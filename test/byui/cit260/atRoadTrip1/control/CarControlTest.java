/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import byui.cit260.atRoadTrip1.exceptions.CarControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author whitbillman
 */
public class CarControlTest {
    
    public CarControlTest() {
    }

    /**
     * Test of calcTotalMiles method, of class CarControl.
     */
    @Test
    public void testCalcTotalMiles() throws CarControlException {
        System.out.println("calcTotalMiles");
        
        /* Test case #1 */
        System.out.println("\tTest case #1");
        
        // input values for test case
        int prevDistance = 0;
        int speed = 65;
        
        // create instance of CarControl class
        CarControl instance = new CarControl();
        
        // call function to run test
        int expResult = 1935;
        int result = instance.calcTotalMiles(prevDistance, speed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    

        /* Test case #2 */
        System.out.println("\tTest case #2");
        
        // input values for test case
        prevDistance = -10;
        speed = 65;
        
        // create instance of CarControl class
       // CarControl instance = new CarControl();
        
        // call function to run test
         expResult = -999;
         result = instance.calcTotalMiles(prevDistance, speed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /* Test case #3 */
        System.out.println("\tTest case #3");
        
        // input values for test case
        prevDistance = 2000;
        speed = 65;
        
        // create instance of CarControl class
       // CarControl instance = new CarControl();
        
        // call function to run test
         expResult = -888;
         result = instance.calcTotalMiles(prevDistance, speed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /* Test case #4 */
        System.out.println("\tTest case #4");
        
        // input values for test case
        prevDistance = 100;
        speed = 110;
        
        // create instance of CarControl class
       // CarControl instance = new CarControl();
        
        // call function to run test
         expResult = -555;
         result = instance.calcTotalMiles(prevDistance, speed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        /* Test case #5 */
        System.out.println("\tTest case #5");
        
        // input values for test case
        prevDistance = 0;
        speed = 0;
        
        // create instance of CarControl class
       // CarControl instance = new CarControl();
        
        // call function to run test
         expResult = 2000;
         result = instance.calcTotalMiles(prevDistance, speed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /* Test case #6 */
        System.out.println("\tTest case #6");
        
        // input values for test case
        prevDistance = 1999;
        speed = 0;
        
        // create instance of CarControl class
       // CarControl instance = new CarControl();
        
        // call function to run test
         expResult = 1;
         result = instance.calcTotalMiles(prevDistance, speed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /* Test case #7 */
        System.out.println("\tTest case #7");
        
        // input values for test case
        prevDistance = 0;
        speed = 105;
        
        // create instance of CarControl class
       // CarControl instance = new CarControl();
        
        // call function to run test
         expResult = 1895;
         result = instance.calcTotalMiles(prevDistance, speed);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
