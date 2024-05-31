/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author dinhl
 */
public class Shipper {
    private String ShipperId;
    private String ShipperFirstName;
    private String ShipperLastName;
    private String ShipperEmail;
    private String ShipperPhone;
    private String ShipperAddress;
    private Date ShipperHireDate;
    private String ShipRegion;
    private int ShipperStatus;

    public Shipper(String ShipperId, String ShipperFirstName, String ShipperLastName, String ShipperEmail, String ShipperPhone, String ShipperAddress, Date ShipperHireDate, String ShipRegion, int ShipperStatus) {
        this.ShipperId = ShipperId;
        this.ShipperFirstName = ShipperFirstName;
        this.ShipperLastName = ShipperLastName;
        this.ShipperEmail = ShipperEmail;
        this.ShipperPhone = ShipperPhone;
        this.ShipperAddress = ShipperAddress;
        this.ShipperHireDate = ShipperHireDate;
        this.ShipRegion = ShipRegion;
        this.ShipperStatus = ShipperStatus;
    }

    public String getShipperId() {
        return ShipperId;
    }

    public void setShipperId(String ShipperId) {
        this.ShipperId = ShipperId;
    }

    public String getShipperFirstName() {
        return ShipperFirstName;
    }

    public void setShipperFirstName(String ShipperFirstName) {
        this.ShipperFirstName = ShipperFirstName;
    }

    public String getShipperLastName() {
        return ShipperLastName;
    }

    public void setShipperLastName(String ShipperLastName) {
        this.ShipperLastName = ShipperLastName;
    }

    public String getShipperEmail() {
        return ShipperEmail;
    }

    public void setShipperEmail(String ShipperEmail) {
        this.ShipperEmail = ShipperEmail;
    }

    public String getShipperPhone() {
        return ShipperPhone;
    }

    public void setShipperPhone(String ShipperPhone) {
        this.ShipperPhone = ShipperPhone;
    }

    public String getShipperAddress() {
        return ShipperAddress;
    }

    public void setShipperAddress(String ShipperAddress) {
        this.ShipperAddress = ShipperAddress;
    }

    public Date getShipperHireDate() {
        return ShipperHireDate;
    }

    public void setShipperHireDate(Date ShipperHireDate) {
        this.ShipperHireDate = ShipperHireDate;
    }

    public String getShipRegion() {
        return ShipRegion;
    }

    public void setShipRegion(String ShipRegion) {
        this.ShipRegion = ShipRegion;
    }

    public int getShipperStatus() {
        return ShipperStatus;
    }

    public void setShipperStatus(int ShipperStatus) {
        this.ShipperStatus = ShipperStatus;
    }
    
    
}
