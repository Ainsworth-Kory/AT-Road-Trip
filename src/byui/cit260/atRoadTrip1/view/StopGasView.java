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
public class StopGasView extends View{
    
    private String promptMessage;
    
    public StopGasView(){
        super ("\nFill it up? (Y or N)");
    /*     this.promptMessage = "\nFill it up? (Y or N)"; */
         // display the banner when the view is created
         this.displayBanner();

    }
    
        @Override
        public boolean doAction(String value){        
            
        value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
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
        this.console.println("\n*** stopGasOption string displayed ***");
        return "Thank You!";
    }
    
    private void displayBuyGas() {
        this.console.println("\n*** displayBuyGas() function called ***"
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
