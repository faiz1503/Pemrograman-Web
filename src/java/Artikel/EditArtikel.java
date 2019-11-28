/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artikel;

import Model.Artikel;
import Model.ArtikelHome;
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
@WebServlet(name = "EditArtikel", urlPatterns = {"/EditArtikel"})
public class EditArtikel extends HttpServlet {

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
            String kodeArtikel = request.getParameter("kodeArtikel");
            String judul = request.getParameter("judul");
            String gambar = request.getParameter("gambar");
            String isi = request.getParameter("isi");
            String kategori = request.getParameter("kategori");
            String jenis = request.getParameter("jenis");

            ModelArtikel.Artikel artikel = new ModelArtikel.Artikel();
            artikel.setKodeArtikel(kodeArtikel);
            artikel.setJudul(judul);
            artikel.setGambar(gambar);
            artikel.setIsi(isi);
            artikel.setKategori(kategori);
            artikel.setJenis(jenis);

            ModelArtikel.ArtikelHome tempatWisataBean = new ModelArtikel.ArtikelHome();
            request.setAttribute("dataTempatWisata", artikel);

            if (tempatWisataBean.store(artikel) == true) {
                response.sendRedirect("Admin/UpdateArtikel/EditArtikel.jsp");
            } else {
                response.sendRedirect("Admin/UpdateArtikel/FormEditArtikel.jsp");
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
