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
public class MainMenuView extends View {

    
    
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
                        + "\n|*| X - Quit                  |*|"
                        + "\n|*| ------------------------- |*|");
        }
   
////////Moved to "View.java" class    
//    public void displayMainMenuView() {
//       
//        boolean done = false; // set flag to not done
//        do {
//            // prompt for and get players name
//            String menuOption = this.getMenuOption();
//            if (menuOption.toUpperCase().equals("X")) // user wants to quit
//                System.exit(0); // exit the game and terminate the program
//            
//            // do the requested action and display the next view
//            done = this.doAction(menuOption);
//            
//        } while (!done);
//        
//    }

//    private String getMenuOption() {
//        
//        this.promptMessage = 
//                        "\n ******** Enter a menu option:"
//                       + "\n" + menu;
//                     
//               
//        
//        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
//        String value = ""; // value to be returned
//        boolean valid = false; //initilaize to not valid
//        
//        while (!valid) { // loop while an invalid value is entered
//            System.out.println("\n" + this.promptMessage);
//            
//            value = keyboard.nextLine(); // get next line typed on keyboard 
//            value = value.trim(); //trim off leading and trailing blanks
//            
//            if (value.length() < 1) { //value is blank
//                System.out.println("\nInvalid value: value cannot be blank");
//                continue;
//            }
//            
//            break; //end the loop
//        }
//        
//        return value; // return the value entered
//    }

    @Override
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
            case "T": // display the map view
                this.displayTestMenu();
                break;                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void startNewGame() {
                

// create a new game
        //GameControl.createNewGame(Group5ot.getPlayer());
        
        // display the game menu
        //GameMenuView gameMenu = new GameMenuView();
        //gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() {
        //Create HELP menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the help menu view
        helpMenuView.displayHelpMenuView();
    }

    private void displayGameMenu() {
        //Create Game menu object
        GameMenuView gameMenuView = new GameMenuView();
                
        // Display the Game menu view
        gameMenuView.displayGameMenuView();
    }
    private void saveGame() {
        System.out.println("*** saveGame() function called ***");
    }
    //go to the map view
    private void displayMapView() {
        //Create map view object
        MapView mapView = new MapView();
                
        // Display the map view
        mapView.displayMapView();
    }
    //display the barrelvolumecalcview
    private void displayBarrelVolumeCalcView() {
        //Create map view object
        BarrelVolumeCalcView calcBarrel = new BarrelVolumeCalcView();
                
        // Display the map view
        calcBarrel.displayBarrelVolumeCalcView();
    }
    
    //display the test menu
   private void displayTestMenu(){
       TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.displayTestMenuView();
   }
}
