/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import byui.cit260.atRoadTrip1.control.CarControl;

/**
 *
 * @author whitbillman
 */
public class TripInfoView extends View{
    
 /*   public TripInfoView(){ */
        public static void main(String args[]){
        TripInfoView tripInfoView = new TripInfoView();
        /*
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

    public static TripInfoView getgameReport() {
        System.out.println("\n"
                  + "\n--------------------------------------"
                  + "\n           List of Trip Info                 "
                  + "\n--------------------------------------"
                  + "\nV - View Trip Info"
                  + "\nD - Drive"
                  + "\nC - Count Cash"
                  + "\nG - Stop for gas"
                  + "\nF - Stop for food"
                  + "\nP - Stop for food & gas"
                  + "\nM - Stop for motel"
                  + "\nS - Save Game"
                  + "\nH - Help Menu"
                  + "\nR - Print Game Report"
                  + "\nQ - Quit"
                  + "\n--------------------------------------");
   
            return null;
        
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
