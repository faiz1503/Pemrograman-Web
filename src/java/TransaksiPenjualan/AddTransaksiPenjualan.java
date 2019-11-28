/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiPenjualan;

import Model.Nomor;
import Model.NomorHome;
import Model.Oleh2;
import Model.Oleh2Home;
import Model.TransaksiPenjualan;
import Model.TransaksiPenjualanHome;
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
@WebServlet(name = "AddTransaksiPenjualan", urlPatterns = {"/AddTransaksiPenjualan"})
public class AddTransaksiPenjualan extends HttpServlet {

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
            String kodeMember = request.getParameter("kodeMember");
            String kodeOleh2 = request.getParameter("kodeOleh2");
            int jmlBeli = Integer.parseInt(request.getParameter("jmlBeli"));
            String tglTransaksi = request.getParameter("tglTransaksi");
            String lokasiPengiriman = request.getParameter("lokasiPengiriman");
            String tglPengiriman = request.getParameter("tglPengiriman");
            
            Nomor nomor = new Nomor();
            NomorHome NomorHome = new NomorHome();
            Nomor[] daftarNomor = NomorHome.getDaftarNomorTransaksiPenjualan();
            
            int harga = jmlBeli*1;
            int angka = daftarNomor.length + 1;
            TransaksiPenjualan transaksiPenjualan = new TransaksiPenjualan();
            transaksiPenjualan.setKodeTransaksi("TP00" + angka+"");
            transaksiPenjualan.setKodeMember(kodeMember);
            transaksiPenjualan.setKodeOleh2(kodeOleh2);
            transaksiPenjualan.setJmlBeli(jmlBeli);
            transaksiPenjualan.setHarga(harga);
            transaksiPenjualan.setHarga(angka);
            transaksiPenjualan.setTglTransaksi(tglTransaksi);
            transaksiPenjualan.setLokasiPengiriman(lokasiPengiriman);
            transaksiPenjualan.setTglPengiriman(tglPengiriman);
            transaksiPenjualan.setKet("Belum Lunas");

            TransaksiPenjualanHome daftarTransaksiBean = new TransaksiPenjualanHome();
            request.setAttribute("dataTransaksi", transaksiPenjualan);

            if (daftarTransaksiBean.create(transaksiPenjualan) == true) {
                response.sendRedirect("Admin/UpdateTransaksiPenjualan/EditTransaksiPenjualan.jsp");
            } else {
                response.sendRedirect("Admin/UpdateTransaksiPenjualan/FormTambahTransaksiPenjualan.jsp");

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
