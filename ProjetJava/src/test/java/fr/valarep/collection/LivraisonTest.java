package fr.valarep.collection;

import org.junit.Test;

import static org.junit.Assert.*;


public class LivraisonTest {
   
    @Test
    public void ajouter_devraitAjouterMesProduits() {
        Produit porte = new Produit("porte en bois", 70);
        Produit fenetre = new Produit("fenetre", 20);

        Livraison livraison = new Livraison();
        livraison.ajouter(porte);
        livraison.ajouter(fenetre);

        assertTrue(livraison.contient(porte) && livraison.contient(fenetre));
    }

    @Test
    public void remplacer_devraitRemplacerMonProduit() {
        Produit porte = new Produit("porte en bois", 70);
        Produit fenetre = new Produit("fenetre", 20);
        Produit panneau = new Produit("panneau", 20);

        Livraison livraison = new Livraison();
        livraison.ajouter(porte);
        livraison.ajouter(fenetre);
        livraison.remplacer(porte,panneau);

        assertTrue(!livraison.contient(porte) && livraison.contient(fenetre) && livraison.contient(panneau));
    }

    @Test
    public void remplacer_neDevraitPasRemplacerProduitManquant() {
        Produit porte = new Produit("porte en bois", 70);
        Produit fenetre = new Produit("fenetre", 20);
        Produit panneau = new Produit("panneau", 20);

        Livraison livraison = new Livraison();
        livraison.ajouter(porte);
        livraison.remplacer(panneau,fenetre);

        assertTrue(livraison.contient(porte) && !livraison.contient(fenetre) && !livraison.contient(panneau));
    }
}
