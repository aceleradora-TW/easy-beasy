package com.thoughtworks.aceleradora;

import com.thoughtworks.aceleradora.dominio.Diagnostico;
import com.thoughtworks.aceleradora.dominio.GerenciadorEstagio;
import com.thoughtworks.aceleradora.dominio.GerenciadorNivel;
import com.thoughtworks.aceleradora.dominio.Subnivel;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class App {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Diagnostico novoDiagnostico = new Diagnostico();
        Subnivel novoSubnivel = new Subnivel();

        GerenciadorNivel gerenciadorNivel = new GerenciadorNivel(novoDiagnostico, entrada);
        GerenciadorEstagio gerenciadorEstagio = new GerenciadorEstagio(entrada, novoSubnivel);

        System.out.println("Boas vindas, {Administrador}");
        int opcao;

        do {
            System.out.println("1 - Gerenciar niveis.");
            System.out.println("2 - Gerenciar estágios");
            System.out.println("0 - Sair.");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    gerenciadorNivel.menuNivel();
                    break;
                case 2:
                    gerenciadorEstagio.menuEstagio();
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
