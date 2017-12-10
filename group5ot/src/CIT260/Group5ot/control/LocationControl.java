/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;
import CIT260.Group5ot.enums.ItemTypes;
import CIT260.Group5ot.exceptions.GameControlException;
import CIT260.Group5ot.model.Barrel;
import CIT260.Group5ot.model.Game;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Map;
import CIT260.Group5ot.model.Player;
import group5ot.Group5ot;
import CIT260.Group5ot.model.InventoryItem;
import CIT260.Group5ot.model.Player;
import CIT260.Group5ot.model.Character;
import CIT260.Group5ot.model.Wagon;
import CIT260.Group5ot.model.WaterSource;
import CIT260.Group5ot.view.FirstView;
import CIT260.Group5ot.view.Location2View;
import CIT260.Group5ot.view.Location3;
import CIT260.Group5ot.view.Location4;
import CIT260.Group5ot.view.Location5;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author erict.blackham
 */
public class LocationControl {
    

/*
Trying to figure out how this is going to work.

So, I want a class to control the flow of the game, 

1. independence, tp
2. kansas city, hunt
3. Fort LeavenWorth, eat
4. little blue river, rest
5. Grand Island debraska, hunt

//have an if-statement in each of the next-view functions. 
//the if statmenet will check the current location of the wagon, depending on what the
//current location of the wagon is - will determine which locationView will be shown next. 

something like this: 
*/
public LocationControl(){

}

    /**
     *This will filter through and display the next view.
     */
    public static void nextView(){
Wagon wagon = Group5ot.getCurrentGame().getWagon();
int location = wagon.getLocationNumber();
//First Trading post
if(location == 1){
    wagon.setLocationNumber(2);
    
    Location2View loc2 = new Location2View();
    loc2.display();
}   
//2nd trading post 
else if(location == 2){
    wagon.setLocationNumber(3);
    Location3 loc3 = new Location3();
    loc3.display();
}
else if(location == 3){
    wagon.setLocationNumber(4);
    Location4 loc4 = new Location4();
    loc4.display();
}
else if(location == 4){
    wagon.setLocationNumber(5);
    Location5 loc5 = new Location5();
    loc5.display();
}
//else if(location == 5){
//    wagon.setLocationNumber(6);
//    Location6 loc6 = new Location6();
//    loc6.display();
//}
//else if(location == 6){
//    wagon.setLocationNumber(7);
//    Location7 loc7 = new Location7();
//    loc7.display();
//}


}
    /*
    *This function will Display the previous View
    */
    public static void previousView(){
       Wagon wagon = Group5ot.getCurrentGame().getWagon();
int location = wagon.getLocationNumber();
if(location == 1){
    FirstView firstView = new FirstView();
    firstView.display();
    }
if(location == 2){
    Location2View l2v = new Location2View();
    l2v.display();
}
if(location == 3){
    Location3 l3 = new Location3();
    l3.display();
}
    }
}
/*
right now, we start with firstview, and then go to trading post.
From the trading post, we go to 2nd view, and then hunt... and then
3rd view, and then trailview, 
4th view, then barrelvolumecalc view, 
then 
*/

