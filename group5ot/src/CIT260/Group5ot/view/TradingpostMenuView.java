/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

//import CIT260.Group5ot.control.GameControl;
import group5ot.Group5ot;
import java.util.Scanner;
/**
 *
 * @author crims
 */
public class TradingpostMenuView {
    
        private String menu;
        private String promptMessage;

        public TradingpostMenuView( ){
         
        }
    
    public void displayTradingpostMenuView() {
        boolean done = false;  //set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X"))  //user wants to quit
                return;  //exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        
        this.promptMessage = 
                        "\n*************Enter a menu option ****************"
                         + "\n------------------------"
                        + "\n| Trading Post Menu     |"
                        + "\n------------------------"
                        + "\nL - Look around"
                        + "\nB - Buy supplies"
                        + "\nM - Continue moving forward"
                        + "\nH - Trading Post help"
                        + "\nG - Game menu"
                        + "\nX - Quit"
                        + "\n------------------------";
        
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
        
        return value;  // return the value entered
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();  //convert choice to upper case
        
        switch (choice) {
            case "L":  // Look around
                this.displayLookAroundView();
                break;
            case "B": // buy supplies
                this.displayBuySupplies();
                break;
            case "M":  //continue moving forward
                this.displayMoveView();
                break;
            case "H": // Trading post help
                this.displayTradingpostHelp();
                break;
            case "G": // game menu
                this.displayGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        
        return false;
    }

    private void displayLookAroundView() {
        //Create lookAround object
        LookAroundView lookAroundView = new LookAroundView();
        
        //display lookAround view
        lookAroundView.displayLookAroundView();
    }

    private void displayBuySupplies() {
        //Create buy supplies object
        BuySuppliesView buySuppliesView = new BuySuppliesView();
        
        //display buy supplies view
        buySuppliesView.displayBuySuppliesView();
       
    }

    private void displayMoveView() {
        //Create move object
        MoveView moveView = new MoveView();
        
        //display move view
        moveView.displayMoveView();
    }

    private void displayTradingpostHelp() {
        //Create Tradingpost Help object
        TradingpostHelpView tradingpostHelpView = new TradingpostHelpView();
        
        // Display the tradingpost help view
        tradingpostHelpView.displayTradingpostHelpView();
    }

    private void displayGameMenu() {
        //Create Game menu object
        GameMenuView gameMenuView = new GameMenuView();
                
        // Display the Game menu view
        gameMenuView.displayGameMenuView();
        
    }
    
}

