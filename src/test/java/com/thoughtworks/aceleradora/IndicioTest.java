package com.thoughtworks.aceleradora;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class IndicioTest {

    @Test
    public void inicializa_como_nao_averiguado() {
        assertThat(new Indicio().foiAveriguado(), equalTo(false));
    }

    @Test
    public void eh_considerado_averiguado_quando_confirmado() {
        Indicio indicio = new Indicio();

        indicio.confirmar();

        assertThat(indicio.foiAveriguado(), equalTo(true));
    }

    @Test
    public void eh_considerado_averiguado_quando_negado() {
        Indicio indicio = new Indicio();

        indicio.negar();

        assertThat(indicio.foiAveriguado(), equalTo(true));
    }
}