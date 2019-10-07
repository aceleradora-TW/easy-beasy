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
        String mensagensDeErros = "";

        for (String capturaErros : erros) {
            mensagensDeErros += "\n" + capturaErros;
        }

        return mensagensDeErros;
    }
}
