/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAOS.UsersDaos;
import Models.Users;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.Date;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class CustomerController extends HttpServlet {

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
            out.println("<title>Servlet CustomerController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CustomerController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String path = request.getRequestURI();
        if (path.startsWith("/CustomerController/Logout")) {
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("/");
        } else if (path.endsWith("/CustomerController/ProfileUser")) {
            request.getRequestDispatcher("/profileUser.jsp").forward(request, response);
        } else if (path.endsWith("/CustomerController/user-order")) {
            request.getRequestDispatcher("/user-order.jsp").forward(request, response);
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
        if (request.getParameter("update") != null) {
            String userName = request.getParameter("username");
            String Fullname = request.getParameter("name");
            String Email = request.getParameter("email");
            int Phone = Integer.parseInt(request.getParameter("phone"));
            String Gender = request.getParameter("gender");
            Date Birthday = Date.valueOf(request.getParameter("birthday"));
            String Address = request.getParameter("address");
            Users u1 = new Users(userName, Fullname, Email, Phone, "", Gender, Birthday, Address, "", 0, "", "");
            UsersDaos usDao = new UsersDaos();
            Users u2 = usDao.Update(u1);
            if (u2 == null) {
                response.sendRedirect("/");
            } else {
                Users infoUser = (Users) session.getAttribute("infoUser");
                Users us3 = usDao.checkAccount(infoUser.getUsername(), infoUser.getPassword());
                session.setAttribute("infoUser", us3);
                response.sendRedirect("/CustomerController/ProfileUser");
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
