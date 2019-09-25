package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Diagnostico {
    private List<Nivel> nivel;

    public Diagnostico() {
        nivel = new ArrayList<>();
    }

    public List<Nivel> getNivel(){
        return nivel;
    }

    public void adicionarNivel(Nivel novoNivel){
        nivel.add(novoNivel);
    }

}
