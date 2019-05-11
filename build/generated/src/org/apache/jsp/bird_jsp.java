package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bird_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             body{\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            .main{\n");
      out.write("                opacity: 1;\n");
      out.write("                align-content: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("            .d1,.d2,.d3{\n");
      out.write("                border-radius: 8px;\n");
      out.write("                padding: 100px;\n");
      out.write("                margin: 30px;\n");
      out.write("            }\n");
      out.write("            .d1{\n");
      out.write("                background-image: url(\"birds1.jpg\");\n");
      out.write("                background-size: 310px 280px;\n");
      out.write("            }\n");
      out.write("            .d2{\n");
      out.write("                \n");
      out.write("                background-image: url(\"bird2.jpg\");\n");
      out.write("                background-size: 310px 280px;\n");
      out.write("            }\n");
      out.write("            .d3{\n");
      out.write("                \n");
      out.write("                background-image: url(\"bird3.JPG\");\n");
      out.write("                background-size: 310px 280px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .d1:hover,.d2:hover,.d3:hover{\n");
      out.write("                transition-duration: 0.5s;\n");
      out.write("                transform: translate(0px, -10px);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("    button:hover{\n");
      out.write("                background-color: #537895;\n");
      out.write("                color: white;\n");
      out.write("                display: block\n");
      out.write("    }            \n");
      out.write("         button{\n");
      out.write("                border: 2px solid #50c9c3;\n");
      out.write("                background-color: white;\n");
      out.write("                color: black;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 16px;\n");
      out.write("                -webkit-transition-duration: 0.4s; \n");
      out.write("                transition-duration: 0.4s;\n");
      out.write("                cursor: pointer;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\t\t.demo{\n");
      out.write("\t\t\tdisplay: flex;\n");
      out.write("\t\t\tbackground-color: ORANGE;   \n");
      out.write("                        margin: 10px;\n");
      out.write("                        padding: 10px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.demo a{\n");
      out.write("\t\t\tcolor: #f1f1f1;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tpadding: 12px 14px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.demo a:hover{\n");
      out.write("\t\t\tbackground-color: black;  \n");
      out.write("\t\t}\n");
      out.write("                #logout{\n");
      out.write("                    \n");
      out.write("                    float:  right;\n");
      out.write("                    margin-top: 35px;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
 if(session.getAttribute("Name")!=null)
{
    
      out.write("\n");
      out.write("<div id=\"name\">\n");
      out.write("Welcome\n");
      out.write("\n");
      out.print( 
    session.getAttribute("Name")
);
      out.write('\n');
}
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("   <img src=\"logo.png\">\n");
      out.write("   \n");
      out.write("        ");

            if(session.getAttribute("Name")!=null)
            {
        
      out.write("\n");
      out.write("        <a href=\"Logout\"><button class=\"btn btn-danger\" id=\"logout\" class=\"btn btn-danger navbar-btn\">LOGOUT</button></a>\n");
      out.write("        ");

            }else{
        
      out.write("\n");
      out.write("        <a href=\"login.jsp\"><button class=\"btn btn-danger\" id=\"logout\" class=\"btn btn-danger navbar-btn\">LOGIN</button></a>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("</div>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"demo\">\n");
      out.write("\t\t<a href=\"#\">HOME</a>\n");
      out.write("\t\t<a href=\"#\">DOG ACCESSORIES</a>\n");
      out.write("\t\t<a href=\"#\">NAME YOUR DOG</a>\n");
      out.write("\t\t<a href=\"#\">ABOUT US</a>\n");
      out.write("\t\t<a href=\"#\">CONTACT US</a>\n");
      out.write("\t</div>\n");
      out.write("    \n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"d1\"><button href=\"buynow.jsp\">Buy Now</button></div>\n");
      out.write("            <div class=\"d2\"><button >Buy Now</button></div>\n");
      out.write("            <div class=\"d3\"><button >Buy Now</button></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("  \n");
      out.write("    </script>\n");
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
