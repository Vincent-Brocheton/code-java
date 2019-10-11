package fr.valarep;

public class IMCcorrection {
    public static void main (String[] args){
        int taille = 170;
        int poids = 75;

        double tailleEnMetre = (double)taille/100;
        double imc = poids / ( tailleEnMetre * tailleEnMetre );

        System.out.println("Un individu de poids "+ poids + " kg et de taille " + tailleEnMetre + " m a un IMC de : " + imc );
        System.out.printf("Un individu de poids %d et de taille %.2f à un IMC de : %.2f", poids , tailleEnMetre , imc);
    }
}