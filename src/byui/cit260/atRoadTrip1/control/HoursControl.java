/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import byui.cit260.atRoadTrip1.exceptions.HoursControlException;

/**
 *
 * @author whitbillman
 */
public class HoursControl {
    
    public int calcCurrentHour (int prevHour, int timeUsed) throws HoursControlException {
   
            if (prevHour < 0) { // This is an entry error
                throw new HoursControlException("Previous hour must be greater than 0.");   
           
            }
    
            if (prevHour > 2400) { 
                throw new HoursControlException("Previous hour must be less than 2400.");
              
            }
            
            if(timeUsed < 0){
                throw new HoursControlException("Previous time used must be greater than 0.");
                
            }
            
            int currentHour = prevHour + (timeUsed * 100);
            return currentHour;
            
    }
            
            //if (prevHour + (timeUsed * 100) < 2400) 
}
