package com.thoughtworks.aceleradora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        SpringApplication.run(App.class, args);
        Scanner scanner = new Scanner(System.in);


        String sim = "S";
        String nao = "N";

        System.out.println("Seja bem vindo a EasyBeasy");
        System.out.println("Responda o questionário apenas com S ou N");
        System.out.println("Voce consegue identificar que sua empresa possui algum problema?");
        String resposta;

        do {
            resposta = scanner.nextLine();
            if(!resposta.equalsIgnoreCase(nao) && !resposta.equalsIgnoreCase(sim)){
                System.out.println("Resposta inválida, responda com S ou N");
            }
           } while (!resposta.equalsIgnoreCase(nao) && !resposta.equalsIgnoreCase(sim));
                                                                               
        if (resposta.equalsIgnoreCase(nao)) {
                System.out.println("Parabens");

            }
            else if(resposta.equalsIgnoreCase(sim)) {
                    System.out.println("Voce identifica problemas financeiros?");
                }
            }

        {
            System.out.println("Não identificado");
        }


    }
