/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import java.util.Scanner;

/**
 *
 * @author erict.blackham
 */
public class TestMenuView {
    
     private String menu;
        private String promptMessage;
                

        public TestMenuView() {
            this.menu = "\n"
                        + "\n--------------------------"
                        + "\n| Test Menu              |"
                        + "\n------------------------------"
                        + "\nGM - Game Menu"
                        + "\nBVC - Calculate Barrel Volume"
                        + "\nH - Test Hunt Menu"                 
                        + "\nS - Save game"
                        + "\nM - View Map"
                        + "\nC - Test Checkpoint Menu"
                        + "\nMEAT - Test Calculate MeatShares"
                        + "\nQ - Quit to Main Menu"
                        + "\n------------------------------";;
        }
   
    
    public void displayTestMenuView() {
       
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
        
        this.promptMessage = 
                        "\n*** Enter a menu option "
                        + "\n" + menu;             
        
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
             case "GM": // display Game menu
                this.displayGameMenu();
                break;
              case "S": // Save game
                this.saveGame();
                break;
            case "H": // display the HUNT menu
                this.displayHuntView();
                break;
            case "C": // display the Game menu
                this.displayCheckpointView();
                break;
            case "T": // trading post view
                this.displayTradingpostMenuView();
                break;
            case "M": // display the map view
                this.displayMapView();
                break;
            case "BVC": // display calc barrel volume view
                this.displayBarrelVolumeCalcView();
                break;
            case "Q": // return to the main menu
                this.displayMainMenu();
                break;
            case "MEAT": // return to the main menu
                this.displayMeatSharesCalcView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

   

    private void displayHuntView() {
        ToHuntOrNotToHuntView huntView = new ToHuntOrNotToHuntView();
        
        huntView.displayToHuntOrNotToHuntView();
    }

    private void displayCheckpointView(){
        //Create checkpoint menu object
        CheckpointView checkpointView = new CheckpointView();
                       
        // Display the checkpoint menu view
        checkpointView.displayCheckpointView() ;
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
    
   private void displayTradingpostMenuView() {
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
        
        tradingpostMenuView.displayTradingpostMenuView();
    }
    
    private void displayMainMenu(){
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }

    private void displayMeatSharesCalcView() {
        MeatShareCalcView meatShareCalcView = new MeatShareCalcView();
        
        meatShareCalcView.displayMeatShareCalcView();    }
    
    
}
