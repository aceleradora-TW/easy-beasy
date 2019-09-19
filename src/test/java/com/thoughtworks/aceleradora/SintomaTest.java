package com.thoughtworks.aceleradora;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SintomaTest {

    @Test
    public void nao_esta_resolvido_se_os_indicios_nao_forem_averiguados() {
        Sintoma sintoma = new Sintoma(
            new Indicio()
        );

        assertThat(sintoma.resolvido(), equalTo(false));
    }

    @Test
    public void esta_resolvido_se_todos_os_indicios_forem_averiguados() {
        Sintoma sintoma = new Sintoma(
            new Indicio(),
            new Indicio()
        );

        sintoma.getIndicio(0).confirmar();
        sintoma.getIndicio(1).negar();

        assertThat(sintoma.resolvido(), is(true));
    }
}