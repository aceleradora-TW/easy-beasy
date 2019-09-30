package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorNivel {

    private Scanner entrada;
    private Diagnostico novoDiagnostico;

    public GerenciadorNivel(Diagnostico novoDiagnostico, Scanner entrada) {
        this.novoDiagnostico = novoDiagnostico;
        this.entrada = entrada;
    }

    private Nivel criarNivel(int ordem, String nome) {
        return new Nivel(ordem, nome);
    }

    private void adicionarNivel(Nivel novoNivel) {
        novoDiagnostico.getNiveis().add(novoNivel);
    }

    private String listarNiveis() {
        String lista = "";

        for (Nivel nivel : novoDiagnostico.getNiveis()) {
            lista = lista + "\n" + nivel.getOrdem() + " " + nivel.getNome();
        }
        return lista;
    }

    private void editarNivel() {
        System.out.println(listarNiveis());
        System.out.println("Digite o nome do nível que você quer editar");
        String nomeEscolhido = entrada.nextLine();

        Nivel antigoNivel = null;

        for (Nivel nivel : novoDiagnostico.getNiveis()) {
            if (nivel.getNome().equals(nomeEscolhido)) {
                antigoNivel = (Nivel) nivel.clone();
                System.out.println("Você deseja alterar a ordem ou o nome?");
                System.out.println("1 - Alterar ordem");
                System.out.println("2 - Alterar nome");
                int resposta = entrada.nextInt();
                entrada.nextLine();
                if (resposta == 1) {
                    System.out.println("Informe a nova ordem");
                    int novaOrdem = entrada.nextInt();
                    nivel.setOrdem(novaOrdem);
                } else if (resposta == 2) {
                    System.out.println("Informe o novo nome");
                    String novoNome = entrada.nextLine();
                    nivel.setNome(novoNome);
                }
            }
        }
    }

    private void removerNivel() {

        System.out.println(listarNiveis());

        System.out.println("Qual o nome do nivel que você deseja remover?");
        String nomeNivel = entrada.nextLine();

        for (int i = 0; i <novoDiagnostico.getNiveis().size() ; i++) {
            if (nomeNivel.equals(novoDiagnostico.getNiveis().get(i).getNome())) {
                novoDiagnostico.getNiveis().remove(i);
                break;
            }
        }
    }

    public void menuNivel() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Criar nível");
            System.out.println("2 - Listar níveis criados");
            System.out.println("3 - Editar nivel");
            System.out.println("4 - Remover nivel");
            System.out.println("0 - Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a ordem");
                    int ordem = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Digite o nome do nível");
                    String nome = entrada.nextLine();

                    adicionarNivel(criarNivel(ordem, nome));
                    break;
                case 2:
                    System.out.println(listarNiveis());
                    break;
                case 3:
                    editarNivel();
                    break;
                case 4:
                    removerNivel();
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

