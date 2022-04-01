package com.app.web_demo.servlets;

import com.app.web_demo.models.Etudiant;
import com.app.web_demo.services.EtudiantService;
import com.app.web_demo.services.imp.EtudiantServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EtudiantUpdateExcServlet", value = "/EtudiantUpdateExcServlet")
public class EtudiantUpdateExcServlet extends HttpServlet {
    private EtudiantService etudiantServiceImp = new EtudiantServiceImp();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(request.getParameter("nom"));
        etudiant.setPrenom(request.getParameter("nom"));
        etudiant.setNote(Double.parseDouble(request.getParameter("note")));
        etudiant.setId(id);
        etudiantServiceImp.update(etudiant);
        response.sendRedirect("helloServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
