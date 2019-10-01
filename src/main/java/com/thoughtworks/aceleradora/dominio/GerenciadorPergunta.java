package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorPergunta {
    private Scanner entradaPergunta;
    private Estagio novoEstagio;

    public GerenciadorPergunta(Estagio novoEstagio, Scanner entradaPergunta){
        this.entradaPergunta = entradaPergunta;
        this.novoEstagio = novoEstagio;
    }

    private Pergunta criarPergunta(){
        System.out.println("\nDigite a ordem:");
        int ordem = entradaPergunta.nextInt();
        entradaPergunta.nextLine();
        System.out.println("\nDigite a descricao:");
        String descricao = entradaPergunta.nextLine();
        return new Pergunta(ordem, descricao);
    }

    private void adicionarPergunta(){
        novoEstagio.getPerguntas().add(criarPergunta());
    }


    public void menuPergunta() {
        int opcao;
        do {
            System.out.println("\nDigite a opção desejada");
            System.out.println("1 - Criar pergunta");
            System.out.println("0 - Sair");
            opcao = entradaPergunta.nextInt();
            entradaPergunta.nextLine();

            switch (opcao){
                case 1:
                    adicionarPergunta();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        }
        while (opcao != 0);
    }
}
