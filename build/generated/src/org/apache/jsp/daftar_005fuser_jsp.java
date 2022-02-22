package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.LoginDao;
import java.util.List;
import model.Login;

public final class daftar_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Data User</title>\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link active\" href=\"index.jsp\">Desa Bejilor </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"index.jsp\">Data Berita </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"daftar_user.jsp\">Data User </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"daftar_wisata.jsp\">Data Wisata</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"daftar_wirausaha.jsp\">Data Usaha </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Logout</a>\n");
      out.write("              </li>\n");
      out.write("               \n");
      out.write("            </ul>\n");
      out.write("        </nav><br><br><br>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3\"></div>\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("        <h1>Data User</h1><br>\n");
      out.write("        <table border=\"1\" cellspacing=\"0\" class=\"table table-bordered text-center\">\n");
      out.write("            <thead class=\"thead-dark\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Username</th>\n");
      out.write("                <th>Nama</th>\n");
      out.write("                <th>No KTP</th>\n");
      out.write("                <th>Level</th>\n");
      out.write("                <th colspan=\"2\">Operasi</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("            ");

                List<Login> listLogin = new LoginDao().getAll();
                for(int i =0; i<listLogin.size(); i++){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ");
      out.print( listLogin.get(i).getUsername() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listLogin.get(i).getNama() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listLogin.get(i).getNo_ktp() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listLogin.get(i).getJenis() );
      out.write(" </td>\n");
      out.write("                        <td><a href =\"hapus_user?username=");
      out.print( listLogin.get(i).getUsername());
      out.write("\">Hapus</a></td>\n");
      out.write("                        <td><a href =\"edit_user.jsp?username=");
      out.print( listLogin.get(i).getUsername());
      out.write("\">Edit</a></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                }
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <a href =\"tambah_user_baru.jsp\">Tambah</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
