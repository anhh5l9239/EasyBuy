/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.14.v20161028
 * Generated at: 2018-07-21 05:04:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/F:/apache-maven-3.2.1/repository/javax/servlet/jsp/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1532071358843L));
    _jspx_dependants.put("jar:file:/F:/apache-maven-3.2.1/repository/javax/servlet/jsp/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1147294006000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>易买网 - 首页</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/function.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"logo\"><img src=\"images/logo.gif\" /></div>\r\n");
      out.write("\t<div class=\"help\"><a href=\"#\" class=\"shopping\">购物车</a><a href=\"login.html\">登录</a><a href=\"register.html\">注册</a><a href=\"guestbook.html\">留言</a></div>\r\n");
      out.write("\t<div class=\"navbar\">\r\n");
      out.write("\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t<li class=\"current\"><a href=\"#\">首页</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">图书</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">百货</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">品牌</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">促销</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"childNav\">\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t<li class=\"first\"><a href=\"#\">音乐</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">影视</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">少儿</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">动漫</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">小说</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">外语</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">数码相机</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">笔记本</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">羽绒服</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">秋冬靴</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">运动鞋</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">美容护肤</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">家纺用品</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">婴幼奶粉</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">饰品</a></li>\r\n");
      out.write("\t\t\t<li class=\"last\"><a href=\"#\">Investor Relations</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"register\" class=\"wrap\">\r\n");
      out.write("\t<div class=\"shadow\">\r\n");
      out.write("\t\t<em class=\"corner lb\"></em>\r\n");
      out.write("\t\t<em class=\"corner rt\"></em>\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<h1>欢迎回到易买网</h1>\r\n");
      out.write("\t\t\t<form id=\"loginForm\" method=\"post\" action=\"reg-result.html\" onsubmit=\"return checkForm(this)\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">用户名：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"text\" type=\"text\" name=\"userName\" onfocus=\"FocusItem(this)\" onblur=\"CheckItem(this);\" /><span></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">登录密码：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input class=\"text\" type=\"password\" id=\"passWord\" name=\"passWord\" onfocus=\"FocusItem(this)\" onblur=\"CheckItem(this);\" /><span></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"ui-green\"><input type=\"submit\" name=\"submit\" value=\"立即登录\" /></label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\tCopyright &copy; 2018 云和数据 All Rights Reserved. 京ICP证1000001号\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}