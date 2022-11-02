/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gavilan.clase7922;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karen Yulied Bohorquez Roa // 20201578118
 */

public class Control extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Control</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>La Solicitud A Sido Enviada Con Exito " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        //Hacer for para mostrar los datos
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
        //processRequest(request, response);
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
        // processRequest(request, response);
        String nombres = request.getParameter("txt_nombres");
        String correo = request.getParameter("txt_email");
        String telefono = request.getParameter("txt_telefono");
        String contraseña = request.getParameter("txt_contraseña");
        PersonaDTO persona = new PersonaDTO(nombres, telefono, correo, contraseña);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Informacion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<img src=\"img/Usuarioo.gif\"align=\"left\">");
            out.println("<body background=\"Fondo.jpg\" bgcolor=\"#77A6FF\">");
            out.println("<h1 style=\"color:white\"align=center>EL MENSAJE HA SIDO ENVIADO</font>");
            out.println("<h1 align=center>"+ persona.toString() + "</h1>");
            out.println("<h1 style=\"color:black\" align=center>Esta es una respuesta desde el Servlet Control</h1>");
            out.println("<h1 align=center><a href=\"index.jsp\" class=\"dropdown-item\">Salir</a>");
            out.println("</body>");
            out.println("</html>");
        }
       System.out.println("entro a post");
        PersonaDAO dao=new PersonaDAO();
        List<PersonaDTO> lista= dao.readAll();
        for(PersonaDTO i : lista){
            System.out.println(i.toString());
        }
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
