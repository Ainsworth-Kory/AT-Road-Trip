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
    /*
    public void displayStopFoodGasView() {
        
        boolean done = false; // set flag to not done
       do {
           // prompt player for yes or no
           String stopFoodGasOption = this.getStopFoodGasOption();
        
           // do the requested action and display the next view
           done = this.doAction(stopFoodGasOption);
       
       } while (!done);
        
    }
        
    private String getStopFoodGasOption(){
        
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
} */
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
              + "\n*     Welcome to Gas-n-Gulp!      *"
              + "\n*                                 *"
              + "\n***********************************"
                );
    }

    private void displayBuyFoodGas() {
        System.out.println("\n*** displayBuyFoodGas() function called ***"
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
