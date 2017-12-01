package CIT260.Group5ot.view;

import CIT260.Group5ot.control.BarrelVolumeControl;
import CIT260.Group5ot.exceptions.BarrelVolumeCalcException;
import group5ot.Group5ot;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeMath.round;
import CIT260.Group5ot.view.ErrorView;

/**
 *
 * @author erict.blackham
 * 
 * Week 7 Individual Assignment (VIEW 2)
 */
public class BarrelVolumeCalcView extends View {
   
    private String promptMessage;
    protected final PrintWriter console = Group5ot.getOutFile();    


public BarrelVolumeCalcView(){

                    super("\n|*| ------------------------------------ |*|"
                        + "\n|*| ***  Barrel Volume Calculation  **** |*|"
                        + "\n|*| ------------------------------------ |*|"
                        + "\n|*| P - Caclulate volume                 |*|"
                        + "\n|*| Q - Return to game/main menu         |*|"                 
                        + "\n|*| ------------------------------------ |*|");

}



public void barrelVolumeCalculation() throws BarrelVolumeCalcException{
//Here I am going to bring in the CalcBarrel Function
// Declares the variable and assigns a new object.
BarrelVolumeControl calcBarrelFunction = new BarrelVolumeControl(); 
//get height from user
this.console.println(
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

this.console.println("please enter the height of the barrel:");

Scanner inputHeight = new Scanner(System.in);
//store it in a variable called height
double height = 0;
double radius = 0;

 try {
            height = parseInt(inputHeight.next());
        } catch (NumberFormatException nf) {
            this.console.println(
                      "\n************************************************************************"
                    + "\nError: Please enter a valid number for the height. "
                    + "\nYou will enter the radius, and then you will be instructed to try again."
                    + "\n************************************************************************"
                    );
        }


this.console.println("You entered " + height);
//get radius from user
this.console.println("please enter the radius of the barrel:");
Scanner inputRadius = new Scanner(System.in);
 try {
            radius = parseInt(inputRadius.next());
        } catch (NumberFormatException nf) {
            this.console.println(
                      "\n************************************************************************"
                    + "\nError: Please enter a valid number for the Radius. "
                    + "\nYou will now start this process over."
                    + "\n************************************************************************"
                    );
        }


this.console.println("You entered " + radius);

double barrelVolume = calcBarrelFunction.calcBarrelVolume(height, radius);

this.console.println(
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

this.console.println("\nYou entered " + answer);
this.console.println("\nThe correct answer was " + barrelVolume);

if (answer == barrelVolume) {
    displaySuccessMessage();
    //go back to the barrel menu
    this.display();
    
}
else {displayFailMessage();
    //player must start again from the beginning
    this.barrelVolumeCalculation();
}
}
@Override
public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "P": {
            try {
                // Display Map
                this.barrelVolumeCalculation();
            } catch (BarrelVolumeCalcException ex) {
               ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
            }
            }
                break;
            case "Q": // return to the previous screen
                this.displayTestMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
 }
 private void displayFailMessage() {
         this.console.println(
                  "******************************************************"
                 +"\nYoda Says 'Failure, you are... Try again, you must!'"
                 +"\n******************************************************"
                 ) ;
    }
 
 private void displaySuccessMessage() {
        this.console.println(
                  "***************************************************************"
                 +"\nSUCCESS!! Yoda Says 'Much Wisdom you have, for one so young!'"
                 +"\n*************************************************************"); //To change body of generated methods, choose Tools | Templates.
 displayTestMenu();   
 }
 
 
 private void displayTestMenu(){
       TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.display();
   }

}


    
    
    
    
    
    
    
    
    
    
    
    

