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
import CIT260.Group5ot.enums.itemType;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Player;
import CIT260.Group5ot.model.Character;
import static CIT260.Group5ot.model.Character.Daughter1;
import static CIT260.Group5ot.model.Character.Daughter2;
import static CIT260.Group5ot.model.Character.Father;
import static CIT260.Group5ot.model.Character.Mother;
import static CIT260.Group5ot.model.Character.Son1;
import static CIT260.Group5ot.model.Character.Trader;


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
    
    
//            public static Actor[] createActors() {
//            actors = create an array Actor objects
//            actor1 = new Actor object
//            Assign values to each attribute in the Actor object
//            Assign actor1 to the next position in the actors array
//            actor2 = new Actor object
//            Assign values to each attribute in the Actor object
//            Assign actor2 to the next position in the actors array
//            …
//            …
//            RETURN items
//            }
    
    
//     public static Character[] createCharacter(){
//         
//               
//        Character obadiah = new Character();
//        obadiah.setName("Obadiah");
//        obadiah.setDescription("He is the leader of the family");
//        obadiah.setCoordinates( new Point(1,1));
//        
//        Character LilyAnne = new Character();
//        lilyAnne.setName("LilyAnne");
//        lilyAnne.setDescription("She is the mother(real leader) of the family");
//        lilyAnne.setCoordinates( new Point(0,1));
//        
//        //return Character[0];
//    }
    
 
    
    
    
//        Xpublic static InventoryItem createItems() {
//        Xitems = create an array InventoryItem objects
//        Xitem1 = new InventoryItem object
//        ?Assign values to each attribute in the InventoryItem object
//        Assign items1 to a position in the items array
//        item2 = new InventoryItem object
//        Assign values to each attribute in the InventoryItem object
//        Assign items2 to a position in the items array
//        …
//        …
//        RETURN items
//        }
    
    public static InventoryItem[] createItems(){
        
        InventoryItem gun = new InventoryItem();
        gun.setInventoryType("gun");
        gun.setQuantityInStock(0);
        gun.setRequiredAmount(0);
        
       // inventoryItem[ItemType.gun.ordinal()] = gun;
        
//        String[] items = new String[7];
//        
//        items[0] = "gun";
//        items[1] = "ox";
//        items[2] = "water";
//        items[3] = "meat";
//        items[4] = "wheat";
//        items[5] = "ammo";
//        items[6] = "medicine";
//        
//        System.out.println("I Like delicious sandwiches that were created  by the createItem Function.");
        return null;
    }
    
   
    public static Map createMap(int noOfRows, int noOfColumns){
        
//        Map map = new createMap(noOfRows, noOfColumns);
//        
//        if (map == null) {
//           return -1; 
//        }

        
        System.out.println("We like tacos but we don't have any. This message brought to you by the createMap() function");
        return null ;
    }
        

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
    }
      
    public static InventoryItem[] createItems(){
        System.out.println("I Like delicious sandwiches that were created  by the createItem Function.");
        return null;
    }
    
    public static void Character createCharacter(){
      //String characters[] = {Father.getName(), Father.getDescription(),};
        //Character obadiah = Character.valueOf("Father");     
        ArrayList<Character> actors = new ArrayList<>();
        actors.add(Father);
        actors.add(Mother);
        actors.add(Son1);
        actors.add(Daughter1);
        actors.add(Daughter2);
        actors.add(Trader);
        
      System.out.println(actors);           
    }
    
        
}
