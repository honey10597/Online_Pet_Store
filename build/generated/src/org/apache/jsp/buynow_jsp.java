package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buynow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Arial;\n");
      out.write("  font-size: 17px;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row {\n");
      out.write("  display: -ms-flexbox; /* IE10 */\n");
      out.write("  display: flex;\n");
      out.write("  -ms-flex-wrap: wrap; /* IE10 */\n");
      out.write("  flex-wrap: wrap;\n");
      out.write("  margin: 0 -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  -ms-flex: 25%; /* IE10 */\n");
      out.write("  flex: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-50 {\n");
      out.write("  -ms-flex: 50%; /* IE10 */\n");
      out.write("  flex: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  -ms-flex: 75%; /* IE10 */\n");
      out.write("  flex: 75%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25,\n");
      out.write(".col-50,\n");
      out.write(".col-75 {\n");
      out.write("  padding: 0 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("  padding: 5px 20px 15px 20px;\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bbb{\n");
      out.write("    float: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("  margin-bottom: 10px;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon-container {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 7px 0;\n");
      out.write("  font-size: 24px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("a {\n");
      out.write("  color: #2196F3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("  border: 1px solid lightgrey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.price {\n");
      out.write("  float: right;\n");
      out.write("  color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("@media (max-width: 800px) {\n");
      out.write("  .row {\n");
      out.write("    flex-direction: column-reverse;\n");
      out.write("  }\n");
      out.write("  .col-25 {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2 align=\"center\">Place Your Order</h2>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"col-75\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <form action=\"/action_page.php\">\n");
      out.write("      \n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-50\">\n");
      out.write("            <h3>Billing Address</h3>\n");
      out.write("            <label for=\"fname\"><i class=\"fa fa-user\"></i> Full Name</label>\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"John M. Doe\">\n");
      out.write("            <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"john@example.com\">\n");
      out.write("            <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Address</label>\n");
      out.write("            <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"542 W. 15th Street\">\n");
      out.write("            <label for=\"city\"><i class=\"fa fa-institution\"></i> City</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Chandigarh\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"state\">State</label>\n");
      out.write("                <input type=\"text\" id=\"state\" name=\"state\" placeholder=\"Punjab\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"zip\">Pincode</label>\n");
      out.write("                <input type=\"text\" id=\"zip\" name=\"zip\" placeholder=\"10001\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-50\">\n");
      out.write("            <h3>Payment</h3>\n");
      out.write("            <label for=\"fname\">Accepted Cards</label>\n");
      out.write("            <div class=\"icon-container\">\n");
      out.write("              <i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-amex\" style=\"color:blue;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-mastercard\" style=\"color:red;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-discover\" style=\"color:orange;\"></i>\n");
      out.write("            </div>\n");
      out.write("            <label for=\"cname\">Name on Card</label>\n");
      out.write("            <input type=\"text\" id=\"cname\" name=\"cardname\" placeholder=\"Garru Don\">\n");
      out.write("            <label for=\"ccnum\">Credit card number</label>\n");
      out.write("            <input type=\"text\" id=\"ccnum\" name=\"cardnumber\" placeholder=\"1111-2222-3333-4444\">\n");
      out.write("            <label for=\"expmonth\">Exp Month</label>\n");
      out.write("            <input type=\"text\" id=\"expmonth\" name=\"expmonth\" placeholder=\"September\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"expyear\">Exp Year</label>\n");
      out.write("                <input type=\"text\" id=\"expyear\" name=\"expyear\" placeholder=\"2019\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"cvv\">CVV</label>\n");
      out.write("                <input type=\"text\" id=\"cvv\" name=\"cvv\" placeholder=\"352\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        <label>\n");
      out.write("          <input type=\"checkbox\" checked=\"checked\" name=\"sameadr\"> Shipping address same as billing\n");
      out.write("        </label>\n");
      out.write("        <button id=\"bbb\" type=\"button\" class=\"btn btn-warning\">Place Order</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
