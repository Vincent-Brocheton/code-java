package fr.valarep.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Livraison {

    public static final int CAMIONETTE_POIDS_MAX = 40;

    private List<Produit> produits = new ArrayList<>();
    private List<Produit> produitsCamionette = new ArrayList<>();
    private List<Produit> produitsCamion = new ArrayList<>();

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

    public void preparer(){
        Collections.sort(produits);
        int indexDuPremierGros = trouverLindexDuPremierGros();

        produitsCamionette = produits.subList(0, indexDuPremierGros);
        produitsCamion = produits.subList(indexDuPremierGros, produits.size());
        //for (Produit produit : produits) {
        //    if(produit.getPoids() > CAMIONETTE_POIDS_MAX){
        //        produitsCamion.add(produit);
        //    } else {
        //        produitsCamionette.add(produit);
        //    }
        //}
    }

	private int trouverLindexDuPremierGros() {
        //int index = 0
        //for (Produit produit : produits) {
        //    if(produit.getPoids()>CAMIONETTE_POIDS_MAX){
         //       return index;
        //    }
        //    index ++;
        //}
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getPoids() > CAMIONETTE_POIDS_MAX){
                return i;
            }
        }
        return 0;
    }

    public List<Produit> getProduitsCamionette() {
		return produitsCamionette;
	}

	public List<Produit> getProduitsCamion() {
		return produitsCamion;
	}

}