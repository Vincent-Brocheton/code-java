package fr.valarep;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        String s = entrerInformations();
        double moyenne = separerLesInformations(s);
        String nom = recupererNom(s);
        System.out.print(nom + " à une moyenne de : " + moyenne);
    }

    public static String recupererNom(String s) {
        String[] output = s.split(" ");
        String nom = output [0];
        return nom;
    }

    public static double separerLesInformations(String s) {
        String[] output = s.split(" ");
        double NoteCumul = 0;
        double Moyenne;
        for (int i = 1; i < output.length; i++) {

            NoteCumul += Double.parseDouble(output[i]);
        }
        Moyenne = NoteCumul / (output.length - 1);
        return Moyenne;
    }

    public static String entrerInformations() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez les informations : ");
        String s = input.nextLine();
        return s;
    }
}