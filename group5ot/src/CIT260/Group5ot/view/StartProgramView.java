/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
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
public class StartProgramView {
         
        private String promptMessage;
        protected final BufferedReader keyboard = Group5ot.getInFile();
        protected final PrintWriter console = Group5ot.getOutFile();
        
        
        public StartProgramView(){
            
            this.promptMessage = "\nPlease enter your name: ";
            // display the banner when view is created
            this.displayBanner();         
        }

        public void displayBanner() {        
        
            this.console.println(
                  "\n|*|------------------------------------------------|*|"
                + "\n|*|   It is 1848 and you are preparing to set off  |*|"
                + "\n|*| on a journey along the Oregon trail. The trail |*|"
                + "\n|*| will be treacherous, but a land of promise and |*|"
                + "\n|*| opportunity awaits. You must make it to Oregon |*|"
                + "\n|*| by October 31 or winter weather will overwhelm |*|"
                + "\n|*| you.                                           |*|"
                + "\n|*|                                                |*|"
                + "\n|*|    You are the wagon leader for your team and  |*|"
                + "\n|*| will betasked with the job of purchasing       |*|"
                + "\n|*| supplies for yourteam and making decisions     |*|"
                + "\n|*| aboutyour travels. Throughout the journey you  |*|"
                + "\n|*| will be set upon by many challenges; some      |*|"
                + "\n|*| from your team will not make it.               |*|"
                + "\n|*|------------------------------------------------|*|" 
            );
        }

        public void displayStartProgramView() {
                       
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
        
        
        
        
 

    private boolean doAction(String playersName) {
        
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

    private void displayNextView(Player player) {
        this.console.println(
                              "\n|======================================================|"
                            + "\n| Welcome to the game, "  + player.getName() + ". " + String.format("%-" + (30 - player.getName().length()) + "s", " ") + "|"
                            + "\n| Prepare yourself for the treacherous trek            |" //The string above ensures that the right "|" character lines up
                            + "\n| to the west - to a land of Opportunity,              |" //regardless of the length of the users's name.
                            + "\n| Gold, and Glory.                                     | "
                            + "\n| Will you Survive the journey?                        |"
                            + "\n| Let’s find out...                                    |" 
                            + "\n|======================================================|"
                            );
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }

    
}

