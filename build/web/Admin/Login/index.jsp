<%@page import="Model.Member"%>
<jsp:useBean id="Member"  class="Model.Member"/>
<jsp:useBean id="MemberHome" class="Model.MemberHome"/>

<%@page import="Model.AdminToko"%>
<jsp:useBean id="AdminToko"  class="Model.AdminToko"/>
<jsp:useBean id="AdminTokoHome" class="Model.AdminTokoHome"/>

<%@page import="Model.PusatOleh2"%>
<jsp:useBean id="PusatOleh2"  class="Model.PusatOleh2"/>
<jsp:useBean id="PusatOleh2Home" class="Model.PusatOleh2Home"/>

<%@page import="Model.TransaksiPenjualan"%>
<jsp:useBean id="TransaksiPenjualan"  class="Model.TransaksiPenjualan"/>
<jsp:useBean id="TransaksiPenjualanHome" class="Model.TransaksiPenjualanHome"/>

<%
    Member member = null;
    Member[] daftarMember = MemberHome.getLastDaftarMember();
%>

<%    AdminToko adminToko = null;
    AdminToko[] daftarAdminToko = AdminTokoHome.getLastDaftarAdminToko();
%>

<%    PusatOleh2 pusatOleh2 = null;
    PusatOleh2[] daftarPusatOleh2 = PusatOleh2Home.getLastDaftarPusatOleh2();
%>

<%
    TransaksiPenjualan transaksi = null;
    TransaksiPenjualan[] daftarTransaksiPenjualan = TransaksiPenjualanHome.getLastDaftarTransaksiPenjualan();
%>
<%@page import="Model.Admin"%>
<jsp:useBean id="Admin"  class="Model.Admin"/>
<jsp:useBean id="AdminHome" class="Model.AdminHome"/>

<%
    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
        response.sendRedirect(application.getContextPath() + "/Admin/Login/LoginAdmin.jsp");
    }
%>

<%
    String emailAdmin = "" + session.getAttribute("email") + "";
    if (emailAdmin != null) {
        Admin = AdminHome.getDaftarAdminByKode(emailAdmin);
    }
%>
<html lang="en">
    <head>
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
                        <div class="row top_tiles">

                            <!--Disini jumlah data di database-->
                            <div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
                                <div class="tile-stats">
                                    <div class="icon"><i class="fa fa-caret-square-o-right"></i></div>
                                    <div class="count"><%=Member.getCount()%></div>
                                    <h3>Member</h3>
                                </div>
                            </div>
                            <div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
                                <div class="tile-stats">
                                    <div class="icon"><i class="fa fa-comments-o"></i></div>
                                    <div class="count"><%=AdminToko.getCount()%></div>
                                    <h3>Admin Toko</h3>
                                </div>
                            </div>
                            <div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
                                <div class="tile-stats">
                                    <div class="icon"><i class="fa fa-sort-amount-desc"></i></div>
                                    <div class="count"><%=PusatOleh2.getCount()%></div>
                                    <h3>Pusat Oleh2</h3>
                                </div>
                            </div>
                            <div class="animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12">
                                <div class="tile-stats">
                                    <div class="icon"><i class="fa fa-check-square-o"></i></div>
                                    <div class="count"><%=TransaksiPenjualan.getCount()%></div>
                                    <h3>Transaksi Penjualan</h3>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>RECENT ACTIVITY</h2>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">


                                        <div class="col-md-3 col-sm-12 col-xs-12">
                                            <div>
                                                <div class="x_title">
                                                    <h2>Recent Member</h2>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <ul class="list-unstyled top_profiles scroll-view">
                                                    <%
                                                        int jml = 0;
                                                        if (daftarMember.length < 5) {
                                                            jml += daftarMember.length;
                                                        } else {
                                                            jml += 5;
                                                        }
                                                        for (int i = 0; i < jml; i++) {
                                                            Member = daftarMember[i];
                                                    %>
                                                    <li class="media event">
                                                        <div class="right col-xs-4 text-center">
                                                            <img src="../../Gambar/<%=Member.getGambar()%>" alt="..." class="img-circle img-responsive" width="50px" height="50px">
                                                        </div>
                                                        <div class="media-body">
                                                            <a class="title" href="#"><%=Member.getNama()%></a>
                                                            <p><%=Member.getEmail()%> </p>
                                                            <p> <small><%=Member.getNoHP()%></small>
                                                            </p>
                                                        </div>
                                                    </li>
                                                    <%}%>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="col-md-3 col-sm-12 col-xs-12">
                                            <div>
                                                <div class="x_title">
                                                    <h2>Recent Admin Toko</h2>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <ul class="list-unstyled top_profiles scroll-view">
                                                    <%
                                                        int jml2 = 0;
                                                        if (daftarAdminToko.length < 5) {
                                                            jml2 += daftarAdminToko.length;
                                                        } else {
                                                            jml2 += 5;
                                                        }
                                                        for (int i = 0; i < jml2; i++) {
                                                            AdminToko = daftarAdminToko[i];
                                                    %>
                                                    <li class="media event">
                                                        <div class="right col-xs-4 text-center">
                                                            <img src="../../Gambar/<%=AdminToko.getGambar()%>" alt="..." class="img-circle img-responsive" height="50px" width="50px">
                                                        </div>
                                                        <div class="media-body">
                                                            <a class="title" href="#"><%=AdminToko.getNama()%></a>
                                                            <p><%=AdminToko.getEmail()%> </p>
                                                            <p> <small><%=AdminToko.getNoHP()%></small>
                                                            </p>
                                                        </div>
                                                    </li>
                                                    <%}%>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="col-md-3 col-sm-12 col-xs-12">
                                            <div>
                                                <div class="x_title">
                                                    <h2>Recent Pusat Oleh-Oleh</h2>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <ul class="list-unstyled top_profiles scroll-view">
                                                    <%
                                                        int jml3 = 0;
                                                        if (daftarPusatOleh2.length < 5) {
                                                            jml3 += daftarPusatOleh2.length;
                                                        } else {
                                                            jml3 += 5;
                                                        }
                                                        for (int i = 0; i < jml3; i++) {
                                                            PusatOleh2 = daftarPusatOleh2[i];
                                                    %>
                                                    <li class="media event">
                                                        <div class="right col-xs-4 text-center">
                                                            <img src="../../Gambar/<%=PusatOleh2.getGambar()%>" alt="..." class="img-circle img-responsive" height="50px" width="50px">
                                                        </div>
                                                        <div class="media-body">
                                                            <a class="title" href="#"><%=PusatOleh2.getNama()%></a>
                                                            <p><%=PusatOleh2.getAlamat()%> </p>
                                                            <p> <small><%=PusatOleh2.getProvinsi()%></small>
                                                            </p>
                                                        </div>
                                                    </li>
                                                    <%}%>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="col-md-3 col-sm-12 col-xs-12">
                                            <div>
                                                <div class="x_title">
                                                    <h2>Recent Transaksi Penjualan</h2>
                                                    <div class="clearfix"></div>
                                                </div>
                                                <ul class="list-unstyled top_profiles scroll-view">
                                                    <%
                                                        int jml4 = 0;
                                                        if (daftarTransaksiPenjualan.length < 5) {
                                                            jml4 += daftarTransaksiPenjualan.length;
                                                        } else {
                                                            jml4 += 5;
                                                        }
                                                        for (int i = 0; i < jml4; i++) {
                                                            TransaksiPenjualan = daftarTransaksiPenjualan[i];
                                                    %>
                                                    <li class="media event">
                                                        <div class="right col-xs-4 text-center">
                                                            <img src="../../Gambar/<%=TransaksiPenjualan.getGambar()%>" alt="..." class="img-circle img-responsive" height="50px" width="50px">
                                                        </div>
                                                        <div class="media-body">
                                                            <a class="title" href="#"><%=TransaksiPenjualan.getKodeTransaksi()%></a>
                                                            <p><%=TransaksiPenjualan.getKodeMember()%> </p>
                                                            <p> <small><%=TransaksiPenjualan.getHarga()%><br><%=TransaksiPenjualan.getTglTransaksi()%></small>
                                                            </p>
                                                        </div>
                                                    </li>
                                                    <%}%>
                                                </ul>
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

        <!-- Custom Theme Scripts -->
        <script src="../../build/js/custom.min.js"></script>

    </body>
</html>

