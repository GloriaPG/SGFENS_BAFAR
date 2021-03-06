/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsp.sgfens.servlet;

import com.tsp.sct.bo.SGCobranzaAbonoBO;
import com.tsp.sct.bo.UsuarioBO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ISCesarMartinez
 */
public class ServletCobranzaEdoCuentaPDF extends HttpServlet {

    private Connection conn = null;
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletOutputStream os = response.getOutputStream();
        // setting some response headers
        response.setHeader("Expires", "0");
        response.setHeader("Cache-Control",
            "must-revalidate, post-check=0, pre-check=0");
        response.setHeader("Pragma", "public");
        // setting the content type
        response.setContentType("application/pdf");
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        //Recuperamos valores de parametros
        int idPedido =-1;
        try { idPedido = Integer.parseInt( request.getParameter("idPedido")); }catch(Exception ex){}
        
        int idComprobanteFiscal=-1;
        try { idComprobanteFiscal = Integer.parseInt( request.getParameter("idComprobanteFiscal")); }catch(Exception ex){}

        SGCobranzaAbonoBO cobranzaAbonoBO = new SGCobranzaAbonoBO(this.conn);
        
        

        /**
         * attachment - since we don't want to open
         * it in the browser, but with Adobe Acrobat, and set the
         * default file name to use.
         */
        response.setHeader("Content-disposition",
                  "attachment; filename=" +
                 // fileFacturaBO.getTspFile().getNameFile().replace(".xml", "").replace(".XML", "") 
                "Pretoriano_" + new Date().getTime()
                + "_EdoCuenta.pdf" );

        /**
         * Recuperamos usuario en sesion
         */
        HttpSession session = request.getSession(true);
        UsuarioBO user = (UsuarioBO)session.getAttribute("user");
        
        try {
            baos = cobranzaAbonoBO.toPdf(user, idPedido, idComprobanteFiscal);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            // the contentlength
            response.setContentLength(baos.size());
            // write ByteArrayOutputStream to the ServletOutputStream
            baos.writeTo(os);
            os.flush();
            os.close();
            
        } finally {
            baos.close();
            //respOut.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
