/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.model.Game;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.Player;
import group5ot.Group5ot;
//import CIT260.Group5ot.enums.itemType;
import CIT260.Group5ot.model.Character;
import java.util.ArrayList;


/**
 *
 * @author crims
 */
public class GameControl {

    public GameControl() {
    }
    

    public static Player createPlayer(String name) {
    
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Group5ot.setPlayer(player); // save the player
        
        return player;
        
        
    }

    public static int createNewGame(Player player) {
        
//        Xpublic static int createNewGame(Player player) {
//        Xif (player == null)
//        Xreturn -1
//        Xgame = create a new Game object
//        XSave a reference to the Player object in the game
//        XSave a reference to the game in the main class
//        ?actors = createActors()
//        ?Save the list of actors in the Game object
//        ?Assign an actor to the player
//        ?items = createItems()
//        ?Save the list of items in the game
//        Xmap = createMap(noOfRows, noOfColumns)
//        XIF map == null THEN
//         RETURN -1
//        ENDIF
//        Assign the map to the game
//        RETURN 1 // indicates success
//        }
        
        //create new game       
       if (player == null) {
           return -1;
       }
        
        Game game = new Game();
        
        game.setPlayer(player);
                
        Group5ot.setCurrentGame(game);
    
        int returnValue = GameControl.createNewGame(Group5ot.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create new game");
        }
        return 0;
    }
    
    
    
     public ArrayList<Character> createCharacter(){
         
        ArrayList<Character> character = new ArrayList<>(); 
               
        Character obadiah = new Character("Obadiah", "He is the leader of the family");
        Character lilyAnne = new Character("LilyAnne", "She is the mother(real leader) of the family");
        Character ephraim = new Character("Ephraim", "First born son");
        Character gertrude = new Character("Gertrude", "First born daughter, who has a fiesty attitude");
        Character myrtle = new Character("Myrtle", "Last born child - only a baby");
        Character traderJoe = new Character("Trader-Joe", "He is the owner of the trading post");
        
        
        character.add(0, obadiah);
        character.add(1, lilyAnne);
        character.add(2, ephraim);
        character.add(3, gertrude);
        character.add(4, myrtle);
        character.add(5, traderJoe);
        
        return character;
    }
    
     
    public ArrayList<InventoryItem> createItems(){
        
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        
        InventoryItem gun = new InventoryItem("Weapon", 3, 1);
        InventoryItem ox = new InventoryItem("Locomotion", 2, 2);
        InventoryItem water = new InventoryItem("Water", 30, 10);
        InventoryItem meat = new InventoryItem("Food", 20, 10);
        InventoryItem wheat = new InventoryItem("Food", 50, 25);
        InventoryItem ammo = new InventoryItem("Weapon", 50, 20);
        InventoryItem medicine = new InventoryItem("Medicine", 20, 10);
        
        inventory.add(0, gun);
        inventory.add(1, ox);
        inventory.add(2, water);
        inventory.add(3, meat);
        inventory.add(4, wheat);
        inventory.add(5, ammo);
        inventory.add(6, medicine);
        
        
        
        System.out.println("I Like delicious sandwiches that were created  by the createItem Function.");
        return inventory;
    }
    
// public static Map createMap( int noOfRows,
// int noOfColumns,
// InventoryItem[] items) {
// if noOfRows < 0 OR numOfColumns < 0
// return null
// endif
// if items is null OR its length is < 1
// RETURN null
// endif
//Map map = new Map object
//save the noOfRows in the map
//save the noOfColumns in the map
//locations = createLocations(noOfRows, noOfColumns)
//Assign the locations array to the map
//scenes = createScenes()
//questions = createQuestions()
//assignQuestionsToScenes()
//assignItemsToScenes() 
//   
    
//    public static Map createMap(int noOfRows, int noOfColumns){
        
//        Map map = new createMap(noOfRows, noOfColumns);
//        
//        if (map == null) {
//           return -1; 
//        }
//
//        
//        System.out.println("We like tacos but we don't have any. This message brought to you by the createMap() function");
//        return null ;
//   }
        

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package CIT260.Group5ot.control;
//

//        
//import group5ot.Group5ot;
//import java.util.ArrayList;
//
///**
// *
// * @author crims
// */
//public class GameControl {
    


//    public static Player createPlayer(String name) {
//    
//        if (name == null) {
//            return null;
//        }
//        
//        Player player = new Player();
//        player.setName(name);
//        
//        Group5ot.setPlayer(player); // save the player
//        
//        return player;
//        
//        
//    }

      //public static int createNewGame(Player player) {
        //return 0;
    //if (player == null)
    //return -1
    //game = create a new Game object
    //Save a reference to the Player object in the game
    //Save a reference to the game in the main class
    //actors = createActors()
    //Save the list of actors in the Game object
    //Assign an actor to the player
    //items = createItems()
    //Save the list of items in the game
    //map = createMap(noOfRows, noOfColumns)
    //IF map == null THEN
    //RETURN -1
    //ENDIF
    //Assign the map to the game
    //RETURN 1 // indicates success
//    }
      
    
    
  
        
    
}