package com.thoughtworks.aceleradora.dominio.servico;

import java.util.ArrayList;
import java.util.List;

public abstract class ValidadorBase {
    protected final List<String> erros = new ArrayList<>();

    public abstract void validar(String... atributos);

    public boolean ehValida(){
        return erros.isEmpty();
    }

    public String getErros() {
        String mensagensDeErros = "";

        for(String erro : erros) {
            mensagensDeErros += "\n" + erro;
        }

        return mensagensDeErros;
    }
}
