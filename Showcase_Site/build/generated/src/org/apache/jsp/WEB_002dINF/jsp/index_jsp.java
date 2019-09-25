package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Welcome to Spring Web MVC project</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <style>\r\n");
      out.write("            .bd-placeholder-img {\r\n");
      out.write("                font-size: 1.125rem;\r\n");
      out.write("                text-anchor: middle;\r\n");
      out.write("                -webkit-user-select: none;\r\n");
      out.write("                -moz-user-select: none;\r\n");
      out.write("                -ms-user-select: none;\r\n");
      out.write("                user-select: none;\r\n");
      out.write("            }\r\n");
      out.write("            @media (min-width: 768px) {\r\n");
      out.write("                .bd-placeholder-img-lg {\r\n");
      out.write("                    font-size: 3.5rem;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            .jumbotron {\r\n");
      out.write("                padding-top: 3rem;\r\n");
      out.write("                padding-bottom: 3rem;\r\n");
      out.write("                margin-bottom: 0;\r\n");
      out.write("                background-color: #fff;\r\n");
      out.write("            }\r\n");
      out.write("            @media (min-width: 768px) {\r\n");
      out.write("                .jumbotron {\r\n");
      out.write("                    padding-top: 6rem;\r\n");
      out.write("                    padding-bottom: 6rem;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            .jumbotron p:last-child {\r\n");
      out.write("                margin-bottom: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .jumbotron-heading {\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("            }\r\n");
      out.write("            .jumbotron .container {\r\n");
      out.write("                max-width: 40rem;\r\n");
      out.write("            }\r\n");
      out.write("            footer {\r\n");
      out.write("                padding-top: 3rem;\r\n");
      out.write("                padding-bottom: 3rem;\r\n");
      out.write("            }\r\n");
      out.write("            footer p {\r\n");
      out.write("                margin-bottom: .25rem;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"collapse bg-dark\" id=\"navbarHeader\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-8 col-md-7 py-4\">\r\n");
      out.write("                        <h4 class=\"text-white\">About</h4>\r\n");
      out.write("                        <p class=\"text-muted\">Add some information about the album below, the author, or any other background context. Make it a few sentences long so folks can pick up some informative tidbits. Then, link them off to some social networking sites or contact information.</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-4 offset-md-1 py-4\">\r\n");
      out.write("                        <h4 class=\"text-white\">Contact</h4>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><a href=\"#\" class=\"text-white\">Follow on Twitter</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"text-white\">Like on Facebook</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"text-white\">Email me</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar navbar-dark bg-dark shadow-sm\">\r\n");
      out.write("            <div class=\"container d-flex justify-content-between\">\r\n");
      out.write("                <a href=\"#\" class=\"navbar-brand d-flex align-items-center\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" aria-hidden=\"true\" class=\"mr-2\" viewBox=\"0 0 24 24\" focusable=\"false\"><path d=\"M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z\"/><circle cx=\"12\" cy=\"13\" r=\"4\"/></svg>\r\n");
      out.write("                    <strong>Album</strong>\r\n");
      out.write("                </a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarHeader\" aria-controls=\"navbarHeader\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <main role=\"main\">\r\n");
      out.write("\r\n");
      out.write("        <section class=\"jumbotron text-center\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h1 class=\"jumbotron-heading\">Hello, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("                <p class=\"lead text-muted\">Something short and leading about the collection below—its contents, the creator, etc. Make it short and sweet, but not too short so folks don’t simply skip over it entirely.</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <a href=\"new-product\" class=\"btn btn-primary my-2\">Add new Product</a>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-secondary my-2\">Secondary action</a>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"album py-5 bg-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    \r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"text-muted\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <p class=\"float-right\">\r\n");
      out.write("                <a href=\"#\">Back to top</a>\r\n");
      out.write("            </p>\r\n");
      out.write("            <p>Album example is &copy; Bootstrap, but please download and customize it for yourself!</p>\r\n");
      out.write("            <p>New to Bootstrap? <a href=\"https://getbootstrap.com/\">Visit the homepage</a> or read our <a href=\"/docs/4.3/getting-started/introduction/\">getting started guide</a>.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("prod");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <div class=\"col-md-4\">\r\n");
          out.write("                        <div class=\"card mb-4 shadow-sm\">\r\n");
          out.write("                            <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\" role=\"img\" aria-label=\"Placeholder: Thumbnail\">\r\n");
          out.write("                                <title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/>\r\n");
          out.write("                                <text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text>\r\n");
          out.write("                            </svg>\r\n");
          out.write("                            <div class=\"card-body\">\r\n");
          out.write("                                <h5 class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\r\n");
          out.write("                                <p class=\"card-text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prod.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                <div class=\"d-flex justify-content-between align-items-center\">\r\n");
          out.write("                                    <div class=\"btn-group\">\r\n");
          out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
          out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <small class=\"text-muted\">9 mins</small>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    </div>    \r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
