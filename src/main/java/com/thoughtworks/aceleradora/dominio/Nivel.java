package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private int ordem;
    private String nome;
    private List<Subnivel> subnivel;


    public Nivel(int ordem, String nome) {
        this.ordem = ordem;
        this.nome = nome;
        subnivel = new ArrayList<>();
    }

    public Nivel(int ordem, String nome, List<Subnivel> subnivel) {
        this.ordem = ordem;
        this.nome = nome;
        this.subnivel = subnivel;
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