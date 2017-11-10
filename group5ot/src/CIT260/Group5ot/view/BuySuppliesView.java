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
public class BuySuppliesView extends View {
       
       private String promptMessage; 
        

        //Add end shopping option
        //Add loop to allow any number of items
        //Add subtotal after each purchase decision
        
    
        public BuySuppliesView() {
                    //display a welcome message and instructions and menu
            super( "\nWelcome to the Trading Post. "
                  +"\nEnter the item name, amount and price."
                  +"\nAt the current time, you must buy 2 items. "
                  + "\n|---------------------------------------|"
                  + "\n|              Buy Supplies             |"
                  + "\n|-------------------------------------- |"
                  + "\n|  S - Shop                             |"
                  + "\n|  Q - Return                           |"
                  + "\n|---------------------------------------|");
        }
        
    @Override
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
        
        
     public void orderTotalCalculation(){
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
            //String value;
            
            Scanner inputItemName1 = new Scanner(System.in);
            
            //while(true){            
             System.out.println("please enter the item name:");            
             //value = inputItemName1.next();
             
            //create memory location for itemName1
            String itemName1 = inputItemName1.next().toUpperCase();
            
            if ("FOOD".equals(itemName1) || "OX".equals(itemName1) || "AMMO".equals(itemName1) || "MEDICINE".equals(itemName1) ) {
            System.out.println("You entered: " + itemName1);
            }
            else {
                System.out.println("\n\n*****Invalid Entry, please start over and try again*****");
                return;
            }
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
            
           // System.out.println("Would you like to purchase another item?  Enter Y or N");
          //  Scanner String answer = new Scanner(System.in);
            //if ("Y".equals(answer)){
                
            
                       
       

            //create memory location for itemName2
            String itemName2 = inputItemName2.next().toUpperCase();
            if ("FOOD".equals(itemName2) || "OX".equals(itemName2) || "AMMO".equals(itemName2) || "MEDICINE".equals(itemName2) ) {
            System.out.println("You entered: " + itemName2);
            }
            else {
                System.out.println("\n\n*****Invalid Entry, please start over and try again*****");
                return;
            }
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
         

    private void displayTestMenu() {
        TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.display();
    }
           
}

    
