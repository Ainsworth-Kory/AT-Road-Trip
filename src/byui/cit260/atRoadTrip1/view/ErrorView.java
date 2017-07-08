/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import atroadtrip1.AtRoadTrip1;
import java.io.PrintWriter;

/**
 *
 * @author Ian Tabeling
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = AtRoadTrip1.getOutFile();
    private static final PrintWriter logFile = AtRoadTrip1.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                     "--------------------------------------"
                    + "\n- Error - " + errorMessage
                    + "\n-----------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }

    public static void display(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
