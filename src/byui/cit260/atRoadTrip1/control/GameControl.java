/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import atroadtrip1.AtRoadTrip1;
import byui.cit260.atRoadTrip1.model.Car;
import byui.cit260.atRoadTrip1.model.Day;
import byui.cit260.atRoadTrip1.model.Game;
import byui.cit260.atRoadTrip1.model.InventoryItem;
import byui.cit260.atRoadTrip1.model.Item;
import byui.cit260.atRoadTrip1.model.Map;
import byui.cit260.atRoadTrip1.model.Player;
import byui.cit260.atRoadTrip1.model.RegSceneType;

/**
 *
 * @author whitbillman
 */
public class GameControl {
    
    public static void createNewGame(Player player){
        
         Game game = new Game();// create new game
         AtRoadTrip1.setCurrentGame(game);
         
         game.setPlayer(player);  // save player in game 
         
         // create the inventory list and save in the game
         InventoryItem[] inventoryList = GameControl.createInventoryList();
         game.setInventory(inventoryList);
         
         Car car = new Car();//create new car
         game.setCar(car);// save car in game
         
         Day day = new Day();// create new day
         game.setDay(day);// save day in game
         
         Map map = MapControl.createMap();//create and initialize new map
         game.setMap(map); //save map in game
    
         MapControl.moveActorsToStartingLocation(map);
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

    public static InventoryItem[] createInventoryList() {
        
        // created array<list> of inventory items
        InventoryItem[] inventory = new InventoryItem[4];
        
        InventoryItem gas = new InventoryItem();
        gas.setInvType("gas");
        gas.setQtyInStock(10);
        gas.setReqAmt(10);
        inventory[Item.gas.ordinal()] = gas;
        
        InventoryItem cash = new InventoryItem();
        cash.setInvType("cash");
        cash.setQtyInStock(500);
        cash.setReqAmt(500);
        inventory[Item.cash.ordinal()] = cash;
        
        InventoryItem time = new InventoryItem();
        time.setInvType("time");
        time.setQtyInStock(30);
        time.setReqAmt(30);
        inventory[Item.time.ordinal()] = time;
        
        InventoryItem distance = new InventoryItem();
        distance.setInvType("distance");
        distance.setQtyInStock(2000);
        distance.setReqAmt(2000);
        inventory[Item.distance.ordinal()] = distance;
        
        
       return inventory;         
    }
    /******COMMENTED OUT TO FIX ERROR TO PUSH TO GITHUB 6/22/17*************
    private static Map createMap() {
        // create the map
        Map map = new Map(5, 6);
        
        // create the scenes for the game

       RegSceneType[] regSceneType = createScene();
        
        // assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
         
    }

    private static RegSceneType[] createScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*****************************************************************/
    
}
