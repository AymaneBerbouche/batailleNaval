package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class Case {
    private Bateau boat;
    private Coordonees cordo;
    private Plateau plateau;
    private Orientation direction;
    HashMap<String, Integer> ListeCases = new HashMap<String, Integer>();

    public Case(Coordonees cordo, Plateau plateau) {
        this.cordo = cordo;
        this.plateau = plateau;
        this.direction = direction;
    }

    public boolean caseExist(Coordonees cordo) {
        if (plateau.getOrdonnee().contains(cordo.getY()) && plateau.getAbsice().contains(cordo.getX())) {
            return true;
        } else {
            return false;
        }
    }

    public HashMap<String, Integer> getListeCases() {
        return ListeCases;
    }

}