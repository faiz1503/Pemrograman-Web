package org.apache.jsp.Admin.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Member;
import Model.AdminToko;
import Model.PusatOleh2;
import Model.TransaksiPenjualan;
import Model.Admin;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      Model.Member Member = null;
      synchronized (_jspx_page_context) {
        Member = (Model.Member) _jspx_page_context.getAttribute("Member", PageContext.PAGE_SCOPE);
        if (Member == null){
          Member = new Model.Member();
          _jspx_page_context.setAttribute("Member", Member, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      Model.MemberHome MemberHome = null;
      synchronized (_jspx_page_context) {
        MemberHome = (Model.MemberHome) _jspx_page_context.getAttribute("MemberHome", PageContext.PAGE_SCOPE);
        if (MemberHome == null){
          MemberHome = new Model.MemberHome();
          _jspx_page_context.setAttribute("MemberHome", MemberHome, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      Model.AdminToko AdminToko = null;
      synchronized (_jspx_page_context) {
        AdminToko = (Model.AdminToko) _jspx_page_context.getAttribute("AdminToko", PageContext.PAGE_SCOPE);
        if (AdminToko == null){
          AdminToko = new Model.AdminToko();
          _jspx_page_context.setAttribute("AdminToko", AdminToko, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      Model.AdminTokoHome AdminTokoHome = null;
      synchronized (_jspx_page_context) {
        AdminTokoHome = (Model.AdminTokoHome) _jspx_page_context.getAttribute("AdminTokoHome", PageContext.PAGE_SCOPE);
        if (AdminTokoHome == null){
          AdminTokoHome = new Model.AdminTokoHome();
          _jspx_page_context.setAttribute("AdminTokoHome", AdminTokoHome, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      Model.PusatOleh2 PusatOleh2 = null;
      synchronized (_jspx_page_context) {
        PusatOleh2 = (Model.PusatOleh2) _jspx_page_context.getAttribute("PusatOleh2", PageContext.PAGE_SCOPE);
        if (PusatOleh2 == null){
          PusatOleh2 = new Model.PusatOleh2();
          _jspx_page_context.setAttribute("PusatOleh2", PusatOleh2, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      Model.PusatOleh2Home PusatOleh2Home = null;
      synchronized (_jspx_page_context) {
        PusatOleh2Home = (Model.PusatOleh2Home) _jspx_page_context.getAttribute("PusatOleh2Home", PageContext.PAGE_SCOPE);
        if (PusatOleh2Home == null){
          PusatOleh2Home = new Model.PusatOleh2Home();
          _jspx_page_context.setAttribute("PusatOleh2Home", PusatOleh2Home, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      Model.TransaksiPenjualan TransaksiPenjualan = null;
      synchronized (_jspx_page_context) {
        TransaksiPenjualan = (Model.TransaksiPenjualan) _jspx_page_context.getAttribute("TransaksiPenjualan", PageContext.PAGE_SCOPE);
        if (TransaksiPenjualan == null){
          TransaksiPenjualan = new Model.TransaksiPenjualan();
          _jspx_page_context.setAttribute("TransaksiPenjualan", TransaksiPenjualan, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      Model.TransaksiPenjualanHome TransaksiPenjualanHome = null;
      synchronized (_jspx_page_context) {
        TransaksiPenjualanHome = (Model.TransaksiPenjualanHome) _jspx_page_context.getAttribute("TransaksiPenjualanHome", PageContext.PAGE_SCOPE);
        if (TransaksiPenjualanHome == null){
          TransaksiPenjualanHome = new Model.TransaksiPenjualanHome();
          _jspx_page_context.setAttribute("TransaksiPenjualanHome", TransaksiPenjualanHome, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

    Member member = null;
    Member[] daftarMember = MemberHome.getLastDaftarMember();

      out.write("\r\n");
      out.write("\r\n");
    AdminToko adminToko = null;
    AdminToko[] daftarAdminToko = AdminTokoHome.getLastDaftarAdminToko();

      out.write("\r\n");
      out.write("\r\n");
    PusatOleh2 pusatOleh2 = null;
    PusatOleh2[] daftarPusatOleh2 = PusatOleh2Home.getLastDaftarPusatOleh2();

      out.write("\r\n");
      out.write("\r\n");

    TransaksiPenjualan transaksi = null;
    TransaksiPenjualan[] daftarTransaksiPenjualan = TransaksiPenjualanHome.getLastDaftarTransaksiPenjualan();

      out.write("\r\n");
      out.write("\r\n");
      Model.Admin Admin = null;
      synchronized (_jspx_page_context) {
        Admin = (Model.Admin) _jspx_page_context.getAttribute("Admin", PageContext.PAGE_SCOPE);
        if (Admin == null){
          Admin = new Model.Admin();
          _jspx_page_context.setAttribute("Admin", Admin, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      Model.AdminHome AdminHome = null;
      synchronized (_jspx_page_context) {
        AdminHome = (Model.AdminHome) _jspx_page_context.getAttribute("AdminHome", PageContext.PAGE_SCOPE);
        if (AdminHome == null){
          AdminHome = new Model.AdminHome();
          _jspx_page_context.setAttribute("AdminHome", AdminHome, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");

    if ((session.getAttribute("email") == null) || (session.getAttribute("email") == "")) {
        response.sendRedirect(application.getContextPath() + "/Admin/Login/LoginAdmin.jsp");
    }

      out.write("\r\n");
      out.write("\r\n");

    String emailAdmin = "" + session.getAttribute("email") + "";
    if (emailAdmin != null) {
        Admin = AdminHome.getDaftarAdminByKode(emailAdmin);
    }

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../../Gambar/GoSurfSumatera24.png\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- Meta, title, CSS, favicons, etc. -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <title>GoSurfSumatera</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"../../vendors/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link href=\"../../vendors/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- NProgress -->\r\n");
      out.write("        <link href=\"../../vendors/nprogress/nprogress.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- iCheck -->\r\n");
      out.write("        <link href=\"../../vendors/iCheck/skins/flat/green.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Datatables -->\r\n");
      out.write("        <link href=\"../../vendors/datatables.net-bs/css/dataTables.bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"../../vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Theme Style -->\r\n");
      out.write("        <link href=\"../../build/css/custom.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"nav-md\">\r\n");
      out.write("        <div class=\"container body\">\r\n");
      out.write("            <div class=\"main_container\">\r\n");
      out.write("                <div class=\"col-md-3 left_col\">\r\n");
      out.write("                    <div class=\"left_col scroll-view\">\r\n");
      out.write("                        <div class=\"navbar nav_title\" style=\"border: 0;\">\r\n");
      out.write("                            <a href=\"\" class=\"site_title\">&nbsp&nbsp<img src=\"../../Gambar/GoSurfSumatera.png\" height=\"35px\"> <span>GoSurfSumatera</span></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- menu profile quick info -->\r\n");
      out.write("                        <div class=\"profile clearfix\">\r\n");
      out.write("                            <div class=\"profile_pic\">\r\n");
      out.write("                                <img src=\"../../Gambar/");
      out.print(Admin.getGambar());
      out.write("\" alt=\"...\" class=\"img-circle profile_img\" height=\"60px\" width=\"70px\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"profile_info\">\r\n");
      out.write("                                <span>Welcome,</span>\r\n");
      out.write("                                <h2>");
      out.print(Admin.getNama());
      out.write("</h2>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /menu profile quick info -->\r\n");
      out.write("\r\n");
      out.write("                        <br />\r\n");
      out.write("\r\n");
      out.write("                        <!-- sidebar menu -->\r\n");
      out.write("                        <div id=\"sidebar-menu\" class=\"main_menu_side hidden-print main_menu\">\r\n");
      out.write("                            <div class=\"menu_section\">\r\n");
      out.write("                                <h3>General</h3>\r\n");
      out.write("                                <ul class=\"nav side-menu\">\r\n");
      out.write("                                    <li><a href=\"../Login/index.jsp\"><i class=\"fa fa-home\"></i> Home </a></li>\r\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Forms <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                                        <ul class=\"nav child_menu\">\r\n");
      out.write("                                            <li><a href=\"../UpdateMember/FormTambahMember.jsp\">Form Member</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateAdminToko/FormTambahAdminToko.jsp\">Form Admin Toko</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdatePusatOleh2/FormTambahPusatOleh2.jsp\">Form Pusat Oleh2</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateOleh2/FormTambahOleh2.jsp\">Form Oleh2</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateTransaksiPenjualan/FormTambahTransaksiPenjualan.jsp\">Form Transaksi Penjualan</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a><i class=\"fa fa-table\"></i> Edit Data <span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                                        <ul class=\"nav child_menu\">\r\n");
      out.write("                                            <li><a href=\"../UpdateMember/EditMember.jsp\">Edit Data Member</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateAdminToko/EditAdminToko.jsp\">Edit Data Admin Toko</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdatePusatOleh2/EditPusatOleh2.jsp\">Edit Data Pusat Oleh-Oleh</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateOleh2/EditOleh2.jsp\">Edit Data Oleh-Oleh</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateTransaksiPenjualan/EditTransaksiPenjualan.jsp\">Edit Data Transaksi Penjualan</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li><a><i class=\"fa fa-edit\"></i> Artikel dan Komentar<span class=\"fa fa-chevron-down\"></span></a>\r\n");
      out.write("                                        <ul class=\"nav child_menu\">\r\n");
      out.write("                                            <li><a href=\"../UpdateArtikel/EditArtikel.jsp\">Artikel</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateKomentar/EditKomentar.jsp\">Komentar</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Tempat-Wisata\">Tempat Wisata</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Pakaian-Adat\">Pakaian Adat</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Makanan-Khas\">Makanan Khas</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Tarian-Tradisional\">Tarian Tradisional</a></li>\r\n");
      out.write("                                            <li><a href=\"../UpdateJenisArtikel/EditJenisArtikel.jsp?jenis=Musik-Tradisional\">Musik Tradisional</a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /sidebar menu -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- /menu footer buttons -->\r\n");
      out.write("                        <div class=\"sidebar-footer hidden-small\">\r\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Settings\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-cog\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"FullScreen\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-fullscreen\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Lock\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-eye-close\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a data-toggle=\"tooltip\" data-placement=\"top\" title=\"Logout\" href=\"../../logout.jsp\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /menu footer buttons -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- /top navigation -->\r\n");
      out.write("                <div class=\"top_nav\">\r\n");
      out.write("                    <div class=\"nav_menu\">\r\n");
      out.write("                        <nav>\r\n");
      out.write("                            <div class=\"nav toggle\">\r\n");
      out.write("                                <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <li class=\"\">\r\n");
      out.write("                                    <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                        <img src=\"../../Gambar/");
      out.print(Admin.getGambar());
      out.write("\" alt=\"\"  height=\"40px\" width=\"40px\">");
      out.print(Admin.getNama());
      out.write("\r\n");
      out.write("                                        <span class=\" fa fa-angle-down\"></span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <ul class=\"dropdown-menu dropdown-usermenu pull-right\">\r\n");
      out.write("\r\n");
      out.write("                                        <li><a href=\"../logout.jsp\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /top navigation -->\r\n");
      out.write("\r\n");
      out.write("                <!-- page content -->\r\n");
      out.write("                <div class=\"right_col\" role=\"main\">\r\n");
      out.write("                    <div class=\"\">\r\n");
      out.write("                        <div class=\"row top_tiles\">\r\n");
      out.write("\r\n");
      out.write("                            <!--Disini jumlah data di database-->\r\n");
      out.write("                            <div class=\"animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("                                <div class=\"tile-stats\">\r\n");
      out.write("                                    <div class=\"icon\"><i class=\"fa fa-caret-square-o-right\"></i></div>\r\n");
      out.write("                                    <div class=\"count\">");
      out.print(Member.getCount());
      out.write("</div>\r\n");
      out.write("                                    <h3>Member</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("                                <div class=\"tile-stats\">\r\n");
      out.write("                                    <div class=\"icon\"><i class=\"fa fa-comments-o\"></i></div>\r\n");
      out.write("                                    <div class=\"count\">");
      out.print(AdminToko.getCount());
      out.write("</div>\r\n");
      out.write("                                    <h3>Admin Toko</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("                                <div class=\"tile-stats\">\r\n");
      out.write("                                    <div class=\"icon\"><i class=\"fa fa-sort-amount-desc\"></i></div>\r\n");
      out.write("                                    <div class=\"count\">");
      out.print(PusatOleh2.getCount());
      out.write("</div>\r\n");
      out.write("                                    <h3>Pusat Oleh2</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"animated flipInY col-lg-3 col-md-3 col-sm-6 col-xs-12\">\r\n");
      out.write("                                <div class=\"tile-stats\">\r\n");
      out.write("                                    <div class=\"icon\"><i class=\"fa fa-check-square-o\"></i></div>\r\n");
      out.write("                                    <div class=\"count\">");
      out.print(TransaksiPenjualan.getCount());
      out.write("</div>\r\n");
      out.write("                                    <h3>Transaksi Penjualan</h3>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"x_panel\">\r\n");
      out.write("                                    <div class=\"x_title\">\r\n");
      out.write("                                        <h2>RECENT ACTIVITY</h2>\r\n");
      out.write("                                        <div class=\"clearfix\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"x_content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"col-md-3 col-sm-12 col-xs-12\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                <div class=\"x_title\">\r\n");
      out.write("                                                    <h2>Recent Member</h2>\r\n");
      out.write("                                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul class=\"list-unstyled top_profiles scroll-view\">\r\n");
      out.write("                                                    ");

                                                        int jml = 0;
                                                        if (daftarMember.length < 5) {
                                                            jml += daftarMember.length;
                                                        } else {
                                                            jml += 5;
                                                        }
                                                        for (int i = 0; i < jml; i++) {
                                                            Member = daftarMember[i];
                                                    
      out.write("\r\n");
      out.write("                                                    <li class=\"media event\">\r\n");
      out.write("                                                        <div class=\"right col-xs-4 text-center\">\r\n");
      out.write("                                                            <img src=\"../../Gambar/");
      out.print(Member.getGambar());
      out.write("\" alt=\"...\" class=\"img-circle img-responsive\" width=\"50px\" height=\"50px\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <a class=\"title\" href=\"#\">");
      out.print(Member.getNama());
      out.write("</a>\r\n");
      out.write("                                                            <p>");
      out.print(Member.getEmail());
      out.write(" </p>\r\n");
      out.write("                                                            <p> <small>");
      out.print(Member.getNoHP());
      out.write("</small>\r\n");
      out.write("                                                            </p>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    ");
}
      out.write("\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 col-sm-12 col-xs-12\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                <div class=\"x_title\">\r\n");
      out.write("                                                    <h2>Recent Admin Toko</h2>\r\n");
      out.write("                                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul class=\"list-unstyled top_profiles scroll-view\">\r\n");
      out.write("                                                    ");

                                                        int jml2 = 0;
                                                        if (daftarAdminToko.length < 5) {
                                                            jml2 += daftarAdminToko.length;
                                                        } else {
                                                            jml2 += 5;
                                                        }
                                                        for (int i = 0; i < jml2; i++) {
                                                            AdminToko = daftarAdminToko[i];
                                                    
      out.write("\r\n");
      out.write("                                                    <li class=\"media event\">\r\n");
      out.write("                                                        <div class=\"right col-xs-4 text-center\">\r\n");
      out.write("                                                            <img src=\"../../Gambar/");
      out.print(AdminToko.getGambar());
      out.write("\" alt=\"...\" class=\"img-circle img-responsive\" height=\"50px\" width=\"50px\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <a class=\"title\" href=\"#\">");
      out.print(AdminToko.getNama());
      out.write("</a>\r\n");
      out.write("                                                            <p>");
      out.print(AdminToko.getEmail());
      out.write(" </p>\r\n");
      out.write("                                                            <p> <small>");
      out.print(AdminToko.getNoHP());
      out.write("</small>\r\n");
      out.write("                                                            </p>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    ");
}
      out.write("\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 col-sm-12 col-xs-12\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                <div class=\"x_title\">\r\n");
      out.write("                                                    <h2>Recent Pusat Oleh-Oleh</h2>\r\n");
      out.write("                                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul class=\"list-unstyled top_profiles scroll-view\">\r\n");
      out.write("                                                    ");

                                                        int jml3 = 0;
                                                        if (daftarPusatOleh2.length < 5) {
                                                            jml3 += daftarPusatOleh2.length;
                                                        } else {
                                                            jml3 += 5;
                                                        }
                                                        for (int i = 0; i < jml3; i++) {
                                                            PusatOleh2 = daftarPusatOleh2[i];
                                                    
      out.write("\r\n");
      out.write("                                                    <li class=\"media event\">\r\n");
      out.write("                                                        <div class=\"right col-xs-4 text-center\">\r\n");
      out.write("                                                            <img src=\"../../Gambar/");
      out.print(PusatOleh2.getGambar());
      out.write("\" alt=\"...\" class=\"img-circle img-responsive\" height=\"50px\" width=\"50px\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <a class=\"title\" href=\"#\">");
      out.print(PusatOleh2.getNama());
      out.write("</a>\r\n");
      out.write("                                                            <p>");
      out.print(PusatOleh2.getAlamat());
      out.write(" </p>\r\n");
      out.write("                                                            <p> <small>");
      out.print(PusatOleh2.getProvinsi());
      out.write("</small>\r\n");
      out.write("                                                            </p>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    ");
}
      out.write("\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-md-3 col-sm-12 col-xs-12\">\r\n");
      out.write("                                            <div>\r\n");
      out.write("                                                <div class=\"x_title\">\r\n");
      out.write("                                                    <h2>Recent Transaksi Penjualan</h2>\r\n");
      out.write("                                                    <div class=\"clearfix\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <ul class=\"list-unstyled top_profiles scroll-view\">\r\n");
      out.write("                                                    ");

                                                        int jml4 = 0;
                                                        if (daftarTransaksiPenjualan.length < 5) {
                                                            jml4 += daftarTransaksiPenjualan.length;
                                                        } else {
                                                            jml4 += 5;
                                                        }
                                                        for (int i = 0; i < jml4; i++) {
                                                            TransaksiPenjualan = daftarTransaksiPenjualan[i];
                                                    
      out.write("\r\n");
      out.write("                                                    <li class=\"media event\">\r\n");
      out.write("                                                        <div class=\"right col-xs-4 text-center\">\r\n");
      out.write("                                                            <img src=\"../../Gambar/");
      out.print(TransaksiPenjualan.getGambar());
      out.write("\" alt=\"...\" class=\"img-circle img-responsive\" height=\"50px\" width=\"50px\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"media-body\">\r\n");
      out.write("                                                            <a class=\"title\" href=\"#\">");
      out.print(TransaksiPenjualan.getKodeTransaksi());
      out.write("</a>\r\n");
      out.write("                                                            <p>");
      out.print(TransaksiPenjualan.getKodeMember());
      out.write(" </p>\r\n");
      out.write("                                                            <p> <small>");
      out.print(TransaksiPenjualan.getHarga());
      out.write("<br>");
      out.print(TransaksiPenjualan.getTglTransaksi());
      out.write("</small>\r\n");
      out.write("                                                            </p>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </li>\r\n");
      out.write("                                                    ");
}
      out.write("\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- /page content -->\r\n");
      out.write("\r\n");
      out.write("                <!-- footer content -->\r\n");
      out.write("                <footer>\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <img src=\"../../Gambar/GoSurfSumatera.png\" height=\"30px\">\r\n");
      out.write("                    </center>\r\n");
      out.write("                    <div class=\"clearfix\"></div>\r\n");
      out.write("                </footer>\r\n");
      out.write("                <!-- /footer content -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"../../vendors/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <script src=\"../../vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- FastClick -->\r\n");
      out.write("        <script src=\"../../vendors/fastclick/lib/fastclick.js\"></script>\r\n");
      out.write("        <!-- NProgress -->\r\n");
      out.write("        <script src=\"../../vendors/nprogress/nprogress.js\"></script>\r\n");
      out.write("        <!-- iCheck -->\r\n");
      out.write("        <script src=\"../../vendors/iCheck/icheck.min.js\"></script>\r\n");
      out.write("        <!-- Datatables -->\r\n");
      out.write("        <script src=\"../../vendors/datatables.net/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-bs/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-buttons/js/dataTables.buttons.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-buttons/js/buttons.flash.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-buttons/js/buttons.html5.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-buttons/js/buttons.print.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-keytable/js/dataTables.keyTable.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-responsive/js/dataTables.responsive.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/datatables.net-scroller/js/dataTables.scroller.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/jszip/dist/jszip.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/pdfmake/build/pdfmake.min.js\"></script>\r\n");
      out.write("        <script src=\"../../vendors/pdfmake/build/vfs_fonts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Theme Scripts -->\r\n");
      out.write("        <script src=\"../../build/js/custom.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
