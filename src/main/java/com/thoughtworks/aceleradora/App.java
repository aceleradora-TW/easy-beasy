package com.thoughtworks.aceleradora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("                  Olá Empreendedor                      ");
        System.out.println("    Nós somos a EasyBeasy e vamos ajudar a sua empresa! ");
        System.out.println("*********************************************************");
        System.out.println("          RESPONDA com  S para SIM  e  N para Não        ");
        System.out.println("*********************************************************");
        System.out.println(" Você está com problemas na sua empresa? \n");
        String resp = in.nextLine();
        if (resp.equals("N")){
            System.out.println("PRIMEIRA - Parabéns Você é um Empreendedor de Sucesso! ");
        }else if (resp.equals("S")){
            System.out.println(" COLETORA - Você está com problemas financeiros da sua empresa?\n ");
            resp = in.nextLine();
            perguntasFinanceiro(resp);
            if (resp.equals("N")){
                System.out.println(" COLETORA - Você está com problemas de organização na sua empresa?\n");
                resp = in.nextLine();
                perguntasOrg(resp);
                if (resp.equals("N")){
                    System.out.println(" COLETORA - Você está com problemas relacionados a parte estratégica da sua empresa?\n");
                    resp = in.nextLine();
                    perguntasEstrategica(resp);
                    if (resp.equals("N")){
                        System.out.println(" Bem Empreendedor \n  Não identificamos nenhum problema nesse momento \n  Você que fazer mesmo assim o Diagnóstico? ");
                        resp = in.nextLine();
                        if (resp.equals("S")){
                           // perguntasFinanceiro(resp);
                            System.out.println(" EM CONTRUÇÃO !!!!");
                        }
                    }
                }
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
                                   "Acesse o link www.easybeasy.com.br/solucao-financeiro para obter a solução");
            }
                if (respF.equals("S")){
                     System.out.println(" VALIDAÇÃO 1 - Você reconhece que suas horas de trabalho também entram nos custos da empresa?\n");
                     respF = in.nextLine();
                     if (respF.equals("N")){
                        System.out.println(" Identificamos que você tem problemas em organizar as finanças da empresa \n " +
                                           "Acesse o link www.easybeasy.com.br/solucao-financeiro para obter a solução");
                     }
                          if (respF.equals("S")){
                           System.out.println(" VALIDAÇÃO 2 - Você sabe quais são os custos fixos e variáveis da sua empresa?\n");
                           respF = in.nextLine();
                               if (respF.equals("N")){
                                    System.out.println(" Identificamos que você tem problemas em organizar as finanças da empresa \n " +
                                                       "Acesse o link www.easybeasy.com.br/solucao-financeiro  para obter a solução");
                               }
                            }
                }
        }

        return " ";
    }

    public static String perguntasOrg(String resp){
        Scanner in = new Scanner(System.in);
        String respP = "";

        if (resp.equals("S")){
            System.out.println(" CABEÇA - Você tem uma organização de tempo e tarefas?\n");
            respP = in.nextLine();
                if (respP.equals("N")){
                System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                   "Acesse o link www.easybeasy.com.br/solucao-organizacao para obter a solução");
                }
                    if(respP.equals("S")){
                    System.out.println(" VALIDAÇÃO 1 - Você tem uma organização de tempo e tarefas?\n");
                    respP = in.nextLine();
                        if (respP.equals("N")){
                        System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                           "Acesse o link www.easybeasy.com.br/solucao-organizacao para obter a solução");
                        }
                           if(respP.equals("S")){
                           System.out.println(" VALIDAÇÃO 2 - Você organiza a semana em tarefas e metas a serem cumpridas?\n");
                           respP = in.nextLine();
                                if (respP.equals("N")){
                                System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                                   "Acesse o link www.easybeasy.com.br/solucao-organizacao para obter a solução");
                                }
                                   if(respP.equals("S")){
                                   System.out.println(" VALIDAÇÃO 3 - Você utiliza alguma ferramenta ou estratégia para organizar a sua semana?\n");
                                   respP = in.nextLine();
                                       if (respP.equals("N")){
                                           System.out.println(" Identificamos que você tem problema na organização da sua empresa \n " +
                                                              "Acesse o link www.easybeasy.com.br/solucao-organizacao  para obter a solução");
                                       }
                                   }
                           }

                    }

        }


        return "";

    }

    public static String perguntasEstrategica(String resp){
        Scanner in = new Scanner(System.in);
        String respM = "";

        if (resp.equals("S")){
            System.out.println(" CABEÇA - Você tem conhecimento sobre o público que consome o seu produto/serviço?\n ");
            respM = in.nextLine();
            if (respM.equals("N")){
                System.out.println(" Identificamos que você tem problema estratégico na sua empresa \n " +
                                   "Acesse o link www.easybeasy.com.br/solucao-estrategico para obter a solução");
            }
                if (respM.equals("S")){
                    System.out.println(" VALIDAÇÃO 1 - Você tem conhecimento sobre o público que consome o seu produto/serviço?\n");
                    respM = in.nextLine();
                    if (respM.equals("N")){
                        System.out.println(" Identificamos que você tem problema estratégico na sua empresa \n " +
                                           "Acesse o link www.easybeasy.com.br/solucao-estrategico  para obter a solução");
                    }
                        if (respM.equals("S")){
                           System.out.println(" VALIDAÇÃO 2 - Você compreende as dores e as necessidades do seu cliente, de acordo com as características dele?\n");
                            respM = in.nextLine();
                            if (respM.equals("N")){
                                System.out.println(" Identificamos que você tem problema estratégico na sua empresa \n " +
                                                   "Acesse o link www.easybeasy.com.br/solucao-estrategico  para obter a solução");
                            }
                                if (respM.equals("S")){
                                   System.out.println(" VALIDAÇÃO 3 - Você utilizou algum método ou ferramenta para entender melhor o seu cliente?\n");
                                   respM = in.nextLine();
                                    if (respM.equals("N")){
                                        System.out.println(" Identificamos que você tem problema estratégico na sua empresa \n " +
                                                           "Acesse o link www.easybeasy.com.br/solucao-estrategico  para obter a solução");
                                    }

                                }
                        }
                }
        }


        return "";
    }

}
