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
public class StopMotelView {
    private String promptMessage;
    
    public StopMotelView(){
        
         this.promptMessage = "\nWould you like to stop for the night? "
                             +"\nCost = $100 (Y or N)";
                                     
         // display the banner when the view is created
         this.displayBanner();

    }
    
    public void displayStopMotelView() {
        
        boolean done = false; // set flag to not done
       do {
           // prompt player for yes or no
           String stopMotelOption = this.getStopMotelOption();
        
           // do the requested action and display the next view
           done = this.doAction(stopMotelOption);
       
       } while (!done);
        
    }
    private String getStopMotelOption(){
        
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
                System.out.println("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
     }
            private void displayBanner() {
        
        System.out.println(
                "\n**************************************"
              + "\n*                                    *"
              + "\n*  Welcome to Road Trip Inn!         *"
              + "\n*                                    *"
              + "\n**************************************"
        );
    }
              
    private void displayStopMotel() {
         System.out.println("\n*** displayStopMotel() function called ***"
                        + "\nThank you for staying at the Road Trip Inn!"
                        );
    }

    private void displayNotStop() {
       GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void displayQuitStopMotel() {
         GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }
 }

