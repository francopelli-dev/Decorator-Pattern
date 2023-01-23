package org.example.mode.entities;

public class Cafe implements Bebida{
    private int precio = 70;

    @Override
    public Integer getPrecio() {
        return this.precio;
    }
    public String toString(){
        return "El precio del cafe: "+ getPrecio();
    }
}
