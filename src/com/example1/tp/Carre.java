package com.example1.tp;

public class Carre extends Rectangle {
    public Carre(String couleur, double cote) {
        super(couleur, cote, cote);
    }

    @Override
    public void dessiner() {
        System.out.println("Dessiner un carré de couleur " + couleur + " et de côté " + largeur);
    }
}
