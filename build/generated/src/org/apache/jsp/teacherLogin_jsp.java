package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class teacherLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <style>\n");
      out.write("            body, html {\n");
      out.write("                height: 100%;\n");
      out.write("                width: auto\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bg {\n");
      out.write("                /* The image used */\n");
      out.write("                background-image: url(./images/loginBG.png);\n");
      out.write("\n");
      out.write("                /* Full height */\n");
      out.write("                height: 100%;\n");
      out.write("\n");
      out.write("                /* Center and scale the image nicely */\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            * {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("            /* Style the input container */\n");
      out.write("            .input-container {\n");
      out.write("                display: flex;\n");
      out.write("                width: 1000px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the input fields */\n");
      out.write("            .input-field {\n");
      out.write("                width: 400px;\n");
      out.write("                padding: 10px;\n");
      out.write("                outline: none;\n");
      out.write("                border: transparent;\n");
      out.write("                background-image: url(./images/inputbox.png);\n");
      out.write("                font-family: Advent Pro;\n");
      out.write("                font-size: 20px;\n");
      out.write("                color: white\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .text{\n");
      out.write("                font-family: Advent Pro;\n");
      out.write("                font-weight: lighter;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body class=\"bg\">\n");
      out.write("        <div style=\"text-align: right;margin: 50px 50px 0px 0px\"><img src=\"./images/logo.png\" width=\"400px\" height=\"auto\"></div>\n");
      out.write("\n");
      out.write("        <form action=\"TeacherLogin\" method=\"post\">\n");
      out.write("            <table style=\"float: right; margin: 50px 50px 0px 0px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <p class=\"text\" style=\"font-size: 30px\">Username : </p>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"input-field\" type=\"text\" placeholder=\"Teacher id\" name=\"username\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <p class=\"text\" style=\"font-size: 30px\">Password : </p>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"input-field\" type=\"password\" placeholder=\"Password\" name=\"password\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td style=\"text-align: right\">\n");
      out.write("                        <button type=\"submit\" style=\"border: 0; background: transparent;\">\n");
      out.write("                            <img src=\"./images/loginbtn.png\" width=\"90\" height=\"auto\" alt=\"submit\" />\n");
      out.write("                        </button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><p class=\"text\" style=\"text-align: right; color: red;font-size: 30px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
