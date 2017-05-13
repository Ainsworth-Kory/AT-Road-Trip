/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author IanandJenna
 */
public class Menu implements Serializable{
    
    // Class instance variables
    private String callLetter;
    private String activity;

    public Menu() {
    }
    
    public String getCallLetter() {
        return callLetter;
    }

    public void setCallLetter(String callLetter) {
        this.callLetter = callLetter;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.callLetter);
        hash = 23 * hash + Objects.hashCode(this.activity);
        return hash;
    }

    @Override
    public String toString() {
        return "Menu{" + "callLetter=" + callLetter + ", activity=" + activity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Menu other = (Menu) obj;
        if (!Objects.equals(this.callLetter, other.callLetter)) {
            return false;
        }
        if (!Objects.equals(this.activity, other.activity)) {
            return false;
        }
        return true;
    }
    
    
    
}
