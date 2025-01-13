package org.centrale.medev.tpnote;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.centrale.medev.tpnote.Pion;
import java.util.ArrayList;

/**
 *
 * @author lacoustille_poulet
 */

public class TestPlateau{
    public TestPlateau() {
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
     * Test de la création du plateau
     */

    @Test
    public void testPlateauPlateau(){
        System.out.println("Plateau test");
        Plateau plateau = new Plateau();
        assertEquals(false, plateau.getCase(3, 3).getCouleur());
        assertEquals(true, plateau.getCase(3, 4).getCouleur());
        assertNull(plateau.getCase(3,5));
    }

    /**
     * Test de l'ajout sur le plateau
     */
    @Test 
    public void testAjout(){
        System.out.println("ajout");
        Plateau plateau = new Plateau();
        plateau.ajout(2, 5, false);
        assertEquals(false,plateau.getCase(2, 5).getCouleur());
    }

    /**
     * Test de la méthode qui renvoie la liste des pion retournable pour une position
     */

    @Test 
    public void testRetournes(){
        System.out.println("retournes");
        Plateau plateau=new Plateau();
        ArrayList<Pion> prenable=plateau.retournes(4, 2, false);
        assertEquals(plateau.getCase(4,3),prenable.get(0));
    }
}