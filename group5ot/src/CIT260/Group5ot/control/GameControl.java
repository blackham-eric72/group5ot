/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.enums.ItemType;
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
        
        InventoryItem gun = new InventoryItem(3, 1);
        InventoryItem ox = new InventoryItem(2, 2);
        InventoryItem water = new InventoryItem(30, 10);
        InventoryItem meat = new InventoryItem(20, 10);
        InventoryItem wheat = new InventoryItem(50, 25);
        InventoryItem ammo = new InventoryItem(50, 20);
        InventoryItem medicine = new InventoryItem(20, 10);
        
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