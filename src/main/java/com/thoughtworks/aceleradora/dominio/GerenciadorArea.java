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

       public void menuArea() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Adicionar área");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    adicionarArea();
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
