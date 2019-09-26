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

    public void menuNivel() {
        System.out.println("Digite a opção desejada");
        System.out.println("1 - Criar nível");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a ordem");
                int ordem = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Digite o nome do nível");
                String nome = entrada.nextLine();

                adicionarNivel(criaNivel(ordem, nome));
                System.out.println(listarNiveis());
                break;
        }
    }
}

