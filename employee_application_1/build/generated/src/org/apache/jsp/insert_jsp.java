package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insert Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"InsertDetail\">\n");
      out.write("            <table border=\"0\" align=\"center\">\n");
      out.write("                <tr><td>Employee_Id</td> <td><input type=\"text\" name=\"eid\" value=\"\" /></td></tr>\n");
      out.write("                <tr><td>First_Name</td> <td><input type=\"text\" name=\"fnm\" value=\"\" /></td></tr>\n");
      out.write("                <tr><td>Last_Name</td> <td><input type=\"text\" name=\"lnm\" value=\"\" /></td></tr>\n");
      out.write("                <tr><td>Mobile_No</td> <td><input type=\"text\" name=\"mno\" value=\"\" /></td></tr>\n");
      out.write("                <tr><td>Email_Id</td> <td><input type=\"text\" name=\"email\" value=\"\" /></td></tr>\n");
      out.write("                <tr><td>Company_Name</td> <td><input type=\"text\" name=\"comp\" value=\"\" /></td></tr>\n");
      out.write("                <tr><td align=\"center\"><input type=\"submit\" value=\"Insert\" name=\"insert\" /><input type=\"submit\" name=\"delete\" value=\"delete\"/><input type=\"submit\" name=\"update\" value=\"update\"</td></tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
