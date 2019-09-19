package com.thoughtworks.aceleradora;

import static com.thoughtworks.aceleradora.Indicio.Situacao.CONFIRMADO;
import static com.thoughtworks.aceleradora.Indicio.Situacao.NAO_AVERIGUADO;
import static com.thoughtworks.aceleradora.Indicio.Situacao.NEGADO;

public class Indicio {

    public enum Situacao {
        NAO_AVERIGUADO,
        CONFIRMADO,
        NEGADO
    }

    private Situacao situacao = NAO_AVERIGUADO;

    public void confirmar() {
        this.situacao = CONFIRMADO;
    }

    public void negar() {
        this.situacao = NEGADO;
    }

    public boolean foiAveriguado() {
        return situacao != NAO_AVERIGUADO;
    }

}
