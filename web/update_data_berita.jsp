<% 
    if(session.isNew()){
        response.sendRedirect("login.jsp");
    }
    else if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>

<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="dao.BeritaDao"%>
<%@page import="model.Berita"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="util.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <%
            String ID = request.getParameter("id");
            int Id=Integer.parseInt(ID);
            String User;
             List<Berita> listBerita = new BeritaDao().getAll();
             User = listBerita.get(Id).getId();
             session.setAttribute("User",User);
         %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Data Berita</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <style> 
        input {
            width: 100%;
        }
    </style>
    <body>
        
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link active" href="index.jsp">Desa Bejilor </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="index.jsp">Data Berita </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="daftar_user.jsp">Data User </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="daftar_wisata.jsp">Data Wisata</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="daftar_wirausaha.jsp">Data Usaha </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="logout">Logout</a>
              </li>
            </ul>
        </nav><br><br><br>
        
        <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
        <h1>Edit Data Berita</h1><br>
        <form action="update_berita" method="post">
        <table cellspacing="0" class="table text-center">
            <tr>
                <td width="20%"><h5>Id Berita : </h5></td>
                <td><input type="text" name="n_id" value="<%= listBerita.get(Id).getId() %>"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Judul : </h5></td>
                <td><input type="text" name="n_judul" value="<%= listBerita.get(Id).getJudul() %>"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Tanggal : </h5></td>
                <td><input type="text" name="n_tanggal" value="<%= listBerita.get(Id).getTanggal() %>"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Isi : </h5></td>
                <td><input type="text" name="n_isi" value="<%= listBerita.get(Id).getIsi() %>"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Editor : </h5></td>
                <td><input type="text" name="n_editor" value="<%= listBerita.get(Id).getEditor() %>"/></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Update" class="btn btn-dark">
                </td>
            </tr>
        </table>
        </form>
        <a href="index.jsp">Kembali</a>
        </div>
        </div>
    </body>

