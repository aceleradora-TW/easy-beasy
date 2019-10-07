package com.thoughtworks.aceleradora.dominio;

public class ValidadorNivel extends ValidacoesBase {

    @Override
    public void validar(String ordem, String nome) {
        validaOrdem(ordem);
        validaNome(nome);
    }

    private void validaOrdem(String ordem) {
        if (!ValidacoesBase.ehNumero(ordem)){
            erros.add("Ordem deve ser um número!");
        }
    }

    private void validaNome(String nome) {
        if (ValidacoesBase.nomeInvalido(nome)) {
            erros.add("Nome do nível não pode estar em branco, e não pode começar com espaço!");
        }
    }
}

