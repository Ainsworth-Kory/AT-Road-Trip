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
public class Game implements Serializable{
    
    // class instance variable
    private double time;
    private Player player;
    private Car car;
    private InventoryItem[] inventory;
    private Day[] day;
    private Menu[] menu;
    private Map map;
    /*
    public Game() {
    }
    */
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
    public Day[] getDay() {
        return day;
    }

    public void setDay(Day[] day) {
        this.day = day;
    }
    
    public Menu[] getMenu() {
        return menu;
    }

    public void setMenu(Menu[] menu) {
        this.menu = menu;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        return true;
    }

   /* public void setPlayer(Player player) {
        System.out.println("*** called setPlayer() in Game.java");
        return null;
    }*/

    /*public void setDay(Day day) {
        this.day = day;
    }*/    

    public void setDay(Day day) {
        System.out.println("*** called setDay() in Game.java");

    }
}
