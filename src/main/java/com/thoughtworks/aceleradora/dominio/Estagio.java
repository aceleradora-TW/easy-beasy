package com.thoughtworks.aceleradora.dominio;

import java.util.List;

public class Estagio {
    private int ordem;
    private List<Pergunta> pergunta;
    private String solucao;
    private String nome;

    public Estagio(int ordem, List<Pergunta> pergunta, String solucao, String nome) {
        this.ordem = ordem;
        this.pergunta = pergunta;
        this.solucao = solucao;
        this.nome = nome;
    }

    public int getOrdem() {
        return ordem;
    }

    public List<Pergunta> getPergunta() {
        return pergunta;
    }

    public String getSolucao() {
        return solucao;
    }

    public String getNome() {
        return nome;
    }
}
