package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorArea {
    private Scanner entrada;

    public GerenciadorArea(Scanner entrada){
        this.entrada = entrada;
    }

    public void menuArea() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Criar area");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
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
