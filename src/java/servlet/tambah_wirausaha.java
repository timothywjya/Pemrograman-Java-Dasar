/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Koneksi;

/**
 *
 * @author daniel
 */
@WebServlet(name = "tambah_wirausaha", urlPatterns = {"/tambah_wirausaha"})
public class tambah_wirausaha extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String Id = request.getParameter("id");
            String Nama_usaha = request.getParameter("nama_usaha");
            String Pemilik = request.getParameter("pemilik");
            String Alamat = request.getParameter("alamat");
            String Deskripsi = request.getParameter("deskripsi");
            
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getKon();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into wirausaha (id,nama_usaha,pemilik,alamat,deskripsi) values ('"+Id+"','"+Nama_usaha+"','"+Pemilik+"','"+Alamat+"','"+Deskripsi+"')");
            out.println("Tambah Usaha Berhasil !");
            out.println("<br/><a href='daftar_wirausaha.jsp'>Klik untuk kembali.</a>");
        } catch (SQLException ex) {
            Logger.getLogger(tambah_user.class.getName()).log(Level.SEVERE, null, ex);
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
