<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    	               "http://www.w3.org/TR/html4/loose.dtd">


<html>
  <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    	<title>GlassFish JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
   
   <%!
   	public int add(List<Integer> liczby)
   {
	   int result = 0;
	   for(int i:liczby)
	   {
		   result+=i;
	   }
	   return result;
   }
   %>
    
    <%
    	List<Integer> liczby = new ArrayList<Integer>();
    	int licznik = Integer.parseInt(request.getParameter("licznik"));
    	int i = 1;
    	int j = 2;
    	int k= i+j;
    %>
    
    Wartosc dla k: <%=k %>
    
    <%for(i =0;i<licznik;i++){ 
    liczby.add(i);
    
    %>
    
    	<br>Wyswietl i <%=i %>
    
    <%} %>
    
    suma liczb : <%=add(liczby) %>
    
    
  </body>
</html> 
