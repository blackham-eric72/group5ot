/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.AnimalHuntedControl;
import CIT260.Group5ot.control.HealthControl;
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
                        + "\n|*| A    - Test Animal List          |*|"                       
                        + "\n|*| H    - Test Hunt Menu            |*|"                 
                        + "\n|*| S    - Save game                 |*|"
                        + "\n|*| M    - View Map                  |*|"
                        + "\n|*| L    - Look Around               |*|"                    
                        + "\n|*| C    - Test Checkpoint Menu      |*|"
                        + "\n|*| MEAT - Test Calculate MeatShares |*|"
                        + "\n|*| T    - Trading Post Menu         |*|"
                        + "\n|*| TP   - Look around Trading Post  |*|"
                        + "\n|*| E    - Eating View               |*|"
                        + "\n|*| R    - Rest View                 |*|"
                        + "\n|*| CH   - calculate health          |*|"
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
            case "A": // display the Animals menu
                this.displayAnimalsArrayTest();
                break;                
            case "H": // display the HUNT menu
                this.displayHuntView();
                break;
            case "T": // trading post view
                this.displayTradingpostMenuView();
                break;
            case "M": // display the map view
                this.displayMapView();
                break;
            case "L": // display the map view
                this.displayLookAroundView();
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
            case "TP": // return to the main menu
                this.displayLookAroundTradingPost();
                break;
            case "E": // return to the main menu
                this.displayEatingView();
                break;
            case "R": // rest view
                this.displayRestView();
                break;
                case "CH": // rest view
                this.displayCalculateHealth();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void displayAnimalsArrayTest() {
//        System.out.println("*** displayAnimalsArrayTest() function called ***");
        System.out.println(AnimalHuntedControl.createAnimals());
    }   

    private void displayHuntView() {
        HuntingSceneView huntSceneView = new HuntingSceneView();
        
        huntSceneView.display();
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
    //go to the look around view
    private void displayLookAroundView() {
        //Create map view object
        LookAroundView lookAroundView = new LookAroundView();
                
        // Display the map view
        lookAroundView.display();
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
        
        meatShareCalcView.display();    
    }

    private void displayLookAroundTradingPost() {
        LookAroundView lookAroundView = new LookAroundView();
        
        lookAroundView.display();    
    }

    private void displayEatingView() {
        EatingView eatingView = new EatingView();
        
        eatingView.display();    
    }
    
        private void displayRestView() {
        RestView restView = new RestView();
                
        // Display the rest menu
        restView.display();    
    }
    private void displayCalculateHealth(){
        HealthControl health = new HealthControl();
        
        health.calcAverageHealth();
    }
    
}
