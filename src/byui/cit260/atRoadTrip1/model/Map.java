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
public class Map implements Serializable{
    
    // class instance variables
    private String description;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    private Location[][] locations;
    private int noOfRows;
    private int noOfColumns;

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Map() {
         
    }
    
    public Map(int noOfRows, int noOfColumns){
    
      if (noOfRows < 1 || noOfColumns < 1){
          System.out.println("The number of rows and colums must be > 1");
          return;
      }
         this.noOfRows = noOfRows;
         this.noOfColumns = noOfColumns;
        Location[][][][] newLocation = null;
         
         //create 2-D array for location of objects
         this.locations = newLocation[noOfRows][noOfColumns];
         
         for (int row = 0; row < noOfRows; row++){
             for (int column = 0; column < noOfColumns; column++){
         // create and initialize new location object instance
         Location location = new Location();
         location.setColumn(column);
         location.setRow(row);
         location.setVisited(false);
         
         // assign the location object to the current position in array
         locations[row][column] = location;
         }
         }       
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + this.rowCount;
        hash = 59 * hash + this.columnCount;
        hash = 59 * hash + this.currentRow;
        hash = 59 * hash + this.currentColumn;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentRow != other.currentRow) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        return true;
    }
    
    
    
    
}
