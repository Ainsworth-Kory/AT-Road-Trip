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
   public double calcCashUsed (double previousCash, double gasCost, double foodCost, double motelCost, double fineCost) throws InventoryControlException{
    
       if (previousCash < 0){
           throw new InventoryControlException("Previous cash cannot be less than 0"); 
       }
       
       if (gasCost > 499){
           throw new InventoryControlException("Cost cannot exceed 499");
       }
       
       if (motelCost > 499) {
           throw new InventoryControlException("Cost cannot exceed 499");
       }
             
       if (previousCash > 500){
           throw new InventoryControlException("Previous cash cannot be greater than 500");
       }
       
       if (foodCost > 499){
           throw new InventoryControlException("Cost cannot exceed 499");
       }
           
       double cashUsed = gasCost + foodCost + motelCost + fineCost;
       
       double cashRemaining = previousCash - cashUsed;
       
       return cashUsed;
   }
    /*
    * @author Kory Ainsworth
    */
   public int calcTimeUsed (int previousTime, int timeUsed) throws InventoryControlException{
    
       if (previousTime < 0){
           throw new InventoryControlException("Previous time cannot be less than 0");
       }
       
       if (timeUsed < 0 || timeUsed > 1) {
           throw new InventoryControlException("Time used must be 1");
       }
             
                
       int totalTime = previousTime + timeUsed;
           
       return totalTime;
   }
   
   /*
    * @author Kory Ainsworth
    */
   public double calcGasCost (double remainGas) throws InventoryControlException {
    
       if (remainGas <= 0){
           throw new InventoryControlException("Gas remaining must be greater than or equal to 1");
       }
                
       double purchGas = 10 - remainGas;
       
       double gasCost = 2.25 * purchGas;
           
       return gasCost;
   }
}
