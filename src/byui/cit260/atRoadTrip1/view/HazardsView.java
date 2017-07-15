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
public class HazardsView extends View {
    
    public HazardsView(){
        super ("\nPress 'H' to return to Help Menu or 'Q' to return to Main Menu");
   
         this.displayBanner();

    }
    
    private void displayBanner() {
        this.console.println(
                "\n---------------------------------------------------------"
              + "\n             Potential Road Hazards                      "
              + "\n---------------------------------------------------------"
              + "\n*There are several road hazards in the game             *"
              + "\n*                                                       *"
              + "\n* Getting Lost: There are two ways to get lost          *"
              + "\n* 1. Drive more than 6 hours without food               *" 
              + "\n* 2. Drive more than 3 hours between 8pm and 8am        *"
              + "\n*                                                       *"
              + "\n* Driving too fast: have at least $1 remaining          *"
              + "\n* There are couple downsides to driving too fast        *"
              + "\n* 1. Reduces gas mileage                                *"
              + "\n* 2. Getting pulled over by 'Buford T. Justice'         *" 
              + "\n*Drive faster than 65 MPH for 2 consecutive hours       *"
              + "\n*                                                       *"
              + "\n*The ticket will be based on the speed when pulled over *"
              + "\n*   75 MPH = $50 fine                                   *"
              + "\n*   85 MPH = $100 fine                                  *"
              + "\n*   95 MPH = $150 fine                                  *"
              + "\n*                                                       *"
              + "\n* Moral of the story:                                   *"
              + "\n*  Stop to eat and sleep and don't speed                *"
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
