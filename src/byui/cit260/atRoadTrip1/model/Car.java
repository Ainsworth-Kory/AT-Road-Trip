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
public class Car implements Serializable{
    public static void main(String args[]){
    Car car = new Car();
    
   
    // assign values to fields in car
    String description = "\nFerrari Enzo";
    int prevDistance = 0;
    int speed = 65;
    int mileage = 25;
    int totalMiles = prevDistance + speed;
    

/*    public Car() {
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
    }  */

/*    @Override
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
    } */
    
    
    
}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.description);
        hash = 19 * hash + this.prevDistance;
        hash = 19 * hash + this.speed;
        hash = 19 * hash + this.mileage;
        hash = 19 * hash + this.totalMiles;
        return hash;
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
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.prevDistance != other.prevDistance) {
            return false;
        }
        if (this.speed != other.speed) {
            return false;
        }
        if (this.mileage != other.mileage) {
            return false;
        }
        return true;
    }
    private String description;
    public int prevDistance;
    private int speed;
    private int mileage;
    private int totalMiles;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrevDistance() {
        return this.prevDistance;
    }

    public void setPrevDistance(int prevDistance) {
        this.prevDistance = prevDistance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    
    
}
