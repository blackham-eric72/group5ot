/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.MeatShareControl;
import CIT260.Group5ot.exceptions.MeatShareException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void MeatShareCalculation() throws MeatShareException{
        //Here I am going to bring in the CalcBarrel Function
        // Declares the variable and assigns a new object.
        MeatShareControl calcWeightShares = new MeatShareControl(); 
        //get weight from user
        this.console.println(
                          "Weight of meat: 150 lbs."
                        + "\n Number of Children: 3"
                        + "\n Number of Adults: 2"
        );

        this.console.println("Please enter the weight of meat:");

        Scanner inputWeight = new Scanner(System.in);
        //store it in a variable called weight
        double weight = inputWeight.nextDouble();
        this.console.println("You entered " + weight);

        //get number of children from user
        this.console.println("Please enter the number of children:");

        Scanner inputChildren = new Scanner(System.in);
        double children = inputChildren.nextDouble();

        this.console.println("You entered " + children +" children.");

        //get number of adults from user
        this.console.println("Please enter the number of adults:");
        Scanner inputAdults = new Scanner(System.in);
        double adults = inputAdults.nextDouble();

        this.console.println("You entered " + adults +" adults.");

        double weightPerShare = calcWeightShares.calcShares(weight, adults, children);
        this.console.println(
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

        this.console.println("\nYou entered " + answer);
        this.console.println("\nThe correct answer was " + weightPerShare);

        if (answer == weightPerShare) {
            this.console.println("\nThat is Correct, please proceed");
            //go back to the checkpoint menu
            this.nextView();

        }
        else{ this.console.println("\nFailure. Please try again");
            //player must start again from the beginning
            this.MeatShareCalculation();
        }
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        if ("C".equals(choice)) {
            try {
                this.MeatShareCalculation();
            } catch (MeatShareException ex) {
                ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());

            }
        }    
        else{
            this.console.println("\n*** Invalid selection *** Try again");
        }
            return false;
    }

    private void nextView() {
        this.console.println("\n*** Chuck Norris has a vacation home on the sun. Brought to you by the NextView().");
    }

}
