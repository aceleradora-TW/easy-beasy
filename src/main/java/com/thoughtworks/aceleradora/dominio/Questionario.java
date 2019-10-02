package com.thoughtworks.aceleradora.dominio;

public class Questionario {
    Diagnostico diagnostico =  new Diagnostico();

    //Organizacional
    Nivel nivel = new Nivel(1, "A");
    Subnivel subnivel =  new Subnivel();
    Area areaOrganizacao = new Area("Organização");
    Estagio estagio =  new Estagio();
    Pergunta primeiraPergunta = new Pergunta(1,"Você tem uma organização de tempo e tarefas?");
    Pergunta segundaPergunta = new Pergunta(2,"Você geralmente esquece de coisas que precisam ser feitas?");
    Pergunta terceiraPergunta = new Pergunta(3,"Você organiza a semana em tarefas e metas a serem cumpridas?");
    Pergunta quartaPergunta = new Pergunta(3,"Você utiliza alguma ferramenta ou estratégia para organizar a sua semana?");
}
