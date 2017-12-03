/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view; 

import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.control.InventoryControl;
import CIT260.Group5ot.exceptions.InventoryControlException;
import CIT260.Group5ot.model.InventoryItem;
import group5ot.Group5ot;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author crims
 */
public class GameMenuView extends View {   
    /*public class MenuView
    {*/
//        private String promptMessage;
                

        public GameMenuView() {
            super   ("\n************ Enter a menu option ************"
                    + "\n------------------------------------"
                    + "\n|            Game Menu             |"
                    + "\n------------------------------------"
                    + "\nR - Return To Game "
                    + "\nH - Display Help Menu"                 
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
//            case "I": {
//                this.printInventory();
//                 break;       
//            }

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

    private void displayHealthView() {
        HealthView healthView = new HealthView();
        
        healthView.display();   
    }
    
    private void saveGameExit() {
        this.console.println("*** saveGameExit() function called ***");    
    }

    private void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();    
    }

    private void returnToGame() {
        this.console.println("\n*** Chuck Norris's calendar goes straight from March 31st to April 2nd. No one fools Chuck Norris.Brought to you by returnToGame().");
    }

    private void printInventory() {
        this.console.println("\nThe inventory will print to an external file. "
                            +"\nEnter the file path for the file it will be printed to.");
        String filePath = this.getInput();
        
        try { 
            InventoryControl.printInventory(InventoryControl.sortInventoryItems(), filePath);
        } catch(Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());

        }    
    }

   

}
