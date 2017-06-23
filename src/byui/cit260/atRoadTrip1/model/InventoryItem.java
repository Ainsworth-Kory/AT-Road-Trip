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
public class InventoryItem implements Serializable{
    
    // class instance variables
    
    private String invType;
    private double qtyInStock;
    private double reqAmt;
    private double amtAvail;
    private double amtUsed;

    public InventoryItem() {
    }
    
    

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    public double getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(double qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public double getReqAmt() {
        return reqAmt;
    }

    public void setReqAmt(double reqAmt) {
        this.reqAmt = reqAmt;
    }

    public double getAmtAvail() {
        return amtAvail;
    }

    public void setAmtAvail(double amtAvail) {
        this.amtAvail = amtAvail;
    }

    public double getAmtUsed() {
        return amtUsed;
    }

    public void setAmtUsed(double amtUsed) {
        this.amtUsed = amtUsed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.invType);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.qtyInStock) ^ (Double.doubleToLongBits(this.qtyInStock) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.reqAmt) ^ (Double.doubleToLongBits(this.reqAmt) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.amtAvail) ^ (Double.doubleToLongBits(this.amtAvail) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.amtUsed) ^ (Double.doubleToLongBits(this.amtUsed) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "invType=" + invType + ", qtyInStock=" + qtyInStock + ", reqAmt=" + reqAmt + ", amtAvail=" + amtAvail + ", amtUsed=" + amtUsed + '}';
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
        final InventoryItem other = (InventoryItem) obj;
        if (Double.doubleToLongBits(this.qtyInStock) != Double.doubleToLongBits(other.qtyInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.reqAmt) != Double.doubleToLongBits(other.reqAmt)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amtAvail) != Double.doubleToLongBits(other.amtAvail)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amtUsed) != Double.doubleToLongBits(other.amtUsed)) {
            return false;
        }
        if (!Objects.equals(this.invType, other.invType)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
