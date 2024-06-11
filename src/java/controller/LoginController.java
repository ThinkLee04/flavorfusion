/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import dao.CustomerDAO;
import dao.ShipperDAO;
import dao.StaffDAO;
import dto.Account;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class LoginController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("email");
        String pass = request.getParameter("password");

        AccountDAO adb = new AccountDAO();
        Account a = adb.login(user, pass);
        CustomerDAO cdb=new CustomerDAO();
        StaffDAO sdb= new StaffDAO();
        ShipperDAO shdb=new ShipperDAO();
        if (a==null) {
//            khi nhap sai se hien mess o trang login.jsp
            request.setAttribute("mess", "Invalid Email or Password");
            request.getRequestDispatcher("login.jsp").forward(request, response);           
        }
        else if (a!=null){
              switch (a.getRole()){
                  //kiem tra account customer
                  case "1":
                      if(cdb.checkCustomerValid(a.getEmail())){
                          response.sendRedirect("home.html");
                      }
                      else{
                          request.setAttribute("mess", "Your account is no longer availble");
                          request.getRequestDispatcher("login.jsp").forward(request, response);
                      }
                      break;
                  //kiem tra account staff
                  case "2":
                      if(sdb.checkStaffValid(a.getEmail())){
                          response.sendRedirect("home.html");
                      }
                      else{
                          request.setAttribute("mess", "Your account is no longer availble");
                          request.getRequestDispatcher("login.jsp").forward(request, response);
                      }
                      break;
                  //kiem tra account shipper
                  case "3":
                      if(shdb.checkShipperValid(a.getEmail())){
                          response.sendRedirect("home.html");
                      }
                      else{
                          request.setAttribute("mess", "Your account is no longer availble");
                          request.getRequestDispatcher("login.jsp").forward(request, response);
                      }
                      break;
                  
              }
//            2 dong nay de luu tk o acc trong suot qua trinh dang nhap
//            HttpSession session = request.getSession();
//            session.setAttribute("acc", a);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
