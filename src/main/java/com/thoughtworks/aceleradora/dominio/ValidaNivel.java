package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class ValidaNivel {

    Scanner entrada = new Scanner(System.in);

    public int defineOrdem(GerenciadorNivel gerenciadorNivel){
        String ordemString;
        System.out.println("Digite a ordem: ");
        ordemString = entrada.nextLine();

        while (!Validacoes.ehNumero(ordemString)) {
            System.out.println("Ordem inexistente. Digite um número válido!");
            ordemString = entrada.nextLine();
            if (ordemString.equalsIgnoreCase("cancelar")) {
                gerenciadorNivel.menuNivel();
            }
        }
        return Integer.parseInt(ordemString);
    }

}
