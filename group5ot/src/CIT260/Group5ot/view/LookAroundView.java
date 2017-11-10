/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

/**
 *
 * @author crims / Ken Hodgson
 */
public class LookAroundView extends View {
//    private String displayMessage;
//    private String promptMessage;
    
    public LookAroundView() {
            super("\n"
                + "\n|*| ------------------------------------ |*| "       
                + "\n|*| You have looked around and found...  |*| "
                + "\n|*| ------------------------------------ |*| "
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| ****   (Variable goes here?)    **** |*|"
                + "\n|*| ------------------------------------ |*|"
                + "\n|*| A - Act on what you see (pick it up?)|*|"
                + "\n|*| R - Return to game/main menu         |*|"  
                + "\n|*| T - Return to Test Menu              |*|"                      
                + "\n|*| ------------------------------------ |*|");
    }

    public void displayLookAroundView() {
        
        //*********Update message after look around is figured out. Need different views for each location!*****
        
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "A": // Act on scene's options. (Pick up something, etc.)
                this.sceneSpecificAction();
                break;
            case "R": // return to the previous screen
                this.displayPreviousScreen();
                break;
            case "T": // return to the previous screen
                this.displayTestMenu();
                break;                
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

            return false;
    }
    
    private void sceneSpecificAction() {
        System.out.println("You are doing something cool now."); 
    }

    private void displayPreviousScreen() {
        System.out.println("Chuck Norris says, 'Welcome back to the test Menu'"); //To change body of generated methods, choose Tools | Templates.
        displayTestMenu();
    }
    private void displayTestMenu(){
        TestMenuView testMenuView = new TestMenuView();
        testMenuView.display();
    }

}
