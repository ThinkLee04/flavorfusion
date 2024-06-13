/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Detail;
import dto.Meal;
import dto.Order;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import util.DBUtils;
import util.GenerateId;

/**
 *
 * @author dinhl
 */
public class OrderDAO {
    
    //Get Order list
    public ArrayList<Order> getAllOrder(){
        ArrayList<Order> listOrder = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DBUtils.makeConnection();
            if (conn != null) {
                String sql1 = "SELECT [OrderId], [AddressId], [CustomerId], [OrderDate], [PaymentMethod], [OrderStatus]\n" 
                        + "FROM [FLAVORFUSION].[dbo].[Order]";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql1);
                
                if(rs!=null){
                    while(rs.next()){
                        Order ord = new Order();
                        //lay thong tin vao cac bien 
                        String orderID = rs.getString("OrderId");
                        int addressID = rs.getInt("AddressId");
                        String cusID = rs.getString("CustomerId");
                        Date orderDate = rs.getDate("OrderDate");
                        String payMethod = rs.getString("PaymentMethod");
                        int status = rs.getInt("OrderStatus");
                        //lay order_detail dua tren orderID
                        String sql2 = "  SELECT [OrderId],[MealId],[Quantity]\n" 
                                + "  FROM [dbo].[OrderDetails]\n" 
                                + "  WHERE [OrderId] = ?";
                        PreparedStatement pst = conn.prepareStatement(sql2);
                        pst.setString(1, orderID);
                        ResultSet detail = pst.executeQuery();
                        
                        if(detail != null){
                            while (detail.next()){
                                String mealId = detail.getString("MealId");
                                int quantity = detail.getInt("Quantity");
                                Detail dtl = new Detail(quantity, orderID, mealId);
                                ord.addOrderDetail(dtl);
                            }
                        }
                        //gan gia tri vao ord 
                        ord.setOrderId(orderID);
                        ord.setAddressId(addressID);
                        ord.setCustomerId(cusID);
                        ord.setOrderDate(orderDate);
                        ord.setOrderStatus(status);
                        ord.setPayMethod(payMethod);
                        //add ord vao listOrder
                        listOrder.add(ord);
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
        return listOrder;
    }
    
    //get Order by status
    public ArrayList<Order> getOrderByStatus(int status){
        ArrayList<Order> list = new ArrayList<>();
        Connection cn=null;
        try{
            cn = DBUtils.makeConnection(); //1.tao connection
            if(cn!=null){
                String sql_1 = "  SELECT [OrderId],[AddressId],[CustomerId],"
                        + "[OrderDate],[PaymentMethod],[OrderStatus]\n" 
                        + "  FROM [dbo].[Order]\n" 
                        + "  WHERE [OrderStatus] = ?";
                PreparedStatement pst_1 = cn.prepareStatement(sql_1);
                pst_1.setInt(1, status);
                ResultSet rs_1=pst_1.executeQuery();
                if(rs_1 != null){
                    while(rs_1.next()){
                        Order ord = new Order();
                        ord.setOrderId(rs_1.getString("OrderId"));
                        ord.setAddressId(rs_1.getInt("AddressId"));
                        ord.setCustomerId(rs_1.getString("CustomerId"));
                        ord.setOrderDate(rs_1.getDate("OrderDate"));
                        ord.setPayMethod(rs_1.getString("PaymentMethod"));
                        ord.setOrderStatus(rs_1.getInt("OrderStatus"));
                        //lay order detail
                        String sql_2 = "  SELECT [OrderId],[MealId],[Quantity]\n" 
                                + "  FROM [dbo].[OrderDetails]\n" 
                                + "  WHERE [OrderId] = ?";
                        PreparedStatement pst_2 = cn.prepareStatement(sql_2);
                        pst_2.setString(1, rs_1.getString("OrderId"));
                        ResultSet rs_2 = pst_2.executeQuery();
                        if(rs_2 != null){
                            while(rs_2.next()){
                                String mealId = rs_2.getString("MealId");
                                int quantity = rs_2.getInt("Quantity");
                                Detail detail = new Detail(quantity, rs_1.getString("OrderId"), mealId);
                                ord.addOrderDetail(detail);
                            }
                        }
                        list.add(ord);
                    }
                }
            }     
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(cn!=null) cn.close();
            }catch(Exception e){ e.printStackTrace();}
        }
        
        return list;
    }
    
    //change orderStatus by staff
    public int changeOrderStatus(int newstatus, String orderid){
        int rs=0;
        Connection cn=null;
        try{
            cn=DBUtils.makeConnection(); //1.tao connection
            if(cn!=null){
                //2) viet sql va exec
               String sql="UPDATE [dbo].[Order] SET [OrderStatus] = ? WHERE [OrderId] LIKE ?";
               PreparedStatement pst = cn.prepareStatement(sql);
               pst.setInt(1, newstatus);
               pst.setString(2, orderid);
               rs=pst.executeUpdate();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(cn!=null) cn.close();
            }catch(Exception e){ e.printStackTrace();}
        }
       return rs;
    }
    
    //delete order by staff
    public int deleteOrder(String orderID){
        int rs = 0;
        Connection cn=null;
        try{
            cn=DBUtils.makeConnection(); //1.tao connection
            if(cn!=null){
                //2) viet sql va exec
               String sql="DELETE FROM [dbo].[Order] WHERE [OrderId] LIKE ?";
               PreparedStatement pst = cn.prepareStatement(sql);
               pst.setString(1, orderID);
               rs=pst.executeUpdate();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(cn!=null) cn.close();
            }catch(Exception e){ e.printStackTrace();}
        }
        return rs;
    }
    
    //create new order by cart
    public int createNewOrder(String accid, int addressid, HashMap<Meal, Integer> cart){
        int rs = 0;
        Connection cn = null;
        String newOrderId = "ORD" + GenerateId.generateId();
        try{
            cn=DBUtils.makeConnection(); //1.tao connection
            if(cn!=null){
                //2) viet sql va exec
                cn.setAutoCommit(false);    //tat tu dong commit tren database
                
                String sql = "INSERT [dbo].[Order] values(?,?,?,?,?,?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, newOrderId);
                pst.setInt(2, addressid);
                pst.setString(3, accid);
                pst.setDate(4, new Date(System.currentTimeMillis()));
                pst.setString(5, "Cash");
                pst.setInt(6, 1);
                rs = pst.executeUpdate();
                
                //lay orderid tu order vua them vao
                /*
                sql = "Select top 1 [OrderId]\n" +
                        "from [dbo].[Order]\n" +
                        "where [OrderId] like ?";
                pst = cn.prepareStatement(sql);
                pst.setString(1, newOrderId);
                ResultSet result = pst.executeQuery();
                if(result != null && result.next()){
                    
                }*/
                
                //insert order detail
                for(Meal meal : cart.keySet()){
                    int quantity = cart.get(meal);
                    sql = "insert [dbo].[OrderDetails] values (?,?,?)";
                    pst = cn.prepareStatement(sql);
                    pst.setString(1, newOrderId);
                    pst.setString(2, meal.getMealId());
                    pst.setInt(3, quantity);
                    rs = pst.executeUpdate();
                }
                cn.commit();
                
                cn.setAutoCommit(true);     //tra ve tu dong commit tren database
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(cn!=null) cn.close();
            }catch(Exception e){ e.printStackTrace();}
        }
        return rs;
    }
}
