package com.company;
import java. util. ArrayList;

public class Coordonees {
    String ordonnee;

    public Coordonees(String ordonnee) {
        this.ordonnee = ordonnee;
    }

    public int getX() {
        return Integer.parseInt(ordonnee.substring(0, 1));
    }

    public char getY() {
        return ordonnee.charAt(0);
    }

    public void setOrdonnee(String ordonnee) {
        this.ordonnee = ordonnee;
    }

    public String getOrdonnee() {
        return ordonnee;
    }
}

