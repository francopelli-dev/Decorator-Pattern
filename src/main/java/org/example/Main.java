package org.example;

import org.example.mode.entities.Bebida;
import org.example.mode.entities.Cafe;
import org.example.mode.entities.ConLeche;

public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Decorator");
        Bebida cafe = new Cafe();
        System.out.println(cafe);
        Bebida conLeche = new ConLeche(cafe);
        System.out.println(conLeche);
    }
}