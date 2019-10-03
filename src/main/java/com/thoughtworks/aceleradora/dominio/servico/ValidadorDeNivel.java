package com.thoughtworks.aceleradora.dominio.servico;

public class ValidadorDeNivel  extends ValidadorBase{

    @Override
    public void validar(String... atributos) {
        String ordem = atributos[0];
        String nome = atributos[1];

        validaNome(nome);
        validaOrdem(ordem);
    }

    private void validaOrdem(String ordem) {
        try {
            Integer.parseInt(ordem);
        }catch(RuntimeException ex) {
            erros.add("Ordem deve ser um número!");
        }
    }

    private void validaNome(String nome) {
        if(nome.isEmpty()){
            erros.add("Nome do nível não pode estar em branco!");
        }
    }
}
