<%-- 
    Document   : profileUser
    Created on : Oct 31, 2023, 8:18:11 PM
    Author     : Ngo Phuc Vinh - CE170573
--%>

<%@page import="Models.Users"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tài kho?n</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <%
            Boolean loggedIn = (Boolean) session.getAttribute("checklogin");
            if (loggedIn != null && loggedIn) {
                Users infoUser = (Users) session.getAttribute("infoUser");

        %>
        <div class="col-md-9">
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-12">
                            <h4>Profile</h4>
                            <hr>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <form action="/CustomerController" method="post">
                                <div class="form-group row">
                                    <label for="username" class="col-4 col-form-label">UserName</label> 
                                    <div class="col-8">
                                        <input value="<%= infoUser.getUsername()%>" id="username" name="username"  class="form-control here" required="required" type="text" readonly>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="name" class="col-4 col-form-label">FullName</label> 
                                    <div class="col-8">
                                        <input value="" id="name" name="name" placeholder="Full Name" class="form-control here" type="text">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="email" class="col-4 col-form-label">Email</label> 
                                    <div class="col-8">
                                        <input value="<%= infoUser.getEmail() %>" id="email" name="email" class="form-control here" type="text" readonly>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="lastname" class="col-4 col-form-label">Number Phone</label> 
                                    <div class="col-8">
                                        <input value="" id="phone" name="phone" placeholder="Phone Number" class="form-control here" type="text">
                                    </div>
                                </div>
                                <!--                                <div class="form-group row">
                                                                    <label for="text" class="col-4 col-form-label">Lo?i tài kho?n</label> 
                                                                    <div class="col-8">
                                                                        <input hidden="" value="" id="text" name="UserType" placeholder="Nick Name" class="form-control here"  type="text" readonly>
                                                                    </div>
                                                                </div>-->
                                <div class="form-group row">
                                    <label for="email" class="col-4 col-form-label">Gender</label> 
                                    <input  type="radio" id="gender" name="gender" value="Male"/> Male
                                    <input  style="margin-left: 30px"type="radio" id="gender" name="gender" value="Female"/>  FeMale  
                                    <br>

                                </div>
                                <div class="form-group row">
                                    <label for="website" class="col-4 col-form-label">Birthday</label> 
                                    <div class="col-8">
                                        <input value="" id="birthday" name="birthday" placeholder="website" class="form-control here" type="date">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="publicinfo" class="col-4 col-form-label">Address</label> 
                                    <div class="col-8">
                                        <textarea value="" id="addresss" name="address" cols="40" rows="4" class="form-control"></textarea>
                                    </div>
                                </div>
                                <!--                                <div class="form-group row">
                                                                    <label for="newpass" class="col-4 col-form-label">New Password</label> 
                                                                    <div class="col-8">
                                                                        <input id="newpass" name="newpass" placeholder="New Password" class="form-control here" type="text">
                                                                    </div>
                                                                </div> -->
                                <div class="form-group row">
                                    <div class="offset-4 col-8">
                                        <button name="update" type="submit" class="btn btn-primary">Edit</button>
                                        <a name="back" href="" class="btn btn-secondary">Back Home</a>
                                        <a name="back" href="" class="btn btn-primary">Edit PassWord</a>

                                    </div>
                                </div>
                            </form>  

                        </div>
                    </div>

                </div>
            </div>
        </div>
        <%
            }
        %>
    </body>
</html>
