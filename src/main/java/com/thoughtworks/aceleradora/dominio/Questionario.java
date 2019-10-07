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

        List<Pergunta> perguntasFA1 = new ArrayList<>();
        pergunta = new Pergunta(1, "Você tem controle sobre as despesas da empresa?");
        perguntasFA1.add(pergunta);
        pergunta = new Pergunta(2, "Você reconhece que suas horas de trabalho também entram nos custos da empresa?");
        perguntasFA1.add(pergunta);
        pergunta = new Pergunta(3, "Você sabe quais são os custos fixos e variáveis da sua empresa?");
        perguntasFA1.add(pergunta);


        List<Estagio> estagiosOrganizacao = new ArrayList<>();
        List<Estagio> estagiosFinanceiro = new ArrayList<>();

        Estagio estagio = new Estagio();
        estagio.setPerguntas(perguntasP1);
        estagio.setSolucao(
                "Com base nas suas respostas realizei o diagnóstico e encontrei os seguintes problemas: " + "\n" +
                        "Podemos melhorar alguns pontos na sua gestão de tempo e tarefas. A solução consistirá em como organizar " + "\n" +
                        "suas atividades, definir prazos e metas, além da indicação de algumas ferramentas que poderão complementar a " +
                        "sua rotina. \n" +
                        "https://medium.com/@easybeasybr/gestao-de-tempo-e-tarefas-p1-12a51de24f75\n");
        estagiosOrganizacao.add(estagio);

        estagio = new Estagio();
        estagio.setPerguntas(perguntasP2);
        estagio.setSolucao(
                "Além de fechar o mês no azul é importante saber " +
                        "por quê e como isso aconteceu, caso contrário você poderá se " +
                        "deparar com surpresas e até acabar tendo prejuízo por falta de organização. " +
                        "Para resolver isso vamos te ensinar como fazer um controle fácil de tudo " +
                        "que entra e sai do caixa do seu negócio.\n" +
                        "https://medium.com/@easybeasybr/controle-financeiro-b%C3%A1sico-p2-b1903b79a182\n");
        estagiosOrganizacao.add(estagio);

        estagio = new Estagio();
        estagio.setPerguntas(perguntasFA1);
        estagio.setSolucao(
                "Custos e despesas são coisas diferentes na hora de gerenciarmos as contas do negócio. " +
                        "Podemos balancear estes dois conceitos e atingir resultados melhores se pensarmos estrategicamente.\n" +
                        "https://medium.com/@easybeasybr/custos-e-despesas-fa1-10e123894cf7\n");
        estagiosFinanceiro.add(estagio);


        Area areaOrganizacao = new Area("Organizacional");
        Area areaFinanceiro= new Area ("Financeira");

        List<Subnivel> listaSubnivel = new ArrayList<>();

        Subnivel subnivelOrganizacao = new Subnivel(1, areaOrganizacao, estagiosOrganizacao);
        listaSubnivel.add(subnivelOrganizacao);

        Subnivel subnivelFinanceiro = new Subnivel(1, areaFinanceiro, estagiosFinanceiro);
        listaSubnivel.add(subnivelFinanceiro);

        Nivel nivel = new Nivel(1, "A", listaSubnivel);
        List<Nivel> listaNiveis = new ArrayList<>();
        listaNiveis.add(nivel);

        return new Diagnostico(listaNiveis);
    }
}
