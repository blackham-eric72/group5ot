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
//This scanner import not needed once code starting on line 74 is fixed.
import java.util.Scanner;

/**
 *
 * @author Flores Family
 */
public class StartProgramView {
    
    protected final BufferedReader keyboard = Group5ot.getInFile();
    protected final PrintWriter console = Group5ot.getOutFile();
    protected String displayMessage;

    public StartProgramView(){
        this.displayMessage = "Press C to continue.";

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
        + "\n|*|------------------------------------------------|*|"  );
    }
    
    public void displayStartProgramView() { 
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("X")) // user wants to quit
                return; // go back to previous view

            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
        
    }

    public String getInput() {
         //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine(); // get next line typed on keyboard 
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "C":
                this.displayMainMenuView();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayMainMenuView() {
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();    
    }
    

    
}

