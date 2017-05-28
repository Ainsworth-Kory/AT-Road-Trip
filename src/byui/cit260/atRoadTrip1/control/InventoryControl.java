/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

/**
 *
 * @author whitbillman
 */
public class InventoryControl {
    // @author Ian Tabeling
    public double calcGasUsed(double previousGas, double speed, double mpg) {
       
        if (previousGas < 0) { // previousGas cannot be negative
            return -9999; 
        }
        
        if (previousGas > 10) { //prviousGas cannot be gretaer than 10
            return -8888;
        }
        
        if (speed > 95) {
            return -555;
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
