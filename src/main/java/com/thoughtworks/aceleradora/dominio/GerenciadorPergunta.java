package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorPergunta {
    private Scanner entrada;
    private Estagio novoEstagio;

    public GerenciadorPergunta(Estagio novoEstagio, Scanner entrada) {
        this.entrada = entrada;
        this.novoEstagio = novoEstagio;
    }

    private Pergunta criarPergunta() {
        System.out.println("\nDigite a ordem:");
        int ordem = entrada.nextInt();
        entrada.nextLine();
        System.out.println("\nDigite a descricao:");
        String descricao = entrada.nextLine();
        return new Pergunta(ordem, descricao);
    }

    private void adicionarPergunta() {
        novoEstagio.getPerguntas().add(criarPergunta());
    }

    public void listarPerguntas() {
        if (!novoEstagio.getPerguntas().isEmpty()) {
            for (Pergunta pergunta : novoEstagio.getPerguntas()) {
                System.out.println("\n" + pergunta.getOrdem() + " " + pergunta.getDescricao());
            }
        } else {
            System.out.println("\nSem perguntas adicionadas para listar.");
        }
    }

    public void removerPergunta() {
        listarPerguntas();
        System.out.println("\nDigite a ordem da pergunta que deseja remover");
        int resposta = entrada.nextInt();

        for (Pergunta pergunta : novoEstagio.getPerguntas()) {
            if (pergunta.getOrdem() == resposta) {
                novoEstagio.getPerguntas().remove(pergunta);
                listarPerguntas();
                break;
            }
        }
    }

    public void editarPergunta() {
        listarPerguntas();
        System.out.println("\nDigite a ordem da pergunta que você quer editar:");
        int ordem = entrada.nextInt();

        for (Pergunta pergunta : novoEstagio.getPerguntas()) {
            if (pergunta.getOrdem() == ordem) {

                System.out.println("\nVocê quer editar a ordem ou a descrição?");
                System.out.println("\n1 - Editar ordem");
                System.out.println("2 - Editar descrição");
                int resposta = entrada.nextInt();
                entrada.nextLine();

                if (resposta == 1) {
                    System.out.println("\nInforme a nova ordem");
                    int novaOrdem = entrada.nextInt();
                    pergunta.setOrdem(novaOrdem);
                } else if (resposta == 2) {
                    System.out.println("\nInforme a nova descrição");
                    String novaDescricao = entrada.nextLine();
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
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    adicionarPergunta();
                    break;
                case 2:
                    listarPerguntas();
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
