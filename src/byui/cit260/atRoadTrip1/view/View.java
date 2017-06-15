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
public abstract class View implements ViewInterface {
    
   // public void display();
   // public String getInput();
    
    protected String displayMessage;
    
    public View(){
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do{
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the view
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done); //exit the view when done == true
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        boolean valid = false; // initialize to not valid
        String value = null; // value to be returned
        
        //loop while an invalid value is enter
        while (!valid) { 
            
            System.out.println("\n" + this.displayMessage);
            
            // get the next line typed on the keyboard
            value = keyboard.nextLine(); 
            value = value.trim(); // trim off the leading and trailing blanks
            
            if (value.length() < 1){//if the value is blank
                System.out.println("\n*** You must enter a value *** ");
                continue;
                
            }
            
             break; // end the loop
          }
        
            return value; // return the value entered
    }
    
    
}
