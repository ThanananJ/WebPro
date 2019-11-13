package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/index.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Advent+Pro&display=swap\" rel=\"stylesheet\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/view/PageHeader.jsp?title=Home Page", out, false);
      out.write("\n");
      out.write("        <title>Web Pro</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"./images/bg.png\" width=\"100%\" height=\"100%\">\n");
      out.write("        <div class =\"bg\">\n");
      out.write("            <h1 style = \"color:#A0896F;font-size: 72px;\"> Search your quiz </h1>\n");
      out.write("            <form>\n");
      out.write("                <input type=\"text\" name=\"searchquiz\" id =\"search\">\n");
      out.write("                <select name =\"grade\" id=\"drop1\">\n");
      out.write("                    <option value =\"Grade 10\">Grade 10</option>\n");
      out.write("                    <option value =\"Grade 11\">Grade 11</option>\n");
      out.write("                    <option value =\"Grade 12\">Grade 12</option>\n");
      out.write("                </select>\n");
      out.write("                <select name =\"subjects\" id=\"drop2\">\n");
      out.write("                    <option value =\"Thai\">Thai</option>\n");
      out.write("                    <option value =\"Mathematics\">Mathematics</option>\n");
      out.write("                    <option value =\"Science\">Science</option>\n");
      out.write("                    <option value=\"English\">English</option>\n");
      out.write("                    <option value=\"Social\">Social</option>\n");
      out.write("                    <option value=\"Other\">Others</option>\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"./index.jsp\"><input type =\"submit\" value=\"Get Started\" id =\"startbutton\"></a>\n");
      out.write("            </form>\n");
      out.write("            <br>\n");
      out.write("            <div class =\"announce\">\n");
      out.write("                <table border=\"1\" width=\"70%\" height=\"90%\" align=\"center\" bordercolor=\"white\" cellpadding =\"9px\">\n");
      out.write("                    <tr bgcolor=\"#BA9366\" id=\"a1\">\n");
      out.write("                        <th>Announcement</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=\"#EBE4D1\">\n");
      out.write("                        <td>1</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=\"DEC7A4\">\n");
      out.write("                        <td>2</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=\"#EBE4D1\">\n");
      out.write("                        <td>3</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=\"DEC7A4\">\n");
      out.write("                        <td>4</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr id=\"a5\">\n");
      out.write("                        <td><a href=\"index.jsp\"> See more</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
