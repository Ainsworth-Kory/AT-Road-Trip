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
public class DayControl {
    
   public int calcTotalDays (int prevDays) {
   
            if (prevDays < 0) { // This is an entry error
                return -111;
           
            }
   
            int totalDays = prevDays + 1;
            return totalDays;
    
        }
}