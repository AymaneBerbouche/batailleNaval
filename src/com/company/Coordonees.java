package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class Coordonees {

    private Integer ordonnee;
    private Integer absice;

    public Coordonees(Integer ordonnee, Integer absice) {
        this.ordonnee = ordonnee;
        this.absice = absice;
    }

   public int getOrdonne(){
        return ordonnee;
   }

    public int getAbsice() {
        return absice;
    }

    public void setOrdonnee(Integer ordonnee) {
        this.ordonnee = 0;
    }

    public void setAbsice(Integer ordonnee) {
        this.ordonnee = 0;
    }

}