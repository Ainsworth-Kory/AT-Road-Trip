/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;
import byui.cit260.atRoadTrip1.exceptions.DayControlException;
/**
 *
 * @author whitbillman
 */
public class DayControl {
    
   public int calcTotalDays (int prevDays) throws DayControlException {
                    
            if (prevDays < 0) { // This is an entry error
                throw new DayControlException("Previous days must be greater than 0.");
           
            }
   
            int totalDays = prevDays + 1;
            return totalDays;
    
        }
}
