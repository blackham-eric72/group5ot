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
public class ToHuntOrNotToHuntView extends View {
    
//    private String promptMessage;
    
    public ToHuntOrNotToHuntView() {
        super("\n"
            + "\n You see a buffalo."
            + "\n Do you want to continue with the hunt? Y/N");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
            //Display 
            choice = choice.toUpperCase(); // convert choice to upper case

            switch (choice) {
                case "Y": // Display Game Description
                    this.huntingSceneView();
                    break;
                default:
                    this.displayTestMenu();
                    break;
            }
            return false;
         
        }

    private void huntingSceneView() {
        HuntingSceneView huntingSceneView = new HuntingSceneView();
                
        // Display the hunting scene menu view
        huntingSceneView.display();    
    }
    
    private void displayTestMenu() {
        TestMenuView testMenuView = new TestMenuView();
       // Display the test menu view
       testMenuView.display();
    }    
}
