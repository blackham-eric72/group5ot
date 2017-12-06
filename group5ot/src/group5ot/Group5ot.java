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
import CIT260.Group5ot.view.BeginGameView;
import CIT260.Group5ot.view.ErrorView;
import CIT260.Group5ot.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
                

/**
 *
 * @author erict.blackham
 */
public class Group5ot {
    
    private static Game currentGame = null;
    private static Player player = null;
   
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

   
    public static void main(String[] args) {
        
        try {
        
            // open character stream files for end user input and outp
            Group5ot.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            Group5ot.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            Group5ot.logFile = new PrintWriter(filePath);
            
            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;
            
        } catch (Throwable te) {
            ErrorView.display(te.getClass().getName(),"Error reading input: " + te.getMessage());

            te.printStackTrace();
           
        }
        finally {
            try {
                
                if (Group5ot.inFile != null)
                    Group5ot.inFile.close();
                if (Group5ot.outFile != null)
                    Group5ot.outFile.close();
                if  (Group5ot.logFile != null)
                    Group5ot.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            

        }
    }
   
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Group5ot.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Group5ot.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Group5ot.logFile = logFile;
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
