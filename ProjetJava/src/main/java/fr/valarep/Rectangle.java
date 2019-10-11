package fr.valarep;

public class Rectangle {
    public static void main(String[] args) {
        afficherRectangle(20, 5, '*');
    }

    public static void afficherRectangle(int a, int b, char car) {
        afficherCaractères(a, car);
        System.out.println();
        ligneEspace(a, b, car);
        afficherCaractères(a, car);
    }

    public static void ligneEspace(int a, int b, char car) {
        for (int j = 0; j < b - 2; j++) {
            System.out.print(car);
            afficherCaractères(a - 2, ' ');
            System.out.println(car);
        }
    }

    public static void afficherCaractères(int a, char car) {
        for (int colonne = 0; colonne < a; colonne++) {
            System.out.print(car);
        }
    }
}
