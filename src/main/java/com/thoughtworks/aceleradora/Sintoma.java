package com.thoughtworks.aceleradora;

import java.util.Arrays;
import java.util.List;


public class Sintoma {

    private List<Indicio> indicios;

    public Sintoma(List<Indicio> indicios) {
        this.indicios = indicios;
    }

    public Sintoma(Indicio... indicios) {
        this.indicios = Arrays.asList(indicios);
    }

    public boolean resolvido() {
        return indicios.stream().allMatch(Indicio::foiAveriguado);
    }

    public Indicio getIndicio(int index) {
        return indicios.get(index);
    }
}

