/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

import CIT260.Group5ot.control.LocationControl;



/**
 *
 * @author crims / Ken Hodgson
 */
public class LookAroundView extends View {
//    private String displayMessage;
//    private String promptMessage;
    
    public LookAroundView() {
            super("\n"
                + "\n|*| ------------------------------------    |*|"
                + "\n|*| You decide to take a look around.      |*|"    
                + "\n|*| You see the following: a friendly       |*|"
                + "\n|*| looking dog, a portal to another        |*|"
                + "\n|*| dimension, and Chuck Norris             |*|"
                + "\n|*| ------------------------------------    |*|"
                + "\n|*| What would you like to look closer at?  |*|"
                + "\n|*| D  - A friendly looking dog             |*|"
                + "\n|*| P  - A portal to another dimension      |*|"
                + "\n|*| CN - Chuck Norris                       |*|"
                + "\n|*| C  - Continue on the trail              |*|");
    }
  
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "D": 
                this.dogBite();
                break;
            case "P": 
                this.portal();
                break;
            case "C": 
                this.chuckNorris();
                break;
            case "R": // return to the previous screen
                this.nextView();
                break;                 
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }

            return false;
    }

    private void dogBite() {
        this.console.println("\n That dog was not friendly. You got bitten. You might have rabies now. ");
        LocationControl.nextView();
    }

    private void portal() {
        this.console.println("\n You lived another life, in a different dimension - but unfortunately fell back to this earth, and are now stuck again on the orgain trail.");
    LocationControl.nextView();
    }

    private void chuckNorris() {
        this.console.println("\n Chuck Norris's glorious presence imbued you with improved health.");
        LocationControl.nextView();
    }

    private void nextView() {
        LocationControl.nextView();
    }
        


}
