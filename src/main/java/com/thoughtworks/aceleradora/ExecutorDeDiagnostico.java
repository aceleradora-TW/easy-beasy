package com.thoughtworks.aceleradora;

import java.util.Scanner;

public class ExecutorDeDiagnostico {

    public static void main(String[] args) {

        Scanner leitora = new Scanner(System.in);

        Dialogo dialogo = new Dialogo(leitora::nextLine, System.out::println);

        Sintoma sintoma = new Sintoma(
            new Indicio("Controla despesas da firma?"),
            new Indicio("Horas de trabalho sao orcadas?"),
            new Indicio("Sabe custos fixos e variaveis?")
        );

        while (!sintoma.foiConfirmado()) {
            Indicio indicio = sintoma.proximoIndicioNaoAveriguado();

            boolean indicioConfirmado = dialogo.perguntar(indicio.toString());

            if (indicioConfirmado) {
                indicio.confirmar();
            } else {
                indicio.negar();
            }
        }

        System.err.println("Controle seus gastos");
    }
}
