<% 
    if(!session.isNew()){
        if(session.getAttribute("username") != null){
            response.sendRedirect("index.jsp");
        }
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
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
        
       <br><br><br>
        
        <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
        <h1>Login</h1><br>
        <form action="proseslogin" method="post">
        <table cellspacing="0" class="table text-center">
            <tr>
                <td width="20%"><h5>Username : </h5></td>
                <td><input type="text" name="username" placeholder="Username"/></td>
            </tr>
            <tr>
                <td width="20%"><h5>Password : </h5></td>
                <td><input type="password" name="password" placeholder="Password"/></td>
            </tr>
                <td><input type="submit" value="Submit" class="btn btn-dark"></td>
            </tr>
        </table>
        </form>
        </div>
        </div>
    </body>
</html>