package com.thoughtworks.aceleradora.spike.questions;

public class Pergunta {
    private String pergunta;
    private int proximaPergunta;



    public Pergunta(String pergunta) {
        this.pergunta = pergunta;
        proximaPergunta++;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void getPergunda(String pergunta){
        this.pergunta = pergunta;
    }
}
