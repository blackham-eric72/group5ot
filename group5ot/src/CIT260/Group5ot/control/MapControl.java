/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.enums.QuestionType;
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
         
         Scenes[] scenes = createScenes();
                 
        
         assignItemsToScenes(items, scenes);
         assignScenesToLocations(scenes, location);
         
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
    
    
    private static Scenes[] createScenes() {
        Scenes[] scenes = new Scenes[8];
        
        Scenes tradingPost = scenes[0];
        Scenes checkpoint = scenes[1];
        Scenes huntingScene = scenes[2];
        Scenes trail = scenes[3];
        Scenes eating = scenes[4];
        Scenes waterSource = scenes[5];
        Scenes foodSource = scenes[6];
        Scenes losingGame = scenes[7];
        
        return scenes;
    }
    
    
    private static void assignQuestionsToScenes(Questions[] questions, Scene[] scenes) {
        System.out.println("Maybe chinese food will have to do. Brought to you by assignQuestionsToScenes().");
    }
    
    
    private static void assignItemsToScenes(ArrayList<InventoryItem> items, Scene[] scenes){
        System.out.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
    }

    
    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        System.out.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
    }       

      
    
    
   private static void assignQuestionsToScenes(Questions[] questions, Scenes[] scenes) {
        System.out.println("Maybe chinese food will have to do. Brought to you by assignQuestionsToScenes().");
    
    }
    
    
    private static void assignItemsToScenes(ArrayList<InventoryItem> items, Scenes[] scenes){
        System.out.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
    }

    
    private static void assignScenesToLocations(Scenes[] scenes, 
                    Location[][] location) {
        System.out.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
       
    }

   

  
}


    
               
     
             
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
    
    
