package fr.valarep;

import java.util.*;

public class TestIf {
    public static void main(String[] args) {
        String s = entrerPhrase();
        int nbLettres = calculerCaractère(s);
        System.out.println("Il y a " + nbLettres + " lettres dans cette phrase.");

    }

    public static int calculerCaractère(String s) {
        int nbLettres = 0;
        char a;
        int l = s.length();
        for (int i = l - 1; i >= 0; i--) {
            a = s.charAt(i);
            if (estUneMajuscule(a) || estUneMinuscule(a)) {
                nbLettres++;
            }
        }
        return nbLettres;
    }

    public static boolean estUneMinuscule(char a) {
        return a >= 'a' && a <= 'z';
    }

    public static boolean estUneMajuscule(char a) {
        return a >= 'A' && a <= 'Z';
    }

    public static String entrerPhrase() {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer une phrase : ");
        String s = input.nextLine();
        return s;
    }
}
