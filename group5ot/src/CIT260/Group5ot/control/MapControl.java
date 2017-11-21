/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.enums.ItemTypes;
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
    
    
    private static SceneType[] createScenes() {
        SceneType[] scenes = new SceneType[8];
        
        SceneType tradingPost = scenes[0];
        SceneType checkpoint = scenes[1];
        SceneType huntingScene = scenes[2];
        SceneType trail = scenes[3];
        SceneType eating = scenes[4];
        SceneType waterSource = scenes[5];
        SceneType foodSource = scenes[6];
        SceneType losingGame = scenes[7];
        
        return scenes;
    }
    
    
    public static BarrelVolume createBarrelVolumeQuestion(double barrelRadius, double barrelDiameter) {
        BarrelVolume barrelVolume = new BarrelVolume();
        return null;
    }    
    
    private static void assignItemsToScenes(ArrayList<ItemTypes> items, Scene[] scenes){
        System.out.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
        
    }

    
    private static void assignScenesToLocations(Scene[] scenes, Location[][] locations) {
        System.out.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
    }       
     
    return map;
}


    
               
     
             
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
        
               
     
    
    
