/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

/**
 *
 * @author Flores Family
 */
public class WaterSourceView extends View{
    public WaterSourceView() {
       super( "\n There is a river. "
            + "\n Would you like to stop and replenish your water supply? "
            + "\n Press Y to get water."
            + "\n Press C to keep moving forward."
            + "\n Press G to display the Game Menu.");

   }
   

//    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "Y":
                this.goToRiver();
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
        this.console.println("\n*** Chuck Norris uses a stunt double for crying scenes. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();    
    }

    private void goToRiver() {
        this.console.println("\n*** Chuck Norris got pulled over by a cop once. He let the cop go with a warning. Brought to you by the goToRiverView().");
    }
}
