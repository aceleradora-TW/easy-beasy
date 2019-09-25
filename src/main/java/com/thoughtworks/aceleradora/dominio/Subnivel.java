package com.thoughtworks.aceleradora.dominio;

import java.util.List;

public class Subnivel {
    private int ordem;
    private Area area;
    private List<Estagio> estagio;

    public Subnivel(int ordem, Area area, List<Estagio> estagio) {
        this.ordem = ordem;
        this.area = area;
        this.estagio = estagio;
    }

    public int getOrdem() {
        return ordem;
    }

    public Area getArea(){
        return area;
    }

    public List<Estagio> getEstagio() {
        return estagio;
    }
}
