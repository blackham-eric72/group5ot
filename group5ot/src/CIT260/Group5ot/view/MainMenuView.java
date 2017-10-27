/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
import group5ot.Group5ot;
import java.util.Scanner;

/**
 *
 * @author crims
 */
public class MainMenuView {

    
    
    /*public class MainMenuView
    {*/
        private String menu;
        private String promptMessage;
                

        public MainMenuView() {
            this.menu = "\n"
                        + "\n--------------------------"
                        + "\n| Main Menu              |"
                        + "\n--------------------------"
                        + "\nB - Begin New Game"
                        + "\nL - Load Saved Game"
                        + "\nH - Help"                 
                        + "\nG - Game Menu"
                        + "\nS - Save game"
                        + "\nX - Quit"
                        + "\n--------------------------";
        }
   
    
    public void displayMainMenuView() {
       
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        
        this.promptMessage = "Enter a menu option";
               
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; // return the value entered
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "B": // create and start new game
                this.startNewGame();
                break;
            case "L": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "G": // display the Game menu
                this.displayGameMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void startNewGame() {
                // create a new game
        GameControl.createNewGame(Group5ot.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu() function called ***");
    }

    private void displayGameMenu() {
        System.out.println("*** displayGameMenu() function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }
}
