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
public class TradingpostMenuView extends View {
    
        public TradingpostMenuView( ){
            super("\n*************Enter a menu option ****************"
                + "\n------------------------"
                + "\n| Trading Post Menu     |"
                + "\n------------------------"
                + "\nL - Look around"
                + "\nB - Buy supplies"
                + "\nM - Continue moving forward"
                + "\nH - Trading Post help"
                + "\nG - Game menu"
                + "\nX - Leave Trading Post"
                + "\n------------------------");
        }
                
   @Override        
    public boolean doAction(String choice) {
        
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
        lookAroundView.display();
    }

    private void displayBuySupplies() {
        //Create buy supplies object
        BuySuppliesView buySuppliesView = new BuySuppliesView();
        
        //display buy supplies view
        buySuppliesView.display();
       
    }

    private void displayMoveView() {
        //Create move object
        MoveView moveView = new MoveView();
                        
        //display move view
        moveView.display();
    }

    private void displayTradingpostHelp() {
        //Create Tradingpost Help object
        TradingpostHelpView tradingpostHelpView = new TradingpostHelpView();
        
        // Display the tradingpost help view
        tradingpostHelpView.display();
    }

    private void displayGameMenu() {
        //Create Game menu object
        GameMenuView gameMenuView = new GameMenuView();
                
        // Display the Game menu view
        gameMenuView.display();
        
    }
    
}

