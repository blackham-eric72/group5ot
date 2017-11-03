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
public class GameMenuView {

    
    
    /*public class MenuView
    {*/
        private String menu;
        private String promptMessage;
                

        public GameMenuView() {
            this.menu = 
                          "\n************ Enter a menu option ************"
                        + "\n--------------------------"
                        + "\n| Game Menu               |"
                        + "\n--------------------------"
                        + "\nC - Continue Game "
                        + "\nM - View Map"
                        + "\nH - Help Menu"                 
                        + "\nI - View Inventory"
                        + "\nV - View Health"
                        + "\nS - Save game and return to main menu"
                        + "\nX - Quit Game and return to main menu"
                        + "\n--------------------------";
        }
   
    
    public void displayGameMenuView() {
       
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
        
        this.promptMessage ="\n" + menu;
                          /*"\n************ Enter a menu option ************"
                        + "\n--------------------------"
                        + "\n| Game Menu               |"
                        + "\n--------------------------"
                        + "\nC - Continue Game "
                        + "\nM - View Map"
                        + "\nH - Help Menu"                 
                        + "\nI - View Inventory"
                        + "\nV - View Health"
                        + "\nS - Save game and return to main menu"
                        + "\nX - Quit Game and return to main menu"
                        + "\n--------------------------";*/
               
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.toUpperCase().trim(); //convert to uppercase and trim off leading and trailing blanks
            
            if ("C".equals(value) || "M".equals(value) || "I".equals(value) || "H".equals(value) || "V".equals(value) || "S".equals(value) || "X".equals(value) ) { //value is blank
               break; 
            }
            else {
                 System.out.println("\nInvalid value: Must input C, M, I, H, V, S, or X");
            }
                    
        }
        
        return value; // return the value entered
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "C": // create and start new game
                this.continueGame();
                break;
            case "M": // get and start an existing game
                this.viewMap();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "I": // display the Game menu
                this.viewInventory();
                break;
            case "V": // save the current game
                this.viewHealth();
                break;
            case "S": // save the current game
                this.saveGameExit();
                break;
            case "X": // save the current game
                this.exitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void displayHelpMenu() {
        //Create HELP menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the main menu view
        helpMenuView.displayHelpMenuView();
    }

    private void continueGame() {
        System.out.println("*** continueGame() function called ***");    
    }

    private void viewMap() {
        System.out.println("*** viewMap() function called ***");    
    }

    private void viewInventory() {
        System.out.println("*** viewInventory() function called ***");    
    }

    private void viewHealth() {
        System.out.println("*** viewHealth() function called ***");    
    }

    private void saveGameExit() {
        System.out.println("*** saveGameExit() function called ***");    
    }

    private void exitGame() {
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();    
    }

    void displayMenu() {
        System.out.println("*** displayMenu() function called ***");    
    }

}
