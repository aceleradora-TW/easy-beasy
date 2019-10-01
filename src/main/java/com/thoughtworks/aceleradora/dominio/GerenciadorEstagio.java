package com.thoughtworks.aceleradora.dominio;

import java.util.Scanner;

public class GerenciadorEstagio {
    private Scanner entrada;
    private Subnivel novoSubnivel;
    private Estagio estagio;

    public GerenciadorEstagio(Scanner entrada, Subnivel novoSubnivel, Estagio estagio) {
        this.entrada = entrada;
        this.novoSubnivel = novoSubnivel;
        this.estagio = estagio;

    }

    private Estagio criarEstagio() {
        System.out.println("Digite a ordem");
        int ordem = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o nome do estágio");
        String nome = entrada.nextLine();
        return new Estagio(ordem, nome);
    }

}




