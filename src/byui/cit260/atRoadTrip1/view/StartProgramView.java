/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import byui.cit260.atRoadTrip1.control.GameControl;
import byui.cit260.atRoadTrip1.model.Player;
import java.util.Scanner;

/**
 *
 * @author Ian Tabeling
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        // promtMessage = "Please enter your name"
        
        this.promptMessage = "\nPlease enter your first name: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n*************************************************"
              + "\n*                                               *"
              + "\n* Hello! Are you ready to start your road trip? *"  
              + "\n* You must reach your destination within 30     *"
              + "\n* hours in order to win the game, so you need   *"
              + "\n* to calculate the time, the distance, how much *"
              + "\n* gas you'll need, and how much money you'll    *"
              + "\n* spend along the way. Use your money wisely so *" 
              + "\n* you don't run out of gas or food. If you make *"
              + "\n* it in time and still have money and gas, you  *"
              + "\n* win the game.                                 *"
              + "\n*                                               *"
              + "\n* So pack up and let's hit the road!            *"
              + "\n*                                               *"
              + "\n*************************************************"
              ); 
    }
     /**
      *  displays the start program view
      */
    public void displayStartProgramView() {
        
        boolean done = false; // set flag to not done
        do{
          // prompt for and get players name
          String playersName = this.getPlayersName();
          if (playersName.toUpperCase().equals("Q")) //user wants to quit game
              return; // exit the game
          
          // do the requested action and diplay the next view
          done = this.doAction(playersName);
          
    } while (!done);
    
}

    private String getPlayersName() {
       
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2){
            System.out.println("\nInvalid players name:  "
                    + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; // success !
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n=============================================="
                          + "\n Welcome to the Road Trip " + player.getName()
                          + "\n We hope you enjoy the ride!"
                          + "\n============================================="
                          );
        
        // Ceate the MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }

    
    
}