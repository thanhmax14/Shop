<%-- 
    Document   : profileUser
   
--%>

<%@page import="Models.Users"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ProFile</title>
        <!--        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeObject/2.0.3/jquery.serializeObject.min.js"></script>
                <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
                <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.serializeObject/2.0.3/jquery.serializeObject.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>


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

<<<<<<< HEAD
                                <div class="form-group row">
                                    <label for="lastname" class="col-4 col-form-label">Number Phone</label> 
                                    <div class="col-8">
                                        <input value="<%= infoUser.getPhone() == 0 ? "" : infoUser.getPhone()%>" id="phone" name="phone" placeholder="Phone Number" class="form-control here" type="text"required>
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
                                    <input  type="radio" id="gender" name="gender" value="Male" <%= infoUser.getGender().equalsIgnoreCase("Male") ? "Checked" : ""%>/> Male
                                    <input  style="margin-left: 30px"type="radio" id="gender" name="gender" value="Female" <%= infoUser.getGender().equalsIgnoreCase("FeMale") ? "Checked" : ""%>  required=""/>  FeMale  
                                    <br>

                                </div>
                                <div class="form-group row">
                                    <label for="website" class="col-4 col-form-label">Birthday</label> 
                                    <div class="col-8">
                                        <input value="<%= infoUser.getBirthday() != null ? infoUser.getBirthday() : ""%>" id="birthday" name="birthday" placeholder="website" class="form-control here" type="date"required>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="publicinfo" class="col-4 col-form-label">Address</label> 
                                    <div class="col-8">
                                        <textarea id="addresss" name="address" cols="40" rows="4" class="form-control"><%= infoUser.getAddress()%></textarea>
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
                                        <button  name="update" type="submit" class="btn btn-primary">Edit</button>
                                        <!--                                        <input type="submit" name="update" value="Update">-->
                                        <a name="back" href="" class="btn btn-secondary">Back Home</a>
                                        <a name="back" href="" class="btn btn-primary">Edit PassWord</a>

                                    </div>
                                </div>
=======
                            <div class="form-group row">
                                <label for="username" class="col-4 col-form-label">UserName</label> 
                                <div class="col-8">
                                    <input value="<%= infoUser.getUsername() != null ? infoUser.getUsername() : ""%>" id="username" name="username"  class="form-control here" required="required" type="text" readonly>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="name" class="col-4 col-form-label">FullName</label> 
                                <div class="col-8">
                                    <input value="<%= infoUser.getFullname() != null ? infoUser.getFullname() : ""%>" id="name" name="name" placeholder="Full Name" class="form-control here" type="text">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="email" class="col-4 col-form-label">Email</label> 
                                <div class="col-8">
                                    <input value="<%= infoUser.getEmail() != null ? infoUser.getEmail() : ""%>" id="email" name="email" class="form-control here" type="text" readonly>
                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="lastname" class="col-4 col-form-label">Number Phone</label> 
                                <div class="col-8">
                                    <input value="<%= infoUser.getPhone()%>" id="phone" name="phone" placeholder="Phone Number" class="form-control here" type="text">
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
                                <input  type="radio" id="gender" name="gender" value="Male" <%= infoUser.getGender().equalsIgnoreCase("Male") ? "Checked" : ""%>/> Male
                                <input  style="margin-left: 30px"type="radio" id="gender" name="gender" value="Female" <%= infoUser.getGender().equalsIgnoreCase("FeMale") ? "Checked" : ""%> />  FeMale  
                                <br>

                            </div>
                            <div class="form-group row">
                                <label for="website" class="col-4 col-form-label">Birthday</label> 
                                <div class="col-8">
                                    <input value="<%= infoUser.getBirthday()%>" id="birthday" name="birthday" placeholder="website" class="form-control here" type="date">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="publicinfo" class="col-4 col-form-label">Address</label> 
                                <div class="col-8">
                                    <textarea id="address" name="address" cols="40" rows="4" class="form-control"><%= infoUser.getAddress()%></textarea>
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
                                    <input class="btn btn-outline-primary" type="button" id="btnSend" value="EditProfile">
                                    <!--                                        <input type="submit" name="update" value="Update">-->
                                    <a href="/" class="btn btn-secondary">Back Home</a>
                                

                                </div>
                            </div>
>>>>>>> 4a29ec4e8c8c402e8fc38d9a35abec79748d5db4
                            </form>  

                        </div>
                    </div>

                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script>
            $(document).ready(function () {
                $("#btnSend").click(function () {
                    const swalWithBootstrapButtons = Swal.mixin({
                        customClass: {
                            confirmButton: "btn btn-success",
                            cancelButton: "btn btn-danger"
                        },
                        buttonsStyling: false
                    });
                    swalWithBootstrapButtons.fire({
                        title: "Are you Edit Profile",
                    
                        icon: "warning",
                        showCancelButton: true,
                        confirmButtonText: "Yes, I want to EditProfile",
                        cancelButtonText: "No, I don't want EditProfile",
                        reverseButtons: true
                    }).then((result) => {
                        if (result.isConfirmed) {

                            var username = $("#username").val();
                            var name = $("#name").val();
                            var email = $("#email").val();
                            var phone = $("#phone").val();
                            var gender = $("input[name='gender']:checked").val();
                            var birthday = $("#birthday").val();
                            var address = $("#address").val();

                            $.ajax({
                                type: "POST",
                                url: "/CustomerController/ProfileUser",
                                dataType: "json",
                                data: {
                                    username: username,
                                    name: name,
                                    email: email,
                                    phone: phone,
                                    gender: gender,
                                    birthday: birthday,
                                    address: address
                                },
                                success: function (data) {
                                    $("#infoFullname").text("infoFullname: " + data.name);
                                    $("#infoAge").text("infoAge: " + data.age);
                                },
                                error: function (xhr, status, error) {
                                    console.log("Error:", error);
                                }
                            });

                        
                        } else if (
                                /* Read more about handling dismissals below */
                                result.dismiss === Swal.DismissReason.cancel
                                ) {
                            swalWithBootstrapButtons.fire({
                                title: "Cancelled",
                                text: "Your cancell EditProfile :)",
                                icon: "error"
                            });
                        }
                    });

                });
            });
        </script>


    </body>

<<<<<<< HEAD
=======
    <%
        }
    %>


>>>>>>> 4a29ec4e8c8c402e8fc38d9a35abec79748d5db4
</html>
