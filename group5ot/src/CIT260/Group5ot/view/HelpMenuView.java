/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.model.Game;
import group5ot.Group5ot;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erict.blackham
 */
public class HelpMenuView extends View {
    
     
    /*public class MainMenuView
    {*/
     
        private String promptMessage;
        

        public HelpMenuView() {
            super(        "\n************ Enter a menu option **********"
                        + "\n|*| ------------------------------------ |*|"
                        + "\n|*| *******       Help Menu      ******* |*|"
                        + "\n|*| ------------------------------------ |*|"
                        + "\n|*| D  - Display Game Description        |*|"
                        + "\n|*| R  - Display Game rules              |*|"
                        + "\n|*| PC - Print a list of Characters      |*|" 
                        + "\n|*| Q  - Return to Main Menu             |*|" 
                        + "\n|*| ------------------------------------ |*|");
        }
   
    
 
    //
   //**********DELETED getInput()...
    //
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
                this.displayGameMenu();
                break;          
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    


    private void displayGameDescription() {
        this.console.println(
                  "\n|*|------------------------------------------------|*|"
                + "\n|*| ******         GAME DESCRIPTION           *****|*|"
                + "\n|*|------------------------------------------------|*|"
                + "\n|*|   It is 1848 and you are preparing to set off  |*|"
                + "\n|*| on a journey along the Oregon trail. The trail |*|"
                + "\n|*| will be treacherous, but a land of promise and |*|"
                + "\n|*| opportunity awaits. You must make it to Oregon |*|"
                + "\n|*| by October 31 or winter weather will overwhelm |*|"
                + "\n|*| you.                                           |*|"
                + "\n|*|                                                |*|"
                + "\n|*|    You are the wagon leader for your team and  |*|"
                + "\n|*| will be tasked with the job of purchasing      |*|"
                + "\n|*| supplies for your team and making decisions    |*|"
                + "\n|*| about your travels. Throughout the journey you |*|"
                + "\n|*| will be set upon by many challenges and some   |*|"
                + "\n|*| from your team will not make it.               |*|"
                + "\n|*|------------------------------------------------|*|" 
        );
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void displayGameRules() {
        this.console.println(
         "\n|*|-------------------------------------------------|*|"
       + "\n|*| ******         << GAME RULES >>            *****|*|"
       + "\n|*|-------------------------------------------------|*|"
       + "\n|*| Press C to move forward along the trail.        |*|"
       + "\n|*| At each location you might find a water supply  |*|"
       + "\n|*| or food source. You may also have the           |*|"
       + "\n|*| opportunity to hunt or purchase supplies.       |*|"
       + "\n|*|-------------------------------------------------|*|");
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
        
    }

    private void displayGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
      
}
