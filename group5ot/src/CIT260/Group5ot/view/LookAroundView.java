/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.HealthControl;

/**
 *
 * @author crims / Ken Hodgson
 */
public class LookAroundView extends View {
//    private String displayMessage;
//    private String promptMessage;
    
    public LookAroundView() {
            super("\n"
                + "\n|*| ------------------------------------    |*|"
                + "\n|*| You see the following: a friendly       |*|"
                + "\n|*| looking dog, a portal to another        |*|"
                + "\n|*| dimension, and Chuck Norris             |*|"
                + "\n|*| ------------------------------------    |*|"
                + "\n|*| What would you like to look closer at?  |*|"
                + "\n|*| D - A friendly looking dog              |*|"
                + "\n|*| P - A portal to another dimension       |*|"
                + "\n|*| C - Chuck Norris                        |*|"
                + "\n|*| R - Return to Trading Post Menu         |*|");
    }
  
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "D": 
                this.dogBite();
                break;
            case "P": 
                this.portal();
                break;
            case "C": 
                this.chuckNorris();
                break;
            case "R": // return to the previous screen
                this.returnToTradingPostMenu();
                break;                 
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

            return false;
    }

    private void dogBite() {
        this.console.println("\n That dog was not friendly. You got bitten. Recovering from the dog bite will decrease your health.");
        //bring in healthdecrease function
        // Declares the variable and assigns a new object.
        //HealthControl calcHealthDecrease = new HealthControl(); 
    }

    private void portal() {
        this.console.println("\n You were sucked into the portal. GAME OVER!");
        System.exit(0);
    }

    private void chuckNorris() {
        this.console.println("\n Chuck Norris's glorious presence imbued you with improved health.");
        //bring in healthincrease function
        // Declares the variable and assigns a new object.
        //HealthControl calcHealthIncrease = new HealthControl();    
    }

    private void returnToTradingPostMenu() {
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
        
        //display buy supplies view
        tradingpostMenuView.display();    }


}
