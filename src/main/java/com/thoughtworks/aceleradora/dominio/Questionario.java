package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Questionario {

    public static void main(String[] args) {
        Diagnostico diagnostico = new Diagnostico();
        List<Pergunta> novaListaPergunta = new ArrayList<>();
        List<Estagio> novaListaEstagio = new ArrayList<>();


        Nivel nivel = new Nivel(1, "A");
        Subnivel subnivel = new Subnivel();
        Area areaOrganizacao = new Area("Organização");

        Pergunta primeiraPergunta = new Pergunta(1, "Você tem uma organização de tempo e tarefas?");
        novaListaPergunta.add(primeiraPergunta);
        Pergunta segundaPergunta = new Pergunta(2, "Você geralmente esquece de coisas que precisam ser feitas?");
        novaListaPergunta.add(segundaPergunta);
        Pergunta terceiraPergunta = new Pergunta(3, "Você organiza a semana em tarefas e metas a serem cumpridas?");
        novaListaPergunta.add(terceiraPergunta);
        Pergunta quartaPergunta = new Pergunta(4, "Você utiliza alguma ferramenta ou estratégia para organizar a sua semana?");
        novaListaPergunta.add(quartaPergunta);
        Estagio estagio1 = new Estagio();
        estagio1.setPerguntas(novaListaPergunta);

        estagio1.setSolucao(
                        "Com base nas suas respostas realizei o diagnóstico e encontrei os seguintes problemas: " + "\n" +
                        "Podemos melhorar alguns pontos na sua gestão de tempo e tarefas. A solução consistirá em como organizar " + "\n" +
                        "suas atividades, definir prazos e metas, além da indicação de algumas ferramentas que poderão complementar a " +
                        "sua rotina. \n" +
                        "https://medium.com/@easybeasybr/gestao-de-tempo-e-tarefas-p1-12a51de24f75\n");

        novaListaEstagio.add(estagio1);

    }
}
