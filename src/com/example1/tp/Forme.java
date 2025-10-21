package com.example1.tp;

public abstract class Forme {
    protected String couleur;

    public Forme(String couleur) {
        this.couleur = couleur;
    }

    public abstract void dessiner();
    public abstract double aire();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + couleur + ")";
    }
}
