package fr.valarep;

import org.junit.Test;
import static org.junit.Assert.*;

public class DuréeTest {
    @Test
    public void testConstructeurHeuresMinutes() {
        Durée durée = new Durée(3, 30);

        assertEquals(3, durée.getHeures());
        assertEquals(30, durée.getMinutes());

    }

    @Test
    public void testConstructeurDecimal() {
        Durée durée = new Durée(3.5);

        assertEquals(3, durée.getHeures());
        assertEquals(30, durée.getMinutes());

    }

    @Test
    public void getDec_3h30_retourne_3Virgule5() {
        Durée durée = new Durée(3, 30);

        assertEquals(3.5, durée.getDec(), 0.001);
    }
    @Test
    public void getDurée_3virugle5_retourne_3h30() {
        Durée durée = new Durée(1, 20);
        durée.setDurée(3.5);

        assertEquals(3, durée.getHeures());
        assertEquals(30, durée.getMinutes());
    }
    @Test
    public void plusHeures_3h30_retourne_13h30() {
        Durée durée = new Durée(3, 30);
        durée.plusHeures(10);

        assertEquals(13, durée.getHeures());
        assertEquals(30, durée.getMinutes());
    }
    @Test
    public void plusMinutes_3h30_retourne_3h40() {
        Durée durée = new Durée(3, 30);
        durée.plusMinutes(10);

        assertEquals(3, durée.getHeures());
        assertEquals(40, durée.getMinutes());
    }
    @Test
    public void plusDurée_3h30plus3Virgule5_retourne_7h00() {
        Durée durée = new Durée(3.5);
        durée.plusDurée(3.5);

        assertEquals(7, durée.getHeures());
        assertEquals(0, durée.getMinutes());
    }

    @Test
    public void plusDurée_3h30plus3h30_retourne7h00(){
        Durée durée = new Durée(3, 30);
        durée.plusDurée(3,30);

        assertEquals(7, durée.getHeures());
        assertEquals(0, durée.getMinutes());
    }

    @Test
    public void plusDurée_3h30plus1h40_retourne5h10(){
        Durée durée = new Durée(3, 30);
        durée.plusDurée(1,40);

        assertEquals(5, durée.getHeures());
        assertEquals(10, durée.getMinutes());
    }


    @Test
    public void plusDurée_Tableau_0h00_2h10plus5h00_retourne7h10(){
        Durée durée = new Durée(0, 00);

        Durée durée1 = new Durée(2, 10);
        Durée durée2 = new Durée(5.0);
        durée.plusDurée(durée1, durée2);

        assertEquals(7, durée.getHeures());
        assertEquals(10, durée.getMinutes());
    }

}