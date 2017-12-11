/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;
import CIT260.Group5ot.control.LocationControl;
/**
 *
 * @author crims
 */
public class RestView extends View{
 
    public RestView() {
     super(   "\n"
            + "\n|--------------------------------------|"       
            + "\n|           **** Rest ****             |"
            + "\n|--------------------------------------|"
            + "\n|There is a nice place to rest. "
            + "\n|Would you like to stop and rest?"
            + "\n|---------------OPTIONS----------------|"
            + "\n|R - Rest for a day                    |"
            + "\n|C - Continue on your journey          |"
            + "\n|G - Display Game Menu                 |"
            + "\n|--------------------------------------|");
        
    }

      @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert to upper case
            
            switch (choice) {
                case "R": // display buy supplies menu
                    this.dayOfRest();
                    break;
                case "C": // return to previous screen
                    this.nextView();
                    break;
                case "G": // return to previous screen
                    this.displayGameMenu();
                    break;
                
                default:
                   this.console.println("\n*** Invalid selection *** Try Again");
                   break;
        }
            return false;
   }
    
    private void dayOfRest() {
        this.console.println("The day of rest has calmed your worried mind and troubled soul.");
        LocationControl.nextView();
    }
         
    private void nextView() {
    LocationControl.nextView();    
    }

    private void displayGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();      
    }
}



