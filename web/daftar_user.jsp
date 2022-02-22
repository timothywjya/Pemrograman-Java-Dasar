<% 
    if(session.isNew()){
        response.sendRedirect("login.jsp");
    }
    else if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>
<%@page import="dao.LoginDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data User</title>
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
        <h1>Data User</h1><br>
        <table border="1" cellspacing="0" class="table table-bordered text-center">
            <thead class="thead-dark">
            <tr>
                <th>Username</th>
                <th>Nama</th>
                <th>No KTP</th>
                <th>Level</th>
                <th colspan="2">Operasi</th>
            </tr>
            </thead>
            <%
                List<Login> listLogin = new LoginDao().getAll();
                for(int i =0; i<listLogin.size(); i++){
                    %>
                    <tr>
                        <td> <%= listLogin.get(i).getUsername() %> </td>
                        <td> <%= listLogin.get(i).getNama() %> </td>
                        <td> <%= listLogin.get(i).getNo_ktp() %> </td>
                        <td> <%= listLogin.get(i).getJenis() %> </td>
                        <td><a href ="hapus_user?username=<%= listLogin.get(i).getUsername()%>">Hapus</a></td>
                        <td><a href ="update_data_user.jsp?id=<%= i %>">Edit</a></td>
                        
                    </tr>
                    <%
                }
                %>
        </table>
        <a href ="tambah_user_baru.jsp">Tambah</a>
        </div>
        </div>
    </body>
</html>