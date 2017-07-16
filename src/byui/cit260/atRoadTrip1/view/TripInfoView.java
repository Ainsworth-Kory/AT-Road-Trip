/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import byui.cit260.atRoadTrip1.control.CarControl;
import byui.cit260.atRoadTrip1.control.GameControl;
import byui.cit260.atRoadTrip1.model.Car;
import byui.cit260.atRoadTrip1.model.InventoryItem;
import byui.cit260.atRoadTrip1.model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author whitbillman
 */
public class TripInfoView extends View{
    
    private String promptMessage;
    
    public TripInfoView(){
        
         // implements View superclass to display message         
        super ("\nWould you like to see Trip Info? (Y or N)");
        
    }
    
    public void displayTripInfoView() {
        
        boolean done = false; // set flag to not done
       do {
           // prompt player for yes or no
           String tripInfoOption = this.getTripInfoOption();
           
           // do the requested action and display the next view
           done = this.doAction(tripInfoOption);
       
       } while (!done);
        
    }
        
    private String getTripInfoOption(){
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get the next line typed on the keyboard
            value = value.trim(); // trim off the leading and trailing blanks  
            if (value.length() > 1){ //if the value is too many characters
                System.out.println("\nInvalid value: you must enter Y or N");
                continue;
          }  
            if (value.length() < 1){ //if the value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
             break; // end the loop
          }
            return value; // return the value entered
}  
        @Override
        public boolean doAction(String value){        
            
        value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
            case "Y": // Yes buy food
                this.displayShowInfo();
                break;
            case "N": // No do not buy food and return to game menu
                this.displayNoInfo();
                break; 
            case "Q": // quit and return to game menu
                this.displayQuitInfoView();
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
}
     
    private void displayShowInfo() {
        this.console.println(
                "\n***********************************"
              + "\n*                                 *"
              + "\n*     Welcome to Trip Info!       *"
              + "\n*     Check your dashboard.       *"
              + "\n***********************************"
        );
        this.displayQuitInfoView();
    }

    // send the player back to the game menu if they do not want to buy food
    private void displayNoInfo() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayQuitInfoView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
    
    

