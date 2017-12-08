/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;
import CIT260.Group5ot.control.GameControl;
import CIT260.Group5ot.control.MapControl;
import group5ot.Group5ot;
import java.util.Scanner;

/**
 *
 * @author erict.blackham
 */
public class MapView extends View {
    
 

public MapView(){

        super(    "\n|| *******      MAP MENU      ******* ||"
                + "\n|| Would you like to:                 ||"
                + "\n|| A - See a map of the trail         ||"
                + "\n|| R - Go to the test menu            ||"
                + "\n|| ********************************** ||");

}


@Override
public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "A": // Display Map 
                this.displayMap();
                break;
            case "R": // return to the previous screen
                this.displayPreviousScreen();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
 }
 private void displayMap() {
        this.console.println(// this will become more legit later on in the development process.... hopefully
                  "                     *** GAME MAP***                    "
                + "\n|*|-OR-----------------------------------------------|*|"
                + "\n|*|---ID-------WY---------NB-------------------------|*|"
                + "\n|*|--------------------------------KS----MO----------|*|"
        ); //To change body of generated methods, choose Tools | Templates.
    }
 
 private void displayPreviousScreen() {
        this.console.println("Chuck Norris says, 'Welcome back to the test Menu'"); //To change body of generated methods, choose Tools | Templates.
    displayTestMenu();
 }
 private void displayTestMenu(){
       TestMenuView testMenuView = new TestMenuView();
       
       testMenuView.display();
   }

}

