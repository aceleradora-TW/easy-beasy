package com.thoughtworks.aceleradora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class App {

    public static String solucaoFinanceiro(){
        return "Solução do Financeiro: ...";
    }
    public static String solucaoOrganizacional(){
        return "Solução do Organizacional: ...";
    }
    public static String solucaogGestão(){
        return "Solução do Gestão: ...";
    }
    public static void main(String[] args) {
        Scanner coletor = new Scanner(System.in);

        boolean respostaDefault = true;
        String respostaUsuario;

        System.out.println("==============================================================");
        System.out.println("************************ Boas Vindas! ************************\n" +
                           "********************* Somos a EasyBeasy! *********************");
        System.out.println("==============================================================");
        System.out.println("Por favor, responda as perguntas a seguir com S(sim) ou N(não)\n");
        System.out.println("Você consegue identificar que sua empresa possui algum problema?");
        respostaUsuario = coletor.nextLine();

        do {
            if (respostaUsuario.equalsIgnoreCase("S")){

                System.out.println("Qual o problema da sua firma? Financeiro, Organizacional ou Gestão");
                respostaUsuario = coletor.nextLine();

                switch (respostaUsuario) {
                    case "Financeiro":
                    case "financeiro":
                    case "FINANCEIRO":
                        System.out.println(solucaoFinanceiro());
                        break;
                    case "Organizacional":
                    case "organizacional":
                    case "ORGANIZACIONAL":
                        System.out.println(solucaoOrganizacional());
                        break;
                    case "Gestão":
                    case "gestão":
                    case "GESTÃO":
                    case "Gestao":
                    case "gestao":
                    case "GESTAO":
                        System.out.println(solucaogGestão());
                        break;
                    default:
                        System.out.println("Não temos esta opção ainda.");
                        break;
                }

            }else if (respostaUsuario.equalsIgnoreCase("N")){
                System.out.println("Parabéns Steve Jobs");
                respostaDefault = false;
            }

        }while (respostaDefault);
    }
}