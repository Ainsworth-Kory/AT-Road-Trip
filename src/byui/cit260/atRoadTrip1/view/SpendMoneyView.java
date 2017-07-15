/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

/**
 *
 * @author Ian Tabeling
 */
public class SpendMoneyView extends View{
     
    public SpendMoneyView(){
        super ("\nPress 'H' to return to Help Menu or 'Q' to return to Main Menu");
   
         this.displayBanner();

    }
    
    private void displayBanner() {
        this.console.println(
                "\n---------------------------------------------------------"
              + "\n             How to spend money                          "
              + "\n---------------------------------------------------------"
              + "\n* At the beginning of the game you are assigned $500    *"
              + "\n*******You must have $1 remaining to win the game********"
              + "\n*                                                       *"
              + "\n*  There are several ways to spend money                *"
              + "\n*                                                       *"
              + "\n* Stop to eat: This costs $20                           *"
              + "\n*                                                       *"
              + "\n* Stop at a motel: This costs $100                      *"
              + "\n*                                                       *"
              + "\n* Stop for gas: Max amount is $20.25                    *"
              + "\n*   Gas is $2.25 per gallon                             *"
              + "\n* Gas mileage is dependent on speed                     *"
              + "\n*                                                       *"
              + "\n* Moral of the story:                                   *"
              + "\n*  Don't eat and sleep too much and don't speed         *"
              + "\n---------------------------------------------------------"
              ); 
    }
    @Override
    public boolean doAction(String value) {
    value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
            case "H": // return 
                this.displayHelpMenu();
                break;
            case "Q": // quit and return to game menu
                this.displayMainMenu();
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
} 
    // send the player back to the help menu 
    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }  
    
     // send the player back to the main menu 
    private void displayMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
    
}
