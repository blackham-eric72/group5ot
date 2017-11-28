/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.exceptions;

/**
 *
 * @author erict.blackham
 */
public class BarrelVolumeCalcException extends Exception{

    public BarrelVolumeCalcException() {
    }

    public BarrelVolumeCalcException(String message) {
        super(message);
    }

    public BarrelVolumeCalcException(String message, Throwable cause) {
        super(message, cause);
    }

    public BarrelVolumeCalcException(Throwable cause) {
        super(cause);
    }

    public BarrelVolumeCalcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
