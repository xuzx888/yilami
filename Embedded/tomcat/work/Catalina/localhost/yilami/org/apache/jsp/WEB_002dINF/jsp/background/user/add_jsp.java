package org.apache.jsp.WEB_002dINF.jsp.background.user;

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
    _jspx_dependants.add("/WEB-INF/jsp/background/user/../../common/taglib.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/background/user/../../common/common-css.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      // /WEB-INF/jsp/background/user/../../common/taglib.jsp(10,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /WEB-INF/jsp/background/user/../../common/taglib.jsp(10,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div style=\"height: 100%;overflow-y: auto;\">\n");
      out.write("\t\t<br /> <br />\n");
      out.write("\t\t<form\n");
      out.write("\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/user/add.html\"\n");
      out.write("\t\t\tmethod=\"post\">\n");
      out.write("\t\t\t<table class=\"ttab\" height=\"100\" width=\"85%\" border=\"0\"\n");
      out.write("\t\t\t\tcellpadding=\"0\" cellspacing=\"1\" align=\"center\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" colspan=\"4\">\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t<font color=\"blue\" size=\"8\"><b>添加信息</b>\n");
      out.write("\t\t\t\t\t\t\t</font>\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">用户名：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userName\" />\n");
      out.write("\t\t\t\t\t\t\t*用户登录的名称\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">开户所在省：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"province\" />\n");
      out.write("\t\t\t\t\t\t\t*客户结算账户开户行所在省级行政区\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">密码：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userPassword\"\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"password\" />\n");
      out.write("\t\t\t\t\t\t\t\t*用户登录的密码\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">开户所在市：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"city\" />\n");
      out.write("\t\t\t\t\t\t\t*客户结算账户开户行所在市级行政区\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">昵称：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userNickname\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">银行名称：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"bankName\" />\n");
      out.write("\t\t\t\t\t\t\t*客户结算的银行名称，如：中国银行\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">真实姓名：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userRealname\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">所属支行或分行：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"subbranchBank\" />\n");
      out.write("\t\t\t\t\t\t\t*如：北京分行或三元桥支行\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">年龄：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userAge\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">银行户名：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"bankAccountName\" />\n");
      out.write("\t\t\t\t\t\t\t*客户结算的银行账户户名\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">性别：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userSex\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">银行账号：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"bankAccount\" />\n");
      out.write("\t\t\t\t\t\t\t*客户结算的银行账户账号\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">地址：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userAddress\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">账号类型：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"accountType\" value=\"个人账号\" checked=\"checked\"/>：个人账号\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"accountType\" value=\"企业账号\"/>：企业账号\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">电话：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userPhone\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">是否付费：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"pay\" value=\"是\" checked=\"checked\"/>：是\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"pay\" value=\"否\"/>：否\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">邮箱：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userMail\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">备注：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"mark\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">QQ：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"userQQ\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">用户状态：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"待审核\" checked=\"checked\"/>：待审核\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"status\" value=\"审核通过\"/>：审核通过\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td height=\"30\" width=\"10%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">级别：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"level\"\n");
      out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"1\"/>\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<td height=\"30\" width=\"13%\">\n");
      out.write("\t\t\t\t\t\t<div align=\"right\" class=\"STYLE1\">上级代理用户名编号：</div></td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<div align=\"left\" class=\"STYLE1\" style=\"padding-left:10px;\">\n");
      out.write("\t\t\t\t\t\t\t<input style=\"height: 20px;width: 200px\" name=\"parentNumber\"\n");
      out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userSession.userId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"4\" style=\"padding: 10px\">\n");
      out.write("\t\t\t\t\t\t<div align=\"center\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"　保　存　\" class=\"input_btn_style1\" /> <input\n");
      out.write("\t\t\t\t\t\t\t\tid=\"backBt\" type=\"button\" value=\"　返　回　\" class=\"input_btn_style1\"\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"javascript:window.location.href='javascript:history.go(-1)'\" />\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
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
