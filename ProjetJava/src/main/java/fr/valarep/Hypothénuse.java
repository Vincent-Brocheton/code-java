package fr.valarep;

public class Hypothénuse {
    public static void main(String[] args) {
        double hypo1 = hypothénuse(5, 12);
        System.out.println( "Hypothénuse 1 =" + hypo1);
        double hypo2 = hypothénuse(3, 4);
        System.out.println( "Hypothénuse 2 =" + hypo2);
    }

    public static double hypothénuse (int a, int b) {
        double c = Math.sqrt(carré(a) + carré(b));
        return c;
    }

    public static double carré (int a) {
        double carré = Math.pow(a, 2);
        return carré;
    }
}