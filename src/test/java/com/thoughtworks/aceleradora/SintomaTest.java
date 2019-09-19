package com.thoughtworks.aceleradora;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SintomaTest {

    @Test
    public void nao_esta_resolvido_se_os_indicios_nao_forem_averiguados() {
        Sintoma sintoma = new Sintoma(
            new Indicio("Voce controla seus gastos?")
        );

        assertThat(sintoma.foiConfirmado(), equalTo(false));
    }

    @Test
    public void se_confirma_se_pelo_menos_um_indicio_for_negado() {
        Sintoma sintoma = new Sintoma(
            new Indicio("Voce controla seus gastos?"),
            new Indicio("Faz orcamento das horas trabalhadas?")
        );

        sintoma.getIndicio(0).negar();

        assertThat(sintoma.foiConfirmado(), is(true));
    }

    @Test
    public void esta_confirmado_se_todos_os_indicios_forem_averiguados() {
        Sintoma sintoma = new Sintoma(
            new Indicio("Voce controla seus gastos?"),
            new Indicio("Faz orcamento das horas trabalhadas?")
        );

        sintoma.getIndicio(0).confirmar();
        sintoma.getIndicio(1).negar();

        assertThat(sintoma.foiConfirmado(), is(true));
    }

    @Test
    public void encontra_proximo_indicio_nao_averiguado() {
        Indicio controleDeGastos = new Indicio("Voce controla gastos?");
        Indicio orcamentoDeHoras = new Indicio("Faz orcamento das horas trabalhadas?");
        Indicio diferencaDeGastos = new Indicio("Sabe diferenca de gastos fixos e variaveis?");

        Sintoma sintoma = new Sintoma(
            controleDeGastos,
            orcamentoDeHoras,
            diferencaDeGastos
        );

        assertThat(sintoma.proximoIndicioNaoAveriguado(), equalTo(controleDeGastos));
        controleDeGastos.negar();

        assertThat(sintoma.proximoIndicioNaoAveriguado(), equalTo(orcamentoDeHoras));
        orcamentoDeHoras.confirmar();

        assertThat(sintoma.proximoIndicioNaoAveriguado(), equalTo(diferencaDeGastos));

// TODO: Ao ter algum dos primeiros indicios negado, esse metodo nao deveria continuar retornando indicios, ja que o sintoma ja foi confirmado
//       O retorno poderia ser Optional para que o cliente da classe tivesse maior controle sobre essa situacao.
//       Essas chamadas lancariam NoSuchElementException:
//              diferencaDeGastos.confirmar();
//              sintoma.proximoIndicioNaoAveriguado();
    }
}