/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.enums.QuestionType;
import CIT260.Group5ot.model.BarrelVolume;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Location;
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.MeatShare;
import java.util.ArrayList;

/**
 *
 * @author Flores Family
 */
public class MapControl {
    
    
    public static Map createMap(int noOfRows, int noOfColumns, ArrayList<InventoryItem> items){
        
          Map map = new Map();
        
            if (map == null) {
               return null; 
            }
        
        System.out.println("We like tacos but we don't have any. This message brought to you by the createMap() function");
        return null ;
    } 
    
    
    private static Location[][] createLocations(int rows, int columns) {
        System.out.println("I want fish tacos because they are delicious. brought to you by createLocations() function.");
        return null;
    }
    
    
    private static Scene[] createScenes() {
        System.out.println("Tortilla chips and guacamole are yummy with fish tacos. Brought to you by createScenes().");
        return null;
    }
    
    
    public static BarrelVolume createBarrelVolumeQuestion(double barrelRadius, double barrelDiameter) {
        BarrelVolume barrelVolume = new BarrelVolume();
        
        barrelVolume.createBarrelVolume();
        return null;
    }    
        
    public static MeatShare createMeatShareQuestion(double meatWeight, int numAdults, int numChildren) {    
        
       System.out.println("Rubio's is too far away to get good fish tacos. Brought to you by createQuestions().");
       return null;
    }    
    
    
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        System.out.println("Maybe chinese food will have to do. Brought to you by assignQuestionsToScenes().");
    }
    
    
    private static void assignItemsToScenes(ArrayList<InventoryItem> items, Scene[] scenes){
        System.out.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
    }

    
    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        System.out.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
    }
    
               
     
    
    return map;
}
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
    
               
     
             
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
    
    
