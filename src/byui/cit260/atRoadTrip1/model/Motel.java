/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.model;

import java.io.Serializable;

/**
 *
 * @author Kory
 */
public class Motel implements Serializable{
    
    private float cost;

    public Motel() {
    }
    
    

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Float.floatToIntBits(this.cost);
        return hash;
    }

    @Override
    public String toString() {
        return "Motel{" + "cost=$" + cost + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Motel other = (Motel) obj;
        if (Float.floatToIntBits(this.cost) != Float.floatToIntBits(other.cost)) {
            return false;
        }
        return true;
    }
    
    
    
}
