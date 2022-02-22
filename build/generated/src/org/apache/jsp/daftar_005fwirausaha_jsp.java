package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.WirausahaDao;
import java.util.List;
import model.Wirausaha;

public final class daftar_005fwirausaha_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Daftar Wirausaha</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Daftar Wirausaha</h1>\n");
      out.write("        <table border=\"1\" cellspacing=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Id Usaha</th>\n");
      out.write("                <th>Nama Usaha</th>\n");
      out.write("                <th>Nama Pemilik</th>\n");
      out.write("                <th>Alamat</th>\n");
      out.write("                <th>Deskripsi</th>\n");
      out.write("                <th colspan=\"2\">Operasi</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                List<Wirausaha> listWirausaha = new WirausahaDao().getAll();
                for(int i =0; i<listWirausaha.size(); i++){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ");
      out.print( listWirausaha.get(i).getId() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listWirausaha.get(i).getNama_usaha() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listWirausaha.get(i).getPemilik() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listWirausaha.get(i).getAlamat() );
      out.write(" </td>\n");
      out.write("                        <td> ");
      out.print( listWirausaha.get(i).getDeskripsi() );
      out.write(" </td>\n");
      out.write("                       \n");
      out.write("                        <td><a href =\"hapus_wirausaha?id=");
      out.print( listWirausaha.get(i).getId());
      out.write("\">Hapus</a></td>\n");
      out.write("                        <td><a href =\"hapus_wirausaha?id=");
      out.print( listWirausaha.get(i).getId());
      out.write("\">Edit</a></td>\n");
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
