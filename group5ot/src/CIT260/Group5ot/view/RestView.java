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
     super(                   "\n"
                            + "\n|--------------------------------------|"       
                            + "\n|           **** Rest ****             |"
                            + "\n|--------------------------------------|"
                            + "\n|Rest is necessary for good health, but|" 
                            + "\n|don't rest too long or you'll run into|"
                            + "\n|winter weather.                       |"
                            + "\n|---------------OPTIONS----------------|"
                            + "\n|R - Rest for another day              |"
                            + "\n|C - Continue on your journey          |"
                            + "\n|Q - Main Menu                         |"
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
                    this.continueJourney();
                    break;
                case "Q": // return to previous screen
                    this.displayMainMenu();
                    break;
                
                default:
                   System.out.println("\n*** Invalid selection *** Try Again");
                   break;
        }
            return false;
   }
    
        private void dayOfRest() {
        System.out.println("Chuck Norris says 'day of rest() has been called'");
    }
    
        private void continueJourney(){
            System.out.println("continue Journey function has been called");
        }
        
    private void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        
        mainMenu.display();
    }
}



