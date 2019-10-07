package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estagio {
    private int ordem;
    private List<Pergunta> perguntas;
    private String solucao;
    private String nome;

    public Estagio() {
        perguntas = new ArrayList<>();
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public int getOrdem() {
        return ordem;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public String getSolucao() {
        return solucao;
    }

    public String getNome() {
        return nome;
    }
}
