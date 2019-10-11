package fr.valarep;

public class Minimum {
    public static void main(String[] args) {
        int min = pieceDe20(64, 20);
        int reste = resteAPayer(64, 20);
        System.out.println("Il faut " + min + " pièces de 20cts. Et il reste " + reste + "cts à payer.");
    }
    
    public static int pieceDe20(int euroTotal, int pieceCentimes) {
        return (int)Math.floor(euroTotal/pieceCentimes);
    }

    public static int resteAPayer(int euroTotal, int pieceCentimes){
        return euroTotal%pieceCentimes;
    }
}