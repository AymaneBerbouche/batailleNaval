package com.company;

public class Bateau {
    private int modele;
    private Orientation orientation;
    private Coordonees coordonees;

    Bateau(int modele, Orientation orientation, Coordonees coordonees) {
    this.modele = modele;
    this.orientation = orientation;
    this.coordonees = new Coordonees();
    }



}
