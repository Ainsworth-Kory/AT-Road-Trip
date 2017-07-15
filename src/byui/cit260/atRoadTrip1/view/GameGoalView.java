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
public class GameGoalView extends View{

    public GameGoalView(){
        super ("\nPress 'H' to return to Help Menu or 'Q' to return to Main Menu");
   
         this.displayBanner();

    }
    
    private void displayBanner() {
        this.console.println(
                "\n--------------------------------------------------"
              + "\n             Rules of the Road                    "
              + "\n--------------------------------------------------"
              + "\n* Hello! Here are the rules of the road          *"
              + "\n*                                                *"
              + "\n* Drive 2,000 miles within 30 hours.             *"
              + "\n*                                                *"          
              + "\n* You must have at least $1 remaining            *"
              + "\n*                                                *"
              + "\n* Must have at least 1 gallon of gas remaining   *"
              + "\n*                                                *" 
              + "\n* You start with $500 and a full tank of gas     *"
              + "\n*                                                *"
              + "\n* You are responsible for tracking cash used     *"
              + "\n*                                                *"
              + "\n* So pack up and let's hit the road!             *"
              + "\n*                                                *"
              + "\n--------------------------------------------------"
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
    // send the player back to the help menu if they do not want to buy gas
    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }  
    
     // send the player back to the main menu if they do not want to buy gas
    private void displayMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
     
    }
    

