/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import java.util.Scanner;

/**
 *
 * @author Kory
 */
public class StopFoodView {
    
    private String promptMessage;
    
    public StopFoodView(){
        
         this.promptMessage = "\nWould you like something to eat? (Y or N)";
         // display the banner when the view is created
         this.displayBanner();

    }

    public void displayStopFoodView() {
        
        boolean done = false; // set flag to not done
       do {
           // prompt player for yes or no
           String stopFoodOption = this.getStopFoodOption();
           
           // do the requested action and display the next view
           done = this.doAction(stopFoodOption);
       
       } while (!done);
        
    }
        
    private String getStopFoodOption(){
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\nHow much would you like to spend on food?");
            
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
        
        private boolean doAction(String choice){        
            
        choice = choice.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (choice){
            case "Y": // Yes buy food
                this.displayBuyFood();
                break;
            case "N": // No do not buy food and return to game menu
                this.displayNoFood();
                break;
            case "Q": // quit and return to game menu
                this.displayQuitStopFood();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
}
        
    
    private void displayBanner() {
        
        System.out.println(
                "\n***********************************"
              + "\n*                                 *"
              + "\n*     Welcome to Chuck-n-Go!      *"
              + "\n*                                 *"
              + "\n***********************************"
        );
    }

    
    private void displayBuyFood() {
        System.out.println("\n*** displayBuyFood() function called ***"
                        + "\nYou just purchased food at a cost of $xx.xx."
                        );
    }

    // send the player back to the game menu if they do not want to buy food
    private void displayNoFood() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void displayQuitStopFood() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
    
}
