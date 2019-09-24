package com.thoughtworks.aceleradora.spike.questions;

public class Coletora extends Pergunta{

    private int proximaColetora;

    public Coletora(String pergunta) {
        super(pergunta);
        proximaColetora++;
    }

}
