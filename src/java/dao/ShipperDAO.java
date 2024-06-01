/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Shipper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import util.DBUtils;

/**
 *
 * @author dinhl
 */
public class ShipperDAO {
    public ArrayList<Shipper> getMeals(){
        ArrayList<Shipper> list = new ArrayList<>();
            Connection conn = null;
            try {
                conn = DBUtils.makeConnection();
                if (conn != null) {
                    String sql = "SELECT [ShipperId], [ShipperFirstName], [ShipperLastName], [ShipperEmail], [ShipperPhone], [ShipperAddress], [ShipperHireDate], [ShipRegion], [ShipperStatus] FROM [dbo].[Shipper]";
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                    if (rs != null) {
                        while (rs.next()) {
                            Shipper shipper = new Shipper(
                                rs.getString("ShipperId"),
                                rs.getString("ShipperFirstName"),
                                rs.getString("ShipperLastName"),
                                rs.getString("ShipperEmail"),
                                rs.getString("ShipperPhone"),
                                rs.getString("ShipperAddress"),
                                rs.getDate("ShipperHireDate"),
                                rs.getString("ShipRegion"),
                                rs.getInt("ShipperStatus")
                            );
                            list.add(shipper); 
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
