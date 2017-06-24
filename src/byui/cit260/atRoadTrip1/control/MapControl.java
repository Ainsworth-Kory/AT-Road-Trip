/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.control;

import byui.cit260.atRoadTrip1.model.Location;
import byui.cit260.atRoadTrip1.model.Map;
import byui.cit260.atRoadTrip1.model.RegSceneType;
import byui.cit260.atRoadTrip1.model.RegSceneType.SceneType;
import javafx.scene.Scene;

/**
 *
 * @author whitbillman
 */
public class MapControl {

 /* 
private static Map createMap() {
        // create the map
        Map map = new Map(5, 6);
        
        // create the scenes for the game

       Scene[] scenes = createScenes(); 
        
        // assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
         
    }

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                    "The journey of a thousand miles starts with the "
                  + "very first step.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
              
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                    "Congratulations! You survived your road trip!");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;        
        
        
        Scene roadScene = new Scene();
        roadScene.setDescription(
                    "This is the road where you will be driving. Keep both eyes on it!");
        roadScene.setMapSymbol(" RD ");
        roadScene.setBlocked(false);
        scenes[SceneType.road.ordinal()] = roadScene;  
        
        return scenes;
    }
    */
    
   
    static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n *** Move actors to start locations ***");
        
    }
}
