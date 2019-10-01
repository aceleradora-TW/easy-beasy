package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorSubnivel {
    private Scanner entrada;
    private Nivel novoNivel;

    public GerenciadorSubnivel(Nivel novoNivel, Scanner entrada) {
        this.entrada = entrada;
        this.novoNivel = novoNivel;
    }

    private Subnivel criarSubnivel() {
        System.out.println("Digite a ordem do subnivel");
        int ordemSubnivel = entrada.nextInt();
        entrada.nextLine();

        return new Subnivel(ordemSubnivel);
    }

    private void adicionarSubnivel() {
        novoNivel.getSubniveis().add(criarSubnivel());
    }

    private String listarSubniveis() {
        String lista = "";

        for (Subnivel subnivel : novoNivel.getSubniveis()) {
            lista = lista + "\n" + subnivel.getOrdem();
        }
        return lista;
    }

    public void menuSubnivel() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Criar Subnível");
            System.out.println("2 - Listar Subníveis criados");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    adicionarSubnivel();
                    break;
                case 2:
                    System.out.println(listarSubniveis());
                    break;
                case 0:
                    System.out.println("Retornando ao menu inicial");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }
}
