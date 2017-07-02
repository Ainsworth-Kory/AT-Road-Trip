/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import byui.cit260.atRoadTrip1.exceptions.InventoryControlException;

/**
 *
 * @author whitbillman
 */
public class InventoryControl {
    // @author Ian Tabeling
    public double calcGasUsed(double previousGas, double speed, double mpg) throws InventoryControlException {
       
        if (previousGas < 0) { // previousGas cannot be negative
            throw new InventoryControlException("Gas volume cannot be negative"); 
        }
        
        if (previousGas > 10) { //prviousGas cannot be gretaer than 10
            throw new InventoryControlException("Gas volume cannot be greater than 10 gallons");
        }
        
        if (speed > 95) {
            throw new InventoryControlException("Speed cannot be greater than 95");
        }
       double gasUsed = speed / mpg;
       
       double gasTotal = previousGas - gasUsed;
       
       double gasRemaining = 10 - gasTotal;
       
       return gasUsed;
    }
    /*
    * @author Ian Tabeling
    */
   public double calcCashUsed (double previousCash, double gasCost, double foodCost, double motelCost, double fineCost) {
    
       if (previousCash < 0){
           return -666;
       }
       
       if (gasCost > 499){
           return -5555;
       }
       
       if (motelCost > 499) {
           return -6666 ;
       }
             
       if (previousCash > 500){
           return -777;
       }
       
       if (foodCost > 499){
           return -7777;
       }
           
       double cashUsed = gasCost + foodCost + motelCost + fineCost;
       
       double cashRemaining = previousCash - cashUsed;
       
       return cashUsed;
   }
    /*
    * @author Kory Ainsworth
    */
   public int calcTimeUsed (int previousTime, int timeUsed) {
    
       if (previousTime < 0){
           return -11;
       }
       
       if (timeUsed < 0 || timeUsed > 1) {
           return -22 ;
       }
             
                
       int totalTime = previousTime + timeUsed;
           
       return totalTime;
   }
   
   /*
    * @author Kory Ainsworth
    */
   public double calcGasCost (double remainGas) {
    
       if (remainGas <= 0){
           return -33;
       }
                
       double purchGas = 10 - remainGas;
       
       double gasCost = 2.25 * purchGas;
           
       return gasCost;
   }
}
