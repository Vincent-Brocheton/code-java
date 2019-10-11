package fr.valarep;

public class Recu {
    public static void main(String[] args) {
        int sousTotal = 38 + 40 + 30;
        System.out.println("Sous-Total:" + sousTotal);
        System.out.println();
        double tva = sousTotal * 0.20;
        System.out.println("TVA:" + tva);
        System.out.println();
        double pourboire = sousTotal * 0.05;
        System.out.println("Pourboire:" + pourboire);
        System.out.println();
        double total = sousTotal + tva + pourboire;
        System.out.println("Total:" + total);
    }
}