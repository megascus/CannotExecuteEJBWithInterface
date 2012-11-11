/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package megascus.cannotexecuteejb;

import javax.ejb.Stateless;

/**
 *
 * @author megascus
 */
@Stateless
public class ImplimentsOfOldEJB implements InterfaceOfOldEJB{

    @Override
    public void doSomething() {
    }
    
}
