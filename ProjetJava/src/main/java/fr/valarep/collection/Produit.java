package fr.valarep.collection;

public class Produit implements Comparable<Produit>{

    private final String nom;
    private final int poids;

    public Produit(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public int getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "Produit [" + nom + ", " + poids + "kg]";
    }

    @Override
    public int compareTo(Produit autre) {
        return this.poids - autre.poids ;
    }

}