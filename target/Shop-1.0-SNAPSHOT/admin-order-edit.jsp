<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Detail</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="/resources/AdminAssets/img/favicon.png" rel="icon">
        <link href="/resources/AdminAssets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.gstatic.com" rel="preconnect">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="/resources/AdminAssets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="/resources/AdminAssets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="/resources/AdminAssets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="/resources/AdminAssets/vendor/quill/quill.snow.css" rel="stylesheet">
        <link href="/resources/AdminAssets/vendor/quill/quill.bubble.css" rel="stylesheet">
        <link href="/resources/AdminAssets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="/resources/AdminAssets/vendor/simple-datatables/style.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="/resources/AdminAssets/css/style.css" rel="stylesheet">


        <!-- =======================================================
        * Template Name: NiceAdmin
        * Updated: Sep 18 2023 with Bootstrap v5.3.2
        * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
        * Author: BootstrapMade.com
        * License: https://bootstrapmade.com/license/
        ======================================================== -->
    </head>

    <body>

        <div class="col-lg-12  container mt-5">

            <div class="">
                <div class="card-body m-5">

                    <form  method="post" action='/OrderID_ad' onsubmit="return validateFormOrder()">
                        <input name='oid' value='' hidden />
                        <div class='row '>
                            <div class='col-md-4 card'>
                                <h5 class="card-title">Thông tin đơn hàng</h5>
                                <div class='card-body'>Mã đơn hàng: <b></b>
                                    <br>
                                    Ngày đặt: 

                                    <br>
                                    Tài khoản: 

                                    <br>
                                    Tổng tiền: <b class="text-danger"></b>


                                    <br>
                                    Địa chỉ nhận hàng: <i><</i>

                                    <br>
                                    Điện thoại: 

                                    <br>
                                    Ghi chú: 

                                    <br></div>
                                <select id="mySelect" class='form-select mb-2' name="a" >
                                    <option   value="0">Đã hủy</option>
                                    <option     value="1">Đã đặt hàng</option><!-- comment -->
                                    <option   value="2">Đã đóng gói</option><!-- comment -->
                                    <option   value="3">Đang vân chuyển</option><!-- comment -->
                                    <option   value="4">Đã giao</option><!-- comment -->

                                </select>
                            </div>
                            <div class='col-md-8'>

                                <div class="card">
                                    <div class="card-body">
                                        <h5 class="card-title">Sản phẩm</h5>

                                        <table class="table ">
                                            <thead>
                                                <tr>
                                                    <th>Sản phẩm</th>
                                                    <th>Số lượng</th>
                                                    <th>Kích cỡ</th>
                                                    <th>Giá tiền</th>
                                                    <th></th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                
                                                 
                                                <tr>
                                                    <td>ProName</td>
                                                    <td>OrderDetailQuan</td>
                                                    <td>Size</td>
                                                    <td>Price</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                        <!-- End Table with stripped rows -->

                                    </div>
                                </div>
                            </div>
                        </div>





                        <a class='btn btn-secondary' href="">back to list</a>
                        <input class='btn btn-info' type="submit" id='btn-up' style="display:none" value="Update" name ="Create" />

                    </form>

                </div>
            </div></div>


        <script src="/resources/UserAssets/js/jquery-2.1.0.min.js"></script>
        <!-- Vendor JS Files -->
        <script src="/resources/AdminAssets/vendor/apexcharts/apexcharts.min.js"></script>
        <script src="/resources/AdminAssets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="/resources/AdminAssets/vendor/chart.js/chart.umd.js"></script>
        <script src="/resources/AdminAssets/vendor/echarts/echarts.min.js"></script>
        <script src="/resources/AdminAssets/vendor/quill/quill.min.js"></script>
        <script src="/resources/AdminAssets/vendor/simple-datatables/simple-datatables.js"></script>
        <script src="/resources/AdminAssets/vendor/tinymce/tinymce.min.js"></script>
        <script src="/resources/AdminAssets/vendor/php-email-form/validate.js"></script>
        <script>
                        function validateForm() {
                            var brandName = document.getElementById("brandName").value;
                            if (brandName === "") {
                                alert("Please enter all files");
                                return false;
                            }
                            return true;
                        }
        </script>
        <!-- Template Main JS File -->
        <script src="/resources/AdminAssets/js/main.js"></script>
        <script>
                        $(document).ready(function () {
                            $('#mySelect').change(function () {
                                //        alert("Giá trị đã thay đổi thành: " + $(this).val());
                                $("#btn-up").show();
                            });
                        });
        </script>
    </body>

</html>