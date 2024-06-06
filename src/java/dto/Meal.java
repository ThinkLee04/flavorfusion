/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;

/**
 *
 * @author dinhl
 */
public class Meal {
    private String MealId;
    private String MealName;
    private String MealImage;
    private Float CookedPrice;
    private Float RawPrice;
    private int Servings;
    private int CookingTime;
    private String MealCuisine;
    private String Nutrition;
    private String Description;
    private String Category;
    private String Diet;
    private int MealStatus;

    public Meal(String MealId, String MealName, String MealImage, Float CookedPrice, Float RawPrice, int Servings, int CookingTime, String MealCuisine, String Nutrition, String Description, String Category, String Diet, int MealStatus) {
        this.MealId = MealId;
        this.MealName = MealName;
        this.MealImage = MealImage;
        this.CookedPrice = CookedPrice;
        this.RawPrice = RawPrice;
        this.Servings = Servings;
        this.CookingTime = CookingTime;
        this.MealCuisine = MealCuisine;
        this.Nutrition = Nutrition;
        this.Description = Description;
        this.Category = Category;
        this.Diet = Diet;
        this.MealStatus = MealStatus;
    }

    public String getMealId() {
        return MealId;
    }

    public void setMealId(String MealId) {
        this.MealId = MealId;
    }

    public String getMealName() {
        return MealName;
    }

    public void setMealName(String MealName) {
        this.MealName = MealName;
    }

    public String getMealImage() {
        return MealImage;
    }

    public void setMealImage(String MealImage) {
        this.MealImage = MealImage;
    }

    public Float getCookedPrice() {
        return CookedPrice;
    }

    public void setCookedPrice(Float CookedPrice) {
        this.CookedPrice = CookedPrice;
    }

    public Float getRawPrice() {
        return RawPrice;
    }

    public void setRawPrice(Float RawPrice) {
        this.RawPrice = RawPrice;
    }

    public int getServings() {
        return Servings;
    }

    public void setServings(int Servings) {
        this.Servings = Servings;
    }

    public int getCookingTime() {
        return CookingTime;
    }

    public void setCookingTime(int CookingTime) {
        this.CookingTime = CookingTime;
    }

    public String getMealCuisine() {
        return MealCuisine;
    }

    public void setMealCuisine(String MealCuisine) {
        this.MealCuisine = MealCuisine;
    }

    public String getNutrition() {
        return Nutrition;
    }

    public void setNutrition(String Nutrition) {
        this.Nutrition = Nutrition;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getDiet() {
        return Diet;
    }

    public void setDiet(String Diet) {
        this.Diet = Diet;
    }

    public int getMealStatus() {
        return MealStatus;
    }

    public void setMealStatus(int MealStatus) {
        this.MealStatus = MealStatus;
    }
    
    
}
