/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ian Tabeling
 */
public class DoubleViewTest {
    
    public DoubleViewTest() {
    }

    /**
     * Test of main method, of class DoubleView.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DoubleView.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoubleNumber method, of class DoubleView.
     */
    @Test
    public void testGetDoubleNumber() {
        System.out.println("getDoubleNumber");
        
        DoubleView instance = new DoubleView();
         /* Test case #1 */
        System.out.println("\tTest case #1");
        
        Double number = 100.00;
        Double result = instance.getDoubleNumber();
        double expResult = 100.00;
        
        assertEquals(expResult, result, 0.0001);
    }
    
}
