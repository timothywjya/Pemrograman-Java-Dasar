<% 
    if(session.isNew()){
        response.sendRedirect("login.jsp");
    }
    else if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah User Baru</title>
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
        <h1>Tambah Berita Baru</h1><br>
        <form action="tambah_berita" method="post">
        <table cellspacing="0" class="table text-center">
            <tr>
                <td width="20%"><h5>Id Berita : </h5></td>
                <td><input type="text" name="id" placeholder="Id Berita"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Judul : </h5></td>
                <td><input type="text" name="judul" placeholder="Judul"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Tanggal : </h5></td>
                <td><input type="text" name="tanggal" placeholder="Tanggal"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Isi : </h5></td>
                <td><input type="text" name="isi" placeholder="Isi"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Editor : </h5></td>
                <td><input type="text" name="editor" placeholder="Editor"/><br></td>
            </tr>
            <tr>
                <td><input type="submit" value="Tambah" class="btn btn-dark"></td>
            </tr>
        </table>
        </form>
        <a href="index.jsp">Kembali</a>
        </div>
        </div>
    </body>
</html>