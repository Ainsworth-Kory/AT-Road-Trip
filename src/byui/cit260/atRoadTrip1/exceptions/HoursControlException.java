/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.exceptions;

/**
 *
 * @author Ian Tabeling
 */
public class HoursControlException extends Exception{
    public HoursControlException() {
    }

    public HoursControlException(String string) {
        super(string);
    }

    public HoursControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public HoursControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public HoursControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
