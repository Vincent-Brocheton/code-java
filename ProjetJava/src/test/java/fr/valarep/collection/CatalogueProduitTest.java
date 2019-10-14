package fr.valarep.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatalogueProduitTest {

    @Test
    public void ajouter_devraitAjouterMesProduits() {
        Produit porte = new Produit("porte en bois", 70);
        Produit fenetre = new Produit("fenetre", 20);

        Fournisseur fou1 = new Fournisseur("BoutiqueKarine");
        fou1.ajouterProduit(porte);
        fou1.ajouterProduit(fenetre);
        Fournisseur fou2 = new Fournisseur("JavaDiscount");
        fou2.ajouterProduit(porte);
        fou2.ajouterProduit(fenetre);

        CatalogueProduits catalogue = new CatalogueProduits();
        catalogue.ajouterProduitsFournisseur(fou1);
        catalogue.ajouterProduitsFournisseur(fou2);

        assertTrue("catalogue ne contient pas tout les produits ajoutés", catalogue.contient(porte) && catalogue.contient(fenetre));
        assertEquals("Catalogue ne contient pas 2 produit", 2, catalogue.getNbProduit());
    }

}
