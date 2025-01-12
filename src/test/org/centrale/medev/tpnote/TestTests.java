
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
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
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
