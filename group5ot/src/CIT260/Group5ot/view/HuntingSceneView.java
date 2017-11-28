
    
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
public class HuntingSceneView extends View {
    public HuntingSceneView() {
        super( "\n There is good hunting here. "
             + "\n Press H to hunt."
             + "\n Press C to keep moving forward."
             + "\n Press G to display the Game Menu.");

        }
   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "H":
                this.displayHuntView();
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

    private void displayHuntView() {

        HuntView huntView = new HuntView();
        
        huntView.display();
    }


    private void nextView() {
        System.out.println("\n*** Chuck Norris doesn't have an esc key on his computer. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();    
    }
}  
    
    
    

