/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Staff;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import util.DBUtils;

/**
 *
 * @author dinhl
 */
public class StaffDAO {
    public ArrayList<Staff> getCustomers() {
        ArrayList<Staff> list = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DBUtils.makeConnection();
            if (conn != null) {
                String sql = "SELECT [CustomerId], [CustomerFirstName], [CustomerLastName], [CustomerEmail], "
                        + "[CustomerPhone], [CustomerAddress], [CustomerJoinDate], [CustomerStatus] FROM [dbo].[Customer]";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs != null) {
                    while (rs.next()) {
                        Staff staff = new Staff(
                            rs.getString("StaffId"),
                            rs.getString("StaffFirstName"),
                            rs.getString("StaffLastName"),
                            rs.getString("StaffEmail"),
                            rs.getString("StaffPhone"),
                            rs.getString("StaffAddress"),
                            rs.getDate("StaffHireDate"),
                            rs.getDate("StaffBirthDate"),
                            rs.getInt("StaffStatus")
                        );
                        list.add(staff);
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
