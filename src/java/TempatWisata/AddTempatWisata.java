/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TempatWisata;

import Model.Nomor;
import Model.NomorHome;
import Model.PusatOleh2;
import Model.PusatOleh2Home;
import ModelArtikel.TempatWisata;
import ModelArtikel.TempatWisataHome;
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
@WebServlet(name = "AddTempatWisata", urlPatterns = {"/AddTempatWisata"})
public class AddTempatWisata extends HttpServlet {

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
            String judul = request.getParameter("judul");
            String gambar = request.getParameter("gambar");
            String isi = request.getParameter("isi");
            String kategori = request.getParameter("kategori");

            Nomor nomor = new Nomor();
            NomorHome NomorHome = new NomorHome();
            Nomor[] daftarNomor = NomorHome.getDaftarNomorTempatWisata();

            int angka = daftarNomor.length + 1;

            TempatWisata tempatWisata = new TempatWisata();
            tempatWisata.setKodeTempatWisata("TWO00" + angka+"");
            tempatWisata.setJudul(judul);
            tempatWisata.setGambar(gambar);
            tempatWisata.setIsi(isi);
            tempatWisata.setKategori(kategori);

            TempatWisataHome tempatWisataBean = new TempatWisataHome();
            request.setAttribute("dataMhs", tempatWisata);

            if (tempatWisataBean.create(tempatWisata) == true) {
                response.sendRedirect("Admin/UpdateTempatWisata/EditTempatWisata.jsp");
            } else {
                response.sendRedirect("Admin/UpdateTempatWisata/FormTambahTempatWisata.jsp");

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
