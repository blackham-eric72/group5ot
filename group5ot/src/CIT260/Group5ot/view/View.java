/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import group5ot.Group5ot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ken
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    protected final BufferedReader keyboard = Group5ot.getInFile();
    protected final PrintWriter console = Group5ot.getOutFile();
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    @Override
    public void display() {

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
    @Override
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
}
