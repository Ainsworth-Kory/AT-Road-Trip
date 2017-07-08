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
import byui.cit260.atRoadTrip1.view.StartProgramView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author IanandJenna
 */
public class AtRoadTrip1 {
    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;

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
    private static BufferedReader inFile = null;
    
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
            AtRoadTrip1.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            AtRoadTrip1.outFile = new PrintWriter(System.out, true);
        } catch (Exception e) {
            
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                 "\nMessage " + e.getMessage());
                                                           
            e.printStackTrace();
        }
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
       
            startProgramView.display();
            return;
                  catch (Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            startProgramView.display();
        }
    }   

    /*public static void setPlayer(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    
}
