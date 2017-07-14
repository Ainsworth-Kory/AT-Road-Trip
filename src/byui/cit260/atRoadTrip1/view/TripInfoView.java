/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import byui.cit260.atRoadTrip1.control.CarControl;
import byui.cit260.atRoadTrip1.model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author whitbillman
 */
public class TripInfoView extends View{
    // This class need the most work
    public TripInfoView(){ 
    /*    public static void main(String args[]){
        TripInfoView tripInfoView = new TripInfoView();
        
        for (TripInfoView prevDistance){
            int returnValue = CarControl.int prevDistance;
            if (returnValue < 0){
                System.out.println("\nERROR: Previous distance or previous speed must be greater than 0.");
            }
        }
        */
        int prevDistance;
        int speed;  

    
    }
    
// This is not the correct way to do this should be char stream
    static TripInfoView getGameReport() {
        System.out.println("\n        Inventory Items"
                             + "\nDescription      Quantity"
                              + " \n Car              One"
                                + "\nCash             $500"
                               + "\n Time             30 hours"
                               + "\n Distance         2000 miles"); //To change body of generated methods, choose Tools | Templates.
            return null;
    }    
            
/*    
    public ArrayList<Item> addInventoryItems(){
        // create an ArrayList of items in the inventory
        ArrayList<Item> inventory = new ArrayList<>();
        
        // adding objects to the ArrayList
        inventory.add(new Item ("Car", 1));
        inventory.add(new Item ("Cash", 500));
        inventory.add(new Item ("Time", 30));
        inventory.add(new Item ("Distance", 2000));
        
        return inventory;        
    }
     
    // Attempt to modify inventory (Trip Info) report - Ainsworth
    public void printTripInfoReport(ArrayList<Item> inventory, String outputLocation){
        
        // create BufferReader object for input file
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            
            // print title and column headings
            out.println("\n\n          Trip Info Report          ");
            out.printf("%n%-20s%10s", "Item", "Quantity");
            out.printf("%n%-20s%10s", "----", "--------");
            
            // print the description and quantity of each item
            for(Item item : inventory){
                out.printf("%n%-20s%10s",item.getDescription()
                                        ,item.getQuantity());
            }                     
       } catch (Exception e){
           ErrorView.display("I/O Error: ");
       }           
    }*/
    
    // This is my attempt at char stream but would not work
      /*  public static TripInfoView getGameReport(String outputLocation) {
       try (PrintWriter out = new PrintWriter(outputLocation)) {
       
              out.println("\n\n     Game Report               ");
               out.printf("%n%-20s%10s%10s", "List of", "Inventory", "Items");
                out.printf("%n%-20s%10s%10s", "Gas", "Cash", "Time", "Distance");
                
       } catch (Exception e){
           ErrorView.display("I/O Error: ");
       }
            return null;
           
    }*/
        
         //To change body of generated methods, choose Tools | Templates.
/*
    static TripInfoView getGameReport(String outputLocation) {
            
       try (PrintWriter out = new PrintWriter(outputLocation)) {
              // print title and column headings
              out.println("\n\n     List of Inventory Items      ");
               out.printf("%n%-20s%10s", "Description", "Quantity");
                out.printf("%n%-20s%10s", "----------", "--------");
          for (Item item : inventoryItem){
              out.printf("%n%-20s%7d", item.getDescripton()
                                      , item.getQuntity());
          }      
       } catch (Exception e){
           ErrorView.display("I/O Error: ");
       }
            return null;
           
    }*/
    
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
    }

}
    
    

