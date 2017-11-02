/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;
import CIT260.Group5ot.control.GameControl;
import group5ot.Group5ot;
import java.util.Scanner;

/**
 *
 * @author erict.blackham
 */
public class MapView {
    
        private String menu;
        private String promptMessage;


public MapView(){

this.menu = "SOME HOW I AM GOING TO GET A PICTURE OF A MAP IN HERE"
+ "n/ and it is going to be awesome";

}

public void displayMapView() {

  boolean done = false; // set flag to not done
        do {
            //Prompt for help menu input
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals(" ")) // user wants to return to game menu
                return; // return to the game?
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }


private String getMenuOption() {
        
        this.promptMessage = 
                  "\n|| *******      MAP MENU      ******* ||"
                + "\n|| Would you like to:                 ||"
                + "\n|| A - See a map of the trail?        ||"
                + "\n|| R - Return to the previous screen? ||"
                + "\n|| ********************************** ||"
                
                        ;
               
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.toUpperCase().trim(); //convert to uppercase and trim off leading and trailing blanks
            
            if ("A".equals(value) || "R".equals(value) ) { //value is blank
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
                this.displayMap();
                break;
            case "R": // return to the previous screen
                this.displayPreviousScreen();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
 }
 private void displayMap() {
        System.out.println(// this will become more legit later on in the development process.... hopefully
                  "                     *** GAME MAP***                    "
                + "\n|*|-OR-----------------------------------------------|*|"
                + "\n|*|---ID-------WY---------NB-------------------------|*|"
                + "\n|*|--------------------------------KS----MO----------|*|"
        ); //To change body of generated methods, choose Tools | Templates.
    }
 
 private void displayPreviousScreen() {
        System.out.println("Chuck Norris says, 'Welcome back to the test Menu'"); //To change body of generated methods, choose Tools | Templates.
    displayTestMenu();
 }
 private void displayTestMenu(){
       TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.displayTestMenuView();
   }

}

