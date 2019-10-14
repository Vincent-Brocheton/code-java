package fr.valarep.collection;

import java.util.*;

public class Fournisseur {
    private String nom;
    private List<Produit> produits = new ArrayList<>();

    public Fournisseur(String nom) {
        this.nom = nom;
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

	public Collection<? extends Produit> getProduits() {
		return produits;
	}
}