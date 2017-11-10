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
public class TestMenuView extends View {
    
     private String menu;
        private String promptMessage;
                

        public TestMenuView() {
            super("\n"
                        + "\n|*| -------------------------------- |*|"
                        + "\n|*| ****        TEST MENU      ****  |*|"
                        + "\n|*| -------------------------------- |*|"
                        + "\n|*| GM   - Game Menu                 |*|"
                        + "\n|*| BVC  - Calculate Barrel Volume   |*|"
                        + "\n|*| H    - Test Hunt Menu            |*|"                 
                        + "\n|*| S    - Save game                 |*|"
                        + "\n|*| M    - View Map                  |*|"
                        + "\n|*| C    - Test Checkpoint Menu      |*|"
                        + "\n|*| MEAT - Test Calculate MeatShares |*|"
                        + "\n|*| T    - Trading Post Menu         |*|"
                        + "\n|*| Q    - Quit to Main Menu         |*|"
                        + "\n|*| -----------------------------------");
        }
   
    
    @Override
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
        checkpointView.display() ;
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
    private void displayMapView() {
        //Create map view object
        MapView mapView = new MapView();
                
        // Display the map view
        mapView.display();
    }
    //display the barrelvolumecalcview
    private void displayBarrelVolumeCalcView() {
        //Create map view object
        BarrelVolumeCalcView calcBarrel = new BarrelVolumeCalcView();
                
        // Display the map view
        calcBarrel.display();
    }
    
   private void displayTradingpostMenuView() {
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
        
        tradingpostMenuView.display();
    }
    
    private void displayMainMenu(){
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }

    private void displayMeatSharesCalcView() {
        MeatShareCalcView meatShareCalcView = new MeatShareCalcView();
        
        meatShareCalcView.display();    }
    
    
}
