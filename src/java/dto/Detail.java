/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Admin
 */
public class Detail {
    private int Quanlity;
    private String OrderId,MealId;

    public Detail() {
        Quanlity = 0;
        OrderId = MealId = "";
    }

    public Detail(int Quanlity, String OrderId, String MealId) {
        this.Quanlity = Quanlity;
        this.OrderId = OrderId;
        this.MealId = MealId;
    }

    public int getQuanlity() {
        return Quanlity;
    }

    public void setQuanlity(int Quanlity) {
        this.Quanlity = Quanlity;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public String getMealId() {
        return MealId;
    }

    public void setMealId(String MealId) {
        this.MealId = MealId;
    }
    
    
}
