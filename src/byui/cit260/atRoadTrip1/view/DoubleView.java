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

public class DoubleView {
 
  // public static void main (String args[]){
//throws java.io.IOException{ 
       
    public Double getDoubleNumber(){
    Double number = null;
    
    while (number == null){
          String value = this.getInput();
          value = value.trim().toUpperCase();
          
          if (value.equals("Q"))
              break;
          try{
              number = Double.parseDouble(value);
          } catch (NumberFormatException nf){
              System.out.println("\nYou must enter a valid number."
              + "Try again or enter Q to quit.");
          }
          }
       return number;
    }

    private String getInput() {
         System.out.println("\nGet Input");
        return null;
    }
    
}
