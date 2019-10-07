package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

import static com.thoughtworks.aceleradora.dominio.Questionario.criaDiagnostico;

public class AppQuestionario {
    public static void main(String[] args) {
        Diagnostico novoDiagnostico = criaDiagnostico();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, boas-vindas! Somos a EasyBeasy.");

        for (Nivel nivel : novoDiagnostico.getNiveis()) {
            for (Subnivel subnivel : nivel.getSubniveis()) {
                System.out.println( "[Área " + subnivel.getArea().getNome() + "]");
                for (Estagio estagio : subnivel.getEstagios()) {
                    System.out.println();
                    int cont = 0;
                    for (Pergunta pergunta : estagio.getPerguntas()) {
                        String resposta;
                        do {
                            System.out.println(pergunta.getDescricao());
                            resposta = entrada.nextLine();
                            if (!resposta.equalsIgnoreCase("nao") && !resposta.equalsIgnoreCase("sim")) {
                                System.out.println("Resposta inválida.");
                            }
                        } while (!resposta.equalsIgnoreCase("nao") && !resposta.equalsIgnoreCase("sim"));
                        if (resposta.equalsIgnoreCase("nao")) {
                            cont++;
                        }
                        if (cont == 2) {
                            break;
                        }
                    }
                    if (cont > 0) {
                        System.out.println(estagio.getSolucao());
                        System.out.println("Deseja continuar o diagnóstico? ");
                        String resposta;
                        do {
                            resposta = entrada.nextLine();
                            if (!resposta.equalsIgnoreCase("nao") && !resposta.equalsIgnoreCase("sim")) {
                                System.out.println("Resposta inválida.");
                            }
                        } while (!resposta.equalsIgnoreCase("nao") && !resposta.equalsIgnoreCase("sim"));

                        if (resposta.equalsIgnoreCase("nao")) {
                            System.out.println("Diagnóstico finalizado.");
                            return;

                        }
                    }
                }
            }
        }
    }
}