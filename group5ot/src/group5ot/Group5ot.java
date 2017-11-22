/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group5ot;

import CIT260.Group5ot.model.Barrel;
import CIT260.Group5ot.model.Player;
import CIT260.Group5ot.model.Character;
import CIT260.Group5ot.model.Health;
import CIT260.Group5ot.model.InventoryItem;


import CIT260.Group5ot.model.Trail;
import CIT260.Group5ot.model.Wagon;

//Ken's classes to import...
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.Location;
import CIT260.Group5ot.model.EndScene;
import CIT260.Group5ot.model.LosingGameScene;
import CIT260.Group5ot.model.WinningGameScene;

//Eric's Classes to import...
import CIT260.Group5ot.model.HuntingScene;
import CIT260.Group5ot.model.FoodSource;
import CIT260.Group5ot.model.Game;
import CIT260.Group5ot.model.TradingPost;
import CIT260.Group5ot.model.WaterSource;
import CIT260.Group5ot.view.StartProgramView;
                

/**
 *
 * @author erict.blackham
 */
public class Group5ot {
    
    private static Game currentGame = null;
    private static Player player = null;

  

   
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
    

    public static Player getPlayer() {
        return player;
    }    
    
    public static void setPlayer(Player player) {
        Group5ot.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Group5ot.currentGame = currentGame;
    }
    
}
