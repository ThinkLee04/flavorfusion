/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Order {
    private String OrderId,CustomerId,PayMethod;
    private int AddressId,OrderStatus;
    private Date OrderDate;
    private ArrayList<Detail> OrderList;

    public Order() {
        OrderDate = new Date(System.currentTimeMillis());
        OrderList = new ArrayList<>();
    }

    public Order(String OrderId, String CustomerId, String PayMethod, int AddressId, int OrderStatus, Date OrderDate, ArrayList<Detail> OrderList) {
        this.OrderId = OrderId;
        this.CustomerId = CustomerId;
        this.PayMethod = PayMethod;
        this.AddressId = AddressId;
        this.OrderStatus = OrderStatus;
        this.OrderDate = OrderDate;
        this.OrderList = OrderList;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getPayMethod() {
        return PayMethod;
    }

    public void setPayMethod(String PayMethod) {
        this.PayMethod = PayMethod;
    }

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int AddressId) {
        this.AddressId = AddressId;
    }

    public int getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(int OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public ArrayList<Detail> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Detail> OrderList) {
        this.OrderList = OrderList;
    }
    
    
    public boolean addOrderDetail(Detail orderDetail){
        return OrderList.add(orderDetail);
    }

    @Override
    public String toString() {
        return "OrderId=" + OrderId + ", CustomerId=" + CustomerId + ", PayMethod=" + PayMethod + ", AddressId=" + AddressId + ", OrderStatus=" + OrderStatus + ", OrderDate=" + OrderDate;
    }
    
    
}
