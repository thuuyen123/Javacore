package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_password_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_label_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_form_modelAttribute_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_input_path_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_password_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_label_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_form_modelAttribute_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_input_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_password_path_nobody.release();
    _jspx_tagPool_spring_label_path_nobody.release();
    _jspx_tagPool_spring_form_modelAttribute_action.release();
    _jspx_tagPool_spring_input_path_nobody.release();
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <p style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        ");
      if (_jspx_meth_spring_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
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

  private boolean _jspx_meth_spring_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_spring_form_modelAttribute_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_form_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_form_0.setParent(null);
    _jspx_th_spring_form_0.setAction("auth");
    _jspx_th_spring_form_0.setModelAttribute("login");
    int[] _jspx_push_body_count_spring_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_form_0 = _jspx_th_spring_form_0.doStartTag();
      if (_jspx_eval_spring_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_spring_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_spring_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("\n");
          out.write("            <br/>\n");
          out.write("            ");
          if (_jspx_meth_spring_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_spring_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_form_0, _jspx_page_context, _jspx_push_body_count_spring_form_0))
            return true;
          out.write("\n");
          out.write("            <br/>\n");
          out.write("            \n");
          out.write("            <input type=\"submit\"/>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_spring_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_form_0.doFinally();
      _jspx_tagPool_spring_form_modelAttribute_action.reuse(_jspx_th_spring_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_spring_label_0 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_spring_label_path_nobody.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_spring_label_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_label_0.setPath("email");
    int[] _jspx_push_body_count_spring_label_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_label_0 = _jspx_th_spring_label_0.doStartTag();
      if (_jspx_th_spring_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_label_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_label_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_label_0.doFinally();
      _jspx_tagPool_spring_label_path_nobody.reuse(_jspx_th_spring_label_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_spring_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_input_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_input_0.setPath("email");
    int[] _jspx_push_body_count_spring_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_input_0 = _jspx_th_spring_input_0.doStartTag();
      if (_jspx_th_spring_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_input_0.doFinally();
      _jspx_tagPool_spring_input_path_nobody.reuse(_jspx_th_spring_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:label
    org.springframework.web.servlet.tags.form.LabelTag _jspx_th_spring_label_1 = (org.springframework.web.servlet.tags.form.LabelTag) _jspx_tagPool_spring_label_path_nobody.get(org.springframework.web.servlet.tags.form.LabelTag.class);
    _jspx_th_spring_label_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_label_1.setPath("password");
    int[] _jspx_push_body_count_spring_label_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_label_1 = _jspx_th_spring_label_1.doStartTag();
      if (_jspx_th_spring_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_label_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_label_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_label_1.doFinally();
      _jspx_tagPool_spring_label_path_nobody.reuse(_jspx_th_spring_label_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_spring_password_0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _jspx_tagPool_spring_password_path_nobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_spring_password_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_form_0);
    _jspx_th_spring_password_0.setPath("password");
    int[] _jspx_push_body_count_spring_password_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_password_0 = _jspx_th_spring_password_0.doStartTag();
      if (_jspx_th_spring_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_password_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_password_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_password_0.doFinally();
      _jspx_tagPool_spring_password_path_nobody.reuse(_jspx_th_spring_password_0);
    }
    return false;
  }
}
