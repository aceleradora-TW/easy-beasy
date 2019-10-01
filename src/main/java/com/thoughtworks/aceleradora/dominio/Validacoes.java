package com.thoughtworks.aceleradora.dominio;

import java.util.List;
import java.util.Scanner;

public class Validacoes {

    public static int entradaNumero(){
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean isNumber = false;
        while (!isNumber) {
            String palavra = entrada.nextLine();
            try {
                numero = Integer.parseInt(palavra);
                isNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Digitou um valor invalido, digite novamente.");
            }
        }
        return numero;
    }

    public static boolean nomeRepetido(List<Nivel> niveis, String nome){
        for (Nivel nivelAux : niveis) {
            if (nivelAux.getNome().equalsIgnoreCase(nome)) return true;
        }
        return false;
    }

    public static boolean nomeInvalido(String nome){
        if(nome.startsWith(" ") || nome.isEmpty()) return true;
        return false;

    }

}
