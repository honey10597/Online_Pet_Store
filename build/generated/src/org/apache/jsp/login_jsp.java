package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<style>\r\n");
      out.write("\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\tbackground-image: url(\"bodybg.jpg\");\r\n");
      out.write("\t\t\tbackground-size: 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#field_set{\r\n");
      out.write("\t\t\tborder-radius: 8px;\r\n");
      out.write("\t\t\tborder: 1px solid;\r\n");
      out.write("\t\t\tborder-color: grey;\r\n");
      out.write("\t\t\twidth: 375px;\r\n");
      out.write("\t\t\theight: 320px;\r\n");
      out.write("\t\t\tmargin: auto;\r\n");
      out.write("\t\t\tmargin-top: 55px;\r\n");
      out.write("\t\t\tbox-shadow: 25px;\r\n");
      out.write("\t\t\tbackground-color:#ffcc99;\r\n");
      out.write("\t\t\tpadding-top: 10px;\r\n");
      out.write("\t\t\tpadding-left: 70px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tinput[type=email],input[type=password]{\r\n");
      out.write("\t\t\tpadding-left: 10px;\r\n");
      out.write("\t\t\tmargin: 12px 0 18px 0;\r\n");
      out.write("\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\twidth: 290px;\r\n");
      out.write("\t\t\theight: 35px;\r\n");
      out.write("\t\t\tborder-bottom: 4px;\r\n");
      out.write("\t\t\tborder: none;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tinput[type=email]:hover,input[type=password]:hover,input[type=button]:hover{\r\n");
      out.write("\t\t\tbackground: #acd6ef;\r\n");
      out.write("            color: #262626;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#container{  \r\n");
      out.write("\t\t\tmargin: auto;\r\n");
      out.write("\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t\theight: 450px;  \r\n");
      out.write("\t\t\twidth: 700px;\r\n");
      out.write("\t\t\tborder: 10px solid grey;\r\n");
      out.write("\t\t\tborder-radius: 10px;\r\n");
      out.write("\t\t\tmargin-top: 100px;\r\n");
      out.write("\t\t\tbackground-image: url(\"bg.jpg\");\r\n");
      out.write("\t\t\tbackground-size: 700px 500px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tinput[type=submit],input[type=button]{\r\n");
      out.write("\t\t\tmargin-left: 8px;\r\n");
      out.write("\t\t    margin-top: 5px;\r\n");
      out.write("\t\t    width: 270px;\r\n");
      out.write("\t\t    height: 30px;\r\n");
      out.write("\t\t    font-size: 14px;;\r\n");
      out.write("\t\t    font-weight: bold;\r\n");
      out.write("\t\t    background-color: dodgerblue;\r\n");
      out.write("\t\t    border-radius: 30px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tinput[type=submit]:hover,input[type=button]:hover{\r\n");
      out.write("\t\t\tbackground-color:#ff4d94;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.heading{\r\n");
      out.write("\t\t\tposition: absolute;\r\n");
      out.write("\t\t\tanimation-name: anih;\r\n");
      out.write("\t\t\tanimation-duration: 2s;\r\n");
      out.write("\t\t\tanimation-fill-mode: forwards;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t@keyframes anih{\r\n");
      out.write("\t\t\t0%{\r\n");
      out.write("\t\t\t\ttop: -100px;\r\n");
      out.write("\t\t\t\tleft: 390px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t100%{\r\n");
      out.write("\t\t\t\tleft:390px;\r\n");
      out.write("         \t\t top:10px;\r\n");
      out.write("         \t\t color: #cc0000;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"heading\"><h1 align=\"center\"><font face=\"comic Sans MS\" size=\"500\">Welcome to Pet World</font></h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<fieldset id=\"field_set\">\r\n");
      out.write("\t\t\t<legend id=\"leg\"><h1 align=\"center\"><font face=\"comic Sans MS\" size=\"50\">Login</font></h1></legend>\t\r\n");
      out.write("\t\t\t<form name=\"login_form\" action=\"LoginServlet\" onsubmit=\"return myVal()\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t<div><i class=\"fa fa-envelope icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" id=\"em\" placeholder=\"email\" name=\"mail\" >\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-key icon\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" id=\"pas\" placeholder=\"password\" name=\"pass\" >\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><input type=\"submit\" value=\"Login\"></a>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"signup.jsp\"><input type=\"button\" value=\"SignUp\"></a>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\tfunction myVal(){\r\n");
      out.write("\t\tflag = true;\r\n");
      out.write("\t\tvar ele1 = document.forms[\"login_form\"][\"mail\"].value;\r\n");
      out.write("\t\tvar ele2 = document.forms[\"login_form\"][\"pass\"].value;\r\n");
      out.write("\t\tif(ele1 == \"\")\r\n");
      out.write("        {\r\n");
      out.write("        \t// alert(\"Enter email or password\");\r\n");
      out.write("            document.getElementById(\"em\").style.borderColor=\"red\";\r\n");
      out.write("            flag = false;\r\n");
      out.write("        }\r\n");
      out.write("        if(ele2 == \"\")\r\n");
      out.write("        {\r\n");
      out.write("        \t// alert(\"Enter email or password\");\r\n");
      out.write("            document.getElementById(\"pas\").style.borderColor=\"red\";\r\n");
      out.write("            flag = false;\r\n");
      out.write("        }\r\n");
      out.write("        return flag;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
