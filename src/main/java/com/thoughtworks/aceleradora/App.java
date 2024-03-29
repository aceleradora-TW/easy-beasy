package com.thoughtworks.aceleradora;

import com.thoughtworks.aceleradora.dominio.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Estagio novoEstagio = new Estagio();
        Diagnostico novoDiagnostico = new Diagnostico();
        Subnivel novoSubnivel = new Subnivel();
        Nivel novoNivel = new Nivel();
        List<Area> areas = new ArrayList<>();
        GerenciadorNivel gerenciadorNivel = new GerenciadorNivel(novoDiagnostico, entrada);
        GerenciadorEstagio gerenciadorEstagio = new GerenciadorEstagio(entrada, novoSubnivel);
        GerenciadorArea gerenciadorArea = new GerenciadorArea(areas, entrada);
        GerenciadorPergunta gerenciadorPergunta = new GerenciadorPergunta(novoEstagio, entrada);
        GerenciadorSubnivel gerenciadorSubnivel = new GerenciadorSubnivel(novoNivel, gerenciadorArea, entrada);

        System.out.println("Boas vindas, {Administrador}");
        int opcao;

        do {
            System.out.println("1 - Gerenciar niveis.");
            System.out.println("2 - Gerenciar estágios");
            System.out.println("3 - Gerenciar áreas.");
            System.out.println("4 - Gerenciar subniveis.");
            System.out.println("5 - Gerenciar perguntas.");
            System.out.println("0 - Sair.");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    gerenciadorNivel.menuNivel();
                    break;
                case 2:
                    gerenciadorEstagio.menuEstagio();
                    break;
                case 3:
                    gerenciadorArea.menuArea();
                    break;
                case 4:
                    gerenciadorSubnivel.menuSubnivel();
                    break;
                case 5:
                    gerenciadorPergunta.menuPergunta();
                    break;
                case 0:
                    System.out.println("Saindo do menu.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }
}
