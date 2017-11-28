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
public class GunControlException extends Exception {

    public GunControlException() {
    }

    public GunControlException(String message) {
        super(message);
    }

    public GunControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GunControlException(Throwable cause) {
        super(cause);
    }

    public GunControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
