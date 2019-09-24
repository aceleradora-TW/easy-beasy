package com.thoughtworks.aceleradora;

import com.thoughtworks.aceleradora.dominio.Categoria;
import com.thoughtworks.aceleradora.dominio.Estagio;
import com.thoughtworks.aceleradora.dominio.Pergunta;
import com.thoughtworks.aceleradora.dominio.Tipo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

//@SpringBootApplication
public class App {

    public static void main(String[] args) {
//        SpringApplication.run(App.class, args);
        final String SIM = "S";
        final String NAO = "N";
        Estagio estagio = new Estagio("Organize-se", Categoria.ORGANIZACIONAL);
        Scanner teclado = new Scanner(System.in);

        Pergunta pergunta= new Pergunta("Organiza seu tempo?", Tipo.CABECA);
        estagio.adicionaPergunta(pergunta);

        pergunta = new Pergunta("Vc organiza horario de espediente?", Tipo.VALIDACAO);
        estagio.adicionaPergunta(pergunta);

        pergunta = new Pergunta("Vc organiza o horario de intervalo?", Tipo.VALIDACAO);
        estagio.adicionaPergunta(pergunta);

        pergunta = new Pergunta("Deseja começar seu diagnostico?", Tipo.COLETORA);

        System.out.println(pergunta.getDescricao());
        if(teclado.nextLine().equalsIgnoreCase(SIM)){
            for (Pergunta perguntaAux : estagio.getPerguntas()) {
                if (perguntaAux.getTipo().equals(Tipo.CABECA)){
                    System.out.println(perguntaAux.getDescricao());
                }
            }
            if(teclado.nextLine().equalsIgnoreCase(SIM)){
                for (Pergunta perguntaAux : estagio.getPerguntas()) {
                    if (perguntaAux.getTipo().equals(Tipo.VALIDACAO)){
                        System.out.println(perguntaAux.getDescricao());
                        if (teclado.nextLine().equalsIgnoreCase(NAO)){
                            System.out.println(estagio.getSolucao());
                            break;
                        }
                    }
                }
            }else{
                System.out.println(estagio.getSolucao());
            }
        }else{
            System.out.println("Ta bom, vlw flws");
        }


    }

}
