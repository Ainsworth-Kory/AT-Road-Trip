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
public class MainMenuView {
     
    private String menu;
    private String promptMessage;
    
    public MainMenuView(){
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n  Main Menu                           "
                  + "\n--------------------------------------"
                  + "\nN - Start new game"
                  + "\nR - Restart existing game"
                  + "\nH - Get help on how to play the game"
                  + "\nQ - Quit"
                  + "\n--------------------------------------";
    
    
    }
    /*
    * displays the start program view
    */

   public void displayMainMenuView() {
         
       boolean done = false; // set flag to not done
       do {
           // prompt for and get players name
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("Q")) // user wants to quit game
               return; // exit the game
           
           // do the requested action and disply the next view
           done = this.doAction(menuOption);
       
       } while (!done);
   }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get the next line typed on the keyboard
            value = value.trim(); // trim off the leading and trailing blanks
            
            if (value.length() < 1){//if the value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
             break; // end the loop
          }
            return value; // return the value entered
    }

    public boolean doAction(String choice){
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
        
        switch (choice){
            case "N": // create and start new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenuView();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
    
          return rtnValue;
    } 
     private void startNewGame(){
         // create a new game
        GameControl.createNewGame(AtRoadTrip1.getPlayer());
    
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
     }
    private void startExistingGame(){
        System.out.println("*** startExistingGame function called ***");
    }
    
     void displayHelpMenuView(){
        // display help menu
       HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView(); 
    }
  }


