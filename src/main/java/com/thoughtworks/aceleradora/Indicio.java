package com.thoughtworks.aceleradora;

import java.util.Objects;

import static com.thoughtworks.aceleradora.Indicio.Situacao.CONFIRMADO;
import static com.thoughtworks.aceleradora.Indicio.Situacao.NAO_AVERIGUADO;
import static com.thoughtworks.aceleradora.Indicio.Situacao.NEGADO;

public class Indicio {

    public enum Situacao {
        NAO_AVERIGUADO,
        CONFIRMADO,
        NEGADO
    }

    private final String texto;
    private Situacao situacao = NAO_AVERIGUADO;

    public Indicio(String texto) {
        this.texto = texto;
    }

    public void confirmar() {
        this.situacao = CONFIRMADO;
    }

    public void negar() {
        this.situacao = NEGADO;
    }

    public boolean foiAveriguado() {
        return situacao != NAO_AVERIGUADO;
    }

    public boolean naoFoiAveriguado() {
        return !foiAveriguado();
    }

    public boolean foiNegado() {
        return situacao == NEGADO;
    }

    @Override
    public String toString() {
        return texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Indicio indicio = (Indicio) o;
        return Objects.equals(texto, indicio.texto) &&
            situacao == indicio.situacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, situacao);
    }
}
