package com.thoughtworks.aceleradora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

//@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        SpringApplication.run(App.class, args);

        System.out.println("Bem Vindxs!\nSomos a EasyBeasy!");
        System.out.println("Por favor responda as perguntas a seguir apenas com S(sim) ou N(não)");
        System.out.println("Você consegue identificar que sua empresa possui algum problema?");

        Scanner scanner = new Scanner(System.in);

        String sim = "S";
        String nao = "N";
        String resposta = scanner.nextLine();

        if (resposta.equals(nao)) {
            System.out.println("Parabéns Steve Jobs!");
        } else {
            System.out.println("Coletora - Você tem problemas financeiros?");
            resposta = scanner.nextLine();

            if (resposta.equals(nao)) {
                System.out.println("Parabéns Steve Jobs!");

            } else {
                System.out.println("Cabeça - Você controla as despesas da sua firma?");
                resposta = scanner.nextLine();

                if (resposta.equals(nao)) {
                    System.out.println("Solução");
                } else {
                    System.out.println("Validaçao- As suas horas de trabalho são orçadas? ");
                    resposta = scanner.nextLine();

                    if (resposta.equals(nao)) {
                        System.out.println("Solução");
                    } else {
                        System.out.println("Validação - Você sabe os custos fixos e variaveis? ");
                        resposta = scanner.nextLine();
                        if (resposta.equals(nao)) {
                            System.out.println("Solução ");
                        } else {
                            System.out.println(" Próximo Nivel Financeiro");
                        }
                    }
                }
            }
        }
    }
}
