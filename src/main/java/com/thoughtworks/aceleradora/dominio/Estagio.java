package com.thoughtworks.aceleradora.dominio;

import java.util.List;

public class Estagio {
    private int ordem;
    private List<Pergunta> perguntas;
    private String solucao;
    private String nome;

    public Estagio(int ordem, List<Pergunta> perguntas, String solucao, String nome) {
        this.ordem = ordem;
        this.perguntas = perguntas;
        this.solucao = solucao;
        this.nome = nome;
    }

    public int getOrdem() {
        return ordem;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public String getSolucao() {
        return solucao;
    }

    public String getNome() {
        return nome;
    }
}
