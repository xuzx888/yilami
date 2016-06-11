package org.apache.jsp.WEB_002dINF.jsp.background.resources;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class permissioUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/background/resources/../../common/common-css.jsp");
  }

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
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>分配权限</title>\n");
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
      out.write("     <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery_1_7_2_min.js\" type=\"text/javascript\"></script>\n");
      out.write("     <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/ligerUI/base.js\" type=\"text/javascript\"></script>\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/ligerUI/ligerui-tree.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/ligerUI/ligerTree.js\" type=\"text/javascript\"></script>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("      \tvar tree;\n");
      out.write("        var manager=null;\n");
      out.write("        \n");
      out.write("        $(function ()\n");
      out.write("        {\n");
      out.write("           \n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("            tree=$(\"#tree1\").ligerTree({ \n");
      out.write("            \tdata:data, \n");
      out.write("                textFieldName: 'fname', \n");
      out.write("                attribute: ['fid', 'fname', 'pfid'],  \n");
      out.write("                idFieldName :'fid',\n");
      out.write("                parentIDFieldName :'pfid',\n");
      out.write("                checkbox: true,\n");
      out.write("                onSelect: onSelect\n");
      out.write("\n");
      out.write("            });\n");
      out.write("            manager = $(\"#tree1\").ligerGetTreeManager();\n");
      out.write("        });\n");
      out.write("        function onSelect(){};\n");
      out.write("        function getfun() //这里的异步加载逻辑取决于你的数据库设计，把选中节点的id传回去，传回子节点json然后加载  \n");
      out.write("        {\n");
      out.write(" \t\t\tvar fids=\"\";\n");
      out.write(" \t\t\tvar notes = manager.getChecked();\n");
      out.write("             for (var i = 0; i < notes.length; i++)\n");
      out.write("             {\n");
      out.write("             \tfids +=notes[i].data.fid+\",\";\n");
      out.write("             \tif(notes[i].data.pfid != \"\" && notes[i].data.pfid != \"null\"){\n");
      out.write("             \t\tfids +=notes[i].data.pfid+\",\";\n");
      out.write("             \t};\n");
      out.write("             }\n");
      out.write("             if(fids == \"\"){\n");
      out.write("                 alert(\"还没有分配权限！！\");\n");
      out.write("                 return;\n");
      out.write("             }\n");
      out.write("             if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" != \"\"){\n");
      out.write("            \t $.ajax({\n");
      out.write("               \t\tasync:false, //请勿改成异步，下面有些程序依赖此请数据\n");
      out.write("               \t\ttype : \"POST\",\n");
      out.write("               \t\tdata:{roleId:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",rescId:fids},\n");
      out.write("               \t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/resources/saveRoleRescours.html\",\n");
      out.write("               \t\tdataType:'json',\n");
      out.write("               \t\tsuccess: function(json){\n");
      out.write("               \t\t\tif(json == \"1000\"){\n");
      out.write("     \t\t\t\t\t\talert(\"分配成功,必须重新登录才生效！！\");\n");
      out.write("     \t\t\t\t\t\twindow.close();\n");
      out.write("                       \t}else if(json == \"1001\"){\n");
      out.write("                       \t\talert(\"分配失败！！\");\n");
      out.write("                         };\n");
      out.write("                \t\t}\n");
      out.write("               \t});\n");
      out.write("      \t\t\t// window.location=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/function/addRoleFun?roleId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&functionId=\"+fids;\n");
      out.write("             }else{\n");
      out.write("\t\t\t\talert(\"该用户还没有分配角色或用户的角色被删除了，请重新分配角色！！\");\n");
      out.write("             }\n");
      out.write("        }\n");
      out.write("        $(function() {\n");
      out.write("        \t$.ajaxSetup ({\n");
      out.write("                cache: false //关闭AJAX相应的缓存\n");
      out.write("             });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body style=\"padding:10px\">   \n");
      out.write("    <div style=\"width:300px; height:300px; margin:5px; float:left; border:1px solid #ccc; overflow:auto;  \">\n");
      out.write("    <ul id=\"tree1\"></ul>\n");
      out.write("    </div> \n");
      out.write(" \n");
      out.write("     <div align=\"center\">\n");
      out.write("    <input type=\"button\" class=\"input_btn_style1\" name=\"btnSave\" value=\"　保　存　\" onclick=\"getfun();\"/>　　\n");
      out.write("    <input id=\"backBt\" type=\"button\" value=\"　关　闭　\" class=\"input_btn_style1\" onclick=\"javascript:window.close();\"/>\n");
      out.write("    </div>\n");
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
