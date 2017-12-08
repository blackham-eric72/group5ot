/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.AnimalHuntedControl;
import CIT260.Group5ot.model.Animal;
import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.exceptions.AnimalControlException;
import group5ot.Group5ot;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//import CIT260.Group5ot.view.ErrorView;

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
                        + "\n|*| H    - Hunting View              |*|"  
//                        + "\n|*| AP   - Print Animal List         |*|"                                       
                        + "\n|*| S    - Save game                 |*|"
                        + "\n|*| M    - View Map                  |*|"
                        + "\n|*| L    - Look Around               |*|"                    
                        + "\n|*| C    - Test Checkpoint Menu      |*|"
                        + "\n|*| MEAT - Test Calculate MeatShares |*|"
                        + "\n|*| T    - Trading Post Menu         |*|"
                        + "\n|*| E    - Eating View               |*|"
                        + "\n|*| W    - Test Wagon Cargo Weight   |*|"
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
            case "AD": {
            try {
                // display the Animals menu
                this.displayAnimalsArrayTest();
            } catch (AnimalControlException ex) {
                System.out.println("I dont know why this is here.");
            } catch (IOException ex) {
                System.out.println("I dont know why this is here.");
            }
        }
                break;                                      
//            case "AP": // display the Animals menu
//                this.printAnimalsArrayTest();
//                break;                
            case "H": // display the HUNT menu
                this.displayHuntView();
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
            case "E": // return to the main menu
                this.displayEatingView();
                break;
            case "W":  // test calcWagonCargoWeight()
                this.displayWagonWeightView();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    
//I could not get this to work.  I'm not sure how to get my Animal array here.
//    private void printAnimalsArrayTest() {
//        
//        this.console.println("\n\nEnter the desired file path for the animal list report.");
//        String filePath = this.getInput();        
//        try { 
//            TestMenuView.printAnimalsArrayTest(AnimalHuntedControl.printAnimalList(animal), filePath);
//        } catch(Exception ex) {
//            ErrorView.display("TestMenuView", ex.getMessage());
//
//        }        
//    
//    }  
      
    
    private void displayAnimalsArrayTest() throws AnimalControlException, IOException {
//        this.console.println("*** displayAnimalsArrayTest() function called ***");
        this.console.println(AnimalHuntedControl.createAnimals());
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
        this.console.println("*** saveGame() function called ***");
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
      
    private void displayMainMenu(){
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }

    private void displayMeatSharesCalcView() {
        MeatShareCalcView meatShareCalcView = new MeatShareCalcView();
        
        meatShareCalcView.display();    
    }

    private void displayEatingView() {
        EatingView eatingView = new EatingView();
        
        eatingView.display();    
    }
    
    private void displayWagonWeightView() {
        WagonWeightView wagonWeight = new WagonWeightView();
        
        wagonWeight.display();
    }
    
}
