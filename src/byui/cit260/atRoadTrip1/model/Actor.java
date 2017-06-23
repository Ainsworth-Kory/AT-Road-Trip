/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ian Tabeling
 */
public enum Actor implements Serializable{
    
    Buford("The Sheriff"),
    Gomer("The gas attendant"),
    Flo("The Server"),
    Bates("The motel manager");
    // Class Instance Variables
    //private String name;
    private final String description;
    private final Point coordinates;

   /* public Actor() {
    }*/
    Actor(String description) {
         this.description = description;
         coordinates = new Point(1,1);
}

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
    return coordinates;
}
    /*public void setDescription(String description) {
        this.description = description;
    }
*/
   /* @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.description);
        return hash;
    }*/

    /*@Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + '}';
    }*/

    /*@Override
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }*/
    
    
    
}
