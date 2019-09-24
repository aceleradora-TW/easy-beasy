package com.thoughtworks.aceleradora.dominio;

public class Pergunta {
    private String descricao;
    private String tipo;

    public Pergunta(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }


}
