package com.thoughtworks.aceleradora.dominio;

import java.util.List;

public class Subnivel {
    private int ordem;
    private Area area;
    private List<Estagio> estagios;

    public Subnivel() {
    }

    public Subnivel(int ordem) {
        this.ordem = ordem;
    }

    public int getOrdem() {
        return ordem;
    }

    public Area getArea(){
        return area;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public List<Estagio> getEstagios() {
        return estagios;
    }
}
