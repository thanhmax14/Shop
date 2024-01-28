<%-- 
    Document   : profileUser
    Created on : Oct 31, 2023, 8:18:11 PM
    Author     : Ngo Phuc Vinh - CE170573
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>T�i kho?n</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="col-md-9">
            <div class="card">
                <div class="card-body">
                    <div class="row">
                        <div class="col-md-12">
                            <h4>Th�ng tin t�i kho?n</h4>
                            <hr>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <form action="/UserHomeController" method="post">
                                <div class="form-group row">
                                    <label for="username" class="col-4 col-form-label">T�n ??ng nh?p</label> 
                                    <div class="col-8">
                                        <input value="" id="username" name="username"  class="form-control here" required="required" type="text" readonly>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="name" class="col-4 col-form-label">H? t�n</label> 
                                    <div class="col-8">
                                        <input value="" id="name" name="name" placeholder="Full Name" class="form-control here" type="text">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="email" class="col-4 col-form-label">Email</label> 
                                    <div class="col-8">
                                        <input value="" id="email" name="email" class="form-control here" type="text" readonly>
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <label for="lastname" class="col-4 col-form-label">?i?n tho?i</label> 
                                    <div class="col-8">
                                        <input value="" id="phone" name="phone" placeholder="Phone Number" class="form-control here" type="text">
                                    </div>
                                </div>
<!--                                <div class="form-group row">
                                    <label for="text" class="col-4 col-form-label">Lo?i t�i kho?n</label> 
                                    <div class="col-8">
                                        <input hidden="" value="" id="text" name="UserType" placeholder="Nick Name" class="form-control here"  type="text" readonly>
                                    </div>
                                </div>-->
                                <div class="form-group row">
                                    <label for="email" class="col-4 col-form-label">Gi?i t�nh</label> 
                                    <input  type="radio" id="gender" name="gender" value="Male"/> Nam
                                    <input  style="margin-left: 30px"type="radio" id="gender" name="gender" value="Female"/> N?
                                    <br>
                                 
                                </div>
                                <div class="form-group row">
                                    <label for="website" class="col-4 col-form-label">Ng�y sinh</label> 
                                    <div class="col-8">
                                        <input value="" id="birthday" name="birthday" placeholder="website" class="form-control here" type="date">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="publicinfo" class="col-4 col-form-label">??a ch?</label> 
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
                                        <button name="update" type="submit" class="btn btn-primary">C?p nh?t</button>
                                        <a name="back" href="" class="btn btn-secondary">V? trang ch?</a>
                                        <a name="back" href="" class="btn btn-primary">Thay ??i m?t kh?u</a>

                                    </div>
                                </div>
                            </form>  
                        </div>
                    </div>

                </div>
            </div>
        </div>

    </body>
</html>
