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
public class Staff {
    private String StaffId;
    private String StaffFirstName;
    private String StaffLastName;
    private String StaffEmail;
    private String StaffPhone;
    private String StaffAddress;
    private Date StaffHireDate;
    private Date StaffBirthDate;
    private int StaffStatus;
    
    public Staff(String StaffId, String StaffFirstName, String StaffLastName, String StaffEmail, String StaffPhone, String StaffAddress, Date StaffHireDate, Date StaffBirthDate, int StaffStatus) {
        this.StaffId = StaffId;
        this.StaffFirstName = StaffFirstName;
        this.StaffLastName = StaffLastName;
        this.StaffEmail = StaffEmail;
        this.StaffPhone = StaffPhone;
        this.StaffAddress = StaffAddress;
        this.StaffHireDate = StaffHireDate;
        this.StaffBirthDate = StaffBirthDate;
        this.StaffStatus = StaffStatus;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

    public String getStaffFirstName() {
        return StaffFirstName;
    }

    public void setStaffFirstName(String StaffFirstName) {
        this.StaffFirstName = StaffFirstName;
    }

    public String getStaffLastName() {
        return StaffLastName;
    }

    public void setStaffLastName(String StaffLastName) {
        this.StaffLastName = StaffLastName;
    }

    public String getStaffEmail() {
        return StaffEmail;
    }

    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    public String getStaffPhone() {
        return StaffPhone;
    }

    public void setStaffPhone(String StaffPhone) {
        this.StaffPhone = StaffPhone;
    }

    public String getStaffAddress() {
        return StaffAddress;
    }

    public void setStaffAddress(String StaffAddress) {
        this.StaffAddress = StaffAddress;
    }

    public Date getStaffHireDate() {
        return StaffHireDate;
    }

    public void setStaffHireDate(Date StaffHireDate) {
        this.StaffHireDate = StaffHireDate;
    }

    public Date getStaffBirthDate() {
        return StaffBirthDate;
    }

    public void setStaffBirthDate(Date StaffBirthDate) {
        this.StaffBirthDate = StaffBirthDate;
    }

    public int getStaffStatus() {
        return StaffStatus;
    }

    public void setStaffStatus(int StaffStatus) {
        this.StaffStatus = StaffStatus;
    }
    
    
    
}
