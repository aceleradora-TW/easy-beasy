package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questionario {

    public static Diagnostico criaDiagnostico() {
        List<Pergunta> novaListaPergunta = new ArrayList<>();
        Pergunta primeiraPergunta = new Pergunta(1, "Você tem uma organização de tempo e tarefas?");
        novaListaPergunta.add(primeiraPergunta);
        Pergunta segundaPergunta = new Pergunta(2, "Você geralmente lembra de coisas que precisam ser feitas?");
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

        List<Estagio> novaListaEstagio = new ArrayList<>();
        novaListaEstagio.add(estagio1);

        Area areaOrganizacao = new Area("Organização");

        Subnivel subnivel = new Subnivel(1, areaOrganizacao, novaListaEstagio);
        List<Subnivel> listaSubnivel = new ArrayList<>();
        listaSubnivel.add(subnivel);

        Nivel nivel = new Nivel(1, "A", listaSubnivel);
        List<Nivel> listaNiveis = new ArrayList<>();
        listaNiveis.add(nivel);

        return new Diagnostico(listaNiveis);
    }
}
