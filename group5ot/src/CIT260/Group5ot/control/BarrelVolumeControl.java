/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author crims
 */
public class BarrelVolumeControl {
    
   public double calcBarrelVolume(double height, double radius){
        
        if(height < 0 || height > 60){
            return -1;
        }
        
        if(radius < 0 || radius > 18){
            return -1;
        }
        
        double volume = (3.14 * Math.pow(radius, 2)* height) / 1728;
        volume = Math.floor(volume * 100) / 100;
        return volume;
    
    }
    
}
