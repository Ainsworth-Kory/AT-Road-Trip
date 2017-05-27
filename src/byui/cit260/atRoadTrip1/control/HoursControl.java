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
public class HoursControl {
    
    public int calcCurrentHour (int prevHour, int timeUsed) {
   
            if (prevHour < 0) { // This is an entry error
                return -222;
           
            }
    
            if (prevHour > 2400) { 
                return -333;
            }
            
            if(timeUsed < 0){
                return -444;
            }
            
            int currentHour = prevHour + (timeUsed * 100);
            return currentHour;
            
    }
            
            //if (prevHour + (timeUsed * 100) < 2400) 
            
        
}
