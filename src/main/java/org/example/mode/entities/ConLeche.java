package org.example.mode.entities;

public class ConLeche implements Bebida{
    private Bebida cafe;

    public ConLeche(Bebida cafe) {
        this.cafe = cafe;
    }

    @Override
    public Integer getPrecio() {
        return cafe.getPrecio()+50;
    }
    public String toString(){
        return ("El precio del cafe con leche: "+this.getPrecio());
    }
}
