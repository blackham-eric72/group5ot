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
    }
    
    
    private static Question[] createQuestions() {
        System.out.println("Rubio's is too far away to get good fish tacos. Brought to you by createQuestions().");
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
