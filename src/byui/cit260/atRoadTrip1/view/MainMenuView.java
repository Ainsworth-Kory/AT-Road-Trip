/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import atroadtrip1.AtRoadTrip1;
import byui.cit260.atRoadTrip1.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Ian Tabeling
 */
public class MainMenuView extends View {

    public MainMenuView() {
        // implements view superclass to display main menu
        super("\n"
                  + "\n--------------------------------------"
                  + "\n            Main Menu                 "
                  + "\n--------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and Start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n--------------------------------------");
    
    }
   
    // uses view supperclass to implement doAction
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
        
        switch (value){
            case "N": // create and start new game
                this.startNewGame();
                break;
            case "G": // create and start new game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenuView();
                break;
            case "S": // create and start new game
                this.saveGame();
                break;
            case "Q": // create and start new game
                return true;
            default:
                ErrorView.display("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
    
          return rtnValue;
    } 
    
     private void startNewGame(){
         // create a new game
        GameControl.createNewGame(AtRoadTrip1.getPlayer());
    
        // display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display(); //GameMenuView
     }
    private void startExistingGame(){
        this.console.println("\n\nEnter the file path for where game "
                             + "file is saved");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getExisitingGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
     void displayHelpMenuView(){
        // display help menu
       HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display(); //HelpMenuView
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for where the game"
                            + " is to be saved");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(AtRoadTrip1.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }
  }


