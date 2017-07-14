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
public class StopFoodGasView extends View{
    
    private String promptMessage;
    
    public StopFoodGasView(){
        super ("\nFill it up and get a bite to eat? (Y or N)");
    /*     this.promptMessage = "\nFill it up and get a bite to eat? (Y or N)"; */
         // display the banner when the view is created
         this.displayBanner();

    }
    
        @Override
        public boolean doAction(String value){        
            
        value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
            case "Y": // Yes buy gas
                this.displayBuyFoodGas();
                break;
            case "N": // No do not buy gas and return to game menu
                this.displayNoFoodGas();
                break;
            case "Q": // quit and return to game menu
                this.displayQuitStopFoodGas();
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
              + "\n*     Welcome to Gas-n-Gulp!      *"
              + "\n*                                 *"
              + "\n***********************************"
                );
    }

    private void displayBuyFoodGas() {
        this.console.println("\n*** displayBuyFoodGas() function called ***"
                        + "\nYou just purchased xx.x gallons of gas at a cost of $xx.xx."
                        + "\n and purchased food at a cost of $25.00."
                        );
    }

    private void displayNoFoodGas() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayQuitStopFoodGas() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

}
