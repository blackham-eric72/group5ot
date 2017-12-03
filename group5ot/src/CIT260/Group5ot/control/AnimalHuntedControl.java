package CIT260.Group5ot.control;

//import CIT260.Group5ot.exceptions.AnimalControlException;
import CIT260.Group5ot.exceptions.HealthControlException;
import CIT260.Group5ot.model.Animal; //Brings in my enum for later array creation.
import group5ot.Group5ot;
import CIT260.Group5ot.view.ErrorView;
import CIT260.Group5ot.view.GameMenuView;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

//Allows array creation.
//import CIT260.Group5ot.model.InventoryItem;

/**
 *
 * @author Flores Family / ken
 */


public class AnimalHuntedControl {
    //determine the animal that will be hunted by the player
    //An array of animals: Squirrel, Rabbit, Deer, Buffalo
    //Animal will be picked randomly.
    //This information will be used by the AnimalHuntedView and MeatShareControl class
    //Squirrel = 1 lbs meat
    //Rabbit = 5 lbs meat
    //Deer = 150 lbs meat
    //Buffalo = 1000 lbs meat
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    protected final PrintWriter console = Group5ot.getOutFile();
    
    public static ArrayList<Animal> createAnimals(){
        
        ArrayList<Animal> tacoMeat = new ArrayList<>();
        
        //will convert enum values to variables (I think that's right)
        Animal squirrel = new Animal("Squirrel", 1);
        Animal rabbit = new Animal("Rabbit", 5);
        Animal deer = new Animal("Deer", 150);
        Animal buffalo = new Animal("Buffalo", 1000);        
        
        //will fill new array with my animals
        tacoMeat.add(0, squirrel);
        tacoMeat.add(1, rabbit);
        tacoMeat.add(2, deer);
        tacoMeat.add(3, buffalo);        
        
        return tacoMeat;
    }
      
    //Display animals in a list...
    public void listAnimals(ArrayList<Animal> tacoMeat) {
        
        try {
            for (int i = 0; i < tacoMeat.size(); i++) {
                this.console.println(tacoMeat.get(i));                
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error creating list." + e.getMessage());
        }
        
    } 
    
//I could not get this to work! - Ken    
//    public static void printAnimalList(ArrayList<Animal> tacoMeat, String outputLocation) { //throws AnimalControlException {
//        try (PrintWriter out = new PrintWriter(outputLocation)) {
//            
//            // print column headings
//            out.println("\n\n         Animal List         ");
//            out.printf("%n%-20s%10s", "Description", "Weight");
//            
//            // print animals wtih weight
//            for (Animals animal : tacoMeat) {
//                out.printf("%n%-20s%7d", animal.getDescription()
//                                             , animal.getWeight());
//            }
//          
//        }
//        catch(IOException ex){
//            System.out.println("I/O Error: " + ex.getMessage());
//        }
//    }    
    public void printHealthReport(ArrayList<CIT260.Group5ot.model.Character> characters)throws HealthControlException, IOException {    
        
          
        PrintWriter outFile = null;
        
        String fileLocation = "report.txt";       
        
        this.console.println("Enter the file name where you want to store the report:");
         fileLocation = this.keyboard.readLine();
        
        
        try {
        outFile = new PrintWriter(fileLocation);
        

            outFile.println("\n\n              Health Report                     ");
            outFile.printf("%n%-20s%10s%15s", "Name", "Level", "Status");
            outFile.printf("%n%-20s%10s%15s", "----", "-----", "------");

            for (CIT260.Group5ot.model.Character character : characters) {
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
}


        
