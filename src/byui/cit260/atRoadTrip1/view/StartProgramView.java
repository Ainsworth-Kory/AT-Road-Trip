/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import byui.cit260.atRoadTrip1.control.GameControl;
import byui.cit260.atRoadTrip1.exceptions.GameControlException;
import byui.cit260.atRoadTrip1.model.Player;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ian Tabeling
 */
public class StartProgramView extends View {
    
    private String promptMessage;
    
    public StartProgramView() {
         //promptMessage = "Please enter your name";
        
        super("\nPlease enter your first name: ");
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        this.console.println(
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
     
    @Override
    public boolean doAction(String playersName) {
        
       /*if (playersName.length() < 2){
            System.out.println("\nInvalid players name:  "
                    + "The name must be greater than one character in length");
            return false;
        }*/
        // call createPlayer() control function
        Player player = null;
        try {
            player = GameControl.createPlayer(playersName);
        } catch (GameControlException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       /* if (player == null) { // if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }*/
        
        //display next view
        this.displayNextView(player);
        
        return true; // success !
    }
   
    private void displayNextView(Player player) {
        // display a custom welcome message
        this.console.println("\n=============================================="
                          + "\n Welcome to the Road Trip " + player.getName()
                          + "\n We hope you enjoy the ride!"
                          + "\n============================================="
                          );
        
        // Ceate the MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
    }

    
    
}