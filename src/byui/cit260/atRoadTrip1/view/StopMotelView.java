/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import java.util.Scanner;

/**
 *
 * @author Ian Tabeling
 */
public class StopMotelView extends View{
    //private String promptMessage;
    
    public StopMotelView(){
        
         /*this.promptMessage =*/ super("\nWould you like to stop for the night? "
                             +"\nCost = $100 (Y or N)");
                                     
         // display the banner when the view is created
         this.displayBanner();

    }
    
     @Override
    public boolean doAction(String value){        
            
        value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
            case "Y": // Yes stop for the night
                this.displayStopMotel();
                break;
            case "N": // No do not stop at motel and return to game menu
                this.displayNotStop();
                break;
            case "Q": // quit and return to game menu 
                this.displayQuitStopMotel();
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
                "\n**************************************"
              + "\n*                                    *"
              + "\n*  Welcome to Road Trip Inn!         *"
              + "\n*                                    *"
              + "\n**************************************"
        );
    }
              
    private void displayStopMotel() {
         this.console.println("\nThank you for staying at the Road Trip Inn!");
                        
    }
    
    private void displayNotStop() {
       GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayQuitStopMotel() {
         GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
 }

