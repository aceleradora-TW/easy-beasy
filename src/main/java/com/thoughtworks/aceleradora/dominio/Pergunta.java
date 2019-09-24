package com.thoughtworks.aceleradora.dominio;

public class Pergunta {
    private String descricao;
    private Tipo tipo;

    public Pergunta(String descricao, Tipo tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
