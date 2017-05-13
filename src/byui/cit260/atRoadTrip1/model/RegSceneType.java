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
public class RegSceneType implements Serializable{
    
    // Class instance variables
    private String description;
    private String tripInfo;

    public RegSceneType() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTripInfo() {
        return tripInfo;
    }

    public void setTripInfo(String tripInfo) {
        this.tripInfo = tripInfo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.tripInfo);
        return hash;
    }

    @Override
    public String toString() {
        return "RegSceneType{" + "description=" + description + ", tripInfo=" + tripInfo + '}';
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
        final RegSceneType other = (RegSceneType) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.tripInfo, other.tripInfo)) {
            return false;
        }
        return true;
    }
    
    
    
}
