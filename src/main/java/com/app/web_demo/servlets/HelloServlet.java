package com.app.web_demo.servlets;

import com.app.web_demo.services.EtudiantService;
import com.app.web_demo.services.imp.EtudiantServiceImp;
import sun.plugin.com.Dispatcher;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    private EtudiantService etudiantService = new EtudiantServiceImp();
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("etudiants",etudiantService.findAll());
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/etudiant.jsp");
        dispatcher.forward(request, response);

    }

    public void destroy() {
    }
}