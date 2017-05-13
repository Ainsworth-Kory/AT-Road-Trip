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
public class Day implements Serializable{
    
    // class instance variables
    private int dayStart;
    private int dayEnd;
    private int totalDays;

    public Day() {
    }
    
    

    public int getDayStart() {
        return dayStart;
    }

    public void setDayStart(int dayStart) {
        this.dayStart = dayStart;
    }

    public int getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(int dayEnd) {
        this.dayEnd = dayEnd;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.dayStart;
        hash = 59 * hash + this.dayEnd;
        hash = 59 * hash + this.totalDays;
        return hash;
    }

    @Override
    public String toString() {
        return "Day{" + "dayStart=" + dayStart + ", dayEnd=" + dayEnd + ", totalDays=" + totalDays + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Day other = (Day) obj;
        if (this.dayStart != other.dayStart) {
            return false;
        }
        if (this.dayEnd != other.dayEnd) {
            return false;
        }
        if (this.totalDays != other.totalDays) {
            return false;
        }
        return true;
    }
    
    
    
}
