package org.apache.jsp.WEB_002dINF.jsp.background.server;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/jsp/background/server/../../common/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/server/../../common/common-css.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/server/../../common/common-js.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/server/../../common/webfenye.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      // /WEB-INF/jsp/background/server/../../common/taglib.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /WEB-INF/jsp/background/server/../../common/taglib.jsp(10,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
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
      out.write('\n');
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.4.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 创建兼容 IE/FireFox 的 event 及 event 的 srcElement、fromElement、toElement 属性 -->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    if (window.addEventListener) {\n");
      out.write("        FixPrototypeForGecko();\n");
      out.write("    }\n");
      out.write("    function FixPrototypeForGecko() {\n");
      out.write("        HTMLElement.prototype.__defineGetter__(\"runtimeStyle\", element_prototype_get_runtimeStyle);\n");
      out.write("        window.constructor.prototype.__defineGetter__(\"event\", window_prototype_get_event);\n");
      out.write("        Event.prototype.__defineGetter__(\"srcElement\", event_prototype_get_srcElement);\n");
      out.write("        Event.prototype.__defineGetter__(\"fromElement\", element_prototype_get_fromElement);\n");
      out.write("        Event.prototype.__defineGetter__(\"toElement\", element_prototype_get_toElement);\n");
      out.write("    }\n");
      out.write("    function element_prototype_get_runtimeStyle() {\n");
      out.write("        return this.style;\n");
      out.write("    }\n");
      out.write("    function window_prototype_get_event() {\n");
      out.write("        return SearchEvent();\n");
      out.write("    }\n");
      out.write("    function event_prototype_get_srcElement() {\n");
      out.write("        return this.target;\n");
      out.write("    }\n");
      out.write("    function element_prototype_get_fromElement() {\n");
      out.write("        var node;\n");
      out.write("        if (this.type == \"mouseover\") node = this.relatedTarget;\n");
      out.write("        else if (this.type == \"mouseout\") node = this.target;\n");
      out.write("        if (!node) return;\n");
      out.write("        while (node.nodeType != 1) node = node.parentNode;\n");
      out.write("        return node;\n");
      out.write("    }\n");
      out.write("    function element_prototype_get_toElement() {\n");
      out.write("        var node;\n");
      out.write("        if (this.type == \"mouseout\") node = this.relatedTarget;\n");
      out.write("        else if (this.type == \"mouseover\") node = this.target;\n");
      out.write("        if (!node) return;\n");
      out.write("        while (node.nodeType != 1) node = node.parentNode;\n");
      out.write("        return node;\n");
      out.write("    }\n");
      out.write("    function SearchEvent() {\n");
      out.write("        if (document.all) return window.event;\n");
      out.write("        func = SearchEvent.caller;\n");
      out.write("        while (func != null) {\n");
      out.write("            var arg0 = func.arguments[0];\n");
      out.write("            if (arg0 instanceof Event) {\n");
      out.write("                return arg0;\n");
      out.write("            }\n");
      out.write("            func = func.caller;\n");
      out.write("        }\n");
      out.write("        return null;\n");
      out.write("    }\n");
      out.write("var  highlightcolor='#c1ebff';\n");
      out.write("var  clickcolor='#51b2f6';\n");
      out.write("function  changeto(){\n");
      out.write("source=event.srcElement;\n");
      out.write("if  (source.tagName==\"TR\"||source.tagName==\"TABLE\")\n");
      out.write("return;\n");
      out.write("while(source.tagName!=\"TD\")\n");
      out.write("source=source.parentElement;\n");
      out.write("source=source.parentElement;\n");
      out.write("cs  =  source.children;\n");
      out.write("//alert(cs.length);\n");
      out.write("if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!=\"nc\"&&cs[1].style.backgroundColor!=clickcolor)\n");
      out.write("for(i=0;i<cs.length;i++){\n");
      out.write("\tcs[i].style.backgroundColor=highlightcolor;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function  changeback(){\n");
      out.write("if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id==\"nc\")\n");
      out.write("return\n");
      out.write("if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)\n");
      out.write("//source.style.backgroundColor=originalcolor\n");
      out.write("for(i=0;i<cs.length;i++){\n");
      out.write("\tcs[i].style.backgroundColor=\"\";\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function  clickto(){\n");
      out.write("source=event.srcElement;\n");
      out.write("if  (source.tagName==\"TR\"||source.tagName==\"TABLE\")\n");
      out.write("return;\n");
      out.write("while(source.tagName!=\"TD\")\n");
      out.write("source=source.parentElement;\n");
      out.write("source=source.parentElement;\n");
      out.write("cs  =  source.children;\n");
      out.write("//alert(cs.length);\n");
      out.write("if  (cs[1].style.backgroundColor!=clickcolor&&source.id!=\"nc\")\n");
      out.write("for(i=0;i<cs.length;i++){\n");
      out.write("\tcs[i].style.backgroundColor=clickcolor;\n");
      out.write("}\n");
      out.write("else\n");
      out.write("for(i=0;i<cs.length;i++){\n");
      out.write("\tcs[i].style.backgroundColor=\"\";\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function pageNow(pageNow){\n");
      out.write("\t var fy=$(\"#fenye\").serialize(); //对表彰数据进行序列化\n");
      out.write("\t var f=$(\"#fenye\").attr(\"action\");//获取表单action的属性值\n");
      out.write("\t var pCount = parseInt(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\n");
      out.write("\tif(pageNow < 1){\n");
      out.write("\t\t\talert(\" 不 好 意 思 ， 已 经 是 第 一 页 啦  ！\");\n");
      out.write("\t\t\treturn false ;\n");
      out.write("\t\t}else if(pCount < pageNow){\n");
      out.write("\t\talert(\" 没 有 下 一 页 啦 ！\");\n");
      out.write("\t\treturn false ;\n");
      out.write("\t}else{\n");
      out.write("\t\t\twindow.location.href=f+\"?pageNow=\"+pageNow+\"&\"+fy;\n");
      out.write("\t\t};\n");
      out.write("}\n");
      out.write("//<!--\t\t################# 全选\t    取消全选      -->\n");
      out.write("\t\tfunction selectAllCheckBox()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar chose;\n");
      out.write("\t\t\t\tif(document.getElementById(\"chose\").checked){\n");
      out.write("\t\t\t\t\tchose = document.getElementById(\"chose\").checked;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(document.getElementById(\"choseAll\").checked){\n");
      out.write("\t\t\t\t\tchose = document.getElementById(\"choseAll\").checked;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tvar checkboxArray = document.getElementsByName(\"check\");\n");
      out.write("\t\t\t\tif(checkboxArray != null)\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\tfor(var i = 0; i < checkboxArray.length; i++)\n");
      out.write("\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\tcheckboxArray[i].checked = chose;\n");
      out.write("\t\t\t\t\t};\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("//点击删除时是否有勾选\n");
      out.write("function result()\n");
      out.write("\t{\n");
      out.write("\t\tvar checks = document.getElementsByName(\"check\");\n");
      out.write("\t\t\n");
      out.write("\t\tfor(var i = 0; i < checks.length; i++)\n");
      out.write("\t\t{\n");
      out.write("\t\t\tif(checks[i].checked == true)\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t};\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("function deleteAll(){\n");
      out.write("\tvar f=$(\"#fenye\").attr(\"action\");//获取表单action的属性值\n");
      out.write("\tf=f.substring(0,f.lastIndexOf(\"/\")+1);\n");
      out.write("\t\tif(result() != false)\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\" 请 选 择 你 要 删 除 的 项 ！\");\n");
      out.write("\t\t}else\n");
      out.write("\t\t{\n");
      out.write("\t\t\tif(window.confirm(\" 你 确  定 要 全 部 删 除 吗 ！删 除 后 不 可 恢 复 !\"))\n");
      out.write("\t\t\t{ \n");
      out.write("\t\t\t    document.fenye.action = f+\"deleteAll.html\";\n");
      out.write("\t\t \t\tdocument.fenye.submit();\n");
      out.write("\t\t\t};\n");
      out.write("\t\t};\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\tfunction deleteId(url){\n");
      out.write("\t\tif(window.confirm(\" 你 确  定 要 删 除 吗 ！删 除 后 不 可 恢 复 !\"))\n");
      out.write("\t\t{ \n");
      out.write("\t\t    window.location.href=url;\n");
      out.write("\t\t};\n");
      out.write("\t}\n");
      out.write("//针对重置按钮失效，清空查询条件\n");
      out.write("function clearText(){\n");
      out.write("\tvar input = document.getElementsByTagName(\"input\");\n");
      out.write("\tfor(var i=0;i<input.length;i++){\n");
      out.write("\t\tif(input[i].type==\"text\" || input[i].type==\"password\"){\n");
      out.write("\t\t\tinput[i].value=\"\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/fenyecss.css\" />\n");
      out.write("</head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("<form id=\"fenye\" name=\"fenye\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/serverInfo/query.html\" method=\"post\">\n");
      out.write("<table width=\"100%\">\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"30\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_05.gif\"><table width=\"100%\">\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"12\" height=\"30\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_03.gif\" width=\"12\" height=\"30\" /></td>\n");
      out.write("        <td><table width=\"100%\">\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"46%\" valign=\"middle\"><table width=\"100%\">\n");
      out.write("              <tr>\n");
      out.write("                <td width=\"5%\"><div align=\"center\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tb.gif\" width=\"16\" height=\"16\" /></div></td>\n");
      out.write("                <td width=\"95%\" class=\"STYLE1\"><span class=\"STYLE3\">你当前的位置</span>：系统管理-视频留言列表</td>\n");
      out.write("              </tr>\n");
      out.write("            </table></td>\n");
      out.write("            <td width=\"54%\"><table align=\"right\" >\n");
      out.write("              <tr>\n");
      out.write("                <td width=\"60\"><table width=\"87%\" >\n");
      out.write("                  <tr>\n");
      out.write("                    <td class=\"STYLE1\"><div align=\"center\">\n");
      out.write("                      <input type=\"checkbox\" name=\"checkbox11\" id=\"choseAll\" onclick=\"selectAllCheckBox()\" />\n");
      out.write("                    </div></td>\n");
      out.write("                    <td class=\"STYLE4\">全选</td>\n");
      out.write("                  </tr>\n");
      out.write("                </table></td>\n");
      out.write("                <td width=\"52\"><table width=\"88%\">\n");
      out.write("                  <tr>\n");
      out.write("                    <td class=\"STYLE1\"><div align=\"center\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/11.gif\" width=\"14\" height=\"14\" /></div></td>\n");
      out.write("                    <td class=\"STYLE4\">\n");
      out.write("                    <a href=\"javascript:void(0);\"  onclick=\"return deleteAll()\">\n");
      out.write("                    \t删除\n");
      out.write("                    </a>\n");
      out.write("                    \t</td>\n");
      out.write("                  </tr>\n");
      out.write("                </table></td>\n");
      out.write("                <td width=\"60\"><table width=\"90%\">\n");
      out.write("                  <tr>\n");
      out.write("                    <td class=\"STYLE1\"><div align=\"center\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/22.gif\" width=\"14\" height=\"14\" /></div></td>\n");
      out.write("                    <td class=\"STYLE1\"><div align=\"center\">新增</div></td>\n");
      out.write("                  </tr>\n");
      out.write("                </table></td>\n");
      out.write("              </tr>\n");
      out.write("            </table></td>\n");
      out.write("          </tr>\n");
      out.write("        </table></td>\n");
      out.write("        <td width=\"16\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_07.gif\" width=\"16\" height=\"30\" /></td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("  <td align=\"center\">\n");
      out.write("  <!-- 这里的表单 name 必须是fenye -->\n");
      out.write("  \t<div class=\"search_k\" align=\"left\">\n");
      out.write("\t\t<fieldset class=\"search\"　style=\"border-bottom-color: #FF0099\">\n");
      out.write("\t\t\t<legend><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/search_btn.gif\" align=\"middle\"/>&nbsp;<span class=\"STYLE1\" style=\"color: blue;\">高级查找</span></legend>\n");
      out.write("\t\t\t<div class=\"search_content\">\n");
      out.write("\t\t\t\temail：<input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"height: 20px\"/>　　\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"开始查询\" class=\"input_btn_style1\"/>&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"重置\" class=\"input_btn_style1\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</fieldset>\n");
      out.write("\t</div>\n");
      out.write("  </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><table class=\"listtable\" width=\"100%\">\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"8\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_12.gif\">&nbsp;</td>\n");
      out.write("        <td><table class=\"ttab\" width=\"100%\" cellspacing=\"1\" onmouseover=\"changeto()\"  onmouseout=\"changeback()\">\n");
      out.write("          <tr>\n");
      out.write("            <td width=\"8%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">当前cpu使用率</span></td>\n");
      out.write("            <td width=\"8%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">预设cpu使用率</span></td>\n");
      out.write("            <td width=\"8%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">当前Jvm使用率</span></td>\n");
      out.write("            <td width=\"8%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">预设Jvm使用率</span></td>\n");
      out.write("            <td width=\"8%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">当前内存使用率</span></td>\n");
      out.write("            <td width=\"8%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">预设内存使用率</span></td>\n");
      out.write("            <td width=\"10%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">超出预设发送邮件</span></td>\n");
      out.write("            <td width=\"10%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">发送时间</span></td>\n");
      out.write("            <td width=\"14%\" height=\"22\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/bg.gif\" ><span class=\"STYLE1\">备注</span></td>\n");
      out.write("          </tr>\n");
      out.write("          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </table></td>\n");
      out.write("        <td width=\"8\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_15.gif\">&nbsp;</td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("  </tr>\n");
      out.write("\t  <tr>\n");
      out.write("\t    <td height=\"35\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_19.gif\">");
      out.write("\n");
      out.write("\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("      <tr>\n");
      out.write("        <td width=\"12\" height=\"35\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_18.gif\" width=\"12\" height=\"35\" /></td>\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("          <tr>\n");
      out.write("            <td class=\"STYLE4\">&nbsp;&nbsp;总记录数:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.rowCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条 |每页显示:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条 | 总页数:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("页</td>\n");
      out.write("            <td><table border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                  <td width=\"40\" class=\"STYLE4\">\n");
      out.write("                  <a href=\"#\" onclick=\"pageNow('1');\">\n");
      out.write("                  \t首页\n");
      out.write("                  </a>\n");
      out.write("                  </td>\n");
      out.write("                  <td width=\"45\" class=\"STYLE4\">\n");
      out.write("                  <a href=\"#\" onclick=\"return pageNow('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow - 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\n");
      out.write("                  \t上一页\n");
      out.write("                  </a>\n");
      out.write("                  </td>\n");
      out.write("                  <td align=\"center\">\n");
      out.write("                  ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("&nbsp;\n");
      out.write("                  </td>\n");
      out.write("                  <td width=\"45\" class=\"STYLE4\">\n");
      out.write("                  <a href=\"#\" onclick=\"pageNow('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\n");
      out.write("                  \t下一页\n");
      out.write("                  </a>\n");
      out.write("                  </td>\n");
      out.write("                  <td width=\"40\" class=\"STYLE4\">\n");
      out.write("                  <a href=\"#\" onclick=\"pageNow('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\">\n");
      out.write("                 \t尾页\n");
      out.write("                  </a>\n");
      out.write("                  </td>\n");
      out.write("                </tr>\n");
      out.write("            </table></td>\n");
      out.write("          </tr>\n");
      out.write("        </table></td>\n");
      out.write("        <td width=\"16\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/tab_20.gif\" width=\"16\" height=\"35\" /></td>\n");
      out.write("      </tr>\n");
      out.write("    </table>");
      out.write("\n");
      out.write("\t    </td>\n");
      out.write("\t  </tr>\n");
      out.write("    </table>\n");
      out.write("   </form>\n");
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
    // /WEB-INF/jsp/background/server/list.jsp(92,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("key");
    // /WEB-INF/jsp/background/server/list.jsp(92,10) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.records}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("          <tr>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.cpuUsage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("%</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.setCpuUsage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("%</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.jvmUsage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("%</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.setJvmUsage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("%</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.ramUsage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("%</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.setRamUsage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("%</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.stringTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\n");
          out.write("            <td height=\"20\" ><span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key.mark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span></td>\n");
          out.write("          </tr>\n");
          out.write("          ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/background/server/../../common/webfenye.jsp(22,18) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setBegin(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageindex.startindex}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
    // /WEB-INF/jsp/background/server/../../common/webfenye.jsp(22,18) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageindex.endindex}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
    // /WEB-INF/jsp/background/server/../../common/webfenye.jsp(22,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("key");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/background/server/../../common/webfenye.jsp(23,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow==key}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t&nbsp;<span class=\"current\" style=\"color: red;font-size: 20px;\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/background/server/../../common/webfenye.jsp(26,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageView.pageNow!=key}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t&nbsp;<a href=\"#\" onclick=\"pageNow('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
