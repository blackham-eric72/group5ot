/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import java.util.Scanner;

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

this.promptMessage = "ENTER YOUR ANSWERS HERE"
+ "n/ and it is going to be awesome";

}

public void displayBarrelVolumeCalcView() {

  boolean done = false; // set flag to not done
        do {
            //Prompt for input
            String menuOption = this.getUserAnswer();
            if (menuOption.toUpperCase().equals(" ")) // user wants to return to game menu
                return; // return to the game?
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }


private String getUserAnswer() {
        
        this.promptMessage = 
                  "\n**********   Calculate the volume of a barrel    **********"
                + "\n|| In order to proceed to the nex step, you must first      ||"
                + "\n|| solve a complex math question.... DUM DUM DUM!!!!        ||"
                + "\n|| You must calculate the volume of a barrel!               ||"
                + "\n|| ---------------------------------------------------------||"
                + "\n|| Given that the Height is equal to 55 inches, and the     ||"
                + "\n|| radius is equal to 12 inches.....                        ||"
                + "\n|| what is the volume of the barrel?                        ||"
                + "\n||    A) - 14.4 inches cubed                                ||"
                + "\n||    B) - 15.4 inches cubed                                ||"
                + "\n||    C) - 28.8 inches cubed                                ||"
                + "\n||    D) - 14.8 inches cubed                                ||"
                + "\n|| ---------------------------------------------------------||"
                + "\n|| --Enter Your Answer Below:                               ||"
                + "\n|| ---------------------------------------------------------||"
        ;
               
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.toUpperCase().trim(); //convert to uppercase and trim off leading and trailing blanks
            
            if ("A".equals(value) || "B".equals(value) || "C".equals(value) || "D".equals(value) ) { //value is blank
               break; 
            }
            else {
                 System.out.println("\nInvalid value: Must input A,or R");
            }
                    
        }
        
        return value; // return the value entered
    }


public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "A": // Display Map 
                this.displaySuccessMessage();
                break;
            case "B": // return to the previous screen
                this.displayFailMessage();
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


    
    
    
    
    
    
    
    
    
    
    
    

