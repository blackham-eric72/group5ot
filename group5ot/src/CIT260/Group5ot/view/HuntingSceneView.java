
    
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
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Flores Family
 */
public class HuntingSceneView extends View {
    public HuntingSceneView() {
        super( "\n|*| --------------------------------------- |*|"
             + "\n|*| There is good hunting here.             |*|"
             + "\n|*| Press A to see a list of local animals. |*|"
             + "\n|*| Press H to hunt                         |*|"
             + "\n|*| Press C to keep moving forward.         |*|"
             + "\n|*| Press G to display the Game Menu.       |*|"
             + "\n|*| --------------------------------------- |*|");

    }
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "A": {
                try {       // display animal list report
                    try{
                        
  //////////////////////////////////////////////////////////////////////////////////////////////////                      
                       ArrayList<Animal> sortableAnimals = AnimalHuntedControl.createAnimals();
                       Collections.sort(sortableAnimals, new Comparator<Animal>() {
                               @Override
                               public int compare(Animal animal2, Animal animal1)
                                {
                                    return animal1.getName().compareTo(animal2.getName());
                                }
                       });
                       this.printAnimalList(sortableAnimals); //Not sure how to actually use the sorted list.
 //////////////////////////////////////////////////////////////////////////////////////////////////                   
                    
                    } catch (IOException ex) {
                        this.console.println("Sorry, you did something wrong.");
                    }
                } catch (AnimalControlException ex) {
                    ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
                }
                this.displayHuntingSceneView();
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
        

        
        try {
    

            System.out.println("\n\n       Animal List                     ");
            System.out.printf("%n%-20s%10s", "Name", "Weight");
            System.out.printf("%n%-20s%10s", "----", "------");

            for (CIT260.Group5ot.model.Animal animal : animals) {
                System.out.printf("%n%-20s%10.2f", animal.getName()
                                            , animal.getWeight());
            }
        } catch (Exception ex) {
            this.console.println("I/O Error: " + ex.getMessage());
        } 
    
            


        HuntingSceneView returnMenuView = new HuntingSceneView();
        
        returnMenuView.display();

    }       


    private void nextView() {
        this.console.println("\n*** Chuck Norris doesn't have an esc key on his computer. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();    
    }
    
    private void displayHuntingSceneView() {
        HuntingSceneView huntSceneView = new HuntingSceneView();
        
        huntSceneView.display();
    }    
}  
    
    
    

