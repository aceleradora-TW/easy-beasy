package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorNivel {

    Scanner entrada = new Scanner(System.in);
    Diagnostico novoDiagnostico;

    public GerenciadorNivel(Diagnostico novoDiagnostico) {
        this.novoDiagnostico = novoDiagnostico;
    }

    public Nivel criaNivel(int ordem, String nome) {
        return new Nivel(ordem, nome);
    }

    public void adicionarNivel(Nivel novoNivel) {
        novoDiagnostico.getNivel().add(novoNivel);
    }

    public String listarNiveis() {
        String lista = "";

        for (Nivel nivel : novoDiagnostico.getNivel()) {
            lista = lista + "\n" + nivel.getOrdem() + " " + nivel.getNome();
        }
        return lista;
    }

    public String editarNivel(){
        System.out.println(listarNiveis());
        System.out.println("Digite o nome do nível que você quer editar");
        String nomeEscolhido = entrada.nextLine();

        Nivel antigoNivel = null;

        for(Nivel nivel: novoDiagnostico.getNivel()){
            if(nivel.getNome().equals(nomeEscolhido)){
                antigoNivel = (Nivel) nivel.clone();
                System.out.println("Você deseja alterar a ordem ou o nome?");
                System.out.println("1 - Alterar ordem");
                System.out.println("2 - Alterar nome");
                int resposta = entrada.nextInt();
                entrada.nextLine();
                if (resposta == 1){
                    System.out.println("Informe a nova ordem");
                    int novaOrdem = entrada.nextInt();
                    nivel.setOrdem(novaOrdem);
                }
                else if (resposta == 2){
                    System.out.println("Informe o novo nome");
                    String novoNome = entrada.nextLine();
                    nivel.setNome(novoNome);
                }
            }
        }
        return String.valueOf(antigoNivel);
    }

    public void menuNivel() {
        int opcao;
        do {
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Criar nível");
            System.out.println("2 - Listar níveis criados");
            System.out.println("3 - Editar nivel");
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

                    adicionarNivel(criaNivel(ordem, nome));
                    break;
                case 2:
                    System.out.println(listarNiveis());
                    break;
                case 3:
                    editarNivel();
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

