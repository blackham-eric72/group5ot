/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Player;
import CIT260.Group5ot.model.Character;
import static CIT260.Group5ot.model.Character.Daughter1;
import static CIT260.Group5ot.model.Character.Daughter2;
import static CIT260.Group5ot.model.Character.Father;
import static CIT260.Group5ot.model.Character.Mother;
import static CIT260.Group5ot.model.Character.Son1;
import static CIT260.Group5ot.model.Character.Trader;
import static CIT260.Group5ot.model.CharacterType.TraderJoe;
        
import group5ot.Group5ot;
import java.util.ArrayList;

/**
 *
 * @author crims
 */
public class GameControl {
    


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
        return 0;
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
    
    public static void createCharacter(){
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
