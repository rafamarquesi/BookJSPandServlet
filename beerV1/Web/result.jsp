<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ page import="java.util.*" %>

<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
   <title>result</title>
  </head>
  <body>
  
   <h1 align="center">Beer Recommendations JSP</h1>
   <p>
   
   <%
     List styles = (List)request.getAttribute("styles");
     Iterator it = styles.iterator();
     while (it.hasNext()) 
     {
        out.print("<br>try: "+it.next());
     }
   %>
   <br><br>
   <%
   	 String [] sizes = request.getParameterValues("sizes");
   	 for(int i = 0; i < sizes.length; i++)
   	 {
   		out.print("<br>sizes: "+sizes[i]);
   	 }
   %>
  </body>
</html>