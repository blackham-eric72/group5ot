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
public class TrailView extends View {
     private String promptMessage;
                

        public TrailView() {
            super( "\n You are traveling merrily along the trail. "
                 + "\nPress C to keep moving forward."
                 + "\nPress G to display the Game Menu.");

        }
   

//    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
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
        this.console.println("\n*** I smell cookies. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();  
    }
}
