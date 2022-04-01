package com.app.web_demo.servlets;

import com.app.web_demo.models.Etudiant;
import com.app.web_demo.services.EtudiantService;
import com.app.web_demo.services.imp.EtudiantServiceImp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpdateEtudiantServlet", value = "/update")
public class UpdateEtudiantServlet extends HttpServlet {
    private EtudiantService etudiantServiceImp = new EtudiantServiceImp();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
        Etudiant e = etudiantServiceImp.findOne(id);
        request.setAttribute("etudiant",e);
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/updateEtudiant.jsp");
        dispatcher.forward(request, response);
        response.sendRedirect("helloServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
