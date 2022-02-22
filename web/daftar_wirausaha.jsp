<% 
    if(session.isNew()){
        response.sendRedirect("login.jsp");
    }
    else if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>
<%@page import="dao.WirausahaDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Wirausaha"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Wirausaha</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
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
            <h1>Daftar Wirausaha</h1><br>
        <table border="1" cellspacing="0" class="table table-bordered text-center">
            <thead class="thead-dark">
            <tr>
                <th>Id Usaha</th>
                <th>Nama Usaha</th>
                <th>Nama Pemilik</th>
                <th>Alamat</th>
                <th>Deskripsi</th>
                <th colspan="2">Operasi</th>
            </tr>
            </thead>
            <%
                List<Wirausaha> listWirausaha = new WirausahaDao().getAll();
                for(int i =0; i<listWirausaha.size(); i++){
                    %>
                    <tr>
                        <td> <%= listWirausaha.get(i).getId() %> </td>
                        <td> <%= listWirausaha.get(i).getNama_usaha() %> </td>
                        <td> <%= listWirausaha.get(i).getPemilik() %> </td>
                        <td> <%= listWirausaha.get(i).getAlamat() %> </td>
                        <td> <%= listWirausaha.get(i).getDeskripsi() %> </td>
                       
                        <td><a href ="hapus_wirausaha?id=<%= listWirausaha.get(i).getId()%>">Hapus</a></td>
                        <td><a href ="update_data_wirausaha.jsp?id=<%= i %>">Edit</a></td>
                        
                    </tr>
                    <%
                }
                %>
        </table>
        <a href ="tambah_wirausaha_baru.jsp">Tambah</a>
        </div>
        </div>
    </body>
</html>