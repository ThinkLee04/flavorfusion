/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Account;
import dto.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import util.DBUtils;
import util.Encrypt;

/**
 *
 * @author dinhl
 */
public class AccountDAO {
    public ArrayList<Account> getAccounts(){
        ArrayList<Account> list = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DBUtils.makeConnection();
            if (conn != null) {
                String sql = "SELECT [AccountEmail],[AccountPassword],[AccountRole] FROM [dbo].[Account]";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs != null) {
                    while (rs.next()) {
                        Account acc = new Account(
                                rs.getString("AccountEmail"),
                                rs.getString("AccountPassword"),
                                rs.getString("AccountRole")
                        );
                        list.add(acc);
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
