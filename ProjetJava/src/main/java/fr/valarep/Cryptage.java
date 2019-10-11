package fr.valarep;

import java.util.Scanner;

public class Cryptage {
    public static void main(String[] args) {
        String s = entrerPhrase();
        int décalage = entrerDécalage();
        String crypte = coder(s, décalage);
        System.out.println("Votre message crypté est : " + crypte);
    }

    public static String coder(String s, int a) {
        a = a % 26;
        String crypte = "";
        int l = s.length();
        char b;
        for (int i = 0; i < l; i++) {
            b = (char) (s.charAt(i) + a);
            if (b > 'Z') {
                int marge = b - 'Z';
                b = (char) ('A' + marge - 1);
            }
            crypte = crypte + "" + b;
        }
        return crypte;

    }

    public static int entrerDécalage() {
        Scanner input = new Scanner(System.in);
        System.out.print("veuillez entrer le décalage souhaité : ");

        int décalage = input.nextInt();
        return décalage;
    }

    public static String entrerPhrase() {
        Scanner input = new Scanner(System.in);
        System.out.print("veuillez entrer votre phrase : ");
        String s = input.nextLine();
        return s;
    }
}