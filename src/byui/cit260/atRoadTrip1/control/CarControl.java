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
public class CarControl {
    
    public int calcTotalMiles(int prevDistance, int speed) {
   
            if (prevDistance < 0 || speed < 0) { // This is an entry error
                return -999;
           
            }
    
            if (prevDistance > 1999) { //Exceeded distance of game
                return -888;
            }
   
            if (speed > 105) { 
                return -555;
            }
            
          int miles = prevDistance + speed;
          int totalMiles = 2000 - miles;
          
          return totalMiles;
            
}
}
    
