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
public class EatingView extends View {
    
    public EatingView(){
        super ("\n"
                + "\n|*| ------------------------------------ |*| "       
                + "\n|*| Would you like to feed yourself      |*| "
                + "\n|*| and your family?                     |*| "
                + "\n|*| Y - Yes                              |*| "
                + "\n|*| N - No I'd like to conserve my food. |*| " );
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // convert choice to upper case

        switch (choice) {
            case "Y": 
                this.eat();
                break;
            case "N": 
                this.continueOn();
                break;           
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

            return false;
    }

    private void eat() {
        System.out.println("\n"
    + "\nYou ate food. Your supply of food has"
    + "\n decreased and your health has increased.");
        //health control and inventory will change
        }

    private void continueOn() {
        TestMenuView testMenuView = new TestMenuView();
        testMenuView.display();    }
}
