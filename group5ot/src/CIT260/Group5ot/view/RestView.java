/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

/**
 *
 * @author crims
 */
public class RestView extends View{
    private String displayMessage;
    
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
        this.console.println("Chuck Norris says 'day of rest() has been called'");
    }
         
    private void nextView() {
        this.console.println("\n*** When Chuck Norris crosses the street, the cars have to look both ways. Brought to you by the NextView().");
    }

    private void displayGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();      
    }
}



