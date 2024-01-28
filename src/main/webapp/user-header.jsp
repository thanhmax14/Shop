<%-- 
    Document   : user-header
    Created on : Oct 31, 2023, 1:34:41 AM
    Author     : Nguyen Hoang Nha - CE170092
--%>

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
                            <a href="" class="logo">
                                <img src="/resources/UserAssets/images/white-logo.png">
                            </a>
                            <!-- ***** Logo End ***** -->
                            <!-- ***** Menu Start ***** -->
                            <ul class="nav">
                                <li class="scroll-to-section"><a href="">Sản phẩm</a></li>



                                <li class="scroll-to-section"><a href="">Giỏ hàng (<span class='text-danger'>2</span>)</a></li>


                                <li class="submenu">
                                    <a href="javascript:;">${sessionScope.fullname}</a>
                                    <ul>
                                        <li><a class='text-info' href="">Thông tin tài khoản</a></li>
                                        <li><a href="" class='text-info'>Đơn hàng</a></li>
                                        <li><a class='text-info' href="" >Đăng xuất</a></li>
                                        <!--<li><a href="#">Log Out</a></li>-->
                                        <!--<li><a rel="nofollow" href="ttps://templatemo.com/page/4" target="_blank">Template Page 4</a></li>-->
                                    </ul>
                                </li>


                               
                                    <li><a class='text-info' href="" class="btn btn-primary btn-block">Đăng nhập</a></li>
                            
                            
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
