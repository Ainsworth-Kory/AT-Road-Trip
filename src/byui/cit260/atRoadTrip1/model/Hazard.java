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
 * @author Kory
 */
public class Hazard implements Serializable{
    
    // class instance variables
    private String cause;
    private String effect;

    public Hazard() {
    }
    
    

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.cause);
        hash = 29 * hash + Objects.hashCode(this.effect);
        return hash;
    }

    @Override
    public String toString() {
        return "Hazard{" + "cause=" + cause + ", effect=" + effect + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hazard other = (Hazard) obj;
        if (!Objects.equals(this.cause, other.cause)) {
            return false;
        }
        if (!Objects.equals(this.effect, other.effect)) {
            return false;
        }
        return true;
    }
    
    
    
}
