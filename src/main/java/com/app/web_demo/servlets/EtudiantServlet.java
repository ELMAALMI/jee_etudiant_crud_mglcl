package com.app.web_demo.servlets;

import com.app.web_demo.models.Etudiant;
import com.app.web_demo.services.EtudiantService;
import com.app.web_demo.services.imp.EtudiantServiceImp;
import com.sun.istack.internal.NotNull;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EtudiantServlet", value = "/etudiant")
public class EtudiantServlet extends HttpServlet {
    EtudiantService etudiantService = new EtudiantServiceImp();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(request.getParameter("nom"));
        etudiant.setPrenom(request.getParameter("nom"));
        etudiant.setNote(Double.parseDouble(request.getParameter("note")));
        etudiantService.save(etudiant);
        response.sendRedirect("/");
    }
}
