package com.company;

import java.util.HashMap;

public class Plateau {
    private Bateau bateau;
    private Integer tailleBateau;
    private static HashMap<Integer, Integer> ListeCoordoTest = new HashMap<>();

    public Bateau getBateau() {
        return bateau;
    }

    public void setBateau(Bateau bateau) {
        this.bateau = bateau;
    }

    public Integer getTailleBateau() {
        return tailleBateau;
    }

    public void setTailleBateau(Integer tailleBateau) {
        this.tailleBateau = tailleBateau;
    }

    public static void getListeCoordo() {

        ListeCoordoTest.putAll();
    }
}
