/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.exceptions;

/**
 *
 * @author ken
 */
public class AnimalControlException extends Exception{

    public AnimalControlException() {
    }

    public AnimalControlException(String message) {
        super(message);
    }

    public AnimalControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnimalControlException(Throwable cause) {
        super(cause);
    }

    public AnimalControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
