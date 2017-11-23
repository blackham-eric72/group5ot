
package CIT260.Group5ot.control;

import static CIT260.Group5ot.control.MapControl.createMap;
import CIT260.Group5ot.enums.ItemTypes;
import CIT260.Group5ot.model.Barrel;
import CIT260.Group5ot.model.Game;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.Player;
import group5ot.Group5ot;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Player;
import CIT260.Group5ot.model.Character;
import java.awt.Point;
import java.util.ArrayList;



   /* public static Character createNewCharacter(Character character){
      //String characters[] = {Father.getName(), Father.getDescription(),};
        //Character obadiah = Character.valueOf("Father");     
        ArrayList<Character> actors = new ArrayList<>();
        actors.add(Father);
        actors.add(Mother);
        actors.add(Son1);
        actors.add(Daughter1);
        actors.add(Daughter2);
        actors.add(Trader);
        
        character = actors;
      
      return character;
    }
*/

   
        



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
        
        //create new game       
       if (player == null) {
           return -1;
       }
        
       Game currentGame = new Game();
        
        currentGame.setPlayer(player);
        //this saves a reference to the player object
                
        Group5ot.setCurrentGame(currentGame);
        //this saves a reference to the game
        ArrayList<Character> characters = createCharacters();
        currentGame.setCharacters(characters);
        
        ArrayList<InventoryItem> items = createItems();
       currentGame.setItems(items);
       
       ArrayList<Barrel> barrels = createBarrels();
       currentGame.setBarrels(barrels);
        
       //dgw start
       //dgw not sure why items are passed to createMap???  
        Map map = createMap(2, 27, items);
        
        int returnValue = GameControl.createNewGame(Group5ot.getPlayer());
        if (returnValue < 0) {
            System.out.println("ERROR - Failed to create new game");
        }
        return 0;
    }
    
    
    public static ArrayList<Barrel> createBarrels(){
        ArrayList<Barrel> barrelSizes = new ArrayList<>();
        
        Barrel extraLarge = new Barrel(18, 60);
        Barrel large = new Barrel(14, 55);
        Barrel medium = new Barrel(12, 50);
        Barrel small = new Barrel(10, 40);
        
        barrelSizes.add(0, extraLarge);
        barrelSizes.add(1, large);
        barrelSizes.add(2, medium);
        barrelSizes.add(3, small);
       
        
        return barrelSizes;
        
    }
     public static ArrayList<Character> createCharacters(){
         
        ArrayList<Character> character = new ArrayList<>(); 
               
        Character obadiah = new Character("Obadiah", "He is the leader of the family", 10);
        Character lilyAnne = new Character("LilyAnne", "She is the mother(real leader) of the family", 10);
        Character ephraim = new Character("Ephraim", "First born son", 10);
        Character gertrude = new Character("Gertrude", "First born daughter, who has a fiesty attitude", 10);
        Character myrtle = new Character("Myrtle", "Last born child - only a baby", 10);
        Character traderJoe = new Character("Trader-Joe", "He is the owner of the trading post", 10);
        
        
        character.add(0, obadiah);
        character.add(1, lilyAnne);
        character.add(2, ephraim);
        character.add(3, gertrude);
        character.add(4, myrtle);
        character.add(5, traderJoe);
        
        return character;
    }
    
     
    public static ArrayList<InventoryItem> createItems(){
        
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        
        //dgw - fixed errors start
        InventoryItem gun = new InventoryItem(ItemTypes.gun, 3, 1);
        InventoryItem ox = new InventoryItem(ItemTypes.ox, 2, 2);
        InventoryItem water = new InventoryItem(ItemTypes.water, 30, 10);
        InventoryItem meat = new InventoryItem(ItemTypes.meat, 20, 10);
        InventoryItem wheat = new InventoryItem(ItemTypes.wheat, 50, 25);
        InventoryItem ammo = new InventoryItem(ItemTypes.ammo, 50, 20);
        InventoryItem medicine = new InventoryItem(ItemTypes.medicine, 20, 10);
        //dgw - fixed errors end
        
        inventory.add(0, gun);
        inventory.add(1, ox);
        inventory.add(2, water);
        inventory.add(3, meat);
        inventory.add(4, wheat);
        inventory.add(5, ammo);
        inventory.add(6, medicine);
        
        return inventory;
    } 
}
