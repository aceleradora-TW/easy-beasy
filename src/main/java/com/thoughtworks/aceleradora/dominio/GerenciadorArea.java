package com.thoughtworks.aceleradora.dominio;

import org.springframework.web.context.request.AbstractRequestAttributesScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorArea {
    private Scanner entrada;
    private List<Area> areas = new ArrayList<>();

    public GerenciadorArea(Scanner entrada) {
        this.entrada = entrada;
    }

    public Area criarArea() {
        System.out.println("Digite o nome desejado para sua área");
        String nome = entrada.nextLine();

        return new Area(nome);
    }

    public void adicionarArea() {
        areas.add(criarArea());
    }

    public String listarArea() {
        String area = "";
        for (int i = 0; i < areas.size(); i++) {
            area += "\n" + areas.get(i).getNome();
        }
        return area;
    }

    public void removerArea() {
        System.out.println(listarArea() + "\n");
        System.out.println("Digite o nome da área que você deseja remover");
        String areaSelecionada = entrada.nextLine();

        for (int i = 0; i < areas.size(); i++) {
            if (areaSelecionada.equalsIgnoreCase(areas.get(i).getNome())) {
                areas.remove(i);
                break;
            }
        }
    }

    public void menuArea() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Adicionar área");
            System.out.println("2 - Listar área");
            System.out.println("3 - Remover área");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    adicionarArea();
                    break;
                case 2:
                    System.out.println(listarArea());
                    break;
                case 3:
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
