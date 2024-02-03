/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAOS.UsersDaos;
import Models.Users;
import SendData.SendMail;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class ForgotController extends HttpServlet {

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
            out.println("<title>Servlet ForgotController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ForgotController at " + request.getContextPath() + "</h1>");
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
        if (path.endsWith("/ForgotController/Forgot")) {
            request.getRequestDispatcher("/EmailForgot.jsp").forward(request, response);
        }
        if (path.startsWith("/ForgotController/Resest/")) {
            String s[] = path.split("/");
            String resetPass = s[s.length - 1];
            UsersDaos uDaos = new UsersDaos();
            Users userModel = uDaos.checkTokenReset(resetPass);
            if (userModel == null) {
               response.sendRedirect("/LoginController");
            } else {
                request.getRequestDispatcher("/ChangePassWord.jsp").forward(request, response);
            }

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
        if (request.getParameter("submitforgort") != null) {
            String email = request.getParameter("email");
            UsersDaos uDaos = new UsersDaos();
            Users uModel = uDaos.checkUserExitByEmail(email);
            if (uModel == null) {
                request.setAttribute("email", email);
                request.setAttribute("comfirm", "comfirm");
                request.setAttribute("sendErro", "Email doesn't exit enter again.!!");
                request.getRequestDispatcher("/EmailForgot.jsp").forward(request, response);
            } else {
                request.setAttribute("sendsusses", "Send email to rest password succses, Please check your email ");
                SendMail sendMail = new SendMail();
                String tokenRest = Hash.MD5.generateRandomString(50);
                int updatetoken = uDaos.addResetToken(tokenRest, uModel.getUsername());
                if (updatetoken != -1) {
                    sendMail.sendCode(email, "http://localhost:8080/ForgotController/Resest/" + tokenRest, uModel.getFullname());
                    request.setAttribute("sendsusses", "Send email to rest password succses, Please check your email ");
                    request.getRequestDispatcher("/EmailForgot.jsp").forward(request, response);
                } else {
                    request.setAttribute("email", email);
                    request.setAttribute("comfirm", "comfirm");
                    request.setAttribute("sendErro", "Please Enter Again!");
                    request.getRequestDispatcher("/EmailForgot.jsp").forward(request, response);
                }
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
