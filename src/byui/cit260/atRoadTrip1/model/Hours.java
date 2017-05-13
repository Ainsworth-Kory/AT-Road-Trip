/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.model;

import java.io.Serializable;

/**
 *
 * @author IanandJenna
 */
public class Hours implements Serializable{
    
    // Class instnce variables
    private double totalHrs;
    private double amtRem;

    public Hours() {
    }
    
    public double getTotalHrs() {
        return totalHrs;
    }

    public void setTotalHrs(double totalHrs) {
        this.totalHrs = totalHrs;
    }

    public double getAmtRem() {
        return amtRem;
    }

    public void setAmtRem(double amtRem) {
        this.amtRem = amtRem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.totalHrs) ^ (Double.doubleToLongBits(this.totalHrs) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.amtRem) ^ (Double.doubleToLongBits(this.amtRem) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Hours{" + "totalHrs=" + totalHrs + ", amtRem=" + amtRem + '}';
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
        final Hours other = (Hours) obj;
        if (Double.doubleToLongBits(this.totalHrs) != Double.doubleToLongBits(other.totalHrs)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amtRem) != Double.doubleToLongBits(other.amtRem)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
