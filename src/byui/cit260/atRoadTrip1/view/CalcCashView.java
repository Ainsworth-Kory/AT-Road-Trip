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
public class CalcCashView extends View{
    
    public CalcCashView (){
        //implements View superclass to display message
                super("\nWould you like to view your cash remaining? (Y or N)" );
                
}
       // implements View superclass to perform doAction function
       @Override
        public boolean doAction(String value){        
            
        value = value.toUpperCase(); // convert choice to upper case
        
        boolean rtnValue = true;
         switch (value){
            case "Y": // Yes view cash remaining
                this.displayCashRemaining();
                break;
            case "N": // No do not view cash raemaining and return to game menu
                this.displayNoCash();
                break;
            case "Q": // quit and return to game menu
                this.displayQuitStopCash();
                break;
            default:
                ErrorView.display("\n*** Invalid Selection *** Try Again");
               rtnValue = false;
                break;
        }
            return rtnValue;
}
 // would need a way of returning cash spent to another class
    private void displayCashRemaining() {
      this.console.println("\nYou have used $xx.xx and have $xx.xx remaining.");
                        
    }

    private void displayNoCash() {
         GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        
    }

    private void displayQuitStopCash() {
         GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
  
    }
       
}