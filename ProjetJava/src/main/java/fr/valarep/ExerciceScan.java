package fr.valarep;

import java.util.*;

public class ExerciceScan {
    public static void main(String[] args) {
        String s = entrerPhrase();
        String s2 = phraseInversée(s);
        System.out.println("Vous avez écrit : " + s2);
    }

    private static String entrerPhrase() {
        Scanner input = new Scanner(System.in);
        System.out.print("Veuillez entrer une phrase : ");
        String s = input.nextLine();
        return s;
    }

    public static String phraseInversée(String s) {
        String res = "";
        int l = s.length();
        char a;
        for (int i = l - 1; i >= 0; i--) {
            a = s.charAt(i);
            res = res + "" + a;
        }
        return res;
    }
}