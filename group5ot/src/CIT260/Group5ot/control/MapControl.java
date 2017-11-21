/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Location;
import CIT260.Group5ot.model.Map;
import java.util.ArrayList;
import java.awt.Point;

/**
 *
 * @author Flores Family
 */
public class MapControl {
    
    
    public static Map createMap(int noOfRows, int noOfColumns, ArrayList<InventoryItem> items){
//           if (noOfRows <0) {
//         return null;
//     }   
//     if (noOfColumns <0) {
//         return null;
//     }   
//     if (items == null) {
//         return null;
//     }
//     if (items.size() > 1 ){
//         return null;
//     }
         Map map = new Map();
//        
//            if (map == null) {
//               return null; 
//            }
//         noOfRows = 2;  
//         noOfColumns = 27;
//         
         Location[][] location = createLocations(noOfRows, noOfColumns);
         
         Scenes[] scenes = createScenes();
         Questions[] questions = createQuestions();
         
         assignQuestionsToScenes(questions, scenes);
         assignItemsToScenes(items, scenes);
         assignScenesToLocations(scenes, location);
         
         return map;
         
  
    }
    public static Location[][] createLocations(int row, int columns) {
                
        if(row < 1) {
        return null;
    }
        if(columns < 1) {
            return null;
        }
        int i = 0;
        int j = 0;
        Location[][] locations = new Location[row][columns];
        for (Location[] rows :locations) {
            for (Location column : rows){ 
                 Location location = new Location();
                  location.setRow(i);
                  location.setColumn(j);
                  location.setVisited(false);
                  j++;  
                  locations[i][j] = location;
        }
            i++;
            j = 0;       
        }
        return locations;
    }
    
    
    private static Scenes[] createScenes() {
        System.out.println("Tortilla chips and guacamole are yummy with fish tacos. Brought to you by createScenes().");
        return null;
    }
    
    
    private static Questions[] createQuestions() {
        System.out.println("Rubio's is too far away to get good fish tacos. Brought to you by createQuestions().");
    return null;
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
    
               
     
             
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
    
    