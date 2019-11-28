<%-- 
    Document   : EditPusatOleh2
    Created on : Jul 7, 2018, 5:04:14 PM
    Author     : DeysiFortuna
--%>


<%@page language="java"%>

<%@page import="Model.PusatOleh2"%>
<jsp:useBean id="PusatOleh2"  class="Model.PusatOleh2"/>
<jsp:useBean id="PusatOleh2Home" class="Model.PusatOleh2Home"/>

<%PusatOleh2 pusatOleh2 = null;
    PusatOleh2[] daftarPusatOleh2 = PusatOleh2Home.getDaftarPusatOleh2();
%>



<!DOCTYPE html>
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
                            <a href="../index.html" class="site_title">&nbsp&nbsp<img src="../../Gambar/GoSurfSumatera.png" height="35px"> <span>GoSurfSumatera</span></a>
                        </div>

                        <div class="clearfix"></div>

                        <!-- menu profile quick info -->
                        <div class="profile clearfix">
                            <div class="profile_pic">
                                <img src="../../Gambar/img.jpg" alt="..." class="img-circle profile_img">
                            </div>
                            <div class="profile_info">
                                <span>Welcome,</span>
                                <h2>Admin</h2>
                            </div>
                        </div>
                        <!-- /menu profile quick info -->

                        <br />

                        <!-- sidebar menu -->
                        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                            <div class="menu_section">
                                <h3>General</h3>
                                <ul class="nav side-menu">
                                    <li><a><a href="../../index.jsp"><i class="fa fa-home"></i> Home </a></li>
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
                                            <li><a href="../UpdateTempatWisata/EditTempatWisata.jsp">Tempat Wisata</a></li>
                                            <li><a href="../UpdatePakaianAdat/EditPakaianAdat.jsp">Pakaian Adat</a></li>
                                            <li><a href="../UpdateMakananKhas/EditMakananKhas.jsp">Makanan Khas</a></li>
                                            <li><a href="../UpdateTarianTradisional/EditTarianTradisional.jsp">Tarian Tradisional</a></li>
                                            <li><a href="../UpdateMusikTradisional/EditMusikTradisional.jsp">Musik Tradisional</a></li>
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
                            <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                            </a>
                        </div>
                        <!-- /menu footer buttons -->
                    </div>
                </div>

                <!-- top navigation -->
                <div class="top_nav">
                    <div class="nav_menu">
                        <nav>
                            <div class="nav toggle">
                                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                            </div>

                            <ul class="nav navbar-nav navbar-right">
                                <li class="">
                                    <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                        <img src="../../Gambar/img.jpg" alt="">Admin
                                        <span class=" fa fa-angle-down"></span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-usermenu pull-right">
                                       
                                        <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
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
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <font size="5">Tabel Pusat Oleh2</font>

                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">



                                    <table id="datatable-responsive" class="table table-striped table-bordered dt-responsive nowrap" cellspacing="0" width="100%">
                                        <thead>
                                            <tr>
                                                <th>No</th>
                                                <th>Kode Pusat Oleh2</th>
                                                <th>Nama</th>
                                                <th>Alamat</th>
                                                <th>Kota</th>
                                                <th>Provinsi</th>
                                                <th>Gambar</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <%
                                                for (int i = 0; i < daftarPusatOleh2.length; i++) {
                                                    PusatOleh2 = daftarPusatOleh2[i];
                                            %>


                                            <tr>
                                                <td><%=i + 1%></td>
                                                <td><%=PusatOleh2.getKodePusatOleh2()%></td>
                                                <td><%=PusatOleh2.getNama()%></td>
                                                <td><%=PusatOleh2.getAlamat()%></td>
                                                <td><%=PusatOleh2.getKota()%></td>
                                                <td><%=PusatOleh2.getProvinsi()%></td>
                                                <td><center><img src="../../Gambar/<%=PusatOleh2.getGambar()%>" width="100" height="100"></center></td>
                                                <td><center>
                                                    <a href="FormEditPusatOleh2.jsp?kodePusatOleh2=<%=PusatOleh2.getKodePusatOleh2()%>">Edit <img src="../../Gambar/Edit.png" height="20"></a> &nbsp | &nbsp
                                                    <a href="../../DeletePusatOleh2?kodePusatOleh2=<%=PusatOleh2.getKodePusatOleh2()%>">Delete<img src="../../Gambar/Delete.png" height="20"></a>
                                        </center></td>
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

