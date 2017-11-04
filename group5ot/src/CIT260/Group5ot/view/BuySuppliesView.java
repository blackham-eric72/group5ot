 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import java.util.Scanner;
import CIT260.Group5ot.control.TradingControl;

/**
 *
 * @author crims
 */
public class BuySuppliesView {
    
        /*display welcome message and instructions
        display merchandise and price list
        get input(itemName1, itemAmountA, itemPriceX, itemName2, itemAmountB, itemPriceZ)
        calculate total
        print purchase invoice
        display end message
        return to ???
        */
        
        private String displayMessage;   
        private String menu;
        private String promptMessage;
    
        public BuySuppliesView() {
            
                    //display a welcome message and instructions
                this.displayMessage = "\nWelcome to the Trading Post. "
                                      +"\nEnter the item name, amount and price"
                                      +"\nin the blanks"
                        ;
                    //display a list of merchandise and prices                  
                this.menu =   "\n|---------------------------------------|"
                            + "\n|              Buy Supplies             |"
                            + "\n|-------------------------------------- |"
                            + "\n|  S - Shop                             |"
                            + "\n|  Q - Return                           |"
                            + "\n|---------------------------------------|";
        }
        
       
        

        public void displayBuySuppliesView() {
        
        //Needs instructions, and a function to enter purchase items and prices with selection statement 
             boolean done = false;
            do {
                // Prompt for menu option input
                String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to return to game menu
                return; // return to the game?
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
                
            } while (!done);
            
            
        }

    private String getMenuOption() {
        
        this.promptMessage = "Enter a menu option" + "\n" + menu;
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.toUpperCase().trim(); //trim off leading and trailing blanks and convert case
            
            if ("S".equals(value) || "Q".equals(value) ) { //check for valid values
                break;
            }
                
            else {
                System.out.println("\nInvalid value: value must be B or Q");
                
            }
            
        }
        
        return value;  //return the value entered
        
    }
    
     public void orderTotalCalculation() {

        //This will run the calcTotal funcion
        
        TradingControl calcTotalFunction = new TradingControl();
            //get purchase choices from user
            System.out.println("\n"
                + "\n|------------------------------------------------------|"       
                + "\n|                 Merchandise List                     |"
                + "\n|------------------------------------------------------|"
                + "\n|         Item                       Price             |" 
                + "\n|------------------------------------------------------|"
                + "\n|         Food                       $1.00 per pound   |"
                + "\n|         Ox                         $50.00            |"
                + "\n|         Ammo                       $2.00/50 rounds   |" 
                + "\n|         Medicine                   $1.00/10 doses    |"
                + "\n|------------------------------------------------------|"
            ); 
            /*Scanner keyboard = new Scanner(System.in);
            String value = ""; //value entered
            boolean valid = false; //initialize to not valid
            
            while (!valid) {
               value = keyboard.nextLine(); //get next line typed on keyboard
               value = value.trim(); //trim spaces
               
               if ("Food".equals(value) || "Ox".equals(value) || "Ammo".equals(value) || "Medicine".equals(value) ) { //check for valid values
                   break;
               }
               
               else {
                   System.out.println("\n*** Invalid entry. Try again ***");
               }
            }
            */
            //first item name input
            System.out.println("please enter the item name:");            
            Scanner inputItemName1 = new Scanner(System.in);
           

            //create memory location for itemName1
            String itemName1 = inputItemName1.next();
            System.out.println("You entered: " + itemName1);

            //get itemAmountA
            System.out.println("Please enter quantity:");
            Scanner inputItemAmountA = new Scanner(System.in);

            double itemAmountA = inputItemAmountA.nextDouble();
            System.out.println("Quantity is " + itemAmountA);

            //get itemPriceX
            System.out.println("Please enter price:");
            Scanner inputItemPriceX = new Scanner(System.in);

            double itemPriceX = inputItemPriceX.nextDouble();
            System.out.println("Price is $ " + itemPriceX);
            
            //Second item name input
            System.out.println("please enter another item name:");            
            Scanner inputItemName2 = new Scanner(System.in);
                       
            /*while (!valid) {
               value = inputItemName2.nextLine(); //get next line typed on keyboard
               value = value.trim(); //trim spaces
               
               if ("Food".equals(value) || "Ox".equals(value) || "Ammo".equals(value) || "Medicine".equals(value) ) { //check for valid values
                   break;
               }
               
               else {
                   System.out.println("\n*** Invalid entry. Try again ***");
               } 
            } */

            //create memory location for itemName1
            String itemName2 = inputItemName2.next();
            System.out.println("You entered: " + itemName2);

            //get itemAmountB
            System.out.println("Please enter quantity:");
            Scanner inputItemAmountB = new Scanner(System.in);

            double itemAmountB = inputItemAmountB.nextDouble();
            System.out.println("Quantity is " + itemAmountB);

            //get itemPriceY
            System.out.println("Please enter price:");
            Scanner inputItemPriceY = new Scanner(System.in);

            double itemPriceY = inputItemPriceY.nextDouble();
            System.out.println("Price is $ " + itemPriceY);
            
            //******************************************
            
            double total = calcTotalFunction.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
           System.out.println(
                              "\n--------------------------------------------------"
                            + "\n                Trading Post Receipt              "
                            + "\n--------------------------------------------------"
                            + "\n " + itemName1 + "     Qty.  " + itemAmountA + "  "          
                            + "\n " + itemName2 + "     Qty.  " + itemAmountB + "  "
                            + "\n Total = " + total + "                            " 
                            + "\n                                                  "        
                            + "\n Thank you for shopping at TrailMart. Come Again! "       
                            + "\n--------------------------------------------------");
          
        }            
     

     
     public boolean doAction(String choice) {
         
            choice = choice.toUpperCase(); // convert to upper case
            
            switch (choice) {
                case "S": // display buy supplies menu
                    this.orderTotalCalculation();
                    break;
                case "Q": // return to previous screen
                    this.displayTestMenu();
                    break;
                default:
                   System.out.println("\n*** Invalid selection *** Try Again");
                   break;
        }
            return false;
            
     }
         
        

    private void displayTestMenu() {
        TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.displayTestMenuView();
    }
           
}

    
