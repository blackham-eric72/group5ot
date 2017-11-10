/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import java.util.Scanner;

/**
 *
 * @author crims
 */
public class TradingpostHelpView extends View {
    
         
        public TradingpostHelpView() {
            super("\n"
                    + "\n----------------------------------------------"
                    + "\n|             Trading Post Help              |"
                    + "\n----------------------------------------------"
                    + "\n|      C - Close Trading Post Help           |"
                    + "\n|      B - Buy Supplies                      |"
                    + "\n|                                            |"
                    + "\n|  To purchase supplies:                     |"
                    + "\n|     From the Tradingpost Menu, choose      |"
                    + "\n|     choose option B.                       |"
                    + "\n|  A list of merchandise items and prices    |"
                    + "\n|  will be displayed. Enter the item name,   |"
                    + "\n|  quantity, and price after the prompts.    |"
                    + "\n|  You must purchase two items only. A       |"
                    + "\n|  receipt with total will then be displayed |"
                    + "\n|  and your will be returned to the          |"
                    + "\n|  Trading Post Menu                         |");
       
    }
        
       @Override
          public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("C")) // user wants to quit
                return; // go back to previous view

            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
        
    }
       
        
        @Override
        public boolean doAction(String value) {
            
                value = value.toUpperCase();
                
            if ("B".equals(value)) {
                this.displayBuySupplies();  // user want to Buy Supplies
            }   
            else{
                System.out.println("\n*** Invalid selection *** Try again");
            }    
                return false;               
         
        }

    
    
        private void displayBuySupplies() {
             //Create buy supplies object
             BuySuppliesView buySuppliesView = new BuySuppliesView();

             //display buy supplies view
             buySuppliesView.display();
        }
}
