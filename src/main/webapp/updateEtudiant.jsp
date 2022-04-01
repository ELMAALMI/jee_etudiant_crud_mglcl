<%@ page import="com.app.web_demo.models.Etudiant" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%
    Etudiant etudiant = (Etudiant) request.getAttribute("etudiant");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Ajouter d'un �tudiant</h1>
<form action="EtudiantUpdateExcServlet" method="get">
    <input type="hidden" name="id" value="<%=etudiant.getId()%>">
    <div class="form-group row">
        <label for="nom" class="col-sm-2 col-form-label">Nom</label>
        <div class="col-sm-6">
            <input type="text" name="nom" class="form-control" id="nom" placeholder="Nom" value="<%=etudiant.getNom()%>">
        </div>
    </div>
    <div class="form-group row">
        <label for="prenom" class="col-sm-2 col-form-label">Pr�nom</label>
        <div class="col-sm-6">
            <input type="text" name="prenom" class="form-control" id="prenom" placeholder="Pr�nom" value="<%=etudiant.getPrenom()%>">
        </div>
    </div>
    <div class="form-group row">
        <label for="note" class="col-sm-2 col-form-label">Note</label>
        <div class="col-sm-6">
            <input type="text" name="note" class="form-control" id="note" placeholder="Note" value="<%=etudiant.getNote()%>">
        </div>
    </div>
    <button type="submit" class="btn btn-danger mb-2">Update</button>
</form>
</body>
</html>