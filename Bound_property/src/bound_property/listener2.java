/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound_property;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author kitsa
 */
public class listener2 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        System.out.println(pce.getNewValue());
    }
    
}