package org.centrale.medev.tpnote;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.centrale.medev.tpnote.Plateau;

/**
 *
 * @author lacoustille_poulet
 */

public class TestPartie{
    public TestPartie() {
        // empty constructor
    }

    @BeforeAll
    public static void setUpClass() {
        //nothing to do yet
    }

    @AfterAll
    public static void tearDownClass() {
        //nothing to do yet

    }

    @BeforeEach
    public void setUp() {
        //nothing to do yet

    }

    @AfterEach
    public void tearDown() {
        //nothing to do yet
    }
    /**
     * Remplace l'utilisateur
     */
    private void mockScannerInput(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void testPartie(){
        afficherMessage();
        mockScannerInput(String.valueOf("d3"));
        Partie partie = Partie();
    }
}