/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author whitbillman
 */
public class DriveView extends View{
    
    public DriveView(){
        
         // implements View superclass to diplay message 
         super("\nWhat speed would you like to drive?");
    }
    // implements View suoperclass to call doAction function
    @Override
     public boolean doAction(String value){        
            
        value = value.toUpperCase(); // convert choice to upper case
        value = value.trim(); // trim extra blank spaces
        
        boolean rtnValue = true;
         switch (value){
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
                ErrorView.display("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
     }  
              
    private void displaySpeedView() {
         this.console.println(
                 "\n**************************************"
               + "\n*                                    *"
               + "\n*       You're on your way!          *"
               + "\n*                                    *"
               + "\n**************************************"
         );
         this.displayQuitDriveView();
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
