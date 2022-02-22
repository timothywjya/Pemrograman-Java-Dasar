package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.WisataDao;
import java.util.List;
import model.Wisata;

public final class daftar_005fwisata_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Daftar Wisata</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Daftar Wisata</h1>\n");
      out.write("        <table border=\"1\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Id Wisata</th>\n");
      out.write("                <th>Nama</th>\n");
      out.write("                <th>Deskripsi</th>\n");
      out.write("                <th colspan=\"2\">Operasi</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                List<Wisata> listWisata = new WisataDao().getAll();
                for(int i =0; i<listWisata.size(); i++){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ");
      out.print( listWisata.get(i).getId() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listWisata.get(i).getNama() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listWisata.get(i).getDeskripsi() );
      out.write(" </td>\n");
      out.write("                    \n");
      out.write("                        <td><a href =\"hapus_wisata?id=");
      out.print( listWisata.get(i).getId() );
      out.write("\">Hapus</a></td>\n");
      out.write("                        <td><a href =\"hapus_wisata?id=");
      out.print( listWisata.get(i).getId() );
      out.write("\">Edit</a></td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                }
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <a href =\"insert_user.jsp\">Tambah</a>\n");
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
