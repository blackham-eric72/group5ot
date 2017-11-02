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
public class HelpMenuView {
    
     
    /*public class MainMenuView
    {*/
        private String menu;
        private String promptMessage;
                

        public HelpMenuView() {
            this.menu = 
                          "\n|*| ------------------------------------ |*|"
                        + "\n|*| *******       Help Menu      ******* |*|"
                        + "\n|*| ------------------------------------ |*|"
                        + "\n|*| D - Display Game Description         |*|"
                        + "\n|*| R - Display Game rules               |*|"
                        + "\n|*| Q - Return to game/main menu         |*|"                 
                        + "\n|*| ------------------------------------ |*|";
        }
   
    
    public void displayHelpMenuView() {
       
        boolean done = false; // set flag to not done
        do {
            //Prompt for help menu input
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("B")) // user wants to return to previous menu
                return; // return to the game?
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
        
    }

    private String getMenuOption() {
        
        this.promptMessage = 
            "************ Enter a menu option ************"
            + "\n" + menu;
          /*+ "\n|*| ------------------------------------ |*|"
          + "\n|*| Help Menu                            |*|"
          + "\n|*| ------------------------------------ |*|"
          + "\n|*| D - Display Game Description         |*|"
          + "\n|*| R - Display Game rules               |*|"
          + "\n|*| Q - Return to game/main menu         |*|"                 
          + "\n|*| ------------------------------------ |*|";*/
               
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initilaize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard 
            value = value.toUpperCase().trim(); //convert to uppercase and trim off leading and trailing blanks
            
            if ("D".equals(value) || "R".equals(value) || "Q".equals(value) ) { //check for valid values
               break; 
            }
            else {
                 System.out.println("\nInvalid value: Must input D, R, or Q");
            }
                    
        }
        
        return value; // return the value entered
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "D": // Display Game Description
                this.displayGameDescription();
                break;
            case "R": // display game rules
                this.displayGameRules();
                break;
            case "Q": // quits, or returns to main menu
                this.displayMainMenu();
                break;
            
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    


    private void displayGameDescription() {
        System.out.println(
                  "                 *** GAME DESCRIPTION***                "
                + "\n|*|------------------------------------------------|*|"
                + "\n|*|   It is 1848 and you are preparing to set off  |*|"
                + "\n|*| on a journey along the Oregon trail. The trail |*|"
                + "\n|*| will be treacherous, but a land of promise and |*|"
                + "\n|*| opportunity awaits. You must make it to Oregon |*|"
                + "\n|*| by October 31 or winter weather will overwhelm |*|"
                + "\n|*| you.                                           |*|"
                + "\n|*|                                                |*|"
                + "\n|*|    You are the wagon leader for your team and  |*|"
                + "\n|*| will betasked with the job of purchasing       |*|"
                + "\n|*| supplies for yourteam and making decisions     |*|"
                + "\n|*| aboutyour travels. Throughout the journey you  |*|"
                + "\n|*| will be set upon by manychallenges and some    |*|"
                + "\n|*| from your team will not make it.               |*|"
                + "\n|*|------------------------------------------------|*|" 
        );
    }

    private void displayGameRules() {
        System.out.println(
         "\n|**********<<<<<------GAME RULES------>>>>>***********|"
       + "\n|*---------------------------------------------------*|"
       + "\n|*| Press enter to move forward along the trail.    |*|"
       + "\n|*| At each checkpoint you will be allowed to       |*|"
       + "\n|*| rest or look around. You may also have the      |*|"
       + "\n|*| opportunity to hunt or purchase supplies.       |*|"
       + "\n|*| Resting will improve health but also cost       |*|"
       + "\n|*| you precious time. Going too long without       |*|"
       + "\n|*| food or getting sick will decrease health       |*|"
       + "\n|*| levels. Medicine will boost your health levels. |*|"
       + "\n|*| You must get to Oregon in time                  |*|"
       + "\n|*|                                                 |*|"
       + "\n|*| Press space to return to the game/main menu     |*|"
       + "\n|*---------------------------------------------------*|"); //To change body of generated methods, choose Tools | Templates.
    }

    
      private void displayMainMenu(){
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }
    }
