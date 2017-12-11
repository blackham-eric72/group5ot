/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.view;

/**
 *
 * @author erict.blackham
 */
public class Location22 extends View {
     public Location22() {
            super( "\n|| -------------------------------------------- ||"
                 + "\n||                                              ||"
                 + "\n|| You are now at Vale, Oregon.                 ||"
                 + "\n|| You are enjoying the crisp air and trail!    ||"
                 + "\n||                                              ||"
                
                 + "\n|| ******************************************** ||"
                 + "\n|| Press C to continue                          ||"
                 + "\n|| Press G to display the Game Menu.            ||"
                 + "\n|| -------------------------------------------- ||");

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
    
    //This will take them to the trading post view. 
    private void nextView() {
    
        
//          TradingPostView tp = new TradingPostView();
//          tp.display();
          
//        WaterSourceView wsv = new WaterSourceView();
//        wsv.display();

//        HuntingSceneView hsv = new HuntingSceneView();
//        hsv.display();
//           
//        EatingView eat = new EatingView();
//        eat.display();    
    
//          RestView rv = new RestView();
//          rv.display();          

          
          LookAroundView lav = new LookAroundView();
          lav.display();
            
//        BarrelVolumeCalcView bvc = new BarrelVolumeCalcView();
//        bvc.display();
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
       
        gameMenuView.display();  
    }


    
}

