package org.centrale.medev.tpnote;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.centrale.medev.tpnote.Pion;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author lacoustille_poulet
 */

public class TestPion{
    public TestPion() {
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
     * Test de la méthode retourner
     */
    @Test 
    public void testRetourner(){
        System.out.println("retourner");
        Pion pion1=new Pion(true);
        Pion pion2=new Pion(false);
        pion1.retourner();
        pion2.retourner();
        assertEquals(false,pion1.getCouleur());
        assertEquals(true,pion2.getCouleur());
    }

}