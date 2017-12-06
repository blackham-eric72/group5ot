/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.exceptions.GameControlException;
import CIT260.Group5ot.model.Player;
import group5ot.Group5ot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Flores Family
 */
public class BeginGameView {
    
    protected final BufferedReader keyboard = Group5ot.getInFile();
    protected final PrintWriter console = Group5ot.getOutFile();
    protected final String promptMessage;
    
    public BeginGameView() throws GameControlException {
        
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayPrompt(); 
       
    }
    
    public void displayPrompt(){
        this.console.println(promptMessage);
    }
    
    public void displayBeginGameView() throws GameControlException {

        boolean done = false;
        do {
            // Prompt for and get the input value
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;

            done = this.doAction(playersName);

        } while (!done);

    }

    private String getPlayersName() {
        
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { try {
            // loop while an invalid value is entered
            
            value = this.keyboard.readLine(); // get next line typed on keyboard 
            } catch (IOException ex) {
                Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                this.console.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; // return the value entered
    }
        

    private boolean doAction(String playersName) throws GameControlException {
        
        if  (playersName.length() < 2) {
            this.console.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccessful
            this.console.println("\nError creating the player.");
            return false;
        }
         
        // display next view
        this.displayNextView(player);
        
        return true;  //success!
    }
    
    private void displayNextView(Player player) throws GameControlException {
        this.console.println(
            "\n|======================================================|"
          + "\n| Welcome to the game, "  + player.getName() + ". " + String.format("%-" + (30 - player.getName().length()) + "s", " ") + "|"
          + "\n| Prepare yourself for the treacherous trek            |" //The string above ensures that the right "|" character lines up
          + "\n| to the West - to a land of Opportunity,              |" //regardless of the length of the users's name.
          + "\n| Gold, and Glory.                                     |"
          + "\n| Will you survive the journey?                        |"
          + "\n| Let’s find out...                                    |"
          + "\n| You will first go to a trading post to stock         |"
          + "\n| up for the journey.                                  |" 
          + "\n|======================================================|");
        
        // create a new game
        GameControl.createNewGame(Group5ot.getPlayer());

        // create items
        GameControl gameControl = new GameControl();
        gameControl.createItems();
        
        //create characters
        gameControl.createCharacters();
        
        
        //Create MainMenuView object
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
                
        // Display the main menu view
        tradingpostMenuView.display();
    }
}