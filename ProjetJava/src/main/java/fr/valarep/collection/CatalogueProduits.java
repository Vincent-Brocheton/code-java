package fr.valarep.collection;

import java.util.*;

public class CatalogueProduits {

    private Set<Produit> produits = new HashSet<>();

	public void ajouterProduitsFournisseur(Fournisseur fournisseur) {
        produits.addAll(fournisseur.getProduits());
	}

	public boolean contient(Produit produit) {

		return produits.contains(produit);
	}

	public Object getNbProduit() {
		return produits.size();
	}

    
}