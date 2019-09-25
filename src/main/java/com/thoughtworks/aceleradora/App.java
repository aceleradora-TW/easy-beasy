package com.thoughtworks.aceleradora;

import com.thoughtworks.aceleradora.dominio.Diagnostico;
import com.thoughtworks.aceleradora.dominio.Nivel;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class App {

    public static void gerenciarNiveis() {


//        switch (opcao) {
//            case 1:
//                novoNivel.criaNivel();
//        }
    }

    public static void main(String[] args) {
        //SpringApplication.run(App.class, args);
        Scanner entrada = new Scanner(System.in);

        Diagnostico novoDiagnostico = new Diagnostico();
        Nivel novoNivel = new Nivel();

        System.out.println("Boas vindas, {Administrador}");

        int opcao;

        System.out.println("1 - Gerenciar niveis.");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
        }
    }
}
