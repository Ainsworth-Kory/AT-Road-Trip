/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import atroadtrip1.AtRoadTrip1;
import byui.cit260.atRoadTrip1.model.Player;

/**
 *
 * @author whitbillman
 */
public class GameControl {
    
    public static void createNewGame(Player player){
          System.out.println("\n*** createNewGame stub function called ***");
    }

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        AtRoadTrip1.setPlayer(player); // save the player
        
        return player;
    }
    
}
