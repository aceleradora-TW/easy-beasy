package com.thoughtworks.aceleradora.dominio;

public class Pergunta {
    private int ordem;
    private String descricao;

    public Pergunta(int ordem, String descricao) {
        this.ordem = ordem;
        this.descricao = descricao;
    }

    public int getOrdem() {
        return ordem;
    }

    public String getDescricao() {
        return descricao;
    }

}
