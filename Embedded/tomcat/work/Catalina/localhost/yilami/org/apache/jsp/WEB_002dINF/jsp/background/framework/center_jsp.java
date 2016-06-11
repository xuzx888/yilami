package org.apache.jsp.WEB_002dINF.jsp.background.framework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<title>无标题文档</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-top: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("\tmargin-bottom: 0px;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<style> \n");
      out.write(".navPoint { \n");
      out.write("COLOR: white; CURSOR: hand; FONT-FAMILY: Webdings; FONT-SIZE: 9pt \n");
      out.write("} \n");
      out.write("</style> \n");
      out.write("<script>\n");
      out.write("function switchSysBar(){ \n");
      out.write("if (document.getElementById(\"frmTitle\").style.display==\"\")\n");
      out.write("{ \n");
      out.write("\tdocument.getElementById(\"img1\").src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_41_1.gif\";\n");
      out.write("\tdocument.getElementById(\"frmTitle\").style.display=\"none\" ;\n");
      out.write("} \n");
      out.write("else\n");
      out.write("{ \n");
      out.write("\tdocument.getElementById(\"img1\").src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_41.gif\";\n");
      out.write("\tdocument.getElementById(\"frmTitle\").style.display=\"\" ;\n");
      out.write("} \n");
      out.write("} \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"overflow:hidden\">\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"171\" id=frmTitle noWrap name=\"fmTitle\" align=\"center\" valign=\"top\">\n");
      out.write("\t<iframe name=\"I1\" height=\"100%\" width=\"171\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/left.html\" border=\"0\" frameborder=\"0\" scrolling=\"no\">\n");
      out.write("\t浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。</iframe>\t</td>\n");
      out.write("    <td width=\"9\" valign=\"middle\"  bgcolor=\"#0a5c8e\" onclick=\"switchSysBar()\" style=\"cursor: pointer;\"><SPAN class=navPoint \n");
      out.write("id=switchPoint title=关闭/打开左栏><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_41.gif\" name=\"img1\" width=9 height=52 id=img1></SPAN></td>\n");
      out.write("    <td align=\"center\" valign=\"top\"><table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"table-layout:fixed;\">\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"8\" style=\" line-height:8px;\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"table-layout:fixed;\">\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"14\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_24.gif\" width=\"14\" height=\"8\"></td>\n");
      out.write("            <td background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_26.gif\" style=\"line-height:8px;\">&nbsp;</td>\n");
      out.write("            <td width=\"7\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_28.gif\" width=\"7\" height=\"8\"></td>\n");
      out.write("          </tr>\n");
      out.write("        </table></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td><table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"table-layout:fixed;\">\n");
      out.write("          <tr>\n");
      out.write("            <td><iframe id=\"main\" name=\"main\" height=\"100%\" width=\"100%\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/tab.html\" border=\"0\" frameborder=\"0\" scrolling=\"no\"> 浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。</iframe></td>\n");
      out.write("            <td width=\"3\" style=\"width:3px; background:#0a5c8e;\">&nbsp;</td>\n");
      out.write("          </tr>\n");
      out.write("        </table></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("        <td height=\"12\" style=\"line-height:12px;\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"table-layout:fixed;\">\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"14\" height=\"12\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_46.gif\" width=\"14\" height=\"12\"></td>\n");
      out.write("            <td background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_48.gif\" style=\"line-height:12px;\">&nbsp;</td>\n");
      out.write("            <td width=\"7\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/main_50.gif\" width=\"7\" height=\"12\"></td>\n");
      out.write("          </tr>\n");
      out.write("        </table></td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
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
}
