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
    /*
    * displays the start program view
    */

 /*  public void displayHelpMenuView() {
         
       boolean done = false; // set flag to not done
       do {
           // prompt player for Help Menu option
           String helpMenuOption = this.getHelpMenuOption();
           if (helpMenuOption.toUpperCase().equals("Q")) // user wants to quit game
               return; // exit the game
           
           // do the requested action and disply the next view
           done = this.doAction(helpMenuOption);
       
       } while (!done);
   }
    private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get the next line typed on the keyboard
            value = value.trim(); // trim off the leading and trailing blanks
            
            if (value.length() < 1){//if the value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
             break; // end the loop
          }
            return value; // return the value entered
    }
    */ 
    
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
                System.out.println("\n*** Invalid Selection *** Try Again");
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
        System.out.println("*** displayGoal function called ***");
    }

    private void displayMove() {
        System.out.println("*** displayMove function called ***"); 
    }

    private void displayEstimateMileage() {
        System.out.println("*** displayEstimateMileage function called ***");
        
    }

    private void displayHazards() {
        System.out.println("*** displayHazards function called ***");
        
    }

    private void displaySpendMoney() {
        System.out.println("*** displaySpendMoney function called ***");
       
    }

    private void displayQuitHelp() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
        
    }

}

  

