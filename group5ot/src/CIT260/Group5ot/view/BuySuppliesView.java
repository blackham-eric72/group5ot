// /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package CIT260.Group5ot.view;
//
//import CIT260.Group5ot.control.ShoppingControl;
//import java.util.Scanner;
//import CIT260.Group5ot.control.TradingControl;
//import CIT260.Group5ot.enums.ShoppingListEnum;
//import CIT260.Group5ot.model.ShoppingList;
//import static java.lang.Integer.parseInt;
//import java.util.ArrayList;
//
///**
// *
// * @author crims
// */
//public class BuySuppliesView extends View {
//       
//       private String promptMessage; 
//        
//
//        //Add end shopping option
//        //Add loop to allow any number of items
//        //Add subtotal after each purchase decision
//        
//    
//        public BuySuppliesView() {
//                    //display a welcome message and instructions and menu
//            super( "\nWelcome to the Trading Post. "
//                  +"\nEnter the item name, amount and price."
//                  +"\nAt the current time, you must buy 2 items. "
//                  + "\n|---------------------------------------|"
//                  + "\n|              Buy Supplies             |"
//                  + "\n|-------------------------------------- |"
//                  + "\n|  S - Shop                             |"
//                  + "\n|  Q - Return                           |"
//                  + "\n|---------------------------------------|");
//        }
//        
//    @Override
//     public boolean doAction(String choice) {
//         
//            choice = choice.toUpperCase(); // convert to upper case
//            
//            switch (choice) {
//                case "S": // display buy supplies menu
//                    this.orderTotalCalculation();
//                    break;
//                case "Q": // return to previous screen
//                    this.displayTradingpostMenuView();
//                    break;
//                default:
//                   System.out.println("\n*** Invalid selection *** Try Again");
//                   break;
//        }
//            return false;
//            
//     }
//        
//        
//     public void orderTotalCalculation(){
//        //Bring in ShoppingControl thingy. I don't know if I did this right.
//        ShoppingControl createListFunction = new ShoppingControl(); 
//                
//        TradingControl calcTotalFunction = new TradingControl();
//            //get purchase choices from user
//            System.out.println("\n"
//                + "\n|------------------------------------------------------|"       
//                + "\n|                 Merchandise List                     |"
//                + "\n|------------------------------------------------------|"
//                + "\n|         Item                       Price             |" 
//                + "\n|------------------------------------------------------|"
//                + "\n|         Food                       $1.00 per pound   |"
//                + "\n|         Ox                         $50.00            |"
//                + "\n|         Ammo                       $0.05/round       |" 
//                + "\n|         Medicine                   $0.05/dose        |"
//                + "\n|------------------------------------------------------|"
//            ); 
//
//        //get food quantity
//        Scanner food = new Scanner(System.in);
//
//        System.out.println("Enter desired pounds of food. (0 if no food is needed)");
//
//        //create memory location for food
//        int foodQuantity = parseInt(food.next());
//        
//        
//        //get Ox quantity
//        Scanner ox = new Scanner(System.in);
//
//        System.out.println("Enter desired number of oxen. (0 if no oxen are needed)");
//
//        //create memory location for ox
//        int oxQuantity = parseInt(ox.next());
//        
//        
//        //get Ammo quantity
//        Scanner ammo = new Scanner(System.in);
//
//        System.out.println("Enter desired number of rounds of ammo. (0 if no ammo is needed)");
//
//        //create memory location for ammo
//        int ammoQuantity = parseInt(ammo.next());
//        
//        
//        //get medicine quantity
//        Scanner medicine = new Scanner(System.in);
//
//        System.out.println("Enter desired number of doses of medicine. (0 if no medicine is needed)");
//
//        //create memory location for ammo
//        int medicineQuantity = parseInt(medicine.next());
//
//        //here I would pass the variables I got up above to my control function which would then 
//        //create the array and calculate the total cost with a for loop and the array. 
//        //I don't think I did this right
//        ShoppingList passFood = new ShoppingList("food", foodquantity, 1);
//        ShoppingList passOx = new ShoppingList("ox", oxQuantity, 50);
//        ShoppingList passAmmo = new ShoppingList("ammo", ammoQuantity, .05);
//        ShoppingList passMedicine = new ShoppingList("medicine", medicineQuantity, .05);
//    }
//            
//            
//            
//            double total = calcTotalFunction.calcTotal(itemAmountA, itemAmountB, itemPriceX, itemPriceY);
//           System.out.println(
//                              "\n--------------------------------------------------"
//                            + "\n                Trading Post Receipt              "
//                            + "\n--------------------------------------------------"
//                            + "\n " + itemName1 + "     Qty.  " + itemAmountA + "  "          
//                            + "\n " + itemName2 + "     Qty.  " + itemAmountB + "  "
//                            + "\n Total = " + total + "                            " 
//                            + "\n                                                  "        
//                            + "\n Thank you for shopping at TrailMart. Come Again! "       
//                            + "\n--------------------------------------------------");
//                      
//         }
//
//
//    private void displayTradingpostMenuView() {
//        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
//       
//        tradingpostMenuView.display();
//    }
//           
//
//    
