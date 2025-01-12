
package org.centrale.medev.tpnote;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.centrale.medev.tpnote.Tests;

/**
 *
 * @author lacoustille_poulet
 */

public class TestTests{
    public TestTests() {
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

    @Test 
    public void testMain(){
        System.out.println("main");
        Tests.main(new String[2]);
    }

    @Test
    public void testAdder(){
        assertEquals(Tests.theAdder(5,4), 9);
        assertEquals(Tests.theAdder(0, -2), 2);
        assertEquals(Tests.theAdder(-2,-2), 0);
    }
}
