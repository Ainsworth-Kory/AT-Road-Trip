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
public class HelpMenuView extends View {
   
    public HelpMenuView(){
        super("\n"
                  + "\n--------------------------------------"
                  + "\n              Help Menu               "
                  + "\n--------------------------------------"
                  + "\nG - What is the goal of the game ?"
                  + "\nM - How to move"
                  + "\nE - Estimating mileage (mpg)"
                  + "\nH - Hazards"
                  + "\nS - Spending money"
                  + "\nQ - Quit"
                  + "\n--------------------------------------");
    
    
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
        
        switch (choice){
            case "G": // What is the goal of the game?
                this.displayGoal();
                break;
            case "M": // how to move
                this.displayMove();
                break;
            case "E": // estimating mileage
                this.displayEstimateMileage();
                break;
             case "H": // Hazards
                this.displayHazards();
                break;
             case "S": // spending money
                this.displaySpendMoney();
                break;
            case "Q": // quit help menu
                this.displayQuitHelp();
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
    
          return rtnValue;
    } 
    
   void displayMenu(){
          // display help menu
       HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display(); //HelpMenuView
    }
    private void displayGoal() {
        this.console.println("*** displayGoal function called ***");
    }

    private void displayMove() {
        this.console.println("*** displayMove function called ***"); 
    }

    private void displayEstimateMileage() {
        this.console.println("*** displayEstimateMileage function called ***");
        
    }

    private void displayHazards() {
        this.console.println("*** displayHazards function called ***");
        
    }

    private void displaySpendMoney() {
        this.console.println("*** displaySpendMoney function called ***");
       
    }

    private void displayQuitHelp() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        
    }

}

  

