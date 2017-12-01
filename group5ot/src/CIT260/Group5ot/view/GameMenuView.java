/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
import group5ot.Group5ot;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author crims
 */
public class GameMenuView extends View {  
    /*public class MenuView
    {*/
        private String promptMessage;
                

        public GameMenuView() {
            super   ("\n************ Enter a menu option ************"
                    + "\n------------------------------------"
                    + "\n|            Game Menu             |"
                    + "\n------------------------------------"
                    + "\nR - Return To Game "
                    + "\nH - Help Menu"                 
                    + "\nI - View Inventory"
                    + "\nV - View Health"
                    + "\nS - Save game and return to main menu"
                    + "\nQ - Quit Game and return to main menu"
                    + "\n-------------------------------------");
        }
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "R": // display the help menu
                this.returnToGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "I": // display the Game menu
                this.displayInventoryView();
                break;
            case "V": // save the current game
                this.displayHealthView();
                break;
            case "S": // save the current game
                this.saveGameExit();
                break;
            case "Q": // return to main menu
                this.displayMainMenuView();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void displayHelpMenu() {
        //Create HELP menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the main menu view
        helpMenuView.display();
    }

    private void displayInventoryView() {
        this.console.println("*** viewInventory() function called ***");    
    }

    private void displayHealthView() {
        this.console.println("*** viewHealth() function called ***");    
    }

    private void saveGameExit() {
        this.console.println("*** saveGameExit() function called ***");    
    }

    private void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();    
    }

    void displayMenu() {
        this.console.println("*** displayMenu() function called ***");    
    }

    private void returnToGame() {
        this.console.println("\n*** Chuck Norris' calendar goes straight from March 31st to April 2nd. No one fools Chuck Norris.Brought to you by returnToGame().");
    }

}
