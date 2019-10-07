package com.thoughtworks.aceleradora.dominio;

import java.util.List;

public class ValidadorNivel extends ValidacoesBase {

    @Override
    public void validar(String ordem, String nome, List<Nivel> niveis) {
        validaOrdem(ordem);
        validaNome(nome, niveis);
    }

    private void validaOrdem(String ordem) {
        if (!ValidacoesBase.ehNumero(ordem)){
            erros.add("Ordem deve ser um número!");
        }
    }

    private void validaNome(String nome, List<Nivel> niveis) {
        if (ValidacoesBase.nomeInvalido(nome)) {
            erros.add("Nome do nível não pode estar em branco, e não pode começar com espaço!");
        }else if(ValidacoesBase.nomeRepetido(nome, niveis)) {
            erros.add("Esse nome já existe");
        }
    }
}

