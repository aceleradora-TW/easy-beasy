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

    public String listarPerguntas(){
        String lista = " ";
        for (Pergunta pergunta: novoEstagio.getPerguntas()) {
            lista = lista + "\n" + pergunta.getOrdem() + " " + pergunta.getDescricao();
        }
        return lista;
    }

    public void removerPergunta(){
        System.out.println(listarPerguntas());
        System.out.println("\nDigite a ordem da pergunta que deseja remover");
        int resposta = entradaPergunta.nextInt();

        for ( Pergunta pergunta : novoEstagio.getPerguntas()){
            if(pergunta.getOrdem() == resposta){
                novoEstagio.getPerguntas().remove(pergunta);
                System.out.println(listarPerguntas());
                break;
            }
        }
    }

    public void editarPergunta(){
        System.out.println(listarPerguntas());
        System.out.println("\nDigite a ordem da pergunta que você quer editar:");
        int ordem = entradaPergunta.nextInt();

        for (Pergunta pergunta : novoEstagio.getPerguntas()) {
            if (pergunta.getOrdem() == ordem) {

                System.out.println("\nVocê quer editar a ordem ou a descrição?");
                System.out.println("\n1 - Alterar ordem");
                System.out.println("2 - Alterar descrição");
                int resposta = entradaPergunta.nextInt();
                entradaPergunta.nextLine();

                if (resposta == 1) {
                    System.out.println("\nInforme a nova ordem");
                    int novaOrdem = entradaPergunta.nextInt();
                    pergunta.setOrdem(novaOrdem);
                }

                else if (resposta == 2) {
                    System.out.println("\nInforme a nova descrição");
                    String novaDescricao = entradaPergunta.nextLine();
                    pergunta.setDescricao(novaDescricao);
                    break;
                }
            }
        }
    }

    public void menuPergunta() {
        int opcao;
        do {
            System.out.println("\nDigite a opção desejada");
            System.out.println("\n1 - Criar pergunta");
            System.out.println("2 - Listar Perguntas");
            System.out.println("3 - Editar perguntas");
            System.out.println("4 - Remover perguntas");
            System.out.println("0 - Sair");
            opcao = entradaPergunta.nextInt();
            entradaPergunta.nextLine();

            switch (opcao){
                case 1:
                    adicionarPergunta();
                    break;
                case 2:
                    System.out.println(listarPerguntas());
                    break;
                case 3:
                    editarPergunta();
                    break;
                case 4:
                    removerPergunta();
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
