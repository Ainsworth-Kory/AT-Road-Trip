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
 * @author Ian Tabeling
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcGasUsed method, of class InventoryControl.
     */
    @Test
    public void testCalcGasUsed() {
        System.out.println("calcGasUsed");
        
        /*********************
         * Test Case #1
         *********************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double previousGas = -10;// previousGas cannot be negative
        double speed = 65;
        double mpg = 25;
        // create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        
        double expResult = -9999; // expected output returend value
        // call function to run test
        double result = instance.calcGasUsed(previousGas, speed, mpg);
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       /*********************
         * Test Case #2
         *********************/
        System.out.println("\tTest case #2");
        //input values for test case 2
        previousGas = 11; // previousGas cannot be > 10
        speed = 65;
        mpg = 25;
        expResult = -8888; // expected output returned value
        result = instance.calcGasUsed(previousGas, speed, mpg);
        //compare expected returned valure with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       /*********************
         * Test Case #3
         *********************/
        System.out.println("\tTest case #3");
        //input values for test case 3
        previousGas = 10.0; 
        speed = 96;// spped cannot be > 95
        mpg = 8;
        expResult = -555; // expected output returned value
        result = instance.calcGasUsed(previousGas, speed, mpg);
        //compare expected returned valure with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       /*********************
         * Test Case #4
         *********************/
        System.out.println("\tTest case #4");
        //input values for test case 4
        previousGas = 0.0; // boundary test (0 speed = 0 gasUsed)
        speed = 0;
        mpg = 25;
        expResult = 0.0; // expected output returned value
        result = instance.calcGasUsed(previousGas, speed, mpg);
        //compare expected returned valure with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       /*********************
         * Test Case #5
         *********************/
        System.out.println("\tTest case #5");
        //input values for test case 5
        previousGas = 10.0; // boundary test previousGas 10 = 0 speed
        speed = 0;
        mpg = 25;
        expResult = 0.0; // expected output returned value
        result = instance.calcGasUsed(previousGas, speed, mpg);
        //compare expected returned valure with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
       /*********************
         * Test Case #6
         *********************/
        System.out.println("\tTest case #6");
        //input values for test case 6
        previousGas = 10.0;
        speed = 95; // boundary test speed cannot > 95
        mpg = 10;
        expResult = 9.5; // expected output returned value
        result = instance.calcGasUsed(previousGas, speed, mpg);
        //compare expected returned valure with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
      
       /*********************
         * Test Case #7
         *********************/
        System.out.println("\tTest case #7");
        //input values for test case 7
        previousGas = 8.0; // valid input test
        speed = 65;
        mpg = 25;
        expResult = 2.6; // expected output returned value
        result = instance.calcGasUsed(previousGas, speed, mpg);
        //compare expected returned valure with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of calcCashUsed method, of class InventoryControl.
     */
    @Test
    public void testCalcCashUsed() {
        System.out.println("calcCashUsed");
        
        /************************
         * cashUsed Test Case #1
         ************************/
        System.out.println("\tcashUsed Test Case #1");
        // input values for test case #1
        double previousCash = -10;// previous cash must be >= 1
        double gasCost = 0.0;
        double foodCost = 0.0;
        double motelCost = 0.0;
        double fineCost = 0.0;
        // create instance of InventoryControl class
        InventoryControl instance = new InventoryControl();
        // expected output returned value
        double expResult = -666;
        //call function to run test
        double result = instance.calcCashUsed(previousCash, gasCost, foodCost, motelCost, fineCost);
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       
        /************************
         * cashUsed Test Case #2
         ************************/
        System.out.println("\tcashUsed Test Case #2");
        //input values for test case #2
        previousCash = 0;
        gasCost = 0.0;
        foodCost = 0.0;
        motelCost = 500.0; // motel cost must be <= 499
        fineCost = 0.0;
       // expected output returned value
        expResult = -6666;
        // call function to run test
        result = instance.calcCashUsed(previousCash, gasCost, foodCost, motelCost, fineCost);
       // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
   
        /************************
         * cashUsed Test Case #3
         ************************/ 
       System.out.println("\tcashUsed Test Case #3");
        // input values for test case #3
        previousCash = 0;
        gasCost = 0.0;
        foodCost = 500; // food cost must be <= 499
        motelCost = 0.0;
        fineCost = 0.0;
        //expected result
        expResult = -7777;
        // call function to run test
        result = instance.calcCashUsed(previousCash, gasCost, foodCost, motelCost, fineCost);
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /************************
         * cashUsed Test Case #4
         ************************/
        System.out.println("\tcashUsed Test Case #4");
        // input values for test case #4
        previousCash = 600;// previous cash cannot be > 500
        gasCost = 0.0;
        foodCost = 0.0;
        motelCost = 0.0;
        fineCost = 0.0;
        //expected result
        expResult = -777;
        // call function to run test
        result = instance.calcCashUsed(previousCash, gasCost, foodCost, motelCost, fineCost);
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /************************
         * cashUsed Test Case #5
         ************************/
        System.out.println("\tcashUsed Test Case #5");
        // input values for test case #5
        previousCash = 500;
        gasCost = 0.0;
        foodCost = 0.0;
        motelCost = 0.0;
        fineCost = 0.0;
        //expected result
        expResult = 0.0;// no cash used
        // call function to run test
        result = instance.calcCashUsed(previousCash, gasCost, foodCost, motelCost, fineCost);
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /************************
         * cashUsed Test Case #6
         ************************/
        System.out.println("\tcashUsed Test Case #6");
        // input values for test case #6
        previousCash = 0.0;
        gasCost = 10.0;
        foodCost = 389.0;
        motelCost = 100.0;
        fineCost = 0.0;
        //expected result
        expResult = 499.0;
        // call function to run test
        result = instance.calcCashUsed(previousCash, gasCost, foodCost, motelCost, fineCost);
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /************************
         * cashUsed Test Case #7
         ************************/
        System.out.println("\tcashUsed Test Case #7");
        // input values for test case #7
        previousCash = 500.0;
        gasCost = 11.25;
        foodCost = 20.0;
        motelCost = 100.0;
        fineCost = 0.0;
        //expected result
        expResult = 131.25;
        // call function to run test
        result = instance.calcCashUsed(previousCash, gasCost, foodCost, motelCost, fineCost);
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
