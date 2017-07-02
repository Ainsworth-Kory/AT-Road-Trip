/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import byui.cit260.atRoadTrip1.exceptions.CarControlException;
import byui.cit260.atRoadTrip1.model.Car;

/**
 *
 * @author whitbillman
 */
public class CarControl {
    public static int main(String args[]){
    CarControl carControl = new CarControl();
    int prevDistance;
    int speed;
    
    prevDistance = 0;
    speed = 65;
    
    return prevDistance;    
 /*   return speed;  */
    }
    
    public int calcTotalMiles(int prevDistance, int speed) throws CarControlException {
   
            if (prevDistance < 0 || speed < 0) { // This is an entry error
                throw new CarControlException("Previous distance or previous speed must be greater than 0.");
           
            }
    
            if (prevDistance > 1999) { //Exceeded distance of game
                throw new CarControlException("Previous distance must be less than 1999.");
            }
   
            if (speed > 105) { 
                throw new CarControlException("Speed must be 105 or less.");
            }
            
          int miles = prevDistance + speed;
          int totalMiles = 2000 - miles;
          
          return totalMiles;
          
            
    }

}
    
