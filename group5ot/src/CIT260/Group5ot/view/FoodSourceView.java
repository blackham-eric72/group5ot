/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import group5ot.Group5ot;
import java.io.PrintWriter;

/**
 *
 * @author Flores Family
 */
public class FoodSourceView extends View{
    
    protected final PrintWriter console = Group5ot.getOutFile();    

    
    public FoodSourceView() {
       super(   "\n|*| --------------------------------------- |*|"
              + "\n|*| There might be food you can harvest.    |*|"
              + "\n|*| Would you like to stop and look around? |*|"
              + "\n|*| Press Y to look around.                 |*|"
              + "\n|*| Press C to keep moving forward.         |*|"
              + "\n|*| Press G to display the Game Menu.       |*|"
              + "\n|*| --------------------------------------- |*|");

   }
   

//    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "Y":
                this.getFood();
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


    private void nextView() {
        this.console.println("\n*** Chuck Norris's tears cure cancer. Too bad he's never cried. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();    
    }

    private void getFood() {
        this.console.println("\n*** When Chuck Norris throws exceptions, it's across the room. Brought to you by getFood().");
    }
}

