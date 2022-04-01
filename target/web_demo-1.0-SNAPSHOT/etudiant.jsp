<%@ page import="com.app.web_demo.models.Etudiant" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: EL MAALMI
  Date: 12/03/2022
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Etudiant</title>
    <link href="/open-iconic/font/css/open-iconic-foundation.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <%
        List<Etudiant> etudiants = (ArrayList<Etudiant>)request.getAttribute("etudiants");
    %>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Etudiants</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-item nav-link active" href="#">
                    Home <span class="sr-only">(current)</span></a>
                <a class="nav-item nav-link" href="#">Departement</a>
                <a class="nav-item nav-link" href="#">Coure</a>
            </div>
        </div>
    </nav>
    <div class="container mt-5">
        <a href="addEdudiant.jsp" class="btn btn-primary">Add</a>
    </div>
    <div class="container">
        <table class="table text-center">
            <thead>
            <tr>
                <th scope="col">id</th>
                <th scope="col">Nom</th>
                <th scope="col">Prenom</th>
                <th scope="col">Note</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
                <%
                    for(Etudiant etudiant:etudiants){
                %>
                <tr>
                    <th scope="row"><%= etudiant.getId()%></th>
                    <td><%= etudiant.getPrenom()%></td>
                    <td><%= etudiant.getNom()%></td>
                    <td><%= etudiant.getNote()%></td>
                    <td class="btn-group" role="group" aria-label="Basic example">
                        <a type="button" href="delete?id=<%=etudiant.getId()%>" class="btn btn-danger">
                            Delete
                        </a>
                        <a type="button" href="update?id=<%=etudiant.getId()%>" class="btn btn-warning">
                            Update
                        </a>
                    </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
