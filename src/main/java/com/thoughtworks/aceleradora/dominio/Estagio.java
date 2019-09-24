package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estagio {

    private List<Pergunta> perguntas= new ArrayList<>();
    private String solucao;
    private Categoria categoria;

    public Estagio( String solucao, Categoria categoria) {
        this.solucao = solucao;
        this.categoria = categoria;
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

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void adicionaPergunta(Pergunta pergunta){
        perguntas.add(pergunta);
    }
}
