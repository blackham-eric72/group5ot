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
         noOfRows = 2;  
         noOfColumns = 13;
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
    
  
    //private static void assignQuestionsToScenes(Questions[] questions, Scene[] scenes) {
   //     System.out.println("Maybe chinese food will have to do. Brought to you by assignQuestionsToScenes().");
    //}
    
    
    private static void assignItemsToScenes(ArrayList<InventoryItem> items, Scene[] scenes){
        System.out.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
    }

    
    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        System.out.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
    }       

      
    
    
//   private static void assignQuestionsToScenes(Questions[] questions, Scene[] scene) {
//        System.out.println("Maybe chinese food will have to do. Brought to you by assignQuestionsToScenes().");
//    
//    }
    
      
    private static void assignScenesToLocations(Location[][] location) {
        System.out.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
       //dgw start
        
        // Here Scene objects are created, and "assigned" to specific locations in the 2D array
        // The  "symbol" in Scene should be used by the map to display the scene on the map
        Scene tradingPostScene = new Scene(SceneType.TradingPost);
        tradingPostScene.setSymbol("P");
        location[0][0].setScene(tradingPostScene);
        Scene trailScene = new Scene(SceneType.Trail);
        trailScene.setSymbol("T");
        location[0][1].setScene(trailScene);
        location[0][2].setScene(trailScene);  // Maybe there are 2 trail scenes next to each other??
        
        Scene huntingScene = new Scene(SceneType.HuntingScene);
        huntingScene.setSymbol("H");
        location[0][3].setScene(huntingScene);
        // ....
        
        //dgw end

    }

   

  
}


    
               
     
             
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
    
    
