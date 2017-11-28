/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.exceptions;

/**
 *
 * @author Flores Family
 */
public class HealthControlException extends Exception{

    public HealthControlException() {
    }

    public HealthControlException(String string) {
        super(string);
    }

    public HealthControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public HealthControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public HealthControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
