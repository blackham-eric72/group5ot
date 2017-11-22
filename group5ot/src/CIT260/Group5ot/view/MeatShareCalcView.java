/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.MeatShareControl;
import java.util.Scanner;

/**
 *
 * @author Flores Family
 */
public class MeatShareCalcView extends View {
       
    public MeatShareCalcView(){

        super(    "\n|*| ------------------------------------  |*|"
                + "\n|*| You just successfully completed the   |*|"
                + "\n|*| hunt. You must now determine how      |*|"
                + "\n|*| many shares of meat you have for your |*|"
                + "\n|*| group. Hit C to continue              |*|"                 
                + "\n|*| ------------------------------------- |*|");

    }

    //Moved to "View.java" class  
    //public void displayMeatShareCalcView() {
    //
    //  boolean done = false; // set flag to not done
    //        do {
    //            //Prompt for input
    //            String despuesDeBlessedMeat = this.onward();
    //            if (despuesDeBlessedMeat.toUpperCase().equals(" ")) // user wants to return to game menu
    //                return; // return to the game?
    //            
    //            // do the requested action and display the next view
    //            done = this.doAction(despuesDeBlessedMeat);
    //            
    //        } while (!done);
    //        
    //    }
    //private String onward() {                     
    //        
    //        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
    //        String value = ""; // value to be returned
    //        boolean valid = false; //initilaize to not valid
    //        
    //        while (!valid) { // loop while an invalid value is entered
    //            System.out.println("\n" + this.blessedMeatMessage);
    //            
    //            value = keyboard.nextLine(); // get next line typed on keyboard 
    //            value = value.toUpperCase().trim(); //convert to uppercase and trim off leading and trailing blanks
    //            
    //            if ( !"C".equals(value) ) { //check for valid values
    //               System.out.println("\nInvalid value: Please enter C");
    //                continue;
    //            }
    //            
    //            break; //end the loop
    //                    
    //        }
    //        
    //        return value; // return the value entered
    //    }

    public void MeatShareCalculation(){
    //Here I am going to bring in the CalcBarrel Function
    // Declares the variable and assigns a new object.
    MeatShareControl calcWeightShares = new MeatShareControl(); 
    //get weight from user
    System.out.println(
                      "Weight of meat: 150 lbs."
                    + "\n Number of Children: 3"
                    + "\n Number of Adults: 2"
    );

    System.out.println("Please enter the weight of meat:");

    Scanner inputWeight = new Scanner(System.in);
    //store it in a variable called weight
    double weight = inputWeight.nextDouble();
    System.out.println("You entered " + weight);

    //get number of children from user
    System.out.println("Please enter the number of children:");

    Scanner inputChildren = new Scanner(System.in);
    double children = inputChildren.nextDouble();

    System.out.println("You entered " + children +" children.");

    //get number of adults from user
    System.out.println("Please enter the number of adults:");
    Scanner inputAdults = new Scanner(System.in);
    double adults = inputAdults.nextDouble();

    System.out.println("You entered " + adults +" adults.");

    double weightPerShare = calcWeightShares.calcShares(weight, adults, children);
    System.out.println(
                      "\n||********          Calculate shares of meat           ********||"
                    + "\n|| In order to proceed to the next step, you must first        ||"
                    + "\n|| determine how much a share of meat from your hunt weighs.   ||"
                    + "\n|| ---------------------------------------------------------   ||"
                    + "\n|| An adult gets 2 shares and a child gets one share.          ||"
                    + "\n|| You will need to determine how many shares there are in     ||"
                    + "\n|| your group by adding the number of children plus the number ||"
                    + "\n|| of adults times 2. Then you will divide the weight by the   ||"
                    + "\n|| the number of shares. Your answer should be to 2 decimal    ||"
                    + "points. Good luck!                                               ||");
    Scanner userAnswer = new Scanner(System.in);
    double answer = userAnswer.nextDouble();

    System.out.println("\nYou entered " + answer);
    System.out.println("\nThe correct answer was " + weightPerShare);

    if (answer == weightPerShare) {
        System.out.println("\nThat is Correct, please proceed");
        //go back to the checkpoint menu
        this.nextView();

    }
    else{ System.out.println("\nFailure. Please try again");
        //player must start again from the beginning
        this.MeatShareCalculation();
    }
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        if ("C".equals(choice)) {
            this.MeatShareCalculation();
        }    
        else{
            System.out.println("\n*** Invalid selection *** Try again");
        }
            return false;
     }

    private void nextView() {
        System.out.println("\n*** Chuck Norris has a vacation home on the sun. Brought to you by the NextView().");
    }

}
