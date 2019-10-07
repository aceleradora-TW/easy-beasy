package com.thoughtworks.aceleradora.dominio;

import java.util.List;
import java.util.Scanner;

public class GerenciadorArea {
    private Scanner entrada;
    private List<Area> areas;
    private Nivel nivel;

    public GerenciadorArea(List<Area> novaArea, Scanner entrada) {
        this.entrada = entrada;
        this.areas = novaArea;
    }

    List<Area> getAreas() {
        return areas;
    }

    private Area criarArea() {
        System.out.println("\nDigite o nome desejado para sua área");
        String nome = entrada.nextLine();

        return new Area(nome);
    }

    private void adicionarArea() {
        areas.add(criarArea());
    }

    void listarArea() {
        if (!areas.isEmpty()) {
            for (Area area : areas) {
                System.out.println(area.getNome());
            }
        } else
            System.out.println("\nVocê ainda não adicionou nenhuma área!");
    }

    private void removerArea() {
        if (!areas.isEmpty()) {
            listarArea();
            System.out.println("\nDigite o nome da área que você deseja remover");
            String areaSelecionada = entrada.nextLine();

            for (Area area : areas) {
                if (areaSelecionada.equalsIgnoreCase(area.getNome())) {
                    for (int i = 0; i < nivel.getSubniveis().size() ; i++) {
                        if (areaSelecionada.equals(nivel.getSubniveis().get(i).getArea())){
                            System.out.println("\nESta área não pode ser removida pois está vinculada a um subnível");
                        }
                        else {
                            areas.remove(area);
                            break;
                        }
                    }
                }
            }
        } else
            System.out.println("\nVocê não tem nenhuma área para ser removida!");
    }


    private void editarArea() {
        if (!areas.isEmpty()) {
            listarArea();
            System.out.println("\nDigite o nome da área que você deseja editar");
            String areaSelecionada = entrada.nextLine();
            System.out.println("\nDigite o novo nome da área");
            String areaAtualizada = entrada.nextLine();

            for (int i = 0; i < areas.size(); i++) {
                if (areaSelecionada.equalsIgnoreCase(areas.get(i).getNome())) {
                    areas.set(i, new Area(areaAtualizada));
                    break;
                }
            }
        } else
            System.out.println("\nVocê não tem nenhuma área para editar!");
    }

    public void menuArea() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("\n1 - Adicionar área");
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
