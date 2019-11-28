/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaksiPenjualan;

import Model.Nomor;
import Model.NomorHome;
import Model.TransaksiPenjualan;
import Model.TransaksiPenjualanHome;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DeysiFortuna
 */
@WebServlet(name = "EditTransaksiPenjualan", urlPatterns = {"/EditTransaksiPenjualan"})
public class EditTransaksiPenjualan extends HttpServlet {

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
            String kodeTransaksi = request.getParameter("kodeTransaksi");
            String kodeMember = request.getParameter("kodeMember");
            String kodeOleh2 = request.getParameter("kodeOleh2");
            int harga = Integer.parseInt(request.getParameter("harga"));
            String tglTransaksi = request.getParameter("tglTransaksi");
            String lokasiPengiriman = request.getParameter("lokasiPengiriman");
            String tglPengiriman = request.getParameter("tglPengiriman");
            String keterangan = request.getParameter("ket");
            String gambar = request.getParameter("gambar");
//            
            String newDate=null;
            Date dtDob = new Date(tglTransaksi);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            newDate=sdf.format(dtDob);
            
            String newDate2=null;
            Date dtDob2 = new Date(tglPengiriman);
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
            newDate2=sdf2.format(dtDob2);
            TransaksiPenjualan transaksiPenjualan = new TransaksiPenjualan();
            transaksiPenjualan.setKodeTransaksi(kodeTransaksi);
            transaksiPenjualan.setKodeMember(kodeMember);
            transaksiPenjualan.setKodeOleh2(kodeOleh2);
            transaksiPenjualan.setHarga(harga);
            transaksiPenjualan.setTglTransaksi(newDate);
            transaksiPenjualan.setLokasiPengiriman(lokasiPengiriman);
            transaksiPenjualan.setTglPengiriman(newDate2);
            transaksiPenjualan.setKet(keterangan);
            transaksiPenjualan.setBuktiPembayaran(gambar);
            

            TransaksiPenjualanHome daftarTransaksiBean = new TransaksiPenjualanHome();
            request.setAttribute("dataTransaksi", transaksiPenjualan);

            if (daftarTransaksiBean.store(transaksiPenjualan) == true) {
                response.sendRedirect("AdminToko/UpdateTransaksiPenjualan/EditTransaksiPenjualan2.jsp");
            } else {
                response.sendRedirect("AdminToko/UpdateTransaksiPenjualan/FormEditTransaksiPenjualan2.jsp");
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
