package fr.valarep.collection;

import java.util.*;
//import java.util.Collection;
//import java.util.Iterator;

public class CollectionsExemple {
    public static void main(String[] args) {
        Produit porte = new Produit("porte en bois", 70);
        Produit panneau = new Produit("panneau", 50);
        Produit fenetre = new Produit("fenetre", 20);

        Collection<Produit> produits = new ArrayList<>();
        produits.add(porte);
        produits.add(panneau);
        produits.add(fenetre);
        System.out.println(produits.size());
        System.out.println(produits.isEmpty());
        System.out.println(produits.contains(fenetre));

        System.out.println(produits);

        int sommesDesPoids = 0;
        for (Produit produit : produits) {
            System.out.println(produit + ",");
            sommesDesPoids += produit.getPoids();
        }
        System.out.println("Somme des poids = " + sommesDesPoids);

        //NE FONCTIONNE PAS
        //for (Produit produit : produits) {
        //    if (produit.getPoids() <= 20) {
        //        produits.remove(produit);
        //        System.out.println("Supprimé :" + produit);
        //    } else {
        //        System.out.println("Non supprimé : " + produit);
        //    }
        //}

        Iterator<Produit> produitIterator = produits.iterator();
        while (produitIterator.hasNext()) {
            Produit produit = produitIterator.next();
            if (produit.getPoids() <= 20){
                produitIterator.remove();
                System.out.println("Supprimé : " + produit);
            }else{
                System.out.println("Non supprimé : " + produit);
            }
        }
    }

}