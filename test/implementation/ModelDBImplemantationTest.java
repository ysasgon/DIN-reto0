/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class test ModelDBImplementation from implementation package
 * @author Emil
 */
public class ModelDBImplemantationTest {
    
    public ModelDBImplemantationTest() {
    }
    
    /**
     * Test of getGreeting method, of class ModelDBImplemantation.
     * Expect to the message not be equal to the greeting we received form database
     */
    @Test
    public void testNotGetGreeting() {
        ModelDBImplemantation instance = new ModelDBImplemantation();
        String expResult = "No Hello world";
        String result = instance.getGreeting();
        assertNotEquals("The message is not correct", expResult, result);
    }

    /**
     * Test of getGreeting method, of class ModelDBImplemantation.
     * Expect to the message to be equal to the greeting we received form database
     */
    @Test
    public void testGetGreeting() {
        ModelDBImplemantation instance = new ModelDBImplemantation();
        String expResult = "Hello world DB";
        String result = instance.getGreeting();
        assertEquals("The message is correct", expResult, result);
    }
    
    
    
}
