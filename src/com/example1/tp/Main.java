package com.example1.tp;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Forme[] formes = new Forme[] {
            new Cercle("Rouge", 5.0),
            new Rectangle("Bleu", 4.0, 3.0),
            new Triangle("Vert", 6.0, 2.5),
            new Carre("Jaune", 4.0)
        };

        System.out.println("=== Dessin des formes ===");
        for (Forme f : formes) {
            f.dessiner();
        }

        Arrays.sort(formes, Comparator.comparingDouble(Forme::aire));

        System.out.println("\n=== Triées par aire croissante ===");
        for (Forme f : formes) {
            System.out.printf("%s -> aire = %.2f\n", f.toString(), f.aire());
        }
    }
}
