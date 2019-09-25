package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private int ordem;
    private List<Subnivel> subnivel = new ArrayList<>();
    private String nome;

    public Nivel() {
    }

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

    public List<Subnivel> getSubnivel() {
        return subnivel;
    }

    public void criaNivel(int ordem, String nome) {
        Nivel novoNivel = new Nivel(ordem, nome);
    }
}


