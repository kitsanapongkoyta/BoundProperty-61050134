/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound_property;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author kitsa
 */
public class MyBean implements Serializable {
    
    public static final String RESULT_PROPERTY = "result";
    
    private String result;
    
    private PropertyChangeSupport propertySupport;
    
    public MyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getRESULT() {
        return result;
    }
    
    public void setRESULT(String value) {
        String oldValue = result;
        result = value;
        propertySupport.firePropertyChange(RESULT_PROPERTY, oldValue, result);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }    
}
