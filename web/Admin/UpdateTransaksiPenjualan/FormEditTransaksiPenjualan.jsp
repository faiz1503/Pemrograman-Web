<%-- 
    Document   : FormTambahOleh2
    Created on : Jul 9, 2018, 12:12:36 PM
    Author     : DeysiFortuna
--%>
<%@page import="Model.Member"%>
<jsp:useBean id="Member"  class="Model.Member"/>
<jsp:useBean id="MemberHome" class="Model.MemberHome"/>

<%@page import="Model.TransaksiPenjualan"%>
<jsp:useBean id="TransaksiPenjualan"  class="Model.TransaksiPenjualan"/>
<jsp:useBean id="TransaksiPenjualanHome" class="Model.TransaksiPenjualanHome"/>

<%TransaksiPenjualan transaksiPenjualan = null;
    TransaksiPenjualan[] daftarTransaksiPenjualan = TransaksiPenjualanHome.getDaftarOlehPusat();
%>

<%Member member = null;
    Member[] daftarMember = MemberHome.getDaftarMember();
%>
<%@page import="Model.Admin"%>
<jsp:useBean id="Admin"  class="Model.Admin"/>
<jsp:useBean id="AdminHome" class="Model.AdminHome"/>

<%
    if((session.getAttribute("email") == null) || (session.getAttribute("email") == "")){
        response.sendRedirect(application.getContextPath()+ "/Admin/Login/LoginAdmin.jsp");
            }
%>

<%
    String emailAdmin = ""+session.getAttribute("email")+"";
    if (emailAdmin != null) {
        Admin = AdminHome.getDaftarAdminByKode(emailAdmin);
    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <style>
            .center {
                margin:auto;
                width:100%;
                padding:15px;
            }
        </style>
        <link rel="icon" type="image/png" href="../../Gambar/GoSurfSumatera24.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Meta, title, CSS, favicons, etc. -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>GoSurfSumatera</title>

        <!-- Bootstrap -->
        <link href="../../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- Font Awesome -->
        <link href="../../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <!-- NProgress -->
        <link href="../../vendors/nprogress/nprogress.css" rel="stylesheet">
        <!-- iCheck -->
        <link href="../../vendors/iCheck/skins/flat/green.css" rel="stylesheet">
        <!-- Datatables -->
        <link href="../../vendors/datatables.net-bs/css/dataTables.bootstrap.min.css" rel="stylesheet">
        <link href="../../vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css" rel="stylesheet">
        <link href="../../vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
        <link href="../../vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css" rel="stylesheet">
        <link href="../../vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap-daterangepicker -->
        <link href="../../vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
        

        <!-- Custom Theme Style -->
        <link href="../../build/css/custom.min.css" rel="stylesheet">
    </head>

    <body class="nav-md">
        <div class="container body">
            <div class="main_container">
                <div class="col-md-3 left_col">
                    <div class="left_col scroll-view">
                        <div class="navbar nav_title" style="border: 0;">
                            <a href="" class="site_title">&nbsp&nbsp<img src="../../Gambar/GoSurfSumatera.png" height="35px"> <span>GoSurfSumatera</span></a>
                        </div>

                        <div class="clearfix"></div>

                        <!-- menu profile quick info -->
                        <div class="profile clearfix">
                            <div class="profile_pic">
                                <img src="../../Gambar/<%=Admin.getGambar()%>" alt="..." class="img-circle profile_img" height="60px" width="70px">
                            </div>
                            <div class="profile_info">
                                <span>Welcome,</span>
                                <h2><%=Admin.getNama()%></h2>
                            </div>
                        </div>
                        <!-- /menu profile quick info -->

                        <br />

                        <!-- sidebar menu -->
                        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                            <div class="menu_section">
                                <h3>General</h3>
                                <ul class="nav side-menu">
                                    <li><a href="../Login/index.jsp"><i class="fa fa-home"></i> Home </a></li>
                                    <li><a><i class="fa fa-edit"></i> Forms <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="../UpdateMember/FormTambahMember.jsp">Form Member</a></li>
                                            <li><a href="../UpdateAdminToko/FormTambahAdminToko.jsp">Form Admin Toko</a></li>
                                            <li><a href="../UpdatePusatOleh2/FormTambahPusatOleh2.jsp">Form Pusat Oleh2</a></li>
                                            <li><a href="../UpdateOleh2/FormTambahOleh2.jsp">Form Oleh2</a></li>
                                            <li><a href="../UpdateTransaksiPenjualan/FormTambahTransaksiPenjualan.jsp">Form Transaksi Penjualan</a></li>
                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-table"></i> Edit Data <span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="../UpdateMember/EditMember.jsp">Edit Data Member</a></li>
                                            <li><a href="../UpdateAdminToko/EditAdminToko.jsp">Edit Data Admin Toko</a></li>
                                            <li><a href="../UpdatePusatOleh2/EditPusatOleh2.jsp">Edit Data Pusat Oleh-Oleh</a></li>
                                            <li><a href="../UpdateOleh2/EditOleh2.jsp">Edit Data Oleh-Oleh</a></li>
                                            <li><a href="../UpdateTransaksiPenjualan/EditTransaksiPenjualan.jsp">Edit Data Transaksi Penjualan</a></li>
                                        </ul>
                                    </li>
                                    <li><a><i class="fa fa-edit"></i> Artikel dan Komentar<span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="../UpdateArtikel/EditArtikel.jsp">Artikel</a></li>
                                            <li><a href="../UpdateKomentar/EditKomentar.jsp">Komentar</a></li>
                                            <li><a href="../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Tempat-Wisata">Tempat Wisata</a></li>
                                            <li><a href="../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Pakaian-Adat">Pakaian Adat</a></li>
                                            <li><a href="../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Makanan-Khas">Makanan Khas</a></li>
                                            <li><a href="../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Tarian-Tradisional">Tarian Tradisional</a></li>
                                            <li><a href="../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Musik-Tradisional">Musik Tradisional</a></li>
                                        </ul>
                                    </li>
                            </div>
                        </div>
                        <!-- /sidebar menu -->

                        <!-- /menu footer buttons -->
                        <div class="sidebar-footer hidden-small">
                            <a data-toggle="tooltip" data-placement="top" title="Settings">
                                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                            </a>
                            <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                            </a>
                            <a data-toggle="tooltip" data-placement="top" title="Lock">
                                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                            </a>
                            <a data-toggle="tooltip" data-placement="top" title="Logout" href="../../logout.jsp">
                                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                            </a>
                        </div>
                        <!-- /menu footer buttons -->
                    </div>
                </div>


                <!-- /top navigation -->
                <div class="top_nav">
                    <div class="nav_menu">
                        <nav>
                            <div class="nav toggle">
                                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                            </div>

                            <ul class="nav navbar-nav navbar-right">
                                <li class="">
                                    <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                        <img src="../../Gambar/<%=Admin.getGambar()%>" alt=""  height="40px" width="40px"><%=Admin.getNama()%>
                                        <span class=" fa fa-angle-down"></span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-usermenu pull-right">
                                       
                                        <li><a href="../logout.jsp"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <!-- /top navigation -->

                <!-- page content -->
                <div class="right_col" role="main">
                    <div class="">

                        <div class="clearfix"></div>


                        <div class="row">
                            <div class="center">
                                <div class="col-md-6 col-sm-12 col-xs-12 col-md-offset-1">

                                    <div class="x_panel">
                                        <br>
                                        <center><font size="5">Form Tambah Transaksi Penjualan</font></center>

                                        <div class="x_content">
                                            <br />
                                            <br>

                                            <form id="form1" data-parsley-validate class="form-horizontal form-label-left" action="../../AddTransaksiPenjualan" method="post">

                                                <%--Tampilan form beserta input text --%>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Kode Member</label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="text" name="kodeMember" required="required" class="form-control col-md-7 col-xs-12">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Kode Oleh2
                                                    </label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="text" name="kodeOleh2"  required="required" class="form-control col-md-7 col-xs-12" >
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Jumlah Beli</label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="number" name="jumlahBeli" min="0" required="required" class="form-control col-md-7 col-xs-12">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Tanggal Transaksi</label>
                                                    

                                                    <div class="col-md-6 col-sm-6 col-xs-15">
                                                        
                                                        <div class="daterangepicker dropdown-menu ltr single opensright show-calendar picker_1 xdisplay">
                                                            <div class="calendar left single" style="display: block;">
                                                                <div class="daterangepicker_input">
                                                                    <input class="input-mini form-control active" type="text" value="" style="display: none;">
                                                                    <i class="fa fa-calendar glyphicon glyphicon-calendar" style="display: none;"></i>
                                                                    <div class="calendar-time" style="display: none;">
                                                                        <div></div>
                                                                        <i class="fa fa-clock-o glyphicon glyphicon-time"></i></div>
                                                                </div>
                                                                <div class="calendar-table">
                                                                    <table class="table-condensed">
                                                                        <thead>
                                                                            <tr>
                                                                                <th class="prev available"><i class="fa fa-chevron-left glyphicon glyphicon-chevron-left"></i></th>
                                                                                <th colspan="5" class="month">Oct 2016</th>
                                                                                <th class="next available"><i class="fa fa-chevron-right glyphicon glyphicon-chevron-right"></i></th>
                                                                            </tr>
                                                                            <tr>
                                                                                <th>Su</th><th>Mo</th><th>Tu</th><th>We</th><th>Th</th><th>Fr</th><th>Sa</th>
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td class="weekend off available" data-title="r0c0">25</td>
                                                                                <td class="off available" data-title="r0c1">26</td>
                                                                                <td class="off available" data-title="r0c2">27</td>
                                                                                <td class="off available" data-title="r0c3">28</td>
                                                                                <td class="off available" data-title="r0c4">29</td>
                                                                                <td class="off available" data-title="r0c5">30</td>
                                                                                <td class="weekend available" data-title="r0c6">1</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r1c0">2</td>
                                                                                <td class="available" data-title="r1c1">3</td>
                                                                                <td class="available" data-title="r1c2">4</td>
                                                                                <td class="available" data-title="r1c3">5</td>
                                                                                <td class="available" data-title="r1c4">6</td>
                                                                                <td class="available" data-title="r1c5">7</td>
                                                                                <td class="weekend available" data-title="r1c6">8</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r2c0">9</td>
                                                                                <td class="available" data-title="r2c1">10</td>
                                                                                <td class="available" data-title="r2c2">11</td>
                                                                                <td class="available" data-title="r2c3">12</td>
                                                                                <td class="available" data-title="r2c4">13</td>
                                                                                <td class="available" data-title="r2c5">14</td>
                                                                                <td class="weekend available" data-title="r2c6">15</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r3c0">16</td>
                                                                                <td class="available" data-title="r3c1">17</td>
                                                                                <td class="today active start-date active end-date available" data-title="r3c2">18</td>
                                                                                <td class="available" data-title="r3c3">19</td>
                                                                                <td class="available" data-title="r3c4">20</td>
                                                                                <td class="available" data-title="r3c5">21</td>
                                                                                <td class="weekend available" data-title="r3c6">22</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r4c0">23</td>
                                                                                <td class="available" data-title="r4c1">24</td>
                                                                                <td class="available" data-title="r4c2">25</td>
                                                                                <td class="available" data-title="r4c3">26</td>
                                                                                <td class="available" data-title="r4c4">27</td>
                                                                                <td class="available" data-title="r4c5">28</td>
                                                                                <td class="weekend available" data-title="r4c6">29</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r5c0">30</td>
                                                                                <td class="available" data-title="r5c1">31</td>
                                                                                <td class="off available" data-title="r5c2">1</td>
                                                                                <td class="off available" data-title="r5c3">2</td>
                                                                                <td class="off available" data-title="r5c4">3</td>
                                                                                <td class="off available" data-title="r5c5">4</td>
                                                                                <td class="weekend off available" data-title="r5c6">5</td>
                                                                            </tr>
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                            <div class="calendar right" style="display: none;">
                                                                <div class="daterangepicker_input">
                                                                    <input class="input-mini form-control" type="text" name="daterangepicker_end" value="" style="display: none;">
                                                                    <i class="fa fa-calendar glyphicon glyphicon-calendar" style="display: none;"></i>
                                                                    <div class="calendar-time" style="display: none;">
                                                                        <div></div>
                                                                        <i class="fa fa-clock-o glyphicon glyphicon-time"></i>
                                                                    </div>
                                                                </div>
                                                                <div class="calendar-table">
                                                                    <table class="table-condensed">
                                                                        <thead>
                                                                            <tr>
                                                                                <th></th>
                                                                                <th colspan="5" class="month">Nov 2016</th>
                                                                                <th class="next available">
                                                                                    <i class="fa fa-chevron-right glyphicon glyphicon-chevron-right"></i>
                                                                                </th>
                                                                            </tr>
                                                                            <tr>
                                                                                <th>Su</th><th>Mo</th><th>Tu</th><th>We</th><th>Th</th><th>Fr</th><th>Sa</th>
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td class="weekend off available" data-title="r0c0">30</td>
                                                                                <td class="off available" data-title="r0c1">31</td>
                                                                                <td class="available" data-title="r0c2">1</td>
                                                                                <td class="available" data-title="r0c3">2</td>
                                                                                <td class="available" data-title="r0c4">3</td>
                                                                                <td class="available" data-title="r0c5">4</td>
                                                                                <td class="weekend available" data-title="r0c6">5</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r1c0">6</td>
                                                                                <td class="available" data-title="r1c1">7</td>
                                                                                <td class="available" data-title="r1c2">8</td>
                                                                                <td class="available" data-title="r1c3">9</td>
                                                                                <td class="available" data-title="r1c4">10</td>
                                                                                <td class="available" data-title="r1c5">11</td>
                                                                                <td class="weekend available" data-title="r1c6">12</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r2c0">13</td>
                                                                                <td class="available" data-title="r2c1">14</td>
                                                                                <td class="available" data-title="r2c2">15</td>
                                                                                <td class="available" data-title="r2c3">16</td>
                                                                                <td class="available" data-title="r2c4">17</td>
                                                                                <td class="available" data-title="r2c5">18</td>
                                                                                <td class="weekend available" data-title="r2c6">19</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r3c0">20</td>
                                                                                <td class="available" data-title="r3c1">21</td>
                                                                                <td class="available" data-title="r3c2">22</td>
                                                                                <td class="available" data-title="r3c3">23</td>
                                                                                <td class="available" data-title="r3c4">24</td>
                                                                                <td class="available" data-title="r3c5">25</td>
                                                                                <td class="weekend available" data-title="r3c6">26</td>
                                                                            </tr><tr><td class="weekend available" data-title="r4c0">27</td>
                                                                                <td class="available" data-title="r4c1">28</td>
                                                                                <td class="available" data-title="r4c2">29</td>
                                                                                <td class="available" data-title="r4c3">30</td>
                                                                                <td class="off available" data-title="r4c4">1</td>
                                                                                <td class="off available" data-title="r4c5">2</td>
                                                                                <td class="weekend off available" data-title="r4c6">3</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend off available" data-title="r5c0">4</td>
                                                                                <td class="off available" data-title="r5c1">5</td>
                                                                                <td class="off available" data-title="r5c2">6</td>
                                                                                <td class="off available" data-title="r5c3">7</td>
                                                                                <td class="off available" data-title="r5c4">8</td>
                                                                                <td class="off available" data-title="r5c5">9</td>
                                                                                <td class="weekend off available" data-title="r5c6">10</td>
                                                                            </tr>
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                            <div class="ranges" style="display: none;">
                                                                <div class="range_inputs">
                                                                    <button class="applyBtn btn btn-sm btn-success" type="button">Apply</button> 
                                                                    <button class="cancelBtn btn btn-sm btn-default" type="button">Cancel</button>
                                                                </div>
                                                            </div>
                                                        </div>


                                                        <fieldset>
                                                            <div class="control-group">
                                                                <div class="controls">
                                                                    <div class="col-md-13 xdisplay_inputx form-group has-feedback">
                                                                        <input type="text" class="form-control has-feedback-left" id="single_cal1" placeholder="Tanggal transaksi" aria-describedby="inputSuccess2Status"  name="tglTransaksi">

                                                                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                                                        <span id="inputSuccess2Status" class="sr-only">(success)</span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </fieldset>
                                                      
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Lokasi Pengiriman
                                                    </label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="text" name="lokasiPengiriman"  required="required" class="form-control col-md-7 col-xs-12" >
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Tanggal Pengiriman</label>
                                                    

                                                    <div class="col-md-6 col-sm-6 col-xs-15">
                                                        
                                                        <div class="daterangepicker dropdown-menu ltr single opensright show-calendar picker_1 xdisplay">
                                                            <div class="calendar left single" style="display: block;">
                                                                <div class="daterangepicker_input">
                                                                    <input class="input-mini form-control active" type="text" value="" style="display: none;">
                                                                    <i class="fa fa-calendar glyphicon glyphicon-calendar" style="display: none;"></i>
                                                                    <div class="calendar-time" style="display: none;">
                                                                        <div></div>
                                                                        <i class="fa fa-clock-o glyphicon glyphicon-time"></i></div>
                                                                </div>
                                                                <div class="calendar-table">
                                                                    <table class="table-condensed">
                                                                        <thead>
                                                                            <tr>
                                                                                <th class="prev available"><i class="fa fa-chevron-left glyphicon glyphicon-chevron-left"></i></th>
                                                                                <th colspan="5" class="month">Oct 2016</th>
                                                                                <th class="next available"><i class="fa fa-chevron-right glyphicon glyphicon-chevron-right"></i></th>
                                                                            </tr>
                                                                            <tr>
                                                                                <th>Su</th><th>Mo</th><th>Tu</th><th>We</th><th>Th</th><th>Fr</th><th>Sa</th>
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td class="weekend off available" data-title="r0c0">25</td>
                                                                                <td class="off available" data-title="r0c1">26</td>
                                                                                <td class="off available" data-title="r0c2">27</td>
                                                                                <td class="off available" data-title="r0c3">28</td>
                                                                                <td class="off available" data-title="r0c4">29</td>
                                                                                <td class="off available" data-title="r0c5">30</td>
                                                                                <td class="weekend available" data-title="r0c6">1</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r1c0">2</td>
                                                                                <td class="available" data-title="r1c1">3</td>
                                                                                <td class="available" data-title="r1c2">4</td>
                                                                                <td class="available" data-title="r1c3">5</td>
                                                                                <td class="available" data-title="r1c4">6</td>
                                                                                <td class="available" data-title="r1c5">7</td>
                                                                                <td class="weekend available" data-title="r1c6">8</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r2c0">9</td>
                                                                                <td class="available" data-title="r2c1">10</td>
                                                                                <td class="available" data-title="r2c2">11</td>
                                                                                <td class="available" data-title="r2c3">12</td>
                                                                                <td class="available" data-title="r2c4">13</td>
                                                                                <td class="available" data-title="r2c5">14</td>
                                                                                <td class="weekend available" data-title="r2c6">15</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r3c0">16</td>
                                                                                <td class="available" data-title="r3c1">17</td>
                                                                                <td class="today active start-date active end-date available" data-title="r3c2">18</td>
                                                                                <td class="available" data-title="r3c3">19</td>
                                                                                <td class="available" data-title="r3c4">20</td>
                                                                                <td class="available" data-title="r3c5">21</td>
                                                                                <td class="weekend available" data-title="r3c6">22</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r4c0">23</td>
                                                                                <td class="available" data-title="r4c1">24</td>
                                                                                <td class="available" data-title="r4c2">25</td>
                                                                                <td class="available" data-title="r4c3">26</td>
                                                                                <td class="available" data-title="r4c4">27</td>
                                                                                <td class="available" data-title="r4c5">28</td>
                                                                                <td class="weekend available" data-title="r4c6">29</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r5c0">30</td>
                                                                                <td class="available" data-title="r5c1">31</td>
                                                                                <td class="off available" data-title="r5c2">1</td>
                                                                                <td class="off available" data-title="r5c3">2</td>
                                                                                <td class="off available" data-title="r5c4">3</td>
                                                                                <td class="off available" data-title="r5c5">4</td>
                                                                                <td class="weekend off available" data-title="r5c6">5</td>
                                                                            </tr>
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                            <div class="calendar right" style="display: none;">
                                                                <div class="daterangepicker_input">
                                                                    <input class="input-mini form-control" type="text" name="daterangepicker_end" value="" style="display: none;">
                                                                    <i class="fa fa-calendar glyphicon glyphicon-calendar" style="display: none;"></i>
                                                                    <div class="calendar-time" style="display: none;">
                                                                        <div></div>
                                                                        <i class="fa fa-clock-o glyphicon glyphicon-time"></i>
                                                                    </div>
                                                                </div>
                                                                <div class="calendar-table">
                                                                    <table class="table-condensed">
                                                                        <thead>
                                                                            <tr>
                                                                                <th></th>
                                                                                <th colspan="5" class="month">Nov 2016</th>
                                                                                <th class="next available">
                                                                                    <i class="fa fa-chevron-right glyphicon glyphicon-chevron-right"></i>
                                                                                </th>
                                                                            </tr>
                                                                            <tr>
                                                                                <th>Su</th><th>Mo</th><th>Tu</th><th>We</th><th>Th</th><th>Fr</th><th>Sa</th>
                                                                            </tr>
                                                                        </thead>
                                                                        <tbody>
                                                                            <tr>
                                                                                <td class="weekend off available" data-title="r0c0">30</td>
                                                                                <td class="off available" data-title="r0c1">31</td>
                                                                                <td class="available" data-title="r0c2">1</td>
                                                                                <td class="available" data-title="r0c3">2</td>
                                                                                <td class="available" data-title="r0c4">3</td>
                                                                                <td class="available" data-title="r0c5">4</td>
                                                                                <td class="weekend available" data-title="r0c6">5</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r1c0">6</td>
                                                                                <td class="available" data-title="r1c1">7</td>
                                                                                <td class="available" data-title="r1c2">8</td>
                                                                                <td class="available" data-title="r1c3">9</td>
                                                                                <td class="available" data-title="r1c4">10</td>
                                                                                <td class="available" data-title="r1c5">11</td>
                                                                                <td class="weekend available" data-title="r1c6">12</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r2c0">13</td>
                                                                                <td class="available" data-title="r2c1">14</td>
                                                                                <td class="available" data-title="r2c2">15</td>
                                                                                <td class="available" data-title="r2c3">16</td>
                                                                                <td class="available" data-title="r2c4">17</td>
                                                                                <td class="available" data-title="r2c5">18</td>
                                                                                <td class="weekend available" data-title="r2c6">19</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend available" data-title="r3c0">20</td>
                                                                                <td class="available" data-title="r3c1">21</td>
                                                                                <td class="available" data-title="r3c2">22</td>
                                                                                <td class="available" data-title="r3c3">23</td>
                                                                                <td class="available" data-title="r3c4">24</td>
                                                                                <td class="available" data-title="r3c5">25</td>
                                                                                <td class="weekend available" data-title="r3c6">26</td>
                                                                            </tr><tr><td class="weekend available" data-title="r4c0">27</td>
                                                                                <td class="available" data-title="r4c1">28</td>
                                                                                <td class="available" data-title="r4c2">29</td>
                                                                                <td class="available" data-title="r4c3">30</td>
                                                                                <td class="off available" data-title="r4c4">1</td>
                                                                                <td class="off available" data-title="r4c5">2</td>
                                                                                <td class="weekend off available" data-title="r4c6">3</td>
                                                                            </tr>
                                                                            <tr>
                                                                                <td class="weekend off available" data-title="r5c0">4</td>
                                                                                <td class="off available" data-title="r5c1">5</td>
                                                                                <td class="off available" data-title="r5c2">6</td>
                                                                                <td class="off available" data-title="r5c3">7</td>
                                                                                <td class="off available" data-title="r5c4">8</td>
                                                                                <td class="off available" data-title="r5c5">9</td>
                                                                                <td class="weekend off available" data-title="r5c6">10</td>
                                                                            </tr>
                                                                        </tbody>
                                                                    </table>
                                                                </div>
                                                            </div>
                                                            <div class="ranges" style="display: none;">
                                                                <div class="range_inputs">
                                                                    <button class="applyBtn btn btn-sm btn-success" type="button">Apply</button> 
                                                                    <button class="cancelBtn btn btn-sm btn-default" type="button">Cancel</button>
                                                                </div>
                                                            </div>
                                                        </div>


                                                        <fieldset>
                                                            <div class="control-group">
                                                                <div class="controls">
                                                                    <div class="col-md-13 xdisplay_inputx form-group has-feedback">
                                                                        <input type="text" class="form-control has-feedback-left" id="single_cal2" placeholder="Tanggal pengiriman" aria-describedby="inputSuccess2Status"  name="tglPengiriman">

                                                                        <span class="fa fa-calendar-o form-control-feedback left" aria-hidden="true"></span>
                                                                        <span id="inputSuccess2Status" class="sr-only">(success)</span>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </fieldset>
                                                      
                                                    </div>
                                                </div>
                                                
                                        </div>
                                        </form>
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-8 col-sm-6 col-xs-12 col-md-offset-3">
                                                <button class="btn btn-primary" type="reset" form="form1">Reset</button>
                                                <button type="submit" class="btn btn-success" form="form1">Submit</button>
                                                <br>
                                                <br>
                                                <br>
                                            </div>
                                            <br>
                                        </div>
                                        <br>
                                    </div>
                                </div>


                                <div class="right_col" role="main">
                    <div class="">
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <font size="5">Tabel Member</font>
                                    <!--<%=Member.getCount()%>-->
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                        <thead>
                                            <tr>
                                                <th>No</th>
                                                <th>Kode Member</th>
                                                <th>Username</th>
                                                <th>Nama</th>
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <%
                                                for (int i = 0; i < daftarMember.length; i++) {
                                                    Member = daftarMember[i];
                                            %>


                                            <tr>
                                                <td><%=i + 1%></td>

                                                <td><%=Member.getKodeMember()%></td>
                                                <td><%=Member.getId()%></td>
                                                <td><%=Member.getNama()%></td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                    </table>


                                </div>
                            </div>
                        </div>
                </div>
                        <div class="col-md-6 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <font size="5">Tabel Oleh2 dan Pusat Oleh2</font>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">
                                    <table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                        <thead>
                                            <tr>
                                                <th>No</th>
                                                <th>Kode Oleh2</th>
                                                <th>Nama Oleh2</th>
                                                <th>Nama Pusat Oleh2</th>
                                                <th>Harga</th>
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <%
                                                for (int i = 0; i < daftarTransaksiPenjualan.length; i++) {
                                                    TransaksiPenjualan = daftarTransaksiPenjualan[i];
                                            %>


                                            <tr>
                                                <td><%=i + 1%></td>
                                                <td><%=TransaksiPenjualan.getKodeOleh2()%></td>
                                                <td><%=TransaksiPenjualan.getNamaOleh2()%></td>
                                                <td><%=TransaksiPenjualan.getNamaPusatOleh2()%></td>
                                                <td><%=TransaksiPenjualan.getHargaBarang()%></td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                    </table>


                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                            </div>
                        </div>
                    </div>
                </div>
            
                <!-- /page content -->

            <!-- footer content -->
            <footer>
              <center>
              <img src="../../Gambar/GoSurfSumatera.png" height="30px">
              </center>
          <div class="clearfix"></div>
        </footer>
            <!-- /footer content -->
        </div>
    </div>

    <!-- jQuery -->
    <script src="../../vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="../../vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="../../vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="../../vendors/nprogress/nprogress.js"></script>
    <!-- iCheck -->
    <script src="../../vendors/iCheck/icheck.min.js"></script>
    <!-- Datatables -->
    <script src="../../vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="../../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
    <script src="../../vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="../../vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
    <script src="../../vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
    <script src="../../vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="../../vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="../../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
    <script src="../../vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
    <script src="../../vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
    <script src="../../vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
    <script src="../../vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
    <script src="../../vendors/jszip/dist/jszip.min.js"></script>
    <script src="../../vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="../../vendors/pdfmake/build/vfs_fonts.js"></script>
    <!-- bootstrap-daterangepicker -->
        <script src="../../vendors/moment/min/moment.min.js"></script>
        <script src="../../vendors/bootstrap-daterangepicker/daterangepicker.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="../../build/js/custom.min.js"></script>

</body>
</html>
