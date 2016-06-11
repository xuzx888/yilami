package org.apache.jsp.WEB_002dINF.jsp.background.resources;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/background/resources/../../common/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/resources/../../common/common-css.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/jsp/background/resources/../../common/taglib.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /WEB-INF/jsp/background/resources/../../common/taglib.jsp(10,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    ");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-top: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("\tmargin-bottom: 0px;\n");
      out.write("}\n");
      out.write(".STYLE1 {font-size: 12px}\n");
      out.write(".STYLE3 {font-size: 12px; font-weight: bold; }\n");
      out.write(".STYLE4 {\n");
      out.write("\tcolor: #03515d;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("}\n");
      out.write("A:HOVER{\n");
      out.write("\tcolor: red;\n");
      out.write("\ttext-decoration:underline;\n");
      out.write("}\n");
      out.write("A{\n");
      out.write("\tcolor: #03515d;\n");
      out.write("\ttext-decoration:NONE;\n");
      out.write("}\n");
      out.write(".listtable td{\n");
      out.write("\tvertical-align: middle;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".ttab td{\n");
      out.write("border:solid 1px #b5d6e6;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table{  \n");
      out.write("\tborder:0px;\n");
      out.write("\tborder-collapse:collapse;  \n");
      out.write("\tborder-spacing:0;  \n");
      out.write("}  \n");
      out.write("th,td{  \n");
      out.write("\tborder:0px;\n");
      out.write("\tborder-collapse:collapse;  \n");
      out.write("\tborder-spacing:0;\n");
      out.write("\tpadding:0;  \n");
      out.write("}\n");
      out.write("/* search */\n");
      out.write(".search_k { margin:5px auto; width: 98%; }\n");
      out.write("\n");
      out.write(".search { border: 1px solid #999999;}\n");
      out.write("\n");
      out.write(".search legend { width:70px; margin-left:5px; }\n");
      out.write("\n");
      out.write(".search_content { font-size: 12px; line-height: 100%; padding: 10px; }\n");
      out.write("\n");
      out.write(".select { width: 98%; text-align: right; margin: 10px auto; clear: both; }\n");
      out.write("\n");
      out.write(".input_btn_style1{ background:#ffffff url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg_x.gif) 0px 0px repeat-x; height: 23px; border: 1px solid #7F9DB9; color: #1E5494; font-size: 12px; line-height: 20px; text-align: center; cursor: pointer;}\n");
      out.write("input.sub{padding:0px 10px 0px 10px;height:28px;color:#000066;background:url(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/sub.png\");border:none;}\n");
      out.write("    .btn3_mouseout {\n");
      out.write("BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#C3DAF5); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid\n");
      out.write("}\n");
      out.write(".btn3_mouseover {\n");
      out.write("BORDER-RIGHT: #2C59AA 1px solid; PADDING-RIGHT: 2px; BORDER-TOP: #2C59AA 1px solid; PADDING-LEFT: 2px; FONT-SIZE: 12px; FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#D7E7FA); BORDER-LEFT: #2C59AA 1px solid; CURSOR: hand; COLOR: black; PADDING-TOP: 2px; BORDER-BOTTOM: #2C59AA 1px solid\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      input{font-size: 12px}\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("<br/>\n");
      out.write("<br/>  \n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/resources/add.html\" method=\"post\">\n");
      out.write("\t\t<table class=\"ttab\" height=\"100\" width=\"70%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\"\n");
      out.write("\t\t\talign=\"center\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td height=\"30\"\n");
      out.write("\t\t\t\t\t colspan=\"2\">\n");
      out.write("\t\t\t\t\t<div align=\"center\">\n");
      out.write("\t\t\t\t\t<font color=\"blue\" size=\"6\" ><b>添加资源</b></font>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\n");
      out.write("\t\t\t\t\t\t\t\t上级资源：\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t<select name=\"parentId\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1010\">顶级菜单</option>\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\n");
      out.write("\t\t\t\t\t\t\t\t资源名称：\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"name\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\n");
      out.write("\t\t\t\t\t\t\t\t资源KEY：\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"resKey\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">\n");
      out.write("\t\t\t\t\t\t\t\t资源URL：\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"resUrl\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\n");
      out.write("\t\t\t\t\t\t\t\t资源类型：\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t<input name=\"type\" type=\"radio\" value=\"0\"/>:目录　　\n");
      out.write("\t\t\t\t\t\t<input name=\"type\" type=\"radio\" value=\"1\"/>:菜单　　\n");
      out.write("\t\t\t\t\t\t<input name=\"type\" type=\"radio\" value=\"2\"/>:按扭\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\n");
      out.write("\t\t\t\t\t\t\t\t优先级：\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"level\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\t\n");
      out.write("\t\t\t\t\t<td height=\"30\"width=\"20%\" >\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\" >\n");
      out.write("\t\t\t\t\t\t\t\t资源描述：\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\"  style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"description\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" style=\"padding: 10px\">\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\n");
      out.write("\t\t\t \t\t\t\t<input type=\"submit\" value=\"　保　存　\" class=\"input_btn_style1\"/>　　　　\n");
      out.write("\t\t\t \t\t\t\t<input id=\"backBt\" type=\"button\" value=\"　返　回　\" class=\"input_btn_style1\" onclick=\"javascript:window.location.href='javascript:history.go(-1)'\"/>\n");
      out.write("\t\t \t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("</form>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/background/resources/add.jsp(36,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("key");
    // /WEB-INF/jsp/background/resources/add.jsp(36,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
