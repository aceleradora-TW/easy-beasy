package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorEstagio {
    private Scanner entrada;
    private Subnivel novoSubnivel;
    private Estagio novoEstagio;

    public GerenciadorEstagio(Scanner entrada, Subnivel novoSubnivel) {
        this.entrada = entrada;
        this.novoSubnivel = novoSubnivel;
        novoEstagio = new Estagio();
    }

    private Estagio criarEstagio() {
        System.out.println("Digite a ordem");
        int ordem = entrada.nextInt();
        entrada.nextLine();
        novoEstagio.setOrdem(ordem);

        System.out.println("Digite o nome do estágio");
        int nome = entrada.nextInt();
        String converte = String.valueOf(nome);
        novoEstagio.setNome(converte);
        entrada.nextLine();

        System.out.println("Digite a solução para esse estágio");
        String solucao = entrada.nextLine();
        novoEstagio.setSolucao(solucao);

        return novoEstagio;
    }
    private void adicionarEstagio(){
        novoSubnivel.getEstagios().add(criarEstagio());
    }

    private String listarEstagios(){
        String retorno = "";
        if (novoSubnivel.getEstagios().isEmpty()){
            System.out.println("Lista vazia");
        }
        for (Estagio estagio: novoSubnivel.getEstagios()) {
            retorno += "ordem: " + estagio.getOrdem() + " nome: " + estagio.getNome() + " solução: " + estagio.getSolucao();
        }
        return retorno;
    }


    private void editarEstagio() {
        System.out.println(listarEstagios());
        System.out.println("Digite o nome do estágio que você quer editar");
        String nomeEscolhido = entrada.nextLine();


        for (Estagio estagio: novoSubnivel.getEstagios()) {
            if (estagio.getNome().equals(nomeEscolhido)) {
                System.out.println("Você deseja alterar a ordem, nome ou solução ?");
                System.out.println("1 - Alterar ordem");
                System.out.println("2 - Alterar nome");
                System.out.println("3 - Alterar Solução");
                int resposta = entrada.nextInt();
                entrada.nextLine();
                if (resposta == 1) {
                    System.out.println("Informe a nova ordem ");
                    int novaOrdem = entrada.nextInt();
                    estagio.setOrdem(novaOrdem);
                } else if (resposta == 2) {
                    System.out.println("Informe o novo nome ");
                    String novoNome = entrada.nextLine();
                    estagio.setNome(novoNome);
                } else if (resposta == 3) {
                    System.out.println("Informe a nova solução ");
                    String novaSolucao = entrada.nextLine();
                    estagio.setSolucao(novaSolucao);
                }
            }
        }
    }
    private void removerEstagio() {

        System.out.println(listarEstagios());

        System.out.println("Qual o nome do estágio que você deseja remover?");
        String nomeEstagio = entrada.nextLine();

        for (int i = 0; i <novoSubnivel.getEstagios().size() ; i++) {
            if (nomeEstagio.equals(novoSubnivel.getEstagios().get(i).getNome())) {
                novoSubnivel.getEstagios().remove(i);
                break;
            }
        }
    }

    public void menuEstagio() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Criar estágio");
            System.out.println("2 - Listar estágios criados");
            System.out.println("3 - Editar estágio");
            System.out.println("4 - Remover estágio");
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
                    case 4:
                    removerEstagio();
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




