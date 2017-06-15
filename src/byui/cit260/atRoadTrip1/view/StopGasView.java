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
public class StopGasView {
    
    private String promptMessage;
    
    public StopGasView(){
        
         this.promptMessage = "\nFill it up? (Y or N)";
         // display the banner when the view is created
         this.displayBanner();

    }

    public void displayStopGasView() {
        
        boolean done = false; // set flag to not done
       do {
           // prompt player for yes or no
           String stopGasOption = this.getStopGasOption();
        
           // do the requested action and display the next view
           done = this.doAction(stopGasOption);
       
       } while (!done);
        
    }
        
    private String getStopGasOption(){
        
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
        
        private boolean doAction(String choice){        
            
        choice = choice.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (choice){
            case "Y": // Yes buy gas
                this.displayBuyGas();
                break;
            case "N": // No do not buy gas and return to game menu
                this.displayNoGas();
                break;
            case "Q": // quit and return to game menu
                this.displayQuitStopGas();
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
              + "\n*     Welcome to Gas-o-Rama!      *"
              + "\n*                                 *"
              + "\n***********************************"
        );
    }
    
    /*
    void displayPrompt() {
        System.out.println(this.prompt);
    }
    */
    private String stopGasOption() {  // What does this do??
        System.out.println("\n*** stopGasOption string displayed ***");
        return "Thank You!";
    }
    
    private void displayBuyGas() {
        System.out.println("\n*** displayBuyGas() function called ***"
                        + "\nYou just purchased xx.x gallons of gas at a cost of $xx.xx."
                        );
    }

    // send the player back to the game menu if they do not want to buy gas
    private void displayNoGas() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayQuitStopGas() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
    
}
