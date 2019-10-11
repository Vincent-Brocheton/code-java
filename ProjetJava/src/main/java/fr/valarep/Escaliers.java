package fr.valarep;

public class Escaliers {
    public static void main(String[] args) {
        dessinerEscaliers();
    }

    private static void dessinerEscaliers() {
        final int NB_MARCHE = 5;
        int nbEspaceAvant = 5 * NB_MARCHE;
        int nbEspaceAprès = 0;

        for (int marche = 1; marche <= NB_MARCHE; marche++) {
            afficherEspace(nbEspaceAvant);
            System.out.print(" o  ******");
            afficherEspace(nbEspaceAprès);
            System.out.println("*");
            nbEspaceAprès +=5;

            afficherEspace(nbEspaceAvant);
            System.out.print("/|\\ *");
            afficherEspace(nbEspaceAprès);
            System.out.println("*");

            afficherEspace(nbEspaceAvant);
            System.out.print("/ \\ *");
            afficherEspace(nbEspaceAprès);
            System.out.println("*");

            nbEspaceAvant -= 5;
        }
    }

    private static void afficherEspace(int nbEspaceAvant) {
        for (int i = 0; i < nbEspaceAvant; i++) {
            System.out.print(" ");
        }
    }
}