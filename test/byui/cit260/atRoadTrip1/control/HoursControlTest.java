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
public class HoursControlTest {
    
    public HoursControlTest() {
    }

    /**
     * Test of calcCurrentHour method, of class HoursControl.
     */
    @Test
    public void testCalcCurrentHour() {
        System.out.println("calcCurrentHour");
        
        /* Test case #1 */
        System.out.println("\tTest case #1");
               
        // input values for test case         
        int prevHour = 800;
        int timeUsed = 1;
        
        // create instance of HoursControl class
        HoursControl instance = new HoursControl();
        
        // call function to run test
        int expResult = 900;
        int result = instance.calcCurrentHour(prevHour, timeUsed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /* Test case #2 */
        System.out.println("\tTest case #2");
               
        // input values for test case         
        prevHour = -100;
        timeUsed = 1;
        
        // create instance of HoursControl class
        //HoursControl instance = new HoursControl();
        
        // call function to run test
        expResult = -222;
        result = instance.calcCurrentHour(prevHour, timeUsed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /* Test case #3 */
        System.out.println("\tTest case #3");
               
        // input values for test case         
        prevHour = 2500;
        timeUsed = 1;
        
        // create instance of HoursControl class
        //HoursControl instance = new HoursControl();
        
        // call function to run test
        expResult = -333;
        result = instance.calcCurrentHour(prevHour, timeUsed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /* Test case #4 */
        System.out.println("\tTest case #4");
               
        // input values for test case         
        prevHour = 800;
        timeUsed = -1;
        
        // create instance of HoursControl class
        //HoursControl instance = new HoursControl();
        
        // call function to run test
        expResult = -444;
        result = instance.calcCurrentHour(prevHour, timeUsed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /* Test case #5 */
        System.out.println("\tTest case #5");
               
        // input values for test case         
        prevHour = 0;
        timeUsed = 1;
        
        // create instance of HoursControl class
        //HoursControl instance = new HoursControl();
        
        // call function to run test
        expResult = 100;
        result = instance.calcCurrentHour(prevHour, timeUsed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /* Test case #6 */
        System.out.println("\tTest case #6");
               
        // input values for test case         
        prevHour = 2400;
        timeUsed = 0;
        
        // create instance of HoursControl class
        //HoursControl instance = new HoursControl();
        
        // call function to run test
        expResult = 2400;
        result = instance.calcCurrentHour(prevHour, timeUsed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
