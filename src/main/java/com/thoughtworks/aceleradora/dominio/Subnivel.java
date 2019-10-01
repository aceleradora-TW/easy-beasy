package com.thoughtworks.aceleradora.dominio;

import java.util.ArrayList;
import java.util.List;

public class Subnivel {
    private int ordem;
    private Area area;
    private List<Estagio> estagios;

    public Subnivel() {
        estagios = new ArrayList<>();
    }

    public Subnivel(int ordem, Area area, List<Estagio> estagios) {
        this.ordem = ordem;
        this.area = area;
        this.estagios = estagios;
    }

    public int getOrdem() {
        return ordem;
    }

    public Area getArea(){
        return area;
    }

    public List<Estagio> getEstagios() {
        return estagios;
    }
}
