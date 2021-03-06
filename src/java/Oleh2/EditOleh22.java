/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oleh2;

import Model.Oleh2;
import Model.Oleh2Home;
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
@WebServlet(name = "EditOleh22", urlPatterns = {"/EditOleh22"})
public class EditOleh22 extends HttpServlet {

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
            String kodeOleh2 = request.getParameter("kodeOleh2");
            String kodePusatOleh2 = request.getParameter("kodePusatOleh2");
            String nama = request.getParameter("nama");
            int harga = Integer.parseInt(request.getParameter("harga"));
            String gambar = request.getParameter("gambar");
            
            Oleh2 oleh2 = new Oleh2();
            oleh2.setKodeOleh2(kodeOleh2);
            oleh2.setKodePusatOleh2(kodePusatOleh2);
            oleh2.setNama(nama);
            oleh2.setHarga(harga);
            oleh2.setGambar(gambar);

            Oleh2Home oleh2Bean = new Oleh2Home();
            request.setAttribute("dataOleh2", oleh2);

            if (oleh2Bean.store(oleh2) == true) {
                response.sendRedirect("AdminToko/Login/index2.jsp");
            } else {
                response.sendRedirect("AdminToko/UpdateOleh2/FormEditOleh22.jsp");

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
