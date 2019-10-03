package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Diagnostico {
    private List<Nivel> niveis;

    public Diagnostico() {
        niveis = new ArrayList<>();
    }

    public Diagnostico(List<Nivel> niveis) {
        this.niveis = niveis;
    }

    public List<Nivel> getNiveis(){
        return niveis;
    }
}
