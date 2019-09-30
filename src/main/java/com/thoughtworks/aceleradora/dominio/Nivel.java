package com.thoughtworks.aceleradora.dominio;

public class Nivel {
    private int ordem;
    private String nome;


    public Nivel(int ordem, String nome) {
        this.ordem = ordem;
        this.nome = nome;
    }

    public int getOrdem() {
        return ordem;
    }

    public String getNome() {
        return nome;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ordem: " + ordem + ", Nome: " + nome;
    }

}