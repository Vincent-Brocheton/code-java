package fr.valarep;

public class Boucle {
    public static void main(String[] args){
            dessinertiret();
            dessinerVisage();
            ecrireChiffre();
            dessinertiret();
    }

    public static void dessinertiret() {
        for(int i = 1; i <=40 ; i++) {
        System.out.print("-");
        }
        System.out.println();
    }

    public static void dessinerVisage() {
        for(int i = 1; i<= 10; i++ ){
        System.out.print("_-^-");
        }
        System.out.println();
    }

    public static void ecrireChiffre() {
        for(int i = 1; i<=2; i++){
            ecrireMultipleDe11();
        }
        System.out.println();
        }

    private static void ecrireMultipleDe11() {
        for(int i = 1; i<=10; i++){
            System.out.print(i%10 + "" + i%10);
        }
    }    
    
}