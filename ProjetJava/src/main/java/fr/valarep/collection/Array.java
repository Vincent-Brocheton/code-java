package fr.valarep.collection;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Produit porte = new Produit("porte en bois", 70);
        Produit panneau = new Produit("panneau", 50);

        Produit[] produits = new Produit[] { porte, panneau };

        // Affichage
        System.out.println(Arrays.toString(produits));

        Produit fenetre = new Produit("fenetre", 20);
        produits = Arrays.copyOf(produits, produits.length + 2);
        produits[2] = fenetre;
        System.out.println(Arrays.toString(produits));
    
        //Doublons?
        Produit fenetreDup = new Produit("fenetre",20);
        produits[3]= fenetreDup;
        System.out.println(Arrays.toString(produits));
    }

}