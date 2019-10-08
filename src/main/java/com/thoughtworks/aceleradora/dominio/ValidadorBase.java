package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class ValidadorBase {

    protected final List<String> erros = new ArrayList<>();

    public abstract void validar(String ordem, String nome, List<Nivel> niveis);


    public static boolean ehNumero(String entrada) {
        try {
            Integer.parseInt(entrada);
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }

    public boolean ehValida() {
        return erros.isEmpty();
    }

    public static boolean nomeInvalido(String nome) {
        if (nome.startsWith(" ") || nome.isEmpty())
            return true;

        return false;
    }

    public static boolean nomeRepetido(String nome, List<Nivel> niveis) {
        for (Nivel nivelAux : niveis) {
            if (nivelAux.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public String getErros() {
        String mensagensDeErros = "";

        for (String capturaErros : erros) {
            mensagensDeErros += "\n" + capturaErros;
        }

        return mensagensDeErros;
    }
}
