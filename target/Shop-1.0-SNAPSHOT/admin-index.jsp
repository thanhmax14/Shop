
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Dashboard</title>
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

        <jsp:include page="admin-header.jsp" />
        <jsp:include page="admin-aside.jsp" />




        <main id="main" class="main">

            <div class="pagetitle">
                <h1>Dashboard</h1>
                <nav>
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                        <li class="breadcrumb-item active">Dashboard</li>
                    </ol>

                </nav>

            </div><!-- End Page Title -->
            <!-- Recent Activity -->
            <div class="card">


                <div class="card-body">
                    <h5 class="card-title">Lọc theo ngày <span></span></h5>

                    <div class="activity">

                        <select class="form-select" value="" onchange="redirect(this)">
                            <option  value="0">Tháng này</option>
                            <option  value="3">3 tháng</option>
                            <option value="6">6 tháng</option>
                            <option  value="12">12 tháng</option>
                        </select>

                    </div>

                </div>
            </div><!-- End Recent Activity -->

            <section class="section dashboard">
                <div class="row">

                    <!-- Left side columns -->
                    <div class="col-lg-12">
                        <div class="row">

                            <!-- Sales Card -->
                            <div class="col-xxl-4 col-md-6">
                                <div class="card info-card sales-card">


                                    <div class="card-body">
                                        <h5 class="card-title">Đơn hàng <span></span></h5>

                                        <div class="d-flex align-items-center">
                                            <div class="card-icon rounded-circle d-flex align-items-center justify-content-center">
                                                <i class="bi bi-cart"></i>
                                            </div>
                                            <div class="ps-3">
                                                <h6></h6>
                                                <span class="text-info small pt-1 fw-bold"></span> <span class="text-muted small pt-2 ps-1">Đơn mới</span><br/>
                                                <span class="text-success small pt-1 fw-bold"></span><span class="text-muted small pt-2 ps-1">Thành công</span> <span class="text-danger small pt-1 fw-bold"></span><span class="text-muted small pt-2 ps-1">Đã huỷ</span>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div><!-- End Sales Card -->

                            <!-- Revenue Card -->
                            <div class="col-xxl-4 col-md-6">
                                <div class="card info-card revenue-card">


                                    <div class="card-body">
                                        <h5 class="card-title">Doanh thu <span></span></h5>

                                        <div class="d-flex align-items-center">
                                            <div class="card-icon rounded-circle d-flex align-items-center justify-content-center">
                                                <i class="bi bi-currency-dollar"></i>
                                            </div>
                                            <div class="ps-3">
                                                <h6>totalRe</h6>
                                                <!--<span class="text-success small pt-1 fw-bold">8%</span> <span class="text-muted small pt-2 ps-1">increase</span>-->

                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div><!-- End Revenue Card -->

                            <!-- Customers Card -->
                            <div class="col-xxl-4 col-xl-6">

                                <div class="card info-card customers-card">



                                    <div class="card-body">
                                        <h5 class="card-title">Khách hàng <span></span></h5>

                                        <div class="d-flex align-items-center">
                                            <div class="card-icon rounded-circle d-flex align-items-center justify-content-center">
                                                <i class="bi bi-people"></i>
                                            </div>
                                            <div class="ps-3">
                                                <h6>totalCustomer</h6>
                                                <!--<span class="text-danger small pt-1 fw-bold">12%</span> <span class="text-muted small pt-2 ps-1">decrease</span>-->

                                            </div>
                                        </div>

                                    </div>
                                </div>

                            </div><!-- End Customers Card -->


                            <!-- Recent Sales -->
                            <div class="col-12">
                                <div class="card recent-sales overflow-auto">



                                    <div class="card-body">
                                        <h5 class="card-title">Sản phẩm bán chạy <span>| Today</span></h5>

                                        <table class="table table-borderless datatable">
                                            <thead>
                                                <tr>
                                                    <th scope="col">Mã sản phẩm</th>
                                                    <th scope="col">Loại</th>
                                                    <th scope="col">Tên</th>
                                                    <th scope="col">Đã bán</th>
                                                    <th scope="col"></th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                
                                                <tr>
                                                    <th scope="row"><a href="#">ProID</a></th>
                                                    <td>CateName</td>
                                                    <td><a href="#" class="text-primary">ProName</a></td>
                                                    <td>TotalSold</td>
                                                    <td><a target="_blank" href="">Chi tiết sản phẩm</a></td>
                                                </tr>                                     

                                            </tbody>
                                        </table>

                                    </div>

                                </div>
                            </div><!-- End Recent Sales -->

                            <!-- Top Selling -->


                        </div>
                    </div><!-- End Left side columns -->

                    <!-- Right side columns -->

                </div>
            </section>

        </main><!-- End #main -->



        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="/resources/AdminAssets/vendor/apexcharts/apexcharts.min.js"></script>
        <script src="/resources/AdminAssets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="/resources/AdminAssets/vendor/chart.js/chart.umd.js"></script>
        <script src="/resources/AdminAssets/vendor/echarts/echarts.min.js"></script>
        <script src="/resources/AdminAssets/vendor/quill/quill.min.js"></script>
        <script src="/resources/AdminAssets/vendor/simple-datatables/simple-datatables.js"></script>
        <script src="/resources/AdminAssets/vendor/tinymce/tinymce.min.js"></script>
        <script src="/resources/AdminAssets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="/resources/AdminAssets/js/main.js"></script>

        <script>

                            function redirect(selectElement) {
                                var selectedValue = selectElement.value;
                                if (selectedValue === "0") {
                                    window.location.href = '/AdminController';
                                } else if (selectedValue === "3") {
                                    window.location.href = '/AdminController?month=3';
                                } else if (selectedValue === "6") {
                                    window.location.href = '/AdminController?month=6';
                                } else if (selectedValue === "12") {
                                    window.location.href = '/AdminController?month=12';
                                }
                            }


        </script>

    </body>

</html>