package fr.valarep.collection;

import java.util.ArrayList;
import java.util.List;

public class Livraison {
    private List<Produit> produits;

    public Livraison() {
        produits = new ArrayList<>();
    }

    public void ajouter(Produit produit) {
        produits.add(produit);
    }

    public boolean contient(Produit produit) {
        return produits.contains(produit);
    }

    public void remplacer(Produit ancien, Produit nouveau) {
        if (produits.contains(ancien)) {
            produits.remove(ancien);
            ajouter(nouveau);
        }
    }

}