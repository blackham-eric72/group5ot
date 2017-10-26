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
public class StartProgramView {
         
        private String promptMessage;
        
        public StartProgramView(){
            
            this.promptMessage = "\nPlease enter your name: ";
            // display the banner when view is created
            this.displayBanner();
            
         
        }

        public void displayBanner() {
        
        
            System.out.println(
               "\n**********************************************          *"
                +"\n*It is 1848 and you are preparing to set off "
                + "\n*on a journey along the Oregon trail. The trail "
                + "\n*will be treacherous, but a land of promise and "
                + "\n*opportunity awaits. You must make it to Oregon "
                + "\n*by October 31 or winter weather will overwhelm you."
                +"\n*                                                     *"
                + "\n*You are the wagon leader for your team and will be "
                + "\n*tasked with the job of purchasing supplies for your "
                + "\n*team and making decisions about your travels. "
                + "\n*Throughout the journey you will be set upon by many "
                + "\n*challenges and some from your team will not make it."
            );
        }

        public void displayStartProgramView() {
            
            boolean done = false;
            do {
                // Prompt for and get the input value
                String playersName = this.getPlayersName();
                if (playersName.toUpperCase().equals("Q"))
                    return;
                
                done = this.doAction(playersName);
                
            } while (!done);
            
            
        }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; // return the value entered
    }
        
        
        
        
        /*WHILE a valid value has not been entered
            DISPLAY a message prompting the user to enter a value
            GET the value entered from keyboard
            Trim front and trailing blanks off of the value
        
            IF the length of the value is blank THEN
                DISPLAY “Invalid value: The value cannot be blank”
                CONTINUE
            ENDIF
        
            BREAK
        
        ENDWHILE
        RETURN value
*/
    

    private boolean doAction(String playersName) {
        
        
        /*
        if the length of the playersName < 2 then
            display “Invalid name: The name must be > 1 character”
            return false
        
        create Player with specified name
        if unsuccessful then
            display “Invalid name: The name is too short”
            return false
        
        display customized welcome message
        display mainMenuView
        return true
        */
        
        
        System.out.println("\n *** doAction() called ****");
        return true;
    }
}

