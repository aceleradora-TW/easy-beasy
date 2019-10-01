package com.thoughtworks.aceleradora;

import com.thoughtworks.aceleradora.dominio.Diagnostico;
import com.thoughtworks.aceleradora.dominio.Estagio;
import com.thoughtworks.aceleradora.dominio.GerenciadorArea;
import com.thoughtworks.aceleradora.dominio.GerenciadorNivel;
import com.thoughtworks.aceleradora.dominio.GerenciadorPergunta;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class App {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Estagio novoEstagio = new Estagio();
        Diagnostico novoDiagnostico = new Diagnostico();
        GerenciadorNivel gerenciadorNivel = new GerenciadorNivel(novoDiagnostico, entrada);
        GerenciadorArea gerenciadorArea = new GerenciadorArea(entrada);
        GerenciadorPergunta gerenciadorPergunta = new GerenciadorPergunta(novoEstagio, entradaPergunta);

        System.out.println("Boas vindas, {Administrador}");
        int opcao;

        do {
            System.out.println("\n1 - Gerenciar niveis.");
            System.out.println("2 - Gerenciar áreas.");
            System.out.println("3 - Gerenciar perguntas.");
            System.out.println("0 - Sair.");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    gerenciadorNivel.menuNivel();
                    break;
                case 2:
                    gerenciadorArea.menuArea();
                    break;
                case 3:
                    gerenciadorPergunta.menuPergunta();
                    break;
                case 0:
                    System.out.println("Saindo do menu.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }while(opcao!=0);

    }
}
