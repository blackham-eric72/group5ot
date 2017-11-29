/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.control.MapControl;
import CIT260.Group5ot.exceptions.GameControlException;
import group5ot.Group5ot;
import java.util.Scanner;
import CIT260.Group5ot.model.Character;
import CIT260.Group5ot.model.InventoryItem;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crims
 */
public class MainMenuView extends View {

    Character ch;
    
    /*public class MainMenuView
    {*/
        private String promptMessage;
                

        public MainMenuView() {
                   super( "\n"
                        + "\n|*| ------------------------- |*|"
                        + "\n|*| ****    Main Menu    **** |*|"
                        + "\n|*| ------------------------- |*|"
                        + "\n|*| B - Begin New Game        |*|"
                        + "\n|*| L - Load Saved Game       |*|"
                        + "\n|*| H - Help Menu             |*|"                 
                        + "\n|*| G - Game Menu             |*|"
                        + "\n|*| S - Save game             |*|"
                        + "\n|*| T - Test Menu             |*|"
                        + "\n|*| Q - Quit                  |*|"
                        + "\n|*| ------------------------- |*|");
        }
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "B": {
            try {
                // create and start new game
              this.startNewGame();
            } catch (GameControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            case "T": // display the map view
                this.displayTestMenu();
                break;  
            case "Q": // end the game
                System.exit(0);
                break; 
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void startNewGame() throws GameControlException {
         
       
        // create a new game
        GameControl.createNewGame(Group5ot.getPlayer());

        // create items
        GameControl gameControl = new GameControl();
        gameControl.createItems();
        
        //create characters

        gameControl.createCharacters();

       
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() {
        //Create HELP menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the help menu view
        helpMenuView.display();
    }

    private void displayGameMenu() {
        //Create Game menu object
        GameMenuView gameMenuView = new GameMenuView();
                
        // Display the Game menu view
        gameMenuView.display();
    }
    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }
    //go to the map view
//    private void displayMapView() {
//        //Create map view object
//        MapView mapView = new MapView();
//                
//        // Display the map view
//        mapView.display();
//    }
    //display the barrelvolumecalcview
    private void displayBarrelVolumeCalcView() {
        //Create map view object
        BarrelVolumeCalcView calcBarrel = new BarrelVolumeCalcView();
                
        // Display the map view
        calcBarrel.display();
    }
    
    //display the test menu
   private void displayTestMenu(){
       TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.display();
   }
}
