package com.thoughtworks.aceleradora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("      Ola Empreendedor   ");
        System.out.println("  Nós somos a EasyBeasy e vamos ajudar a sua empresa! ");
        System.out.println(" Você está com problemas na sua empresa? \n");
        String resp = in.nextLine();
        if (resp.equals("N")){
            System.out.println("PRIMEIRA - Parabéns Você é um Empreendedor de Sucesso! ");
        }else if (resp.equals("S")){
            System.out.println(" COLETORA - Você está com problemas financeiros da sua empresa?\n ");
            resp = in.nextLine();
            perguntasFinanceiro(resp);
            if (resp.equals("N")){
                System.out.println("COLETORA - Você está com problemas de organização na sua empresa?\n");
                resp = in.nextLine();
                perguntasOrg(resp);
            }
        }






    }

    public static String perguntasFinanceiro(String resp){
        Scanner in = new Scanner(System.in);

        String respF = "";
        if (resp.equals("S")){
            System.out.println(" CABEÇA - Você tem controle sobre as despesas da empresa?\n ");
            respF = in.nextLine();
            if (respF.equals("N")){
                System.out.println(" Identificamos que você tem problemas em organizar as finanças da empresa \n " +
                                   "Acesse o link www.easybeasy.com.br/solucao-financeiro \n para obter a solução");
            }
            if (respF.equals("S")){
                System.out.println(" VALIDAÇÃO 1 - Você reconhece que suas horas de trabalho também entram nos custos da empresa?\n");
                respF = in.nextLine();
                if (respF.equals("N")){
                    System.out.println(" Identificamos que você tem problemas em organizar as finanças da empresa \n " +
                                       "Acesse o link www.easybeasy.com.br/solucao-financeiro \n para obter a solução");
                }
                     if (respF.equals("S")){
                      System.out.println(" VALIDAÇÃO 2 - Você sabe quais são os custos fixos e variáveis da sua empresa?\n");
                      respF = in.nextLine();
                         if (respF.equals("N")){
                             System.out.println(" Identificamos que você tem problemas em organizar as finanças da empresa \n " +
                                                "Acesse o link www.easybeasy.com.br/solucao-financeiro \n para obter a solução");
                         }
                      }
            }
        }

        return " SEGUE O FLUXO! ";
    }
    public static String perguntasOrg(String resp){
        Scanner in = new Scanner(System.in);
        String respP = "";

        if (resp.equals("S")){
            System.out.println(" CABEÇA - Você tem uma organização de tempo e tarefas?\n");
            respP = in.nextLine();
                if (respP.equals("N")){
                System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                   "Acesse o link www.easybeasy.com.br/solucao-organização \n para obter a solução");
                }
                    if(respP.equals("S")){
                    System.out.println(" VALIDAÇÃO 1 - Você tem uma organização de tempo e tarefas?\n");
                    respP = in.nextLine();
                        if (respP.equals("N")){
                        System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                           "Acesse o link www.easybeasy.com.br/solucao-organização \n para obter a solução");
                        }
                           if(respP.equals("S")){
                           System.out.println(" VALIDAÇÃO 2 - Você organiza a semana em tarefas e metas a serem cumpridas?\n");
                           respP = in.nextLine();
                                if (respP.equals("N")){
                                System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                                   "Acesse o link www.easybeasy.com.br/solucao-organização \n para obter a solução");
                                }
                                   if(respP.equals("S")){
                                   System.out.println(" VALIDAÇÃO 3 - Você utiliza alguma ferramenta ou estratégia para organizar a sua semana?\n");
                                   respP = in.nextLine();
                                       if (respP.equals("N")){
                                           System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                                              "Acesse o link www.easybeasy.com.br/solucao-organização \n para obter a solução");
                                       }
                    }
                }

            }

        }


        return " SEGUE O FLUXO! ";

    }

}
