package com.company;

public class Main {
    public static void main(String[] args) {
        Bateau bateau = new Bateau("AymaneBoat", Orientation.SUD, new Coordonees(1,1), ModeleBoat.BigBlaster);
        Bateau bateau2 = new Bateau("AymaneBoat", Orientation.SUD, new Coordonees(2,3), ModeleBoat.BigBlaster);
    }
}
