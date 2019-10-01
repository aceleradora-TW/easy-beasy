package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorEstagio {
    private Scanner entrada;
    private Subnivel novoSubnivel;

    public GerenciadorEstagio(Scanner entrada, Subnivel novoSubnivel) {
        this.entrada = entrada;
        this.novoSubnivel = novoSubnivel;
    }

    private Estagio criarEstagio() {
        System.out.println("Digite a ordem");
        int ordem = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o nome do estágio");
        int nome = entrada.nextInt();
        String converte = String.valueOf(nome);
        return new Estagio(ordem,converte);
    }
    private void adicionarEstagio(){
        novoSubnivel.getEstagios().add(criarEstagio());
    }
    private String listarEstagios(){
        String retorno = "";
        for (Estagio estagio: novoSubnivel.getEstagios()) {
            retorno += "ordem: " + estagio.getOrdem() + " nome: " + estagio.getNome()+ "\n";
        }
        return retorno;
    }


    private void editarEstagio() {
        System.out.println(listarEstagios());
        System.out.println("Digite o nome do estágio que você quer editar");
        String nomeEscolhido = entrada.nextLine();


        for (Estagio estagio: novoSubnivel.getEstagios()) {
            if (estagio.getNome().equals(nomeEscolhido)) {
                System.out.println("Você deseja alterar a ordem ou o nome?");
                System.out.println("1 - Alterar ordem");
                System.out.println("2 - Alterar nome");
                int resposta = entrada.nextInt();
                entrada.nextLine();
                if (resposta == 1) {
                    System.out.println("Informe a nova ordem");
                    int novaOrdem = entrada.nextInt();
                    estagio.setOrdem(novaOrdem);
                } else if (resposta == 2) {
                    System.out.println("Informe o novo nome");
                    String novoNome = entrada.nextLine();
                    estagio.setNome(novoNome);
                }
            }
        }
    }

    public void menuEstagio() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Criar estágio");
            System.out.println("2 - Listar estágios criados");
            System.out.println("3 - Editar estágios");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    adicionarEstagio();
                    break;
                case 2:
                    System.out.println(listarEstagios());
                    break;
                case 3:
                    editarEstagio();
                    break;
                case 0:
                    System.out.println("Retornando ao menu inicial");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }
}




