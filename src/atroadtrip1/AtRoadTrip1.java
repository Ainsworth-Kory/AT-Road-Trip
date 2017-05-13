/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atroadtrip1;

import byui.cit260.atRoadTrip1.model.Actor;
import byui.cit260.atRoadTrip1.model.Game;
import byui.cit260.atRoadTrip1.model.Hours;
import byui.cit260.atRoadTrip1.model.InventoryItem;
import byui.cit260.atRoadTrip1.model.Menu;
import byui.cit260.atRoadTrip1.model.Player;
import byui.cit260.atRoadTrip1.model.Question;
import byui.cit260.atRoadTrip1.model.RegSceneType;

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
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
       Game gameOne = new Game();
       gameOne.setTime(20.00);
       
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        Actor actorOne = new Actor();
        
        actorOne.setName("Ian Tabeling");
        actorOne.setDescription("Child of God");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
      
        RegSceneType regSceneTypeOne = new RegSceneType();
        
        regSceneTypeOne.setDescription("Atlanta");
        regSceneTypeOne.setTripInfo("start");
        
        String regSceneTypeInfo = regSceneTypeOne.toString();
        System.out.println(regSceneTypeInfo);
        
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setAmtAvail(100);
        inventoryItemOne.setAmtUsed(20);
        inventoryItemOne.setInvType("Fuel");
        inventoryItemOne.setReqAmt(10);
        inventoryItemOne.setQtyInStock(200);
        
        String inventoryItemInfo = inventoryItemOne.toString();
        System.out.println(inventoryItemInfo);
        
        Question questionOne = new Question();
        
        questionOne.setQuestion("When can I eat?");
        questionOne.setAnswer("When I'm done building Java Beans");
        
        String questionInfo = questionOne.toString();
        System.out.println(questionInfo);
        
        Hours hoursOne = new Hours();
        
        hoursOne.setTotalHrs(30);
        hoursOne.setAmtRem(25);
        
        String hoursInfo = hoursOne.toString();
        System.out.println(hoursInfo);
        
        Menu menuOne = new Menu();
        
        menuOne.setCallLetter("D");
        menuOne.setActivity("Drive");
        
        String menuInfo = menuOne.toString();
        System.out.println(menuInfo);
        
    }
    
}
