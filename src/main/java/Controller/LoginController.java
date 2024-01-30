/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAOS.UsersDaos;
import LoginWithGoogle.Constants;
import LoginWithGoogle.GooglePojo;
import LoginWithGoogle.GoogleUtils;
import Models.Users;
import com.google.gson.Gson;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Date;
import org.apache.commons.codec.digest.Md5Crypt;

/**
 *
 * @author Pham Quang Thanh - CE171732
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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    private String URL = "/";

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
        String path = request.getRequestURI();
        if (path.endsWith("/LoginController")) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        if (path.startsWith("/LoginController/Register")) {
            request.getRequestDispatcher("/sigup.jsp").forward(request, response);
        }
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
        HttpSession session = request.getSession();
        if (request.getParameter("btnLogin") != null) {
            String use = request.getParameter("user");
            String pass = request.getParameter("pass");
            UsersDaos UDaos = new UsersDaos();
            Users userModel = UDaos.checkAccount(use, Hash.MD5.getMd5(pass));
            if (userModel != null) {
                if (userModel.getUserType().equalsIgnoreCase("admin")) {
                    session.setAttribute("checklogin", true);
                    session.setAttribute("infoUser", userModel);
                    URL = "/AdminController";
                } else {
                    session.setAttribute("checklogin", true);
                    session.setAttribute("infoUser", userModel);
                }
            } else {
                request.setAttribute("mess", "Wrong username or password.");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
            response.sendRedirect(URL);
        }
        if (request.getParameter("register") != null) {
            String UserName = request.getParameter("user");
            String fullName = request.getParameter("fullname");
            String PassWord = request.getParameter("pass");
            String Email = request.getParameter("email");
            int SDT = Integer.parseInt(request.getParameter("phone"));
            // Chuyển đổi chuỗi ngày thành đối tượng java.sql.Date
            Date date = Date.valueOf("2003-06-21");
            // Tạo đối tượng Users với ngày đăng ký được thiết lập
            Users us = new Users(UserName, fullName, Email, SDT, "Customer", "", date, "", Hash.MD5.getMd5(PassWord), 0, "", "");
            UsersDaos usDaos = new UsersDaos();
            Users us1 = usDaos.register(us);
            if (us1 == null) {
                response.sendRedirect("/LoginController/Register");
            } else {
                session.setAttribute("Username", UserName);
                session.setAttribute("FullName", fullName);
                session.setAttribute("Email", Email);
                response.sendRedirect("/");
            }
        }
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
