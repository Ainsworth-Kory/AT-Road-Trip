/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atroadtrip1;

import byui.cit260.atRoadTrip1.model.Actor;
import byui.cit260.atRoadTrip1.model.Car;
import byui.cit260.atRoadTrip1.model.Day;
import byui.cit260.atRoadTrip1.model.Food;
import byui.cit260.atRoadTrip1.model.Game;
import byui.cit260.atRoadTrip1.model.Hazard;
import byui.cit260.atRoadTrip1.model.Hours;
import byui.cit260.atRoadTrip1.model.InventoryItem;
import byui.cit260.atRoadTrip1.model.Location;
import byui.cit260.atRoadTrip1.model.Map;
import byui.cit260.atRoadTrip1.model.Menu;
import byui.cit260.atRoadTrip1.model.Motel;
import byui.cit260.atRoadTrip1.model.Player;
import byui.cit260.atRoadTrip1.model.Question;
import byui.cit260.atRoadTrip1.model.RegSceneType;
import byui.cit260.atRoadTrip1.view.ErrorView;
import byui.cit260.atRoadTrip1.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IanandJenna
 */
public class AtRoadTrip1 {
    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        AtRoadTrip1.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        AtRoadTrip1.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        AtRoadTrip1.inFile = inFile;
    }
    
     public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        AtRoadTrip1.currentGame = currentGame;
    }
     public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        AtRoadTrip1.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            // open character stream files for end user input and output
            AtRoadTrip1.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            AtRoadTrip1.outFile = new PrintWriter(System.out, true);
        
            // open log file
            String filePath = "log.txt";
            AtRoadTrip1.logFile = new PrintWriter(filePath);
       
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
            //startProgramView.display();
            //return;
            
        } catch (Exception e){
             ErrorView.display("Exception: " + e.toString() 
                               + "\nCause: " + e.getCause() 
                               + "\nMessage " + e.getMessage());
                e.printStackTrace();;
                          
           /*System.out.println(e.getMessage());
            e.printStackTrace();
            startProgramView.display();*/
                           
        }
        
        finally {
            try {
                if (AtRoadTrip1.inFile != null)
                    AtRoadTrip1.inFile.close();
                
                if (AtRoadTrip1.outFile != null)
                    AtRoadTrip1.outFile.close();
                
                if (AtRoadTrip1.logFile != null)
                    AtRoadTrip1.logFile.close();
            } catch (IOException ex) {
                ErrorView.display("Error closing files");
                return;
            }
         
        }
    }   

// need to use this function to getgameReport (should be getGameReport??
    public static Game getGameReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
