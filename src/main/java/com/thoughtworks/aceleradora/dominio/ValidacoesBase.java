package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class ValidacoesBase {

    protected final List<String> erros = new ArrayList<>();

    public abstract void validar(String ordem, String nome);


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

    public String getErros() {
        String mensagemDeErro = "";

        for (String capturaErros : erros) {
            mensagemDeErro += "\n" + capturaErros;
        }

        return mensagemDeErro;
    }


//    public static boolean nomeRepetido(List<Nivel> niveis, String nome) {
//        for (Nivel nivelAux : niveis) {
//            if (nivelAux.getNome().equalsIgnoreCase(nome)) return true;
//        }
//        return false;
//    }
//
//    public static boolean nomeInvalido(String nome) {
//        if (nome.startsWith(" ") || nome.isEmpty()) return true;
//        return false;
//
//    }

}
