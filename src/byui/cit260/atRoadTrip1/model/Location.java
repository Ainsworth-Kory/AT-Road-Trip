/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.atRoadTrip1.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kory
 */
public class Location implements Serializable{
    
    // class instance variables
    private int row;
    private int column;
    private int visited;
    private int amountRemaining;
    private RegSceneType scene;

    public RegSceneType getScene() {
        return scene;
    }

    public void setScene(RegSceneType scene) {
        this.scene = scene;
    }
    
    private ArrayList<Actor> actors;

    public Location() {
    }
    
    

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + this.visited;
        hash = 79 * hash + this.amountRemaining;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return true;
    }

    void setVisited(boolean b) {
       System.out.println("\n *** Set visited location ***");
    }
    
    
    
}
