package com.thoughtworks.aceleradora.dominio;

public class ValidadorNivel extends ValidacoesBase {


    @Override
    public void validar(String ordem, String nome) {

        String ordemRecebida = ordem;
        String nomeRecebido = nome;

        validaOrdem(ordemRecebida);
        validaNome(nomeRecebido);
    }

    private void validaOrdem(String ordem) {
        try {
            Integer.parseInt(ordem);
        } catch (RuntimeException ex) {
            erros.add("Ordem deve ser um número!");
        }
    }

    private void validaNome(String nome) {
        if (nome.isEmpty()) {
            erros.add("Nome do nível não pode estar em branco!");
        }
    }

}

