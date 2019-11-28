/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PusatOleh2;

import Model.Nomor;
import Model.NomorHome;
import Model.PusatOleh2;
import Model.PusatOleh2Home;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DeysiFortuna
 */
@WebServlet(name = "AddPusatOleh2", urlPatterns = {"/AddPusatOleh2"})
public class AddPusatOleh2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String nama = request.getParameter("nama");
            String alamat = request.getParameter("alamat");
            String kota = request.getParameter("kota");
            String provinsi = request.getParameter("provinsi");
            String gambar = request.getParameter("gambar");
            String noHPToko = request.getParameter("noHPToko");

            Nomor nomor = new Nomor();
            NomorHome NomorHome = new NomorHome();
            Nomor[] daftarNomor = NomorHome.getDaftarNomorPusatOleh2();

            int angka = daftarNomor.length + 1;
            String kodePusatOleh2="MO"+angka;

            PusatOleh2 poleh2 = new PusatOleh2();
            poleh2.setKodePusatOleh2("PO00" + angka+"");
            poleh2.setNama(nama);
            poleh2.setAlamat(alamat);
            poleh2.setKota(kota);
            poleh2.setProvinsi(provinsi);
            poleh2.setNoHPToko(noHPToko);
            poleh2.setGambar(gambar);

            PusatOleh2Home memberBean = new PusatOleh2Home();
            request.setAttribute("dataMhs", poleh2);

            if (memberBean.create(poleh2) == true) {
                response.sendRedirect("Admin/UpdatePusatOleh2/EditPusatOleh2.jsp");
            } else {
                response.sendRedirect("Admin/UpdatePusatOleh2/FormTambahPusatOleh2.jsp");

            }
        } finally {
            out.close();
        }
    }



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
