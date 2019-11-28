/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Member;

import Model.Member;
import Model.MemberHome;
import Model.Nomor;
import Model.NomorHome;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DeysiFortuna
 */
@WebServlet(name = "AddMemberAction", urlPatterns = {"/AddMemberAction"})
public class AddMemberAction extends HttpServlet {

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

            String id = request.getParameter("id");
            String password = request.getParameter("password");
            String nama = request.getParameter("nama");
            String jk = request.getParameter("jk");
            String tempatLahir = request.getParameter("tempatLahir");
            String tglLahir = request.getParameter("tglLahir");
            String alamat = request.getParameter("alamat");
            String email = request.getParameter("email");
            String noHP = request.getParameter("noHP");
            String gambar = request.getParameter("gambar");
            
            String newDate=null;
            Date dtDob = new Date(tglLahir);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            

            newDate=sdf.format(dtDob);

            Nomor nomor = new Nomor();
            NomorHome NomorHome = new NomorHome();
            Nomor[] daftarNomor = NomorHome.getDaftarNomor();
            
            int angka = daftarNomor.length + 1;
            Member member = new Member();
            member.setKodeMember("M00" + angka+"");
            member.setId(id);
            member.setPassword(password);
            member.setNama(nama);
            member.setJk(jk);
            member.setTempatLahir(tempatLahir);
            member.setTglLahir(newDate);
            member.setAlamat(alamat);
            member.setEmail(email);
            member.setNoHP(noHP);
            member.setGambar(gambar);

            MemberHome memberBean = new MemberHome();
            request.setAttribute("dataMhs", member);

            if (memberBean.create(member) == true) {
                response.sendRedirect("Admin/UpdateMember/EditMember.jsp");
            } else {
                response.sendRedirect("Admin/UpdateMember/FormTambahMember.jsp");

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
