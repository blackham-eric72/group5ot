/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.control;

/**
 *
 * @author crims
 */
public class BarrelVolumeControl {
    
    double calcBarrelVolume(double height, double radius){
        
        if(height < 0 || height > 60){
            return -1;
        }
        
        if(radius < 0 || radius > 18){
            return -1;
        }
        
        double volume = (Math.PI * Math.pow(radius, 2)* height) / 1728;
        
        return volume;
    
    }
    
}
