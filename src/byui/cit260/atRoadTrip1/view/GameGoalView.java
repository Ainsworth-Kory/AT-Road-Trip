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
        super ("\nWould you like to know the goals of the game? (Y or N)");
   
         this.displayBanner();

    }
    
    private void displayBanner() {
        this.console.println(
                "\n*************************************************"
              + "\n*           Road Trip Game Goals                *                             *"
              + "\n*************************************************"
              + "\n* Hello! Are you ready to start your road trip? *" 
              + "\n* You must reach your destination within 30     *"
              + "\n* hours in order to win the game, so you need   *"
              + "\n* to calculate the time, the distance, how much *"
              + "\n* gas you'll need, and how much money you'll    *"
              + "\n* spend along the way. Use your money wisely so *" 
              + "\n* you don't run out of gas or food. If you make *"
              + "\n* it in time and still have money and gas, you  *"
              + "\n* win the game.                                 *"
              + "\n*                                               *"
              + "\n* So pack up and let's hit the road!            *"
              + "\n*                                               *"
              + "\n*************************************************"
              ); 
    }
    @Override
    public boolean doAction(String value) {
    value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
            case "G": // return 
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
    

