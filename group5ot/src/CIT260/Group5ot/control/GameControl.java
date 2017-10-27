/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import CIT260.Group5ot.model.Player;
import group5ot.Group5ot;

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

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame() function called ***");
    }
    
}
