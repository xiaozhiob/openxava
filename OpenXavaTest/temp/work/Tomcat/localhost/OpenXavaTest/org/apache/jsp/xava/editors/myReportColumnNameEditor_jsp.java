/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2020-01-20 10:55:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.model.meta.MetaProperty;
import org.openxava.actions.OnChangeMyReportColumnNameAction;

public final class myReportColumnNameEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1575894601490L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1575894605918L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1575894601783L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.model.meta.MetaProperty");
    _jspx_imports_classes.add("org.openxava.actions.OnChangeMyReportColumnNameAction");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody;

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
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('\n');
 
boolean editable="true".equals(request.getParameter("editable"));
if (!editable) {

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "textEditor.jsp", out, false);
      out.write('\n');
      out.write('\n');
 } else { 
      out.write('\n');
      out.write('\n');

String propertyKey = request.getParameter("propertyKey");
MetaProperty p = (MetaProperty) request.getAttribute(propertyKey);
String fvalue = (String) request.getAttribute(propertyKey + ".fvalue");
String script = request.getParameter("script");

String viewObject = request.getParameter("viewObject");
viewObject = (viewObject == null || viewObject.equals(""))?"xava_view":viewObject;
org.openxava.view.View view = (org.openxava.view.View) context.get(request, viewObject);
Boolean oshowAllColumns = (Boolean) view.getObject("xava.myReportColumnShowAllColumns");
boolean showAllColumns = oshowAllColumns==null?false:oshowAllColumns.booleanValue();

String tabObject = request.getParameter("tabObject");
tabObject = (tabObject == null || tabObject.equals(""))?"xava_tab":tabObject;
org.openxava.tab.Tab tab = (org.openxava.tab.Tab) context.get(request, tabObject);
java.util.Collection columns = showAllColumns?
	tab.getMetaTab().getMetaModel().getRecursiveQualifiedPropertiesNames():
	tab.getMetaTab().getMetaModel().getRecursiveQualifiedPropertiesNamesUntilSecondLevel();
showAllColumns = tab.getMetaTab().getMetaModel().getRecursiveQualifiedPropertiesNames().size() == columns.size(); 	
if (!showAllColumns && 
	!org.openxava.util.Is.emptyString(fvalue) && 
	!OnChangeMyReportColumnNameAction.SHOW_MORE.equals(fvalue) && 
	!columns.contains(fvalue)) 
{
	columns = new java.util.ArrayList(columns);
	columns.add(fvalue);
}

      out.write("\n");
      out.write("\n");
      out.write("<select id=\"");
      out.print(propertyKey);
      out.write("\" name=\"");
      out.print(propertyKey);
      out.write("\" tabindex=\"1\" class=");
      out.print(style.getEditor());
      out.write(' ');
      out.print(script);
      out.write(" title=\"");
      out.print(p.getDescription(request));
      out.write("\">\n");
      out.write("\t<option value=\"\"></option>\n");
      out.write("\t");
 
	for (java.util.Iterator it = columns.iterator(); it.hasNext(); ) {
		String column = (String) it.next();
		MetaProperty property = tab.getMetaTab().getMetaModel().getMetaProperty(column);
		property = property.cloneMetaProperty();
		property.setQualifiedName(column);
		String label = property.getQualifiedLabel(org.openxava.util.Locales.getCurrent());		
		String selected = column.equals(fvalue)?"selected":""; 
	
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(column);
      out.write('"');
      out.write(' ');
      out.print(selected);
      out.write('>');
      out.print(label);
      out.write("</option>\n");
      out.write("\t");
 
	}
	
      out.write('\n');
      out.write('	');
 if (!showAllColumns) {
      out.write("\n");
      out.write("\t<option value=\"");
      out.print(OnChangeMyReportColumnNameAction.SHOW_MORE);
      out.write('"');
      out.write('>');
      if (_jspx_meth_xava_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</option>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("</select>\t\n");
      out.write("\n");
 } 
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

  private boolean _jspx_meth_xava_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:message
    org.openxava.web.taglib.MessageTag _jspx_th_xava_005fmessage_005f0 = (org.openxava.web.taglib.MessageTag) _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.get(org.openxava.web.taglib.MessageTag.class);
    boolean _jspx_th_xava_005fmessage_005f0_reused = false;
    try {
      _jspx_th_xava_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fmessage_005f0.setParent(null);
      // /xava/editors/myReportColumnNameEditor.jsp(63,65) name = key type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
      _jspx_th_xava_005fmessage_005f0.setKey("my_report_show_more_columns");
      int _jspx_eval_xava_005fmessage_005f0 = _jspx_th_xava_005fmessage_005f0.doStartTag();
      if (_jspx_th_xava_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_xava_005fmessage_005f0);
      _jspx_th_xava_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fmessage_005f0_reused);
    }
    return false;
  }
}
