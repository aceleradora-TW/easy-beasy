package com.thoughtworks.aceleradora.spike.user;

public class Empreendedor extends Pessoa{
    private String ramoDeAtuacao;
    private String cidade;
    private String estado;
    private String cnpj;

    public Empreendedor(String nome, String cpf, String email, String ramoDeAtuacao, String cidade, String estado, String cnpj) {
        super(nome,cpf,email, cnpj);
        this.ramoDeAtuacao = ramoDeAtuacao;
        this.cidade = cidade;
        this.estado = estado;
    }

}
