/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atroadtrip1;

import byui.cit260.atRoadTrip1.model.Player;

/**
 *
 * @author IanandJenna
 */
public class AtRoadTrip1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Ian Tabeling");
        playerOne.setBestTime(29);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
