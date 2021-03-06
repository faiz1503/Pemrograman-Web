/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminToko;

import Model.AdminToko;
import Model.AdminTokoHome;
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
@WebServlet(name = "EditAdminToko2", urlPatterns = {"/EditAdminToko2"})
public class EditAdminToko2 extends HttpServlet {

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
            String kodeAdminToko = request.getParameter("kodeAdminToko");
            String kodePusatOleh2 = request.getParameter("kodePusatOleh2");
            String id = request.getParameter("id");
            String password = request.getParameter("password");
            String nama = request.getParameter("nama");
            String email = request.getParameter("email");
            String noHP = request.getParameter("noHP");
            String gambar = request.getParameter("gambar");
                    
            AdminToko adminToko = new AdminToko();
            adminToko.setKodeAdminToko(kodeAdminToko);
            adminToko.setKodePusatOleh2(kodePusatOleh2);
            adminToko.setId(id);
            adminToko.setPassword(password);
            adminToko.setNama(nama);
            adminToko.setEmail(email);
            adminToko.setNoHP(noHP);
            adminToko.setGambar(gambar);

            AdminTokoHome adminTokoBean = new AdminTokoHome();
            request.setAttribute("dataAdminToko", adminToko);

            if (adminTokoBean.store(adminToko) == true) {
                response.sendRedirect("AdminToko/Login/index2.jsp");
            } else {
                response.sendRedirect("AdminToko/UpdateAdminToko/FormEditAdminToko2.jsp");

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
