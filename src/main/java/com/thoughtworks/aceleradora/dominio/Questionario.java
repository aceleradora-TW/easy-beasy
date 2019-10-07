package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Questionario {

    public static Diagnostico criaDiagnostico() {
        List<Pergunta> perguntasP1 = new ArrayList<>();
        Pergunta pergunta = new Pergunta(1, "Você tem uma organização de tempo e tarefas?");
        perguntasP1.add(pergunta);
        pergunta = new Pergunta(2, "Você geralmente lembra de coisas que precisam ser feitas?");
        perguntasP1.add(pergunta);
        pergunta = new Pergunta(3, "Você organiza a semana em tarefas e metas a serem cumpridas?");
        perguntasP1.add(pergunta);
        pergunta = new Pergunta(4, "Você utiliza alguma ferramenta ou estratégia para organizar a sua semana?");
        perguntasP1.add(pergunta);

        List<Pergunta> perguntasP2 = new ArrayList<>();
        pergunta = new Pergunta(1, "Você tem um controle do dinheiro que entra e sai da empresa?");
        perguntasP2.add(pergunta);
        pergunta = new Pergunta(2, "Você sabe para onde foi todo o dinheiro ganho com a empresa?");
        perguntasP2.add(pergunta);
        pergunta = new Pergunta(3, "Você sabe quanto dinheiro é gasto para sustentar o negócio?");
        perguntasP2.add(pergunta);
        pergunta = new Pergunta(4, "Você sabe qual é o faturamento mensal da empresa?");
        perguntasP2.add(pergunta);

        List<Estagio> estagios = new ArrayList<>();

        Estagio estagio = new Estagio();
        estagio.setPerguntas(perguntasP1);
        estagio.setSolucao(
                "Com base nas suas respostas realizei o diagnóstico e encontrei os seguintes problemas: " + "\n" +
                "Podemos melhorar alguns pontos na sua gestão de tempo e tarefas. A solução consistirá em como organizar " + "\n" +
                "suas atividades, definir prazos e metas, além da indicação de algumas ferramentas que poderão complementar a " +
                "sua rotina. \n" +
                "https://medium.com/@easybeasybr/gestao-de-tempo-e-tarefas-p1-12a51de24f75\n");
        estagios.add(estagio);

        estagio = new Estagio();
        estagio.setPerguntas(perguntasP2);
        estagio.setSolucao(
                "Além de fechar o mês no azul é importante saber " +
                "por quê e como isso aconteceu, caso contrário você poderá se " +
                "deparar com surpresas e até acabar tendo prejuízo por falta de organização. " +
                "Para resolver isso vamos te ensinar como fazer um controle fácil de tudo " +
                "que entra e sai do caixa do seu negócio.\n"+
                "https://medium.com/@easybeasybr/controle-financeiro-b%C3%A1sico-p2-b1903b79a182\n");
        estagios.add(estagio);

        Area areaOrganizacao = new Area("Organização");

        Subnivel subnivel = new Subnivel(1, areaOrganizacao, estagios);
        List<Subnivel> listaSubnivel = new ArrayList<>();
        listaSubnivel.add(subnivel);


        Nivel nivel = new Nivel(1, "A", listaSubnivel);
        List<Nivel> listaNiveis = new ArrayList<>();
        listaNiveis.add(nivel);

        return new Diagnostico(listaNiveis);
    }
}
