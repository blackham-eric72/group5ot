/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import java.util.Scanner;

/**
 *
 * @author Flores Family
 */
public class ToHuntOrNotToHuntView {
    
    private String promptMessage;
    /*
    public void displayHelpMenuView() {
        boolean done = false; // set flag to not done
        do {
            //Prompt for input
            String huntOption = this.getInput();
            if (menuOption.toUpperCase().equals("N")) // user wants to return to previous menu
                return; // return to the game?
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);*/
    
    
    private String getInput(){    
        
        this.promptMessage = "/n"
                //eventually this will get the animal type from the animal
                //hunted control class and give an option. For now, it is 
                //a tatonka only.
                + "/n You see a buffalo ."
                + "/n Do you want to continue with the hunt? Y/N";

        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.toUpperCase().trim(); //convert to uppercase and trim off leading and trailing blanks
            
            if ("Y".equals(value) || "N".equals(value) ) { //check for valid values
               break; 
            }
            else {
                 System.out.println("\nInvalid value: Must input Y or N.");
            }
                    
        }
        
        return value; // return the value entered
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
            //Display 
            choice = choice.toUpperCase(); // convert choice to upper case

            switch (choice) {
                case "Y": // Display Game Description
                    this.huntingScene();
                    break;
                case "N": // display game rules
                    this.continueGame();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }
            return false;
         
        }

    private void huntingScene() {
        System.out.println("Chuck Norris says, 'The HuntingScene function has been called'"); //To change body of generated methods, choose Tools | Templates.
    }

    private void continueGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayToHuntOrNotToHuntView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}