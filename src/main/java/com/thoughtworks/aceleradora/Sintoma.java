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

//    TODO: Se todos os indicios forem confirmados, este sintoma deveria deixar de ser diagnosticado. Este metodo
//          nao preve a possibilidade de todos os indicios serem confirmados.
//              confirmado != finalizado
    public boolean foiConfirmado() {
        return indicios.stream().anyMatch(Indicio::foiNegado);
    }

    public Indicio getIndicio(int index) {
        return indicios.get(index);
    }

    public Indicio proximoIndicioNaoAveriguado() {
        return indicios.stream().filter(Indicio::naoFoiAveriguado).findFirst().get();
    }
}

