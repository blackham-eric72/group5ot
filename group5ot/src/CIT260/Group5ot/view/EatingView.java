/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import group5ot.Group5ot;
import java.io.PrintWriter;

/**
 *
 * @author Flores Family
 */
public class EatingView extends View {
       
    public EatingView(){
        super ("\n"
                + "\n|*| ------------------------------------ |*| "       
                + "\n|*|  Would you like to stop and eat?     |*| "
                + "\n|*|  Y - Yes                             |*| "
                + "\n|*|  N - No I'd like to conserve my food.|*| "
                + "\n|*|  G - Display Game Menu               |*| " );
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "Y": 
                this.eat();
                break;
            case "N": 
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

    private void eat() {
        this.console.println("\n"
    + "\nYou ate food. Your supply of food has decreased.");
        //inventory will change
        }

    private void nextView() {
        this.console.println("\n*** Chuck Norris's bloodtype is AK-47. Brought to you by the NextView().");
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display(); 
    }
}
