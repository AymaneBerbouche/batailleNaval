package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Plateau {
    private List<Integer> Absice = new ArrayList<Integer>();
    private List<Character> Ordonnee = new ArrayList<Character>();
    HashMap<String, Integer> ListeCases = new HashMap<String, Integer>();

    public Plateau(List<Integer> absice, List<Character> ordonnee, HashMap<String, Integer> listecases) {
        Absice = absice;
        Ordonnee = ordonnee;
        ListeCases = listecases;
    }

    public boolean caseExist(Coordonees cordo) {
        if (this.getOrdonnee().contains(cordo.getY()) && this.getAbsice().contains(cordo.getX())) {
            return true;
        } else {
            return false;
        }
    }

    public List<Integer> getAbsice() {
        return Absice;
    }

    public List<Character> getOrdonnee() {
        return Ordonnee;
    }

    public void setAbsice(List<Integer> absice) {
        for (int j = 1; j < 10; j++) {
            absice.add(j);
        }
    }

    public void setOrdonnee(List<Character> ordonnee) {
        for (List<Character> ordonnee: o) {
            
        }
        for (int i = 1; i != 10; i++) {
            ordonnee.add((char) ('A' + i));
        }
    }

    public HashMap<String, Integer> getListeCases() {
        return ListeCases;
    }
}