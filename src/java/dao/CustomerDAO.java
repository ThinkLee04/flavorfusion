/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import util.DBUtils;

/**
 *
 * @author dinhl
 */
public class CustomerDAO {

    //Auto generate CustomerId by Time
    public static String generateId() {
        //Get time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmssSSS");

        //Format getted time
        String formattedDateTime = now.format(formatter);
        String alphabet = decimalToAlphabet(Long.parseLong(formattedDateTime));
        String id = "CUS" + alphabet;

        return id;
    }

    //Convert decimal to alphabet by ASCII
    public static String decimalToAlphabet(long number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            number--;
            char digit;
            if (number % 36 < 10) {
                digit = (char) ('0' + (number % 36)); // Map to '0'-'9'
            } else {
                digit = (char) ('a' + ((number % 36) - 10)); // Map to 'a'-'z'
            }
            result.insert(0, digit);
            number = number / 36;
        }

        return result.toString().toUpperCase();
    }

    //Get Customer list
    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> list = new ArrayList<>();
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
                        Customer cus = new Customer(
                            rs.getString("CustomerId"),
                            rs.getString("CustomerFirstName"),
                            rs.getString("CustomerLastName"),
                            rs.getString("CustomerEmail"),
                            rs.getString("CustomerPhone"),
                            rs.getString("CustomerAddress"),
                            rs.getDate("CustomerJoinDate"),
                            rs.getInt("CustomerStatus")
                         );
                        list.add(cus);
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
    
    public boolean checkCustomerValid(String email){
        ArrayList<Customer> list = new ArrayList<>();
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
                        Customer cus = new Customer(
                            rs.getString("CustomerId"),
                            rs.getString("CustomerFirstName"),
                            rs.getString("CustomerLastName"),
                            rs.getString("CustomerEmail"),
                            rs.getString("CustomerPhone"),
                            rs.getString("CustomerAddress"),
                            rs.getDate("CustomerJoinDate"),
                            rs.getInt("CustomerStatus")
                         );
                        list.add(cus);
                    }
                }
                for(Customer c:list){
                    if(c.getCustomerEmail().equalsIgnoreCase(email)){
                        if(c.getCustomerStatus()<3) return true;
                        if(c.getCustomerStatus()>=3) return false;
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
        return false;
    }
}
