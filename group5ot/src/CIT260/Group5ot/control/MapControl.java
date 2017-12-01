package CIT260.Group5ot.control;

//import CIT260.Group5ot.enums.QuestionType;
import CIT260.Group5ot.enums.SceneType;
import CIT260.Group5ot.model.BarrelVolume;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Location;
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.MeatShare;
import CIT260.Group5ot.model.Scene;
import group5ot.Group5ot;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Flores Family
 */
public class MapControl {
   
    protected final PrintWriter console = Group5ot.getOutFile();    
    
   public Map createMap(int noOfRows, int noOfColumns, ArrayList<InventoryItem> items){
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
    
    private void assignItemsToScenes(ArrayList<InventoryItem> items, Scene[] scenes){
        this.console.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
    }
    
    private void assignScenesToLocations(Location[][] location) {
        this.console.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
       //dgw start
        
        // Here Scene objects are created, and "assigned" to specific locations in the 2D array
        // The  "symbol" in Scene should be used by the map to display the scene on the map
        Scene tradingPostScene = new Scene(SceneType.TradingPost);
        tradingPostScene.setSymbol("TP");
        location[0][0].setScene(tradingPostScene);
        location[2][7].setScene(tradingPostScene);
        location[1][14].setScene(tradingPostScene);
        
        Scene trailScene = new Scene(SceneType.Trail);
        trailScene.setSymbol("T");
        location[0][1].setScene(trailScene);
        location[1][1].setScene(trailScene); 
        location[1][2].setScene(trailScene);
        location[1][4].setScene(trailScene);
        location[0][5].setScene(trailScene);
        location[1][6].setScene(trailScene);
        location[2][6].setScene(trailScene);
        location[2][8].setScene(trailScene);
        location[2][9].setScene(trailScene);
        location[0][11].setScene(trailScene);
        location[1][11].setScene(trailScene);
        location[2][11].setScene(trailScene);
        location[1][13].setScene(trailScene);
        location[1][16].setScene(trailScene);
        location[1][17].setScene(trailScene);
        location[1][18].setScene(trailScene);
        
        Scene eatingScene = new Scene(SceneType.Eating);
        eatingScene.setSymbol("E");
        location[2][1].setScene(eatingScene);
        location[1][5].setScene(eatingScene);
        location[1][10].setScene(eatingScene);
        location[1][15].setScene(eatingScene);
        
        Scene restScene = new Scene(SceneType.RestScene);
        eatingScene.setSymbol("R");
        location[2][2].setScene(restScene);
        location[1][7].setScene(restScene);
        location[2][12].setScene(restScene);
        location[0][17].setScene(restScene);
        
        Scene waterScene = new Scene(SceneType.WaterSource);
        eatingScene.setSymbol("W");
        location[2][3].setScene(waterScene);
        location[2][10].setScene(waterScene);
        location[0][16].setScene(waterScene);
      
        Scene huntingScene = new Scene(SceneType.HuntingScene);
        huntingScene.setSymbol("H");
        location[0][4].setScene(huntingScene);
        location[0][10].setScene(huntingScene);
        
        Scene foodScene = new Scene(SceneType.FoodSource);
        foodScene.setSymbol("F");
        location[2][5].setScene(foodScene);
        location[1][12].setScene(foodScene);

    }
    
    
//    public static int moveWagonToLocation(Character character, Point coordinates) {
//        
//        Map map = Group5ot.getCurrentGame().getMap();
//        int newRow = coordinates.x-1;
//        int newColumn = coordinates.y-1;
//        
//        if (newRow < 0 || newRow >= map.getNoOfRows() ||
//            newColumn < 0 || newColumn <= map.getNoOfColumns{}) {
//            return -1;
//            }
//            else { 
//                return 0;
//            }    
//    }
 
}
