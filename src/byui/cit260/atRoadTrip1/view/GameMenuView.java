/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.view;

import byui.cit260.atRoadTrip1.model.Game;
import java.util.Scanner;

/**
 *
 * @author Ian Tabeling
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
        
              super("\n"
                  + "\n--------------------------------------"
                  + "\n            Game Menu                 "
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
                  + "\nQ - Quit"
                  + "\n--------------------------------------");
    
    }

        @Override
        public boolean doAction(String value){
        
        value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
            case "V": // Trip Info
                this.displayTripInfo();
                break;
            case "D": // Drive
                this.displayDrive();
                break;
            case "C": // count cash
                this.displayCalcCash();
                break;
            case "G": // stop for gas
                this.displayStopGas();
                break;    
            case "F": // stop for food
                this.displayStopFood();
                break;
            case "P": // stop for food and gas
                this.displayStopFoodGas();
                break;
            case "M": // stop for motel
                this.displayStopMotel();
                break;
            case "S": // save game
                this.displaySaveGame();
                break;
            case "H": // help menu
                 this.displayHelpMenu();
                 break;
            case "Q": // quit help menu
                this.displayQuitHelp();
                break;
            default:
                ErrorView.display("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
}

    private void displayTripInfo() {
        this.console.println("*** displayTripInfo function called ***");
    }

    private void displayDrive() {
        DriveView driveView = new DriveView();
        driveView.display();
    }

    private void displayCalcCash() {
        CalcCashView calcCashView = new CalcCashView();
        calcCashView.display();
       
    }
 
    private void displayStopGas() {
        StopGasView stopGasView = new StopGasView();
        stopGasView.display();
    }    

    private void displayStopFood() {
        StopFoodView stopFoodView = new StopFoodView();
        stopFoodView.display();
    }

    private void displayStopFoodGas() {
        StopFoodGasView stopFoodGasView = new StopFoodGasView();
        stopFoodGasView.display(); 
    }

    private void displayStopMotel() {
       StopMotelView stopMotelView = new StopMotelView();
        stopMotelView.display(); 
    }

    private void displaySaveGame() {
        this.console.println("*** displaySaveGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void displayQuitHelp() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}

