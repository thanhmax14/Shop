<%-- 
    Document   : user-header
    Created on : Oct 31, 2023, 1:34:41 AM
    Author     : Nguyen Hoang Nha - CE170092
--%>

<%@page import="Models.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>



        <header class="header-area header-sticky">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <nav class="main-nav">
                            <!-- ***** Logo Start ***** -->
                            <a href="/" class="logo">
                                <img src="/resources/UserAssets/images/white-logo.png">
                            </a>
                            <!-- ***** Logo End ***** -->
                            <!-- ***** Menu Start ***** -->
                            <ul class="nav">
                                <li class="scroll-to-section"><a href="">Sản phẩm</a></li>



                                <li class="scroll-to-section"><a href="">Giỏ hàng (<span class='text-danger'>2</span>)</a></li>

                                <%
                                    Boolean checck = (Boolean) session.getAttribute("checklogin");
                                    if (checck != null && checck) {
                                        Users infoUser = (Users) session.getAttribute("infoUser");
                                %>
                                <li class="submenu">
                                    <a href="javascript:;"><%= infoUser.getFullname()%></a>
                                    <ul>
                                        <li><a class='text-info' href="/CustomerController/ProfileUser">Thông tin tài khoản</a></li>
                                        <li><a href="" class='text-info'>Đơn hàng</a></li>
                                        <li><a href="" class='text-info'>Đơn hàng</a></li>
                                        <li><a href="" class='text-info'>Đơn hàng</a></li> 
                                        <li><a class='text-info' href="/CustomerController/Logout" >Đăng xuất</a></li>
                                    </ul>
                                </li>
                                <% } else { %>
                                <li><a class='text-info' href="/LoginController" class="btn btn-primary btn-block">Đăng nhập</a></li>
                                    <% }%>
                            </ul>
                            <a class='menu-trigger'>
                                <span>Menu</span>
                            </a>
                            <!-- ***** Menu End ***** -->
                        </nav>
                    </div>
                </div>
            </div>
        </header>
    </body>
</html>
