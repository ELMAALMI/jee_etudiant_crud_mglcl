package com.app.web_demo.servlets;

import com.app.web_demo.models.Etudiant;
import com.app.web_demo.services.EtudiantService;
import com.app.web_demo.services.imp.EtudiantServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteEtudiantServlet", value = "/delete")
public class DeleteEtudiantServlet extends HttpServlet {
    private EtudiantService etudiantServiceImp = new EtudiantServiceImp();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        Etudiant etudiant = new Etudiant();
        etudiant.setId(id);

        etudiantServiceImp.delete(etudiant);
        System.out.println(id+" id ==> "+etudiant.getId());
        response.sendRedirect("helloServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
