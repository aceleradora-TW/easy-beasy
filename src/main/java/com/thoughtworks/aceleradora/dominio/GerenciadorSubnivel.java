package com.thoughtworks.aceleradora.dominio;

import java.util.List;
import java.util.Scanner;

public class GerenciadorSubnivel {
    private List<Area> areas;
    private Scanner entrada;
    private Nivel novoNivel;
    GerenciadorArea gerenciadorArea;
    Subnivel subnivel =  new Subnivel();


    public GerenciadorSubnivel(Nivel novoNivel,GerenciadorArea gerenciadorArea, Scanner entrada) {
        this.entrada = entrada;
        this.novoNivel = novoNivel;
        this.gerenciadorArea = gerenciadorArea;

    }

    private Subnivel criarSubnivel() {

        gerenciadorArea.listarArea();

        System.out.println("Digite a ordem do subnivel");
        int ordemSubnivel = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Informe o nome da area para este subnível.");
        String entradaArea = entrada.nextLine();
        entrada.nextLine();

        if(!areas.isEmpty()) {
            for (Area area : areas) {
                if (entradaArea.equals(area.getNome())) {
                    subnivel = new Subnivel(ordemSubnivel, area);
                }
            }
        } else {
            System.out.println("Área não encontrada");
        }
        return subnivel;
    }

    private void adicionarSubnivel() {
        novoNivel.getSubniveis().add(criarSubnivel());
    }

    private String listarSubniveis() {
        String lista = "";

        for (Subnivel subnivel : novoNivel.getSubniveis()) {
            lista = lista + "\n" + subnivel.getOrdem() + " " + subnivel.getArea().getNome();
        }

        return lista;
    }

    private void editarSubnivel() {
        System.out.println(listarSubniveis());
        System.out.println("Digite o nome da ordem do subnível que você quer editar");
        int ordemEscolhida = entrada.nextInt();
        entrada.nextLine();


        for (Subnivel subnivel : novoNivel.getSubniveis()) {
            if (subnivel.getOrdem() == ordemEscolhida) {
                System.out.println("Você deseja alterar a ordem ou o nome?");
                System.out.println("1 - Alterar ordem");
                System.out.println("2 - Alterar nome");
                int resposta = entrada.nextInt();
                entrada.nextLine();
                if (resposta == 1) {
                    System.out.println("Informe a nova ordem");
                    int novaOrdem = entrada.nextInt();
                    subnivel.setOrdem(novaOrdem);
                } else if (resposta == 2) {
                    System.out.println("Informe o novo nome da area");
                    String novoNome = entrada.nextLine();
                    Area novaArea = new Area(novoNome);
                    subnivel.setArea(novaArea);
                }
            }
        }
    }

    private void removerSubnivel() {

        System.out.println(listarSubniveis());

        System.out.println("Qual a ordem do subnivel que você deseja remover?");
        int ordemSubnivel = entrada.nextInt();
        entrada.nextLine();

        for (Subnivel subnivel : novoNivel.getSubniveis()) {
            if (ordemSubnivel == subnivel.getOrdem()) {
                novoNivel.getSubniveis().remove(subnivel);
                break;
            }
        }
    }

    public void menuSubnivel() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Criar Subnível");
            System.out.println("2 - Listar Subníveis criados");
            System.out.println("3 - Editar Subnivel");
            System.out.println("4 - Remover Subnivel");
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
                case 3:
                    editarSubnivel();
                    break;
                case 4:
                    removerSubnivel();
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
