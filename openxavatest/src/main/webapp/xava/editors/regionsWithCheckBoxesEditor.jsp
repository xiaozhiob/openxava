<%@ page import="java.util.Collection" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="org.openxava.util.Labels" %>

<jsp:useBean id="style" class="org.openxava.web.style.Style" scope="request"/>

<%
String propertyKey = request.getParameter("propertyKey");
String [] fvalues = (String []) request.getAttribute(propertyKey + ".fvalue");
boolean editable="true".equals(request.getParameter("editable"));
String disabled=editable?"":"disabled";
boolean label = org.openxava.util.XavaPreferences.getInstance().isReadOnlyAsLabel();
if (editable || !label) {
	String sregionsCount = request.getParameter("regionsCount");
	int regionsCount = sregionsCount == null?5:Integer.parseInt(sregionsCount);
	Collection regions = fvalues==null?Collections.EMPTY_LIST:Arrays.asList(fvalues);
	for (int i=1; i<regionsCount+1; i++) {
		String checked = regions.contains(Integer.toString(i))?"checked":"";		
	%>	
		<input name="<%=propertyKey%>" type="checkbox" class="<%=style.getEditor()%>" 
				tabindex="1" 
				value="<%=i%>" 
				<%=checked%>
				<%=disabled%>
		/>
		<%=Labels.get("regions." + i, request.getLocale())%>
	<%
	}
}
else {
	for (int i=0; i<fvalues.length; i++) {
%>
<%=Labels.get("regions." + fvalues[i], request.getLocale())%>
<%
	}
}
%>

<% 
if (!editable) { 
	for (int i=0; i<fvalues.length; i++) {
%>
		<input type="hidden" name="<%=propertyKey%>" value="<%=fvalues[i]%>">		
<%
	}
} 
%>			
