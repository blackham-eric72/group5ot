/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.WagonControl;
import CIT260.Group5ot.exceptions.WagonControlException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author crims
 */
public class WagonWeightView extends View{
    private String displayMessage;
    
        public WagonWeightView() {
    
            super("\n|  W - Calculate Wagon Cargo Weight      |"
                + "\n|  Q - Return                            |"
                + "\n|----------------------------------------|");
        }
        
    @Override
     public boolean doAction(String choice) {
         
            choice = choice.toUpperCase(); // convert to upper case
            
            switch (choice) {      
                case "W": 
            {
                try {
                    this.WagonWeightCalc();
                } catch (WagonControlException ex) {
                    Logger.getLogger(WagonWeightView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    break;
                case "Q": // return to previous screen
                    this.displayTestMenuView();
                    break;
                default:
                   System.out.println("\n*** Invalid selection *** Try Again");
                   break;
        }
            return false;
            
     }

    private void WagonWeightCalc() throws WagonControlException  {
        WagonControl calcWagonCargoWeight = new WagonControl();
        
        
            Scanner numAdults = new Scanner(System.in);
        
            System.out.println("Enter the number of adults");
            
            String adultStr = numAdults.nextLine();
            int adults = 0;
            try {
                adults = parseInt(adultStr);
            } catch (NumberFormatException nf) {
                System.out.println("Please enter a valid number. Adults must be 1 or 2.");
            }
        
            
            //Scanner numChildren = new Scanner(System.in);
            
            System.out.println("Enter the number of children");
            
            String childrenStr = numAdults.nextLine();
            int children = 0;
            try {
                children = parseInt(childrenStr);
            } catch (NumberFormatException nf) {
                System.out.println("Please enter a valid number. Children must be between 1 and 4.");
            }
        
            double supplyWeight = 382;
            double meatWeight = 114;
            double waterWeight = 453;
                      
            double totalWeight = calcWagonCargoWeight.calcWagonCargoWeight(adults, children, supplyWeight, meatWeight, waterWeight);
    
           
        
            System.out.println("\n" + "Number of adults: " + adults +" "
                              + "\n" + "Number of children: " + children +" "
                              + "\n" + "Supply weight: " + supplyWeight + " "
                              + "\n" + "Meat weight: " + meatWeight + " "
                              + "\n" + "Water weight: " + waterWeight); 
            
            
        }    
            
           
       
            
    

    private void displayTestMenuView() {
        //create test menu object
        TestMenuView testMenuView = new TestMenuView();
        
        //display the test menu
        testMenuView.display();
        
    }
    
}