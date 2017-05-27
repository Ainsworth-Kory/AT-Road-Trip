/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author whitbillman
 */
public class DayControlTest {
    
    public DayControlTest() {
    }

    /**
     * Test of calcTotalDays method, of class DayControl.
     */
    @Test
    public void testCalcTotalDays() {
        System.out.println("calcTotalDays");
        
        /* Test case #1 */
        System.out.println("\tTest case #1");
        
        // input values for test case
        int prevDays = 0;
        
        // create instance of DayControl class
        DayControl instance = new DayControl();
        
        // call function to run test
        int expResult = 1;
        int result = instance.calcTotalDays(prevDays);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /* Test case #2 */
        System.out.println("\tTest case #2");
        
        // input values for test case
         prevDays = -1;
        
        // create instance of DayControl class
        // DayControl instance = new DayControl();
        
        // call function to run test
         expResult = -111;
         result = instance.calcTotalDays(prevDays);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
      
    }
    
}
