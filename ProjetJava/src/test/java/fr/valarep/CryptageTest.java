package fr.valarep;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class CryptageTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void ABCD_3_Retourne_DEFG() {
        String entree = "ABCD";
        int decalage = 3;

        String sortie = Cryptage.coder(entree,decalage);

        assertEquals("DEFG", sortie);
    }
@Test
public void XYZ_3_Retourne_ABC(){
        String entree = "XYZ";
        int decalage = 3;

        String sortie = Cryptage.coder(entree,decalage);

        assertEquals("ABC", sortie);
    }
}
    