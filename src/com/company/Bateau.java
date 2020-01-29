package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bateau {
    private String nom;
    private Orientation orient;
    private Coordonees coordo;
    private ModeleBoat typeboat;
    private static HashMap<Integer, Integer> ListeCoordo = new HashMap<>();
    private static int counter;

    public Bateau(String nom, Orientation orient, Coordonees coordo, ModeleBoat typeboat) {
        this.nom = nom;
        this.orient = orient;
        this.coordo = coordo;
        this.typeboat = typeboat;
        addCoordonne();
    }

    public String getNom() {
        return nom;
    }

    public Orientation getOrient() {
        return orient;
    }

    public Coordonees getCoordo() {
        return coordo;
    }

    public ModeleBoat getTypeboat() {
        return typeboat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setOrient(Orientation orient) {
        this.orient = orient;
    }

    public void setCoordo(Coordonees coordo) {
        this.coordo = coordo;
    }

    public void setTypeboat(ModeleBoat typeboat) {
        this.typeboat = typeboat;
    }

    public HashMap<Integer, Integer> addCoordonne()    {
        ListeCoordo.put(coordo.getAbsice(), coordo.getOrdonne());
        return(ListeCoordo);
    }
    public HashMap<Integer, Integer> getListeBateau(){
        return ListeCoordo;
    }

}
