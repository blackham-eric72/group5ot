package CIT260.Group5ot.view;

import CIT260.Group5ot.control.BarrelVolumeControl;
import CIT260.Group5ot.exceptions.BarrelVolumeCalcException;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author erict.blackham
 * 
 * Week 7 Individual Assignment (VIEW 2)
 */
public class BarrelVolumeCalcView extends View {
   
    private String promptMessage;


public BarrelVolumeCalcView(){

                    super("\n|*| ------------------------------------ |*|"
                        + "\n|*| ***  Barrel Volume Calculation  **** |*|"
                        + "\n|*| ------------------------------------ |*|"
                        + "\n|*| P - Caclulate volume                 |*|"
                        + "\n|*| Q - Return to game/main menu         |*|"                 
                        + "\n|*| ------------------------------------ |*|");

}



public void barrelVolumeCalculation() throws BarrelVolumeCalcException, IOException{
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
String inputHeight = null;
        try {
            inputHeight = this.keyboard.readLine();
        } catch (IOException ex) {
            this.console.println("something went wrong");
        }
//store it in a variable called height
double height = 0;
double radius = 0;

 try {
            height = parseDouble(inputHeight);
        } catch (NumberFormatException nf) {
            System.out.println(
                      "\n************************************************************************"
                    + "\nError: Please enter a valid number for the height. "
                    + "\nYou will enter the radius, and then you will be instructed to try again."
                    + "\n************************************************************************"
                    );
        }


System.out.println("You entered " + height);
//get radius from user
System.out.println("please enter the radius of the barrel:");
String inputRadius = null;
        inputRadius = this.keyboard.readLine();
 try {
            radius = parseDouble(inputRadius);
        } catch (NumberFormatException nf) {
            System.out.println(
                      "\n************************************************************************"
                    + "\nError: Please enter a valid number for the Radius. "
                    + "\nYou will now start this process over."
                    + "\n************************************************************************"
                    );
        }


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


//Scanner userAnswer = new Scanner(System.in);
String userAnswer = null;
userAnswer = this.keyboard.readLine();
      
double answer = parseDouble(userAnswer);

System.out.println("\nYou entered " + answer);
System.out.println("\nThe correct answer was " + barrelVolume);

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
                try {
                    // Display Map
                    this.barrelVolumeCalculation();
                } catch (IOException ex) {
                    System.out.println("you done messed up A-Aron");
                }
            } catch (BarrelVolumeCalcException ex) {
               System.out.println(ex.getMessage());
             
            }
        }
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
         System.out.println(
                  "******************************************************"
                 +"\nYoda Says 'Failure, you are... Try again, you must!'"
                 +"\n******************************************************"
                 ) ;
    }
 
 private void displaySuccessMessage() {
        System.out.println(
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


    
    
    
    
    
    
    
    
    
    
    
    

