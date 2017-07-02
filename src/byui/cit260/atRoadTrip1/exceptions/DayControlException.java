/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.exceptions;

/**
 *
 * @author IanandJenna
 */
public class DayControlException extends Exception{

    public DayControlException() {
    }

    public DayControlException(String string) {
        super(string);
    }

    public DayControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DayControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DayControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
