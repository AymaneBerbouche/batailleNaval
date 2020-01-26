package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bateau {
    private String nom;
    private Orientation orient;
    private Coordonees coordo;

    public Bateau(String nom, Orientation orient, Coordonees coordo) {
        this.nom = nom;
        this.orient = orient;
        this.coordo = coordo;

    }
    public HashMap<String, Integer> CreerBateau() {
        List<Integer> absice = new ArrayList<>();
        List<Character> ordonnee = new ArrayList();
        HashMap<String, Integer> listeCases = new HashMap();
        Plateau plat = new Plateau(absice,ordonnee,listeCases);
        switch (orient) {
            case NORD:
                for (int i = coordo.getX(); i != i - 2; i--) {
                    if (plat.getOrdonnee().contains(coordo.getY()) && plat.getAbsice().contains(coordo.getX())) {
                        plat.ListeCases.put(coordo.getY() + Integer.toString(coordo.getX() - i), 1);
                    }
                }
            case SUD: {
                for (int i = coordo.getX(); i != i + 2; i++) {
                    if (plat.getOrdonnee().contains(coordo.getY()) && plat.getAbsice().contains(coordo.getX()))
                        plat.ListeCases.put(coordo.getY() + Integer.toString(coordo.getX() + i), 1);
                }
            }
            case OUEST: {
                for (int i = coordo.getY(); i != i + 2; i++) {
                    if (plat.getOrdonnee().contains(coordo.getY()) && plat.getAbsice().contains(coordo.getX()))
                        plat.ListeCases.put(coordo.getY() + Integer.toString(coordo.getY() + i), 1);
                }
            }
            case EST: {
                for (int i = coordo.getY(); i != i - 2; i--) {
                    if (plat.getOrdonnee().contains(coordo.getY()) && plat.getAbsice().contains(coordo.getX()))
                        plat.ListeCases.put(coordo.getY() + Integer.toString(coordo.getY() + i), 1);

                }
            }
        }
        return plat.ListeCases;
    }

    public String getNom() {
        return nom;
    }

    public Orientation getOrient() {
        return orient;
    }

    public void setOrient(Orientation orient) {
        this.orient = orient;
    }



}
