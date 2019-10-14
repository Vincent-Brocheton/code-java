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
        livraison.remplacer(porte, panneau);

        assertTrue(!livraison.contient(porte) && livraison.contient(fenetre) && livraison.contient(panneau));
    }

    @Test
    public void remplacer_neDevraitPasRemplacerProduitManquant() {
        Produit porte = new Produit("porte en bois", 70);
        Produit fenetre = new Produit("fenetre", 20);
        Produit panneau = new Produit("panneau", 20);

        Livraison livraison = new Livraison();
        livraison.ajouter(porte);
        livraison.remplacer(panneau, fenetre);

        assertTrue(livraison.contient(porte) && !livraison.contient(fenetre) && !livraison.contient(panneau));
    }

    @Test
    public void preparer_devraitRepartirCorrectementLesProduits() {
        Produit porte = new Produit("porte en bois", 70);
        Produit fenetre = new Produit("fenetre", 20);
        Produit panneau = new Produit("panneau", 50);

        Livraison livraison = new Livraison();
        livraison.ajouter(porte);
        livraison.ajouter(panneau);
        livraison.ajouter(fenetre);

        livraison.preparer();

        assertTrue("Camionnette ne contient pas la fenetre", livraison.getProduitsCamionette().contains(fenetre));
        assertTrue("Camion ne contiens pas porte ou panneau", livraison.getProduitsCamion().contains(porte) && livraison.getProduitsCamion().contains(panneau));
        assertTrue("Pas le bon nombre dans camionette", livraison.getProduitsCamionette().size() == 1);
        assertTrue("Pas le bon nombre dans le Camion", livraison.getProduitsCamion().size() == 2);

    }

    @Test
    public void CamionDevraitEtreVideSiQueDesProduitsLeger() {
        Produit fenetre = new Produit("fenetre", 20);
        Produit fenetre2 = new Produit("fenetre2", 15);

        Livraison livraison = new Livraison();
        livraison.ajouter(fenetre);
        livraison.ajouter(fenetre2);

        livraison.preparer();

        assertTrue("Camionnette ne contient pas les fenetres", livraison.getProduitsCamionette().contains(fenetre));
        assertTrue("Pas le bon nombre dans camionette", livraison.getProduitsCamionette().size() == 2);
        assertTrue("Comion n'est pas vide", livraison.getProduitsCamion().size() == 0);

    }

    @Test
    public void CamionetteDevraitEtreVideSiQueDesProduitsLourds() {
        Produit fenetre = new Produit("fenetre", 50);
        Produit fenetre2 = new Produit("fenetre2", 55);

        Livraison livraison = new Livraison();
        livraison.ajouter(fenetre);
        livraison.ajouter(fenetre2);

        livraison.preparer();

        assertTrue("Camionnette ne contient pas les fenetres", livraison.getProduitsCamionette().contains(fenetre));
        assertTrue("Pas le bon nombre dans camionette", livraison.getProduitsCamionette().size() == 0);
        assertTrue("Comion n'est pas vide", livraison.getProduitsCamion().size() == 2);

    }
}
