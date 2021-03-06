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
public class StopFoodView extends View{
    
    private String promptMessage;
    
    public StopFoodView(){
        super ("\nWould you like to buy food? (Y or N)");
        
        // the promptMessage is replaced by the super() function above
    /*     this.promptMessage = "\nWould you like to buy food? (Y or N)"; */
         
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
                this.displayBuyFood();
                break;
            case "N": // No do not buy food and return to game menu
                this.displayNoFood();
                break; 
            case "Q": // quit and return to game menu
                this.displayQuitStopFood();
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
}
        
    
    private void displayBanner() {
        
        this.console.println(
                "\n***********************************"
              + "\n*                                 *"
              + "\n*     Welcome to Chuck-n-Go!      *"
              + "\n*                                 *"
              + "\n***********************************"
        );
    }

    
    private void displayBuyFood() {
        this.console.println("\n*** displayBuyFood() function called ***"
                        + "\nYou just purchased food at a cost of $25.00."
                        );
    }

    // send the player back to the game menu if they do not want to buy food
    private void displayNoFood() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayQuitStopFood() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    
}
