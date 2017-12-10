package CIT260.Group5ot.control;

//import CIT260.Group5ot.enums.QuestionType;
import CIT260.Group5ot.enums.SceneType;
import CIT260.Group5ot.model.BarrelVolume;
import CIT260.Group5ot.model.Game;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Location;
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.MeatShare;
import CIT260.Group5ot.model.Scene;
import CIT260.Group5ot.model.Wagon;
import group5ot.Group5ot;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Flores Family
 */
public class MapControl {
   
    protected final PrintWriter console = Group5ot.getOutFile();   
    //create a variable of type Location, that will store a 2-d array of locations. 
    
    //protected Location[][] location;
    //create a getter to access the location array. 

    
    
    
    //Calls a single location based on it's 'locationNumber' 
    //and then prints it's name and number. 
    public void displayMap(){
        //create a variable that gets the wagon's locaitonNumber
        //When the wagon is found, 
        Wagon wagon = Group5ot.getCurrentGame().getWagon();
        Location[][] location = Group5ot.getCurrentGame().getMap().getLocation();
        String mapBoundaries = "\n|-----------------------------------------------------------------------------------|";
        this.console.println(
                            "\n ------------- MAP OF THE GAME ------------- "
                          + mapBoundaries);
        
        
        for (Location[] location1 : location) {
            for (Location location2 : location1) {
                if (location2.getLocationNumber() == 1  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 2  ){
                    this.console.print(location2.getLocationNumber());
                }
                  if (location2.getLocationNumber() == 3  ){
                    this.console.print(location2.getLocationNumber());
                }
                   if (location2.getLocationNumber() == 4  ){
                    this.console.print(location2.getLocationNumber());
                }
                    if (location2.getLocationNumber() == 5  ){
                    this.console.print(location2.getLocationNumber());
                }
                     if (location2.getLocationNumber() == 6  ){
                    this.console.print(location2.getLocationNumber());
                }
                      if (location2.getLocationNumber() == 7  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 8  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 9  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 10  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 11  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 12  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 13  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 14  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 15  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 16  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 17  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 18  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 19  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 20  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 21  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 22  ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 23 ){
                    this.console.print(location2.getLocationNumber());
                }
                 if (location2.getLocationNumber() == 24 ){
                    this.console.print(location2.getLocationNumber());
                }
                if (location2.getLocationNumber() == 25 ){
                    this.console.print(location2.getLocationNumber());
                }
                if (location2.getLocationNumber() == wagon.getLocationNumber()) {
                    this.console.print("<--*U*R*HERE**||");
                     }
                else{
                    this.console.print("|-");
                }
                //this.console.print("|");
            }
            this.console.println("\n|-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-|");
        }
        this.console.println(mapBoundaries);
        this.console.println(
                "\n--------- LEGEND -------------"
                + "\n1 - Independence, Missouri              2 - Kansas City, Missouri      3 - Fort LeavenWorth, Nebraska\n" +
"4 - Little Blue River, Nebraska          5 - Grand Island, Nebraska   6 - Fort Kearny, Nebraska\n" +
"7 - Lexington, Nebraska                   8 - Gothenberg, Nebraska    9 - Bayard, Nebraska\n" +
"10 - Scott's Bluff, Wyoming             11 - Torrington, Wyoming     12  - Fort Laramie, Wyoming\n" +
"13 - Independence Rock, Wyoming 14 - Devil's Gate, Wyoming   15 - Fort Bridger,  Idaho\n" +
"16 - Soda Springs, Idaho                  17 - Fort Hall, Idaho               18 - Independence Rock, Idaho\n" +
"19 - American Falls, Idaho                 20 - Twin Falls, Idaho             21 - Fort Boise, Idaho\n" +
"22 - Vale, Oregon                               23 - Huntington, Oregon      24 - Baker City, Oregon \n" +
"25 - Oregon City, Oregon"
        );
    }
    
   public Map createMap(int noOfRows, int noOfColumns){
     if (noOfRows <0) {
        return null;
     }   
     if (noOfColumns <0) {
         return null;
     }   
    
         Map map = new Map();
        
            if (map == null) {
               return null; 
            }
        
         Location[][] location = createLocations(noOfRows, noOfColumns);
         map.setLocation(location);
//        //This method will print the locations using the to string method    
//        System.out.println(Arrays.deepToString(location).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
//    
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
                    location.setRow(i);
                    location.setColumn(j);
                    //THE FOLLOWING IF STATEMENTS SET THE LOCATIONS i.e 0,0 = location one
                    //They also assign a city-name to the location. 
                    //1
                    if( i == 9 && j == 0) {
                        location.setLocationNumber(1);
                        location.setLocationName("Independence, Missouri");
                       }
                    //2
                    else if( i == 9 && j == 1) {
                        location.setLocationNumber(2);
                        location.setLocationName("Kansas City, Missouri");
                    }
                    //3
                    else if( i == 8 && j == 2) {
                        location.setLocationNumber(3);
                        location.setLocationName("Fort LeavenWorth, Nebraska");
                    }
                     //4
                    else if( i == 8 && j == 3) {
                        location.setLocationNumber(4);
                        location.setLocationName("Little Blue River, Nebraska");
                    }                    
                     //5
                    else if( i == 8 && j == 4) {
                        location.setLocationNumber(5);
                        location.setLocationName("Grand Island, Nebraska");
                    }
                    //6
                    else if( i == 8 && j == 5) {
                        location.setLocationNumber(6);
                        location.setLocationName("Fort Kearny, Nebraska");
                    }
                    
                     //7
                    else if( i == 6 && j == 6) {
                        location.setLocationNumber(7);
                        location.setLocationName("Lexington, Nebraska");
                    }
                     //1
                    else if( i == 6 && j == 7) {
                        location.setLocationNumber(8);
                        location.setLocationName("Gothenberg, Nebraska");
                    }
                     //1
                    else if( i == 8 && j == 8) {
                        location.setLocationNumber(9);
                        location.setLocationName("Bayard, Nebraska");
                    }
                     //1
                    else if( i == 6 && j == 9) {
                        location.setLocationNumber(10);
                        location.setLocationName("Scott's Bluff, Wyoming");
                    }
                     //1
                    else if( i == 7 && j == 10) {
                        location.setLocationNumber(11);
                         location.setLocationName("Torrington, Wyoming");
                    }
                     //1
                    else if( i == 7 && j == 11) {
                        location.setLocationNumber(12);
                         location.setLocationName("Fort Laramie, Wyoming");
                    }
                     //1
                   else  if( i == 5 && j == 12) {
                        location.setLocationNumber(13);
                         location.setLocationName("Independence Rock, Wyoming");
                    }
                     //1
                    else if( i == 5 && j == 13) {
                        location.setLocationNumber(14);
                        location.setLocationName("Devil's Gate, Wyoming");
                        
                    }
                     //1
                    else if( i == 5 && j == 14) {
                        location.setLocationNumber(15);
                        location.setLocationName("Fort Bridger,  Idaho");
                    }
                     //1
                    else if( i == 5 && j == 15) {
                        location.setLocationNumber(16);
                        location.setLocationName("Soda Springs, Idaho");
                    }
                     //1
                    else if( i == 4 && j == 16) {
                        location.setLocationNumber(17);
                        location.setLocationName("Fort Hall, Idaho");
                    }
                     //1
                    else if( i == 4 && j == 17) {
                        location.setLocationNumber(18);
                        location.setLocationName("Independence Rock, Idaho");
                    }
                     //1
                    else if( i == 4 && j == 18) {
                        location.setLocationNumber(19);
                        location.setLocationName("American Falls, Idaho");
                    }
                     //1
                    else if( i == 4 && j == 19) {
                        location.setLocationNumber(20);
                        location.setLocationName("Twin Falls, Idaho");
                    }
                     //1
                    else if( i == 2 && j == 20) {
                        location.setLocationNumber(21);
                        location.setLocationName("Fort Boise, Idaho");
                    }
                     //1
                    else if( i == 1 && j == 21) {
                        location.setLocationNumber(22);
                        location.setLocationName("Vale, Oregon");
                    }
                     //1
                    else if( i == 1 && j == 22) {
                        location.setLocationNumber(23);
                        location.setLocationName("Huntington, Oregon");
                    }
                     //1
                    else if( i == 0 && j == 23) {
                        location.setLocationNumber(24);
                        location.setLocationName("Baker City, Oregon");
                    }
                     //1
                    else if( i == 0 && j == 24) {
                        location.setLocationNumber(25);
                        location.setLocationName("**Oregon City, Oregon**");
                    }
                                     
                    
                    locations[i][j] = location;
                }     
            }
            System.out.println("Locations have been created");
        return locations;
    }
     //this function moves the wagon along the path, and should be called 
     public void incrementWagonLocation(){
         Wagon wagon = Group5ot.getCurrentGame().getWagon();
        
         int currentLocation = wagon.getLocationNumber();
         
         wagon.setLocationNumber(currentLocation++);
     }
    
//    private void assignItemsToScenes(ArrayList<InventoryItem> items, Scene[] scenes){
//   this.console.println("Teriyaki sounds good right now. Brought to you by assignItemsToScenes().");
//    }
    
     /*
     *
     *I (Eric) Commented out the assignSCenesToLocations because it was running into an error. :*(
     *
     */
     
  //  private void assignScenesToLocations(Location[][] location) {
////        this.console.println("Teriyaki is Japanese, but they have it at Chinese restaurants. Brought to you by assignScenesToLocations() PS- I'm getting hungry");
////       //dgw start
//        
//        // Here Scene objects are created, and "assigned" to specific locations in the 2D array
//        // The  "symbol" in Scene should be used by the map to display the scene on the map
//        
//        //Eric add this to show up after some one begins a game
//        //if it doesn't work, feel free to take it out.        
//        Scene firstScene = new Scene(SceneType.FirstScene);
//        firstScene.setSymbol("FS");
//        location[0][0].setScene(firstScene);
//        
//        
//        Scene tradingPostScene = new Scene(SceneType.TradingPost);
//        tradingPostScene.setSymbol("TP");
//        location[0][0].setScene(tradingPostScene);
//        location[2][7].setScene(tradingPostScene);
//        location[1][14].setScene(tradingPostScene);
//        
//        Scene trailScene = new Scene(SceneType.Trail);
//        trailScene.setSymbol("T");
//        location[0][1].setScene(trailScene);
//        location[1][1].setScene(trailScene); 
//        location[1][2].setScene(trailScene);
//        location[2][2].setScene(trailScene);
//        location[1][4].setScene(trailScene);
//        location[0][5].setScene(trailScene);
//        location[1][6].setScene(trailScene);
//        location[2][6].setScene(trailScene);
//        location[2][8].setScene(trailScene);
//        location[2][9].setScene(trailScene);
//        location[0][11].setScene(trailScene);
//        location[1][11].setScene(trailScene);
//        location[2][11].setScene(trailScene);
//        location[2][12].setScene(trailScene);
//        location[1][13].setScene(trailScene);
//        location[1][16].setScene(trailScene);
//        location[0][17].setScene(trailScene);
//        location[1][17].setScene(trailScene);
//        location[1][18].setScene(trailScene);
//        
//        Scene eatingScene = new Scene(SceneType.Eating);
//        eatingScene.setSymbol("E");
//        location[2][1].setScene(eatingScene);
//        location[1][5].setScene(eatingScene);
//        location[1][10].setScene(eatingScene);
//        location[1][15].setScene(eatingScene);
//        
//        Scene waterScene = new Scene(SceneType.WaterSource);
//        eatingScene.setSymbol("W");
//        location[1][7].setScene(waterScene);
//        location[2][3].setScene(waterScene);
//        location[2][10].setScene(waterScene);
//        location[0][16].setScene(waterScene);
//      
//        Scene huntingScene = new Scene(SceneType.HuntingScene);
//        huntingScene.setSymbol("H");
//        location[0][4].setScene(huntingScene);
//        location[0][10].setScene(huntingScene);
//        
//        Scene foodScene = new Scene(SceneType.FoodSource);
//        foodScene.setSymbol("F");
//        location[2][5].setScene(foodScene);
//        location[1][12].setScene(foodScene);
//
//        System.out.println("********* SCENES HAVE BEEN ASSIGNED TO LOCATIONS *******");
//    }
    
    
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
// 
}
