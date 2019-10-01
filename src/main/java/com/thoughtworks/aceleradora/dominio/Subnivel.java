package com.thoughtworks.aceleradora.dominio;

import java.util.List;

public class Subnivel {
    private int ordem;
    private Area area;
    private List<Estagio> estagios;

    public Subnivel() {
    }

    public Subnivel(int ordem, Area area) {
        this.ordem = ordem;
        this.area = area;
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

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Estagio> getEstagios() {
        return estagios;
    }
}
