/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Meal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import util.DBUtils;

/**
 *
 * @author dinhl
 */
public class MealDAO {
    public ArrayList<Meal> getMeals(){
        ArrayList<Meal> list = new ArrayList<>();
            Connection conn = null;
            try {
                conn = DBUtils.makeConnection();
                if (conn != null) {
                    String sql = "SELECT [MealId], [MealName], [MealImage], [CookedPrice], [RawPrice], [Servings], "
                            + "[CookingTime], [MealCuisine], [Nutrition], [Description], [Category], [Diet], [MealStatus] FROM [dbo].[Meal]";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    if (rs != null) {
                        while (rs.next()) {
                            Meal meal = new Meal(
                                rs.getString("MealId"),
                                rs.getString("MealName"),
                                rs.getString("MealImage"),
                                rs.getFloat("CookedPrice"),
                                rs.getFloat("RawPrice"),
                                rs.getInt("Servings"),
                                rs.getString("CookingTime"),
                                rs.getString("MealCuisine"),
                                rs.getString("Nutrition"),
                                rs.getString("Description"),
                                rs.getString("Category"),
                                rs.getString("Diet"),
                                rs.getInt("MealStatus")
                            );
                            list.add(meal); 
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return list;
    }
}
