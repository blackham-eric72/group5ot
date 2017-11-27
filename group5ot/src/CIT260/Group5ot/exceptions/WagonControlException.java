/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.exceptions;

/**
 *
 * @author crims
 */
public class WagonControlException extends Exception {

    public WagonControlException() {
    }

    public WagonControlException(String string) {
        super(string);
    }

    public WagonControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public WagonControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public WagonControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
