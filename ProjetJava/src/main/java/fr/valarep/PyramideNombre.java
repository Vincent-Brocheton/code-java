package fr.valarep;

public class PyramideNombre {
    public static final int NB_LIGNES=5;
    public static void main(String[] args) {
        afficherPyramide();
    }

    public static void afficherPyramide() {
        for (int i = 1; i <=NB_LIGNES; i++) {
            afficherTirets(i);
            afficherNombre(i);
            afficherTirets(i);
        System.out.println();
        }
    }

    public static void afficherNombre(int i) {
        for (int j= 1; j <=i*2-1; j++)  {
            System.out.print(i*2-1);
            }
    }
    

    public static void afficherTirets(int i) {
        for (int j = 1; j <=6-i; j++) {
            System.out.print("-");
        }
    }
}