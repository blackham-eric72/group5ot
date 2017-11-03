/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.BarrelVolumeControl;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author erict.blackham
 * 
 * Week 7 Individual Assignment (VIEW 2)
 */
public class BarrelVolumeCalcView {
    private String menu; 
    private String promptMessage;


public BarrelVolumeCalcView(){

this.menu =               "\n|*| ------------------------------------ |*|"
                        + "\n|*| ***  Barrel Volume Calculation  **** |*|"
                        + "\n|*| ------------------------------------ |*|"
                        + "\n|*| P - Caclulate volume                 |*|"
                        + "\n|*| Q - Return to game/main menu         |*|"                 
                        + "\n|*| ------------------------------------ |*|";

}

public void displayBarrelVolumeCalcView() {

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
            
            if ("P".equals(value) || "Q".equals(value) ) { //check for valid values
               break; 
            }
            else {
                 System.out.println("\nInvalid value: Must input P or Q");
            }
                    
        }
        
        return value; // return the value entered
    }

public void barrelVolumeCalculation(){
//Here I am going to bring in the CalcBarrel Function
// Declares the variable and assigns a new object.
BarrelVolumeControl calcBarrelFunction = new BarrelVolumeControl(); 
//get height from user
System.out.println(
                  "\n|--12INCHES-|"
                + "\n(((((((((((())))))))))))"
                + "\n|                 ^    |"
                + "\n|                 |    |"
                + "\n|                 |    |"
                + "\n|                 |    |"
                + "\n|            55 Inches |"
                + "\n|                 |    |"
                + "\n|                 |    |"
                + "\n|                 v    |"
                + "\n(((((((((((())))))))))))"
);

System.out.println("please enter the height of the barrel:");

Scanner inputHeight = new Scanner(System.in);
//store it in a variable called height
double height = inputHeight.nextDouble();

System.out.println("You entered " + height);
//get radius from user
System.out.println("please enter the radius of the barrel:");
Scanner inputRadius = new Scanner(System.in);
double radius = inputRadius.nextDouble();

System.out.println("You entered " + radius);

double barrelVolume = calcBarrelFunction.calcBarrelVolume(height, radius);
System.out.println(
                  "\n||***********   Calculate the volume of a barrel    ***********||"
                + "\n|| In order to proceed to the next step, you must first         ||"
                + "\n|| solve a complex math question.... DUM DUM DUM!!!!           ||"
                + "\n|| You must calculate the volume of a barrel!                  ||"
                + "\n|| ---------------------------------------------------------   ||"
                + "\n|| According to the Formula, V = PI * (r*r) * h, what is the   ||"
                + "\n|| volume of the barrel in inches? (round to 2 decimal places) ||"
                + "\n|| hint: Assume PI = 3.14                                      ||");
Scanner userAnswer = new Scanner(System.in);
double answer = userAnswer.nextDouble();

System.out.println("\nYou entered " + answer);
System.out.println("\nThe correct answer was " + barrelVolume);

if (answer == barrelVolume) {
    System.out.println("\nThat is Correct, please proceed");
    //go back to the barrel menu
    this.displayBarrelVolumeCalcView();
    
}
else{ System.out.println("\nFailure. Please try again");
    //player must start again from the beginning
    this.barrelVolumeCalculation();
}
}

public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "P": // Display Map 
                this.barrelVolumeCalculation();
                break;
            case "Q": // return to the previous screen
                this.displayTestMenu();
                break;
            case "C": // return to the previous screen
                this.displayFailMessage();
                break;
            case "D": // return to the previous screen
                this.displayFailMessage();
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


    
    
    
    
    
    
    
    
    
    
    
    

