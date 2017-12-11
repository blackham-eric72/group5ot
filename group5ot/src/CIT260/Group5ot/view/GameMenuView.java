/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view; 

import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.control.InventoryControl;
import CIT260.Group5ot.control.LocationControl;
import CIT260.Group5ot.exceptions.InventoryControlException;
import CIT260.Group5ot.model.Game;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Wagon;
import group5ot.Group5ot;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author crims
 */
public class GameMenuView extends View {  
            
    protected final PrintWriter console = Group5ot.getOutFile();  

                

        public GameMenuView() {
            super   ("\n************ Enter a menu option ************"
                    + "\n------------------------------------"
                    + "\n|            Game Menu             |"
                    + "\n------------------------------------"
                    + "\nR - Return To Game "
                    + "\nH - Help Menu"                 
                    + "\nI - View Inventory"
                    + "\nM - Main menu"
                    + "\nPW - Print Wagon"
                    
                    + "\n-------------------------------------");
        }
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "R": // display the help menu
                this.returnToGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "I": {
                try {
                    try {
                        Game game = Group5ot.getCurrentGame();
                        ArrayList<InventoryItem> inventory = game.getItems();
                        this.printInventory(inventory);
                    }
                    catch (IOException ex){
                        this.console.println("You have failed and for that you shall pay.");
                    }
                } catch (InventoryControlException ex){
                    ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
                }
            }
                break;       
            case "M": // save the current game
                this.displayMainMenuView();
                break;
            case "PW": // save the current game
                this.printWagonContents();
                break;
            
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void displayHelpMenu() {
        //Create HELP menu object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the main menu view
        helpMenuView.display();
    }  
    
    private void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();    
    }

    private void returnToGame() {
        LocationControl.previousView();
    }

    public void printInventory(ArrayList<InventoryItem> inventory) throws InventoryControlException, IOException {
        
        PrintWriter outFile = null;
        String fileLocation = "inventoryReport.txt";

        
        this.console.println("\nThe inventory will print to an external file. "
                            +"\nEnter the file path for the file it will be printed to.");
        String filePath = this.keyboard.readLine();
        
        try { 
            outFile = new PrintWriter(filePath);
            
            outFile.println("\n\n         Inventory Report            ");
            outFile.printf("%n%-20s%10s", "Item", "Quantity");
            outFile.printf("%n%-20s%10s", "----", "-----");
            
            for (InventoryItem item : inventory) {
                outFile.printf("%n%-20s%10d", item.getItemTypes()
                                                , item.getQuantityInStock());
            }
        } catch(IOException ex) {
            this.console.println("I/O Error: " + ex.getMessage());

        } finally {
            if (outFile != null) {
                outFile.close();
            
            }
    }

    }
    
    public void printWagonContents(){
        Wagon wagon = Group5ot.getCurrentGame().getWagon();
        this.console.println(wagon.toInventoryString());
    }

}
