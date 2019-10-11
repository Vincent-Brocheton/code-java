package fr.valarep;

public class ParametreNombre{
    public static void main(String[] args) {
        afficherNombre(15);
        System.out.println();
        afficherNombre(5);
    }

    public static void afficherNombre(int nb) {
        for (int i = 1; i <= nb; i++) {
            System.out.print("[" + i + "]");
        }
    }
}