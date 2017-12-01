package CIT260.Group5ot.view;

import CIT260.Group5ot.control.ShoppingControl;
import java.util.Scanner;
import CIT260.Group5ot.enums.ShoppingListEnum;
import CIT260.Group5ot.exceptions.ShoppingControlException;
import CIT260.Group5ot.model.ShoppingList;
import group5ot.Group5ot;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crims
 */
public class BuySuppliesView extends View {
       
       private String promptMessage; 
        protected final PrintWriter console = Group5ot.getOutFile();    
 

        //Add end shopping option
        //Add loop to allow any number of items
        //Add subtotal after each purchase decision
        
    
        public BuySuppliesView() {
                    //display a welcome message and instructions and menu
            super( "\nWelcome to the Trading Post. "
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
                case "S": {
                try {
                    // display buy supplies menu
                    this.orderTotalCalculation();
                } catch (ShoppingControlException ex) {
                    Logger.getLogger(BuySuppliesView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "Q": // return to previous screen
                    this.displayTradingpostMenuView();
                    break;
                default:
                   this.console.println("\n*** Invalid selection *** Try Again");
                   break;
        }
            return false;
            
     }
        
        
     public void orderTotalCalculation() throws ShoppingControlException {
        ShoppingControl createListFunction = new ShoppingControl(); 
                
            //get purchase choices from user
            this.console.println("\n"
                + "\n|------------------------------------------------------|"       
                + "\n|                 Merchandise List                     |"
                + "\n|------------------------------------------------------|"
                + "\n|         Item                       Price             |" 
                + "\n|------------------------------------------------------|"
                + "\n|         Food                       $1.00 per pound   |"
                + "\n|         Ox                         $50.00            |"
                + "\n|         Ammo                       $0.05/round       |" 
                + "\n|         Medicine                   $0.05/dose        |"
                + "\n|------------------------------------------------------|"
            ); 

        //get food quantity
        Scanner food = new Scanner(System.in);

        this.console.println("Enter desired pounds of food. (0 if no food is needed)");

        //create memory location for food ,set to 0, try to create int from input, catch exception.
        int foodQuantity = 0;
        try {
            foodQuantity = parseInt(food.next());
        } catch (NumberFormatException nf) {
            this.console.println("Please enter a valid number."
                    + "\n Try again or enter Q to quit.");
        }
        
        
        //get Ox quantity
        Scanner ox = new Scanner(System.in);

        this.console.println("Enter desired number of oxen. (0 if no oxen are needed)");

        //create memory location for ox
        int oxQuantity = 0;
        try {
            oxQuantity = parseInt(ox.next());
        } catch (NumberFormatException nf) {
            this.console.println("Please enter a valid number."
                    + "\n Try again or enter Q to quit.");
        }
        
        
        //get Ammo quantity
        Scanner ammo = new Scanner(System.in);

        this.console.println("Enter desired number of rounds of ammo. (0 if no ammo is needed)");

        //create memory location for ammo
        int ammoQuantity = 0;
        try {
            ammoQuantity = parseInt(ammo.next());
        } catch (NumberFormatException nf) {
            this.console.println("Please enter a valid number."
                    + "\n Try again or enter Q to quit.");
        }
        
        
        //get medicine quantity
        Scanner medicine = new Scanner(System.in);

        this.console.println("Enter desired number of doses of medicine. (0 if no medicine is needed)");

        //create memory location for ammo
        int medicineQuantity = 0;
        try {
            medicineQuantity = parseInt(medicine.next());
        } catch (NumberFormatException nf) {
            this.console.println("Please enter a valid number."
                    + "\n Try again or enter Q to quit.");
        }


        ShoppingList passFood = new ShoppingList(ShoppingListEnum.food, foodQuantity, 1);
        ShoppingList passOx = new ShoppingList(ShoppingListEnum.ox, oxQuantity, 50);
        ShoppingList passAmmo = new ShoppingList(ShoppingListEnum.ammo, ammoQuantity, .05);
        ShoppingList passMedicine = new ShoppingList(ShoppingListEnum.medicine, medicineQuantity, .05);
    
            
            
            
        ArrayList<ShoppingList> myList = createListFunction.createList();
		myList.add(passFood);
		myList.add(passOx);
		myList.add(passAmmo);
		myList.add(passMedicine);
		
		double totalCost = createListFunction.calculateTotalCost(myList);           
     
                              
                this.console.println(   "\n--------------------------------------------------"
                                    + "\n                Trading Post Receipt              "
                                    + "\n--------------------------------------------------"
                                    + "\n" + "Food Quantity:  " + foodQuantity + ""            
                                    + "\n" + "Ox Quantity:  " + oxQuantity +     "" 
                                    + "\n" + "Ammo Quantity:  " + ammoQuantity + ""
                                    + "\n" + "Medicine Quantity:  " + oxQuantity + "" 
                                    + "\nTotal = $" + totalCost + "                        " 
                                    + "\n                                                  "        
                                    + "\n Thank you for shopping at TrailMart. Come Again! "       
                                    + "\n--------------------------------------------------");
        
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
       
        tradingpostMenuView.display();  
     } 
            
     private void displayTradingpostMenuView() {
        TradingpostMenuView tradingpostMenuView = new TradingpostMenuView();
       
        tradingpostMenuView.display();
    }
}



           

    



           

    
