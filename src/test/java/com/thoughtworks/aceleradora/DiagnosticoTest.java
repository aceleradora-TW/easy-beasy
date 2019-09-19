package com.thoughtworks.aceleradora;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DiagnosticoTest {

    private Diagnostico diagnostico;

    @Before
    public void setUp() {
        diagnostico = new Diagnostico();
    }

    @Test
    public void encerra_quando_receber_nao_para_pergunta_inicial() {
        Resultado resultado = diagnostico.lerResposta("N");

        assertThat(resultado.getTexto(), equalTo("Fim"));
    }

    @Test
    public void propoe_nova_pergunta_quando_resposta_inicial_for_sim() {
        Resultado resultado = diagnostico.lerResposta("S");

        assertThat(resultado.getTexto(), equalTo("Voce tem problemas financeiros?"));
    }
}