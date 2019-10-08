package com.thoughtworks.aceleradora.dominio;

import java.util.List;

public class ValidadorNivel extends ValidacoesBase {

    @Override
    public void validar(String ordem, String nome, List<Nivel> niveis) {
        validaOrdem(ordem);
        validaNome(nome, niveis);
    }

    private void validaOrdem(String ordem) {
        if (!ehNumero(ordem)){
            erros.add("Ordem deve ser um número!");
        }
    }

    private void validaNome(String nome, List<Nivel> niveis) {
        if (nomeInvalido(nome)) {
            if (nome.isEmpty()){
                erros.add("Nome do nível não pode estar em branco");
            }
            else{
                erros.add("Nome do nível não pode começar com espaço!");
            }
        }
        else if(nomeRepetido(nome, niveis)) {
            erros.add("Esse nome já existe");
        }
    }
}

