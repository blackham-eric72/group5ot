package CIT260.Group5ot.control;

import CIT260.Group5ot.exceptions.BarrelVolumeCalcException;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author crims
 */
public class BarrelVolumeControl {
    
   public double calcBarrelVolume(double height, double radius) throws BarrelVolumeCalcException {
        
        if(height < 1 || height > 60){
            throw new BarrelVolumeCalcException("You have entered and invalid height. "
                    + "height must be greater than 0 and less than 60");
        }
        
        if(radius < 1 || radius > 18){
             throw new BarrelVolumeCalcException("\nYou have entered and invalid radius. "
                    + "\nRadius must be greater than 0 and less than 18");
        }
        
        double volume = (3.14 * Math.pow(radius, 2)* height) / 1728;
        volume = Math.floor(volume * 100) / 100;
        return volume;
    
    }
    
}
