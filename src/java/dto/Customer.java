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
public class Customer {
    private String CustomerId;
    private String CustomerFirstName;
    private String CustomerLastName;
    private String CustomerEmail;
    private String CustomerPhone;
    private String CustomerAddress;
    private Date CustomerJoinDate;
    private int CustomerStatus;

    public Customer(String CustomerId, String CustomerFirstName, String CustomerLastName, String CustomerEmail, String CustomerPhone, String CustomerAddress, Date CustomerJoinDate, int CustomerStatus) {
        this.CustomerId = CustomerId;
        this.CustomerFirstName = CustomerFirstName;
        this.CustomerLastName = CustomerLastName;
        this.CustomerEmail = CustomerEmail;
        this.CustomerPhone = CustomerPhone;
        this.CustomerAddress = CustomerAddress;
        this.CustomerJoinDate = CustomerJoinDate;
        this.CustomerStatus = CustomerStatus;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getCustomerFirstName() {
        return CustomerFirstName;
    }

    public void setCustomerFirstName(String CustomerFirstName) {
        this.CustomerFirstName = CustomerFirstName;
    }

    public String getCustomerLastName() {
        return CustomerLastName;
    }

    public void setCustomerLastName(String CustomerLastName) {
        this.CustomerLastName = CustomerLastName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String CustomerPhone) {
        this.CustomerPhone = CustomerPhone;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    public Date getCustomerJoinDate() {
        return CustomerJoinDate;
    }

    public void setCustomerJoinDate(Date CustomerJoinDate) {
        this.CustomerJoinDate = CustomerJoinDate;
    }

    public int getCustomerStatus() {
        return CustomerStatus;
    }

    public void setCustomerStatus(int CustomerStatus) {
        this.CustomerStatus = CustomerStatus;
    }
    
    
}
