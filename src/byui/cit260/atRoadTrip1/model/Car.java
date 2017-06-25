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
public class Car implements Serializable{
    
    // class instance variables
    private String description;
    private int speed;
    private float mileage;
    private int totalMiles;

    public Car() {
        
        this.description = "\nFerrari Enzo";
    }    

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public int getTotalMiles() {
        return totalMiles;
    }

    public void setTotalMiles(int totalMiles) {
        this.totalMiles = totalMiles;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.speed;
        hash = 67 * hash + Float.floatToIntBits(this.mileage);
        hash = 67 * hash + this.totalMiles;
        return hash;
    }

    @Override
    public String toString() {
        return "Car{" + "speed=" + speed + " mph, mileage=" + mileage + " mpg, totalMiles=" + totalMiles + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.speed != other.speed) {
            return false;
        }
        if (Float.floatToIntBits(this.mileage) != Float.floatToIntBits(other.mileage)) {
            return false;
        }
        if (this.totalMiles != other.totalMiles) {
            return false;
        }
        return true;
    }
    
    
    
}
