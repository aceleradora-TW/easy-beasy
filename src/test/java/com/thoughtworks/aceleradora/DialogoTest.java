package com.thoughtworks.aceleradora;

import org.junit.Before;
import org.junit.Test;

import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DialogoTest {

    private String saida;

    private Consumer<String> receptorDeSaida = (s) -> saida += s;

    @Before
    public void setUp() {
        saida = "";
    }

    @Test
    public void entende_letra_n_como_nao() {
        boolean resultado = new Dialogo(() -> "n", receptorDeSaida).perguntar("Vai chover hoje?");

        assertThat(resultado, equalTo(false));
        assertThat(saida, equalTo("Vai chover hoje?"));
    }

    @Test
    public void entende_letra_N_como_nao() {

        boolean resultado = new Dialogo(() -> "N", receptorDeSaida).perguntar("Vai chover hoje?");

        assertThat(resultado, equalTo(false));
        assertThat(saida, equalTo("Vai chover hoje?"));
    }

    @Test
    public void entende_letra_s_como_sim() {

        boolean resultado = new Dialogo(() -> "s", receptorDeSaida).perguntar("Vai chover hoje?");

        assertThat(resultado, equalTo(true));
        assertThat(saida, equalTo("Vai chover hoje?"));
    }

    @Test
    public void entende_letra_S_como_sim() {

        boolean resultado = new Dialogo(() -> "S", receptorDeSaida).perguntar("Vai chover hoje?");

        assertThat(resultado, equalTo(true));
        assertThat(saida, equalTo("Vai chover hoje?"));
    }

    @Test
    public void qualquer_outra_coisa_e_entendida_como_nao() {

        boolean resultado = new Dialogo(() -> " ", receptorDeSaida).perguntar("Vai chover hoje?");

        assertThat(resultado, equalTo(false));
        assertThat(saida, equalTo("Vai chover hoje?"));
    }

}