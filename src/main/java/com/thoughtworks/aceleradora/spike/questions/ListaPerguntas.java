package com.thoughtworks.aceleradora.spike.questions;

import java.util.ArrayList;

public class ListaPerguntas {
    private ArrayList<Pergunta> perguntas;
    private ArrayList<Coletora> coletoras;

    // abstracao
    // coletora.equals(sim) = "continua para perguntas"
    // coletora.equals(nao) = "parabens steve jobs / prox coletora"
    // pergunta.equals(sim) = "proxima / validacao"
    // pergunta.equals(nao) = "solucao direto"

    public ListaPerguntas(){
        coletoras = new ArrayList<>();
        perguntas = new ArrayList<>();

        Coletora coletoraFinanceiro = new Coletora("Sua empresa tem problemas financeiros?");
        coletoras.add(coletoraFinanceiro);

        Pergunta perguntaFinanceiroA = new Pergunta("Você controla as despesas da sua firma?");
        Pergunta perguntaFinanceiroB = new Pergunta("As suas horas de trabalho são orçadas?");
        Pergunta perguntaFinanceiroC = new Pergunta("Você sabe os custos fixos e variaveis?");
        perguntas.add(perguntaFinanceiroA);
        perguntas.add(perguntaFinanceiroB);
        perguntas.add(perguntaFinanceiroC);
    }

    public Pergunta getPergunta(int indice) {
        return perguntas.get(indice);
    }

    public Coletora getColetora(int indice){
        return coletoras.get(indice);
    }

}
