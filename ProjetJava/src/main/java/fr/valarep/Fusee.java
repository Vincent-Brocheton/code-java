package fr.valarep;

public class Fusee {
    public static void main(String[] args) {
        DessinerLosange();
        System.out.println();
        DessinerCroix();
        System.out.println();
        DessinerFusee();
    }

    public static void DessinerLosange() {
        DessinerTriangle();
        DessinerTriangleInversé();
    }

    public static void DessinerCroix() {
        DessinerTriangleInversé();
        DessinerTriangle();
    }

    public static void DessinerFusee() {
        DessinerTriangle();
        DessinerCarré();
        AfficherJava();
        DessinerCarré();
        DessinerTriangle();
    }

    public static void DessinerTriangle() {
        System.out.println("   /\\   ");
        System.out.println("  /  \\  ");
        System.out.println(" /    \\ ");
    }

    public static void DessinerTriangleInversé() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void DessinerCarré() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }

    public static void AfficherJava() {
        System.out.println("| Java |");
    }
}