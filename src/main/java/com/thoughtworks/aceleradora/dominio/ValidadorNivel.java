package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class ValidadorNivel extends ValidacoesBase {


    @Override
    public void validar(String ordem, String nome) {

        String ordemRecebida = ordem;
        String nomeRecebido = nome;

    }

}

//    public int defineOrdem(GerenciadorNivel gerenciadorNivel, String ordemString){
//
//        while (!ValidacoesBase.ehNumero(ordemString)) {
//            System.out.println("Ordem inexistente. Digite um número válido!");
//            ordemString = entrada.nextLine();
//            if (ordemString.equalsIgnoreCase("cancelar")) {
//                gerenciadorNivel.menuNivel();
//            }
//        }
//        return Integer.parseInt(ordemString);
//    }
//
//    public String defineNome(){
//        boolean nomeInvalido = false;
//        String nome;
//        do {
//            System.out.println("Digite o nome do nível ('cancelar' para sair do programa)");
//            nome = entrada.nextLine();
//            if ((Validacoes.nomeInvalido(nome))) {
//                System.out.println("Nome invalido");
//                nomeInvalido = true;
//            } else {
//                nomeInvalido = Validacoes.nomeRepetido(novoDiagnostico.getNiveis(), nome);
//                if (nomeInvalido) System.out.println("Este nome já existe, escolha outro nome.");
//            }
//        } while (nomeInvalido);
//
//        if (nome.equalsIgnoreCase("cancelar")) return null;
//    }
//
//}
