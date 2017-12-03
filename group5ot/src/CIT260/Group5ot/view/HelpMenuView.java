/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.exceptions.HealthControlException;
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
            super(
                          "\n|*| ------------------------------------ |*|"
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
                this.displayMainMenu();
                break;
                case "PC": // prints a list of characters with their descriptions
                try {       // print health report
                    try{
                        Game game = Group5ot.getCurrentGame();
                        ArrayList<CIT260.Group5ot.model.Character> characterList = game.getCharacters();
                        this.printCharacterList(characterList);
                    } catch (IOException ex) {
                        this.console.println("Not sure about this either.");
                    }
                } catch (HealthControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading input: " +ex.getMessage());
                }
            
    
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
    }

    private void displayGameRules() {
        this.console.println(
         "\n|*|-------------------------------------------------|*|"
       + "\n|*| ******         << GAME RULES >>            *****|*|"
       + "\n|*|-------------------------------------------------|*|"
       + "\n|*| Press enter to move forward along the trail.    |*|"
       + "\n|*| At each checkpoint you will be allowed to       |*|"
       + "\n|*| rest or look around. You may also have the      |*|"
       + "\n|*| opportunity to hunt or purchase supplies.       |*|"
       + "\n|*| Resting will improve health but also cost       |*|"
       + "\n|*| you precious time. Going too long without       |*|"
       + "\n|*| food or getting sick will decrease health       |*|"
       + "\n|*| levels. Medicine will boost your health levels. |*|"
       + "\n|*| You must get to Oregon in time!                 |*|"
       + "\n|*|                                                 |*|"
       + "\n|*| Press space to return to the game/main menu     |*|"
       + "\n|*|-------------------------------------------------|*|"); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        
        mainMenu.display();
    }
    
       public void printCharacterList(ArrayList<CIT260.Group5ot.model.Character> characters)throws HealthControlException, IOException {    
        
          
        PrintWriter outFile = null;
        
        String fileLocation = "aNewReport.txt";       
        
        this.console.println("Enter the file name where you want to store the report:");
         fileLocation = this.keyboard.readLine();
        
        
        try {
        outFile = new PrintWriter(fileLocation);
        

            outFile.println("\n\n              Character List                     ");
            outFile.printf("%n%-20s%10s", "Name", "Description");
            outFile.printf("%n%-20s%10s", "----", "-----");

            for (CIT260.Group5ot.model.Character character : characters) {
                outFile.printf("%n%-20s%10s", character.getName()
                                            , character.getDescription());
            }
        } catch (IOException ex) {
            this.console.println("I/O Error: " + ex.getMessage());
        } finally {
            if (outFile != null) {
                outFile.close();
            
            }
        }
            


        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.display();

    
    }
    
    
    
    
    
    
    
    
    
}
