/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import java.util.Scanner;

/**
 *
 * @author whitbillman
 */
public class DriveView {
    
    private String promptMessage;
    
    public DriveView(){
        
         this.promptMessage = "\nWhat speed would you like to drive?";
         // display the banner when the view is created
         this.displayBanner();

    }
    
    public void displayDriveView() {
        
        boolean done = false; // set flag to not done
       do {
           // prompt player for yes or no
           String driveViewOption = this.getDriveViewOption();
        
           // do the requested action and display the next view
           done = this.doAction(driveViewOption);
       
       } while (!done);
        
    }
    private String getDriveViewOption(){
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get the next line typed on the keyboard
            value = value.trim(); // trim off the leading and trailing blanks  
            if (value.length() > 105){ //if the value is too many characters
                System.out.println("\nInvalid value: you must enter a number between 0 and 105");
                continue;
          }  
            if (value.length() < 0){ //if the value is blank
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
             case "0": // Speed int
                this.displaySpeedView();
                break;
             case "5": // Speed int
                this.displaySpeedView();
                break;   
             case "10": // Speed int
                this.displaySpeedView();
                break;   
             case "15": // Speed int
                this.displaySpeedView();
                break;   
             case "20": // Speed int
                this.displaySpeedView();
                break;  
             case "25": // Speed int
                this.displaySpeedView();
                break; 
             case "30": // Speed int
                this.displaySpeedView();
                break;   
             case "35": // Speed int
                this.displaySpeedView();
                break;   
             case "40": // Speed int
                this.displaySpeedView();
                break;  
             case "45": // Speed int
                this.displaySpeedView();
                break;   
             case "50": // Speed int
                this.displaySpeedView();
                break;  
             case "55": // Speed int
                this.displaySpeedView();
                break; 
             case "60": // Speed int
                this.displaySpeedView();
                break;   
             case "65": // Speed int
                this.displaySpeedView();
                break;   
             case "70": // Speed int
                this.displaySpeedView();
                break;    
             case "75": // Speed int
                this.displaySpeedView();
                break;   
             case "80": // Speed int
                this.displaySpeedView();
                break;  
             case "85": // Speed int
                this.displaySpeedView();
                break; 
             case "90": // Speed int
                this.displaySpeedView();
                break;   
             case "95": // Speed int
                this.displaySpeedView();
                break;   
             case "100": // Speed int
                this.displaySpeedView();
                break;    
             case "105": // Speed int
                this.displaySpeedView();
                break;
          
                
            case "No": // "sorry my error"
                this.displayNoDriveView();
                break;
                
            case "Q": // quit and return to game menu 
                this.displayQuitDriveView();
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
              + "\n*       You're on your way!          *"
              + "\n*                                    *"
              + "\n**************************************"
        );
    }
              
    private void displaySpeedView() {
         System.out.println("\n*** displayDriveView() function called ***"
                        + "\nYou're hitting the road!"
                        );
    }

   
// Return the game menu 
    private void displayNoDriveView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayQuitDriveView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}  
