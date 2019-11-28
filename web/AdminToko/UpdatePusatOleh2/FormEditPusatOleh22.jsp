<%-- 
    Document   : FormEditPusatOleh2
    Created on : Jul 8, 2018, 10:12:18 AM
    Author     : DeysiFortuna
--%>



<%@page language="java"%>
<%@page import="Model.PusatOleh2"%>
<jsp:useBean id="PusatOleh2"  class="Model.PusatOleh2"/>
<jsp:useBean id="PusatOleh2Home" class="Model.PusatOleh2Home"/>

<%@page import="ModelArtikel.Artikel"%>
<jsp:useBean id="Artikel"  class="ModelArtikel.Artikel"/>
<jsp:useBean id="ArtikelHome" class="ModelArtikel.ArtikelHome"/>
<%Artikel artikel = null;
    Artikel[] daftarProvinsi = ArtikelHome.getDaftarProvinsi();
%>

<%@page import="Model.Admin"%>
<jsp:useBean id="AdminToko2"  class="Model.AdminToko"/>
<jsp:useBean id="AdminTokoHome2" class="Model.AdminTokoHome"/>

<%
    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
        response.sendRedirect(application.getContextPath() + "/Admin/Login/LoginAdmin.jsp");
    }
%>

<%
    String emailAdmin = "" + session.getAttribute("email") + "";
    if (emailAdmin != null) {
        AdminToko2 = AdminTokoHome2.getDaftarAdminToko2ByKode(emailAdmin);
    }
%>
<%
    String kodePusatOleh2 = AdminToko2.kodePusatOleh2;
    if (kodePusatOleh2 != null) {
        PusatOleh2 = PusatOleh2Home.getDaftarPusatOleh2ByKode(kodePusatOleh2);
    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <style>
            .center {
                margin:auto;
                width:70%;
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
                                <img src="../../Gambar/<%=AdminToko2.getGambar()%>" alt="..." class="img-circle profile_img" height="60px" width="70px">
                            </div>
                            <div class="profile_info">
                                <span>Welcome,</span>
                                <h2><%=AdminToko2.getNama()%></h2>
                            </div>
                        </div>
                        <!-- /menu profile quick info -->

                        <br />

                        <!-- sidebar menu -->
                        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                            <div class="menu_section">
                                <h3>General</h3>
                                <ul class="nav side-menu">
                                    <li><a href="../Login/index2.jsp"><i class="fa fa-home"></i> Edit Data Oleh2 </a></li>
                                    <li><a href="../UpdateAdminToko/FormEditAdminToko2.jsp?kodeAdminToko=<%=AdminToko2.getKodeAdminToko()%>"><i class="fa fa-edit"></i> Edit Data Diri </a></li>
                                    <li><a href="../UpdateOleh2/FormTambahOleh22.jsp"><i class="fa fa-edit"></i> Form Tambah Oleh2 </a></li>
                                    <li><a><i class="fa fa-table"></i> Edit Data Toko<span class="fa fa-chevron-down"></span></a>
                                        <ul class="nav child_menu">
                                            <li><a href="../UpdatePusatOleh2/FormEditPusatOleh22.jsp">Edit Data Pusat Oleh-Oleh</a></li>
                                            <li><a href="../UpdateTransaksiPenjualan/EditTransaksiPenjualan2.jsp">Edit Data Transaksi Penjualan</a></li>
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
                                        <img src="../../Gambar/<%=AdminToko2.getGambar()%>" alt=""  height="40px" width="40px"><%=AdminToko2.getNama()%>
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
                                <div class="col-md-11 col-sm-12 col-xs-12">

                                    <div class="x_panel">
                                        <br>
                                        <center><font size="5">Form Edit Pusat Oleh</font></center>

                                        <div class="x_content">
                                            <br />
                                            <br>

                                            <form id="form1" data-parsley-validate class="form-horizontal form-label-left" action="../../EditPusatOleh22" method="post">

                                                <%--Tampilan form beserta input text --%>
                                                <input type="hidden" name="kodePusatOleh2" value=<%=PusatOleh2.getKodePusatOleh2()%>>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Nama </label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="text" name="nama" required="required" class="form-control col-md-7 col-xs-12" value='<%=PusatOleh2.getNama()%>'>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Alamat</label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="text" name="alamat" required="required" class="form-control col-md-7 col-xs-12" value='<%=PusatOleh2.getAlamat()%>'>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Kota
                                                    </label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="text" name="kota" required="required" class="form-control col-md-7 col-xs-12" value='<%=PusatOleh2.getKota()%>'>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Kategori Provinsi</label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <!--<input type="text" name="kategori" required="required" class="form-control col-md-7 col-xs-12">-->
                                                        <font size="3px" color="grey">
                                                        <select name="provinsi" height="10" style="height:30px;" required>
                                                            <option value="<%=PusatOleh2.getProvinsi()%>"><%=PusatOleh2.getProvinsi()%></option>
                                                            <%
                                                                for (int i = 0; i < daftarProvinsi.length; i++) {
                                                                    Artikel = daftarProvinsi[i];
                                                            %>
                                                            <option value="<%=Artikel.getProvinsi()%>"><%=Artikel.getProvinsi()%></option>

                                                            <%}%>
                                                        </select>
                                                        </font>
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">No HP Toko
                                                    </label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <input type="number" name="noHPToko" required="required" class="form-control col-md-7 col-xs-12" value='<%=PusatOleh2.getNoHPToko()%>'>
                                                    </div>
                                                </div>

                                                <div class="form-group">
                                                    <label class="control-label col-md-4 col-sm-3 col-xs-12">Gambar</label>
                                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                                        <%=PusatOleh2.getGambar()%>
                                                        <input type="file" required id="myFile" name="gambar" value="D:\ProjectPWEB\web\Gambar\<%=PusatOleh2.getGambar()%>" required>
                                                    </div>
                                                </div>

                                        </div>
                                        </form>
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-4">
                                                <button class="btn btn-primary" type="reset" form="form1">Reset</button>
                                                <button type="submit" class="btn btn-success" form="form1">Update</button>
                                                <br>
                                                <br>
                                                <br>
                                            </div>
                                            <br>
                                        </div>
                                        <br>
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

        <!-- Custom Theme Scripts -->
        <script src="../../build/js/custom.min.js"></script>

    </body>
</html>
