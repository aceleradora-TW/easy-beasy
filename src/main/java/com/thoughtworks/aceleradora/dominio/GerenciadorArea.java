package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorArea {
    private Scanner entrada;
    private List<Area> areas;

    public GerenciadorArea(List<Area> novaArea, Scanner entrada) {
        this.entrada = entrada;
        this.areas = novaArea;
    }

    public Area criarArea() {
        System.out.println("Digite o nome desejado para sua área");
        String nome = entrada.nextLine();
        Area area = new Area(nome);

        return area;
    }

    public void adicionarArea() {
        areas.add(criarArea());
    }

    public void listarArea() {
        if (!areas.isEmpty()) {
            for (Area area : areas) {
                System.out.println(area.getNome());
            }
        } else
            System.out.println("Você ainda não adicionou nenhuma área!");
    }

    public void removerArea() {
        if (!areas.isEmpty()) {
            listarArea();
            System.out.println("Digite o nome da área que você deseja remover");
            String areaSelecionada = entrada.nextLine();

            for (Area area : areas) {
                if (areaSelecionada.equalsIgnoreCase(area.getNome())) {
                    areas.remove(area);
                    break;
                }
            }
        } else
            System.out.println("Você não tem nenhuma área para ser removida!");
    }


    public void editarArea() {
        if (!areas.isEmpty()) {
            listarArea();
            System.out.println("Digite o nome da área que você deseja editar");
            String areaSelecionada = entrada.nextLine();
            System.out.println("Digite o novo nome da área");
            String areaAtualizada = entrada.nextLine();

            for (int i = 0; i < areas.size(); i++) {
                if (areaSelecionada.equalsIgnoreCase(areas.get(i).getNome())) {
                    areas.set(i, new Area(areaAtualizada));
                    break;
                }
            }
        } else
            System.out.println("Você não tem nenhuma área para editar!");
    }

    public void menuArea() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Adicionar área");
            System.out.println("2 - Listar área");
            System.out.println("3 - Editar área");
            System.out.println("4 - Remover área");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    adicionarArea();
                    break;
                case 2:
                    listarArea();
                    break;
                case 3:
                    editarArea();
                    break;
                case 4:
                    removerArea();
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
