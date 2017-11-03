/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GunControl;
import java.util.Scanner;

/**
 *
 * @author ken
 * 
 * Week 7 Individual Assignment
 */
public class HuntingSceneView {
    private String menu; 
    private String promptMessage;


    public HuntingSceneView(){

        this.menu =               "\n|*| ------------------------------------ |*|"
                                + "\n|*| ****      Kill the Beast!       **** |*|"
                                + "\n|*| ------------------------------------ |*|"
                                + "\n|*| S - Shoot                            |*|"
                                + "\n|*| Q - Return to game/main menu         |*|"                 
                                + "\n|*| ------------------------------------ |*|";

    }

    public void displayHuntingSceneView() {

        boolean done = false; // set flag to not done
            do {
                //Prompt for input
                String menuOption = this.getMenuOption();
                if (menuOption.toUpperCase().equals(" ")) // user wants to return to game menu
                    return; // return to the game?

                // do the requested action and display the next view
                done = this.doAction(menuOption);

            } while (!done);

    }

    private String getMenuOption() {

        this.promptMessage = 
            "************ Enter a menu option ************"
            + "\n" + menu;


        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.toUpperCase().trim(); //convert to uppercase and trim off leading and trailing blanks

            if ("S".equals(value) || "Q".equals(value) ) { //check for valid values
                break; 
            }
            else {
                System.out.println("\nInvalid value: Must input S or Q");
            }

        }

        return value; // return the value entered
    }

    public void gunControlTaxCalculation(){
        //Here I am going to bring in the gunControl class
        // Declares the variable and assigns a new object.
        GunControl calcGunControl = new GunControl(); 

        //get subtotal from user
        System.out.println(
                              "\nTo shoot, please solve a problem."
                            + "\nHow much were your bullets...before tax?"
        );
        Scanner inputSubtotal = new Scanner(System.in);

        //store it in a variable called subtotal
        double subtotal = inputSubtotal.nextDouble();
        System.out.println("You entered the cost as: " + subtotal);

        //get tax from user
        System.out.println("What was the tax rate, entered as a decimal, when you bought them?, IE: .08 for 8%:");
        Scanner inputTax = new Scanner(System.in);
        double tax = inputTax.nextDouble();

        System.out.println("You entered tax as: " + tax);

        double bulletPrice = calcGunControl.calcTaxProblem(subtotal, tax);
        System.out.println(
                          "\n||********   Calculate the price of bullets with tax   ********||"
                        + "\n|| In order to fire the gun, you must first calculate          ||"
                        + "\n|| the price of bullets including tax.                         ||"
                        + "\n|| ---------------------------------------------------------   ||"
                        + "\n|| To figure out the total cost of something, you must         ||"
                        + "\n|| follow two steps.  First, multiply the subtotal amount of   ||"
                        + "\n|| " + subtotal + " by the tax rate which was " + tax + " to get the tax amount. ||"
                        + "\n|| Second, add that amount to the subtotal.                    ||"
                        + "\n||***************************************************************"
                        + "\n\n"
                        + "Now, how much were your bullets plus tax?"
        );
        Scanner userAnswer = new Scanner(System.in);
        double answer = userAnswer.nextDouble();

        System.out.println("\nYou entered " + answer);
        System.out.println("\nThe correct answer was " + bulletPrice);

        if (answer == bulletPrice) {
            System.out.println("\nThat is correct, you shot a tatanka!");
            //go back to the hunting menu
            this.displayHuntingSceneView();

        }
        else{ System.out.println("\nSorry, please try again");
            //player must start again from the beginning
            this.gunControlTaxCalculation();
        }
    }

    public boolean doAction(String choice) {

            choice = choice.toUpperCase(); // convert choice to upper case

            switch (choice) {
                case "S": // Calculate Tax to shoot gun 
                    this.gunControlTaxCalculation();
                    break;
                case "Q": // return to the previous screen
                    this.displayTestMenu();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }

            return false;
     }
     private void displayFailMessage() {
             System.out.println("\nYoda Says 'Failure, you are... Try again, you must!'") ;
        }

     private void displaySuccessMessage() {
            System.out.println("Chuck Norris says, 'You are correct'"); //To change body of generated methods, choose Tools | Templates.
     displayTestMenu();   
     }


     private void displayTestMenu(){
           TestMenuView testMenuView = new TestMenuView();

           testMenuView.displayTestMenuView();
     }

}


    
    
    
    
    
    
    
    
    
    
    
    

