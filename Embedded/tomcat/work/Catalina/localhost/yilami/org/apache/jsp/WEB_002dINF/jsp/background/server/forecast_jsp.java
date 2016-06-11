package org.apache.jsp.WEB_002dINF.jsp.background.server;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forecast_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/background/server/../../common/common-css.jsp");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>定时任务监控管理</title>\n");
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
      out.write("   <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/showLoading.css\" rel=\"stylesheet\" media=\"screen\" /> \n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.3.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.showLoading.js\"></script>\n");
      out.write("\t\n");
      out.write("<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/FusionCharts/FusionCharts.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body{\n");
      out.write("font-size: 12px;\n");
      out.write("}\n");
      out.write(".ttab{\n");
      out.write("text-align: center;\n");
      out.write("}\n");
      out.write(".list{float:left;}\n");
      out.write(".list li{text-align:left; padding-left:5px;height:25px;border:#FFFFCC dashed 1px; text-decoration:underline;}\n");
      out.write(".config_text{width:400px; height:35px; border:#CCCCCC solid 1px;background:#FFCC99;}\n");
      out.write(".inputclass {\n");
      out.write("    border: 1px solid #DDDDDD;\n");
      out.write("    color: #333333;\n");
      out.write("    font-size: 13px;\n");
      out.write("    outline: medium none;\n");
      out.write("    width:80px;\n");
      out.write("    background: none repeat scroll 0 0 #FFFF9D;\n");
      out.write("}\n");
      out.write(".tab_div{margin:5px;height:440px;overflow-x:hidden;}\n");
      out.write(".block_panel{ float:left;width:99%;}\n");
      out.write(".block_table{ float:left; width:250px; text-align:left; border:0;}\n");
      out.write(".block_icon_disk{text-align:center; background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/other/disk.jpg) no-repeat;}\n");
      out.write(".block_icon_cpuInfos{text-align:center; background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/icons/other/disk.jpg) no-repeat;}\n");
      out.write(".block_stat{ background:#FFFFFF; border:#666666 solid 1px; height:15px; width:150px;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("\t$(\".loading\").showLoading(); \n");
      out.write("\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/serverInfo/warnInfo.html\";\n");
      out.write("\t$.ajax({\n");
      out.write("\t\ttype : 'POST',\n");
      out.write("\t\turl : url,\n");
      out.write("\t\tdataType : 'json',\n");
      out.write("\t\tsuccess : function(data) {\n");
      out.write("\t\t var tbodyContent=\"\";\n");
      out.write("\t\t \ttbodyContent = tbodyContent + \"<tr>\";\n");
      out.write("\t\t \ttbodyContent = tbodyContent + \"<td>CPU</td><td style='padding-left:10px;text-align: left;'>使用率：\"+data.cpuUsage+\"%</td>\";\n");
      out.write("\t\t \ttbodyContent = tbodyContent + \"<td>使用率超出 <input class='inputclass' name='cpu' id='cpu' type='text' value='\"+data.cpu+\"'/> %,发送邮箱提示 <input type='button' value='更新' id='btnLoadData' class='input_btn_style1' onclick='modifySer(\\\"cpu\\\");'/></td><td rowspan='3'><input class='inputclass'style='width:180px;height:24px;' name='toEmail' id='toEmail' type='text' value='\"+data.toEmail+\"'/><input type='button' value='更新' id='btnLoadData' class='input_btn_style1'style='padding: 3px 11px;' onclick='modifySer(\\\"toEmail\\\");'/></td>\";\n");
      out.write("\t\t \t tbodyContent = tbodyContent + \"</tr>\";\n");
      out.write("\t\t \ttbodyContent = tbodyContent + \"<tr>\";\n");
      out.write("\t\t \ttbodyContent = tbodyContent + \"<td>服务器内存</td><td style='padding-left:10px;text-align: left;'>总内存：\"+data.TotalMem+\"<br/>空闲内存：\"+data.FreeMem+\"<br/>使用率：\"+data.serverUsage+\"%</td>\";\n");
      out.write("\t\t \ttbodyContent = tbodyContent + \"<td>使用率超出 <input class='inputclass' name='ram' id='ram' type='text' value='\"+data.ram+\"'/> %,发送邮箱提示 <input type='button' value='更新' id='btnLoadData' class='input_btn_style1' onclick='modifySer(\\\"ram\\\");'/></td>\";\n");
      out.write("\t\t\t tbodyContent = tbodyContent + \"</tr>\";\n");
      out.write("\t\t\t tbodyContent = tbodyContent + \"<tr>\";\n");
      out.write("\t\t\t \ttbodyContent = tbodyContent + \"<td>JVM内存</td><td style='padding-left:10px;text-align: left;'>JVM总内存：\"+data.JvmTotalMem+\"<br/>JVM空闲内存：\"+data.JvmFreeMem+\"<br/>使用率：\"+data.JvmUsage+\"%</td>\";\n");
      out.write("\t\t\t \ttbodyContent = tbodyContent + \"<td>使用率超出 <input class='inputclass' name='jvm' id='jvm' type='text' value='\"+data.jvm+\"'/> %,发送邮箱提示 <input type='button' value='更新' id='btnLoadData' class='input_btn_style1' onclick='modifySer(\\\"jvm\\\");'/></td>\";\n");
      out.write("\t\t\t\t tbodyContent = tbodyContent + \"</tr>\";\n");
      out.write("\t\t $('#tbody').html(tbodyContent);\n");
      out.write("\t\tfchart(\"CPU使用情况\",\"%\", \"剩余\", (100-data.cpuUsage), \"已经使用\", data.cpuUsage, \"cpu\", \"cpuchart\");\n");
      out.write("\t\tfchart(\"内存使用情况\",\"%\", \"剩余\", (100-data.serverUsage), \"已经使用\", data.serverUsage, \"ram\", \"ramchart\");\n");
      out.write("\t\tfchart(\"JVM使用情况\",\"%\", \"剩余\", (100-data.JvmUsage), \"已经使用\", data.JvmUsage, \"jvm\", \"jvmchart\");\n");
      out.write("\t\t var disk = data.diskInfos;\n");
      out.write("\t\t var html = \"\";\n");
      out.write("\t\t if(disk == null || disk == undefined || disk == \"\"){\n");
      out.write("\t\t\t $('#diskInfos').html(\"无法获取系统磁盘信息\");\n");
      out.write("\t\t\t $(\".loading\").hideLoading();\n");
      out.write("\t\t\t return;\n");
      out.write("\t\t }\n");
      out.write("\t\t\t\n");
      out.write("\t\thtml = createDiskInfosHtml(disk);\n");
      out.write("\t\t $('#diskInfos').html(html);\n");
      out.write("\t\t $(\".loading\").hideLoading();\n");
      out.write("\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("function createDiskInfosHtml(datas){\n");
      out.write("\tvar html = \"\";\n");
      out.write("\tvar name,title,availSize,freeSize,percentSize;\n");
      out.write("\tfor(var index in datas){\n");
      out.write("\t\tvar info = datas[index];\n");
      out.write("\t\tname = \"磁盘 \"+info['devName'];\n");
      out.write("\t\ttotalSize = info['totalSize'];\n");
      out.write("\t\tavailSize = info['availSize'];\n");
      out.write("\t\tpercentSize = 150 * (info['usedSize']/info['totalSize']);\n");
      out.write("\t\thtml = html + \"<table class=\\\"block_table\\\">\";\n");
      out.write("\t\thtml = html + \"<tr><th width=\\\"20%\\\">&nbsp;</th><th width=\\\"80%\\\">\"+name+\"</th></tr>\";\n");
      out.write("\t\thtml = html + \"<tr>\";\n");
      out.write("\t\thtml = html + \"<td rowspan=\\\"2\\\" class=\\\"block_icon_disk\\\"></td>\";\n");
      out.write("\t\thtml = html + \"<td><div class=\\\"block_stat\\\"><div style=\\\"background:#46AF6D;height:15px; width:\"+percentSize+\"px;\\\">&nbsp;</div></div></td>\";\n");
      out.write("\t\thtml = html + \"</tr>\";\n");
      out.write("\t\thtml = html + \"<tr><td>\"+availSize+\"G 可用 共\"+totalSize+\"G </td></tr>\";\n");
      out.write("\t\thtml = html + \"</table>\";\n");
      out.write("\t}\n");
      out.write("\treturn html;\n");
      out.write("}\n");
      out.write("function modifySer(key){\n");
      out.write("\t$.ajax({\n");
      out.write("        async: false,\n");
      out.write("        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/background/serverInfo/modifySer.html\",\n");
      out.write("        data:{\"key\":key,\"value\":$(\"#\"+key).val()},\n");
      out.write("        dataType: \"json\",\n");
      out.write("        success: function (data) {\n");
      out.write("    \t    if(data.flag){\n");
      out.write("    \t    \talert(\"更新成功！\");\n");
      out.write("    \t    }else{\n");
      out.write("    \t    \talert(\"更新失败！\");\n");
      out.write("    \t    }\n");
      out.write("        }\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write(" function fchart(name,pen,label1,value1,label2,value2,charId,divId){\n");
      out.write("  \tvar text_chart=\"('<chart baseFontSize=\\\"12\\\" caption=\\\"\"+name+\"\\\" numberPrefix=\\\"\"+pen+\"\\\"><set value=\\\"\"+value1+\"\\\" label=\\\"\"+label1+\"\\\" color=\\\"AFD8F8\\\" /><set value=\\\"\"+value2+\"\\\" label=\\\"\"+label2+\"\\\" color=\\\"F6BD0F\\\" /></chart>')\";\n");
      out.write("\t  var chart = new FusionCharts(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/FusionCharts/Pie3D.swf\", charId, \"350\", \"200\");\n");
      out.write("\t  chart.setDataXML(text_chart);\t\t   \n");
      out.write("\t  chart.render(divId);  \n");
      out.write(" }\n");
      out.write("\t \n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"height: 588px;overflow-y: scroll;\">\n");
      out.write("<div class=\"loading\" style=\"height: 650px;\">\n");
      out.write("<center>\n");
      out.write("<table class=\"ttab\" width=\"99%\">\n");
      out.write("  <thead>\n");
      out.write("  <tr style=\"background-color:#e8f3fd;\">\n");
      out.write("   <td width=\"100\">名称</td>\n");
      out.write("    <td width=\"100\">参数</td>\n");
      out.write("\t<td width=\"275\">预警设置</td>\n");
      out.write("\t<td width=\"275\">邮箱设置</td>\n");
      out.write("  </tr>\n");
      out.write("  </thead>\n");
      out.write("<tbody id=\"tbody\">\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td><div id=\"cpuchart\"></div></td>\n");
      out.write("<td><div id=\"ramchart\"></div></td>\n");
      out.write("<td><div id=\"jvmchart\"></div></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<br/>\n");
      out.write("<h1 style=\"background-color:#e8f3fd; width:99%;text-align: left;\">磁盘信息</h1><br/>\n");
      out.write("<div class=\"block_panel\" id=\"diskInfos\"></div>\n");
      out.write("</center>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
