/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.HealthControl;
import CIT260.Group5ot.exceptions.HealthControlException;
import CIT260.Group5ot.model.Health;
import CIT260.Group5ot.model.Character;
import CIT260.Group5ot.enums.CharacterType;
import CIT260.Group5ot.model.Game;
import group5ot.Group5ot;
import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author crims
 */
public class HealthView extends View {
    
        private String promptMessage;       
        protected final PrintWriter console = Group5ot.getOutFile();  
    
    public HealthView(){
        
        super("\n|| ********   HEALTH MENU   ******** ||"
                +"\n||                                ||"
                +"\n||    V - View Health Status      ||"
                +"\n||    P - Print Health Report     ||"
                +"\n||    G - Return to Game Menu     ||"
                +"\n||                                ||"
                +"\n||********************************||");
    }
    
    @Override
    public boolean doAction(String choice) {
        //Console console = System.console();    
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "V": {
                try {       // display health status
                    try {
                        this.displayHealthStatus();
                    } catch (IOException ex) {
                        this.console.println("Not sure if this is right.");
                    }   
                } catch (HealthControlException ex) {
                    ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
                }
            }
                break;
                
            case "P": {
                try {       // print health report
                    try{
                        Game game = Group5ot.getCurrentGame();
                        ArrayList<Character> characterList = game.getCharacters();
                        this.printHealthReport(characterList);
                    } catch (IOException ex) {
                        this.console.println("Not sure about this either.");
                    }
                } catch (HealthControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading input: " +ex.getMessage());
                }
            }
                break;
                
            case "G":  //return to Game Menu
                this.displayGameMenuView();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }


    public void displayHealthStatus() throws HealthControlException, IOException { 
        HealthControl displayCalcHealthStatus = new HealthControl();
        HealthControl displayCalcAverageHealthFunction = new HealthControl();
      
        
        this.console.println("\n|| ********  Health Status  ******** ||"
                            +"\n||                                  ||"
                            +"\n||                                  ||"
                            +"\n||                                  ||"
                            +"\n||                                  ||"
                            +"\n||                                  ||");
                            
        
    }
        
    

    public void printHealthReport(ArrayList<Character> characters)throws HealthControlException, IOException {    
        
          
        PrintWriter outFile = null;
        
        String fileLocation = "report.txt";       
        
        this.console.println("Enter the file name where you want to store the report:");
         fileLocation = this.keyboard.readLine();
        
        
        try {
        outFile = new PrintWriter(fileLocation);
        

            outFile.println("\n\n              Health Report                     ");
            outFile.printf("%n%-20s%10s%15s", "Name", "Level", "Status");
            outFile.printf("%n%-20s%10s%15s", "----", "-----", "------");

            for (Character character : characters) {
                outFile.printf("%n%-20s%10d%15s", character.getDescription()
                                            , character.getHealthLevel()
                                            , character.getHealthStatus());
            }
        } catch (IOException ex) {
                    this.console.println("I/O Error: " + ex.getMessage());
        } finally {
            if (outFile != null) {
                outFile.close();
            
            }
        }
            


        GameMenuView gameMenuView = new GameMenuView();
        
        gameMenuView.display();

    
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        
        gameMenuView.display();
    }
}
