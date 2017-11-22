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
public class FoodSourceView extends View{
        public FoodSourceView() {
       super( "\n There might be food you can harvest. "
            + "\n Would you like to stop and look around? "
            + "\n Press Y to look around."
            + "\n Press C to keep moving forward."
            + "\n Press G to display the Game Menu.");

   }
   

//    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "Y":
                this.displayLookAroundCheckpointView();
                break;
            case "C":
                this.nextView();
                break;
            case "G": // return to previous screen
                this.displayGameMenuView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    


    private void nextView() {
        System.out.println("\n*** Chuck Norris's tears cure cancer. Too bad he's never cried. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();    
    }

    private void displayLookAroundCheckpointView() {
        LookAroundCheckpointView lookAroundCheckpointView  = new LookAroundCheckpointView ();
       
        lookAroundCheckpointView.display();    
    }
}

