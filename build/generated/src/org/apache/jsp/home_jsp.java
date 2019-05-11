package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("\t<style>\n");
      out.write("\t\t\n");
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
      out.write("                #name{\n");
      out.write("                    float: right;\n");
      out.write("                }\n");
      out.write("                #slide{\n");
      out.write("                    height: 450px;\n");
      out.write("                    width: 97%;\n");
      out.write("                    margin: 20px;\n");
      out.write("                    border: 5px solid black;\n");
      out.write("                }\n");
      out.write("                .mySlides {\n");
      out.write("                    display:none;\n");
      out.write("                    height: 400px;\n");
      out.write("                    width: 1100px;\n");
      out.write("                }\n");
      out.write("                #shop{\n");
      out.write("                    display: flex;\n");
      out.write("                    justify-content: center;\n");
      out.write("                    align-content: center;\n");
      out.write("/*                    padding: 20px;\n");
      out.write("                    margin: 20px;*/\n");
      out.write("                    transition: transform 5s;\n");
      out.write("                }\n");
      out.write("                #shop1{\n");
      out.write("                    margin: 10px;\n");
      out.write("                    padding: 140px;\n");
      out.write("                    height: 140px;\n");
      out.write("                    width: 100px;\n");
      out.write("                    border: 2px solid black;\n");
      out.write("                    /*border-color: gray;*/\n");
      out.write("                }\n");
      out.write("                .shop_img{\n");
      out.write("                    display: flex;\n");
      out.write("                    justify-content: center;\n");
      out.write("                    align-content: center;\n");
      out.write("                    height: 300px;\n");
      out.write("                    width: 350px;\n");
      out.write("                    padding: 20px;\n");
      out.write("                    margin: 20px;\n");
      out.write("                }\n");
      out.write("                .shop_img:hover{\n");
      out.write("                    -ms-transform: scale(1.1); /* IE 9 */\n");
      out.write("                    -webkit-transform: scale(1.1); /* Safari 3-8 */\n");
      out.write("                    transform: scale(1.1); \n");
      out.write("                }\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
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
      out.write("        <a href=\"LogoutServlet\"><button class=\"btn btn-danger\" id=\"logout\" class=\"btn btn-danger navbar-btn\">LOGOUT</button></a>\n");
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
      out.write("    <div id=\"slide\">\n");
      out.write("        <div class=\"w3-content w3-section\" style=\"max-width:500px\">\n");
      out.write("            <img class=\"mySlides\" src=\"slide1.jpg\" >\n");
      out.write("            <img class=\"mySlides\" src=\"slide2.jpg\" >\n");
      out.write("            <img class=\"mySlides\" src=\"slide3.jpg\" >\n");
      out.write("            <img class=\"mySlides\" src=\"slide4.jpg\" >\n");
      out.write("            <img class=\"mySlides\" src=\"slide5.jpg\" >\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"shop\">\n");
      out.write("        <a href=\"cat.jsp\"><img class=\"shop_img\" src=\"cat1.jpg\"></a>\n");
      out.write("        <a href=\"dog.jsp\"> <img class=\"shop_img\" src=\"dog1.jpg\"></a>\n");
      out.write("        <a href=\"bird.jsp\"><img class=\"shop_img\" src=\"birds1.jpg\"></a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("  var i;\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("    x[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  myIndex++;\n");
      out.write("  if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("  x[myIndex-1].style.display = \"block\";  \n");
      out.write("  setTimeout(carousel, 2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
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
