/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class test ModelFileImplementation from implementation package
 * @author Emil
 */
public class ModelFileImplementationTest {

    public ModelFileImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class ModelFileImplementation.
     * Expect to the message not be equal to the greeting we received form the config file
     */
    @Test
    public void testNotGetGreeting() {
        ModelFileImplementation instance = new ModelFileImplementation();
        String expResult = "No Hello world";
        String result = instance.getGreeting();
        assertNotEquals("The message is not correct", expResult, result);
    }

    /**
     * Test of getGreeting method, of class ModelFileImplementation.
     * Expect to the message to be equal to the greeting we received form the config file
     */
    @Test
    public void testGetGreeting() {
        ModelFileImplementation instance = new ModelFileImplementation();
        String expResult = "Hello world File";
        String result = instance.getGreeting();
        assertEquals("The message is correct", expResult, result);
    }

}
