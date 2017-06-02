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
public class MainMenuView {
     
    private String menu;
    private String promptMessage;
    
    public MainMenuView(){
        this.menu = "\n"
                  + "\n--------------------------------------"
                  + "\n  Main Menu                           "
                  + "\n--------------------------------------"
                  + "\nN - Start new game"
                  + "\nR - Restart existing game"
                  + "\nH - Get help on how to play the game"
                  + "\nQ - Quit"
                  + "\n--------------------------------------";
    
    
    }

   public void displayMainMenuView() {
         
       boolean done = false; // set flag to not done
       do{
           // prompt for and get players name
           String menuOption = this.getMenuOption();
           if (menuOption.toUpperCase().equals("Q")) // user wants to exit game
               return; // exit the game
           
           // do the requested action and disply the next view
           done = this.doAction(menuOption);
       
       } while (!done);
   }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
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

    /*private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }*/
    
    private void startNewGame(){
        System.out.println("*** startNewGame function called ***");
    }
    
    private void startExistingGame(){
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu(){
        System.out.println("*** displayHelpMenu function called ***");
    }
    
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice){
            case "N": // create and start new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    
          return false;
    }
}
    
    

