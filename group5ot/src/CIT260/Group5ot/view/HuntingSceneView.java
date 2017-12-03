
    
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.AnimalHuntedControl;
import CIT260.Group5ot.model.Animal; 
import CIT260.Group5ot.exceptions.AnimalControlException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Flores Family
 */
public class HuntingSceneView extends View {
    public HuntingSceneView() {
        super( "\n There is good hunting here. "
             + "\n Press P to print a list of local animals."
             + "\n Press H to hunt."
             + "\n Press C to keep moving forward."
             + "\n Press G to display the Game Menu.");

        }
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "P": {
                try {       // print animal list report
                    try{
                       this.printAnimalList(AnimalHuntedControl.createAnimals());
                    } catch (IOException ex) {
                        this.console.println("Not sure about this either.");
                    }
                } catch (AnimalControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading input: " +ex.getMessage());
                }
            }
                break;
                
            case "H": {
                try {
                    try {
                        this.displayHuntView();
                    } catch (IOException ex) {
                        this.console.println("Not sure if this is right.");
                    }
                } catch (AnimalControlException ex) {
                    ErrorView.display(this.getClass().getName(),"Error reading input: " + ex.getMessage());
                }
            }
                break;
                
            case "C":
                this.nextView();
                break;
            case "G": // return to previous screen
                this.displayGameMenuView();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void displayHuntView() throws AnimalControlException, IOException {

        HuntView huntView = new HuntView();
        
        huntView.display();
    }
    
    public void printAnimalList(ArrayList<CIT260.Group5ot.model.Animal> animals)throws AnimalControlException, IOException {    
        
          
        PrintWriter outFile = null;
        
        String fileLocation = "report.txt";       
        
        this.console.println("Enter the file name where you want to store the report:");
         fileLocation = this.keyboard.readLine();
        
        
        try {
        outFile = new PrintWriter(fileLocation);
        

            outFile.println("\n\n             Animal List                     ");
            outFile.printf("%n%-20s%10s", "Name", "Weight");
            outFile.printf("%n%-20s%10s", "----", "------");

            for (CIT260.Group5ot.model.Animal animal : animals) {
                outFile.printf("%n%-20s%10f", animal.getName()
                                            , animal.getWeight());
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


    private void nextView() {
        this.console.println("\n*** Chuck Norris doesn't have an esc key on his computer. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();    
    }
}  
    
    
    

