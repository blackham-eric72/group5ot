/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

//import CIT260.Group5ot.enums.QuestionType;
import CIT260.Group5ot.enums.SceneType;
import CIT260.Group5ot.model.BarrelVolume;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Location;
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.MeatShare;
import CIT260.Group5ot.model.Scene;
import java.util.ArrayList;

/**
 *
 * @author Flores Family
 */
public class MapControl {
    
    
   public static Map createMap(int noOfRows, int noOfColumns, ArrayList<InventoryItem> items){
           if (noOfRows <0) {
         return null;
     }   
     if (noOfColumns <0) {
         return null;
     }   
     if (items == null) {
         return null;
     }
     if (items.size() > 1 ){
         return null;
     }
         Map map = new Map();
        
            if (map == null) {
               return null; 
            }
         noOfRows = 3;  
         noOfColumns = 20;
//         
         Location[][] location = createLocations(noOfRows, noOfColumns);
         
         //dgw start
         //Scene[] scenes = createScenes();
                 
         // If you are assigning items to scenes, you will need Items objects inside
         // the scene object, or each Item will have to have a scene object inside it.
         //assignItemsToScenes(items, scenes);
         assignScenesToLocations(location);
         
         return map;
         
  
    

    
    } 
    
    
     public static Location[][] createLocations(int rows, int columns) {
                
        if(rows < 1) {
        return null;
    }
        if(columns < 1) {
            return null;
        }
       Location[][] locations = new Location[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j< columns; j++){ 
                 Location location = new Location();
                  location.setVisited(false);
                  locations[i][j] = location;
                  }     
        }
        return locations;
     }
    
    private static void assignItemsToScenes(ArrayList<InventoryItem> items, Scene[] scenes){
        System.out.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
    }

    
    private static void assignScenesToLocations(Location[][] location) {
        System.out.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
       //dgw start
        
        // Here Scene objects are created, and "assigned" to specific locations in the 2D array
        // The  "symbol" in Scene should be used by the map to display the scene on the map
        Scene tradingPostScene = new Scene(SceneType.TradingPost);
        tradingPostScene.setSymbol("TP");
        location[0][0].setScene(tradingPostScene);
        location[7][2].setScene(tradingPostScene);
        location[14][1].setScene(tradingPostScene);
        
        Scene trailScene = new Scene(SceneType.Trail);
        trailScene.setSymbol("T");
        location[0][1].setScene(trailScene);
        location[1][1].setScene(trailScene); 
        location[2][1].setScene(trailScene);
        location[4][1].setScene(trailScene);
        location[5][0].setScene(trailScene);
        location[6][2].setScene(trailScene);
        location[6][1].setScene(trailScene);
        location[8][2].setScene(trailScene);
        location[9][2].setScene(trailScene);
        location[11][0].setScene(trailScene);
        location[11][1].setScene(trailScene);
        location[11][2].setScene(trailScene);
        location[13][1].setScene(trailScene);
        location[16][1].setScene(trailScene);
        location[17][1].setScene(trailScene);
        location[18][1].setScene(trailScene);
        
        Scene eatingScene = new Scene(SceneType.Eating);
        eatingScene.setSymbol("E");
        location[1][2].setScene(eatingScene);
        location[5][1].setScene(eatingScene);
        location[10][1].setScene(eatingScene);
        location[15][1].setScene(eatingScene);
        
        Scene restScene = new Scene(SceneType.RestScene);
        eatingScene.setSymbol("R");
        location[2][2].setScene(restScene);
        location[7][1].setScene(restScene);
        location[12][2].setScene(restScene);
        location[17][0].setScene(restScene);
        
        Scene waterScene = new Scene(SceneType.WaterSource);
        eatingScene.setSymbol("W");
        location[3][2].setScene(waterScene);
        location[10][2].setScene(waterScene);
        location[16][0].setScene(waterScene);
      
        Scene huntingScene = new Scene(SceneType.HuntingScene);
        huntingScene.setSymbol("H");
        location[4][0].setScene(huntingScene);
        location[10][0].setScene(huntingScene);
        
        Scene foodScene = new Scene(SceneType.FoodSource);
        foodScene.setSymbol("F");
        location[5][2].setScene(foodScene);
        location[12][1].setScene(foodScene);

    }

   

  
}


    
               
     
             
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
    
    
