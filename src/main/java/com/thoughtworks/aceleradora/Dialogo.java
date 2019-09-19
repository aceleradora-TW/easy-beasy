package com.thoughtworks.aceleradora;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Dialogo {

    private static final String SIM = "S";

    private final Supplier<String> provedorDeEntrada;
    private final Consumer<String> receptorDeSaida;

    public Dialogo(Supplier<String> provedorDeEntrada, Consumer<String> receptorDeSaida) {
        this.provedorDeEntrada = provedorDeEntrada;
        this.receptorDeSaida = receptorDeSaida;
    }

    public boolean perguntar(String enunciado) {
        receptorDeSaida.accept(enunciado);
        return provedorDeEntrada.get().equalsIgnoreCase(SIM);
    }
}
