<%@page import="service.Aurthorized"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@page  import="service.Student" %>
<jsp:useBean class="service.Student" id="s"></jsp:useBean>
<jsp:setProperty name="s" property="*"></jsp:setProperty>

<%
try
{
    Aurthorized a=new Aurthorized(request, response);
    if(!a.isAdmin())
    {
        response.sendRedirect("home.jsp");
        return;
    }


if(s.insertStudent())
  {
    out.print("Record insertd......<a href=home.jsp>home</a>");
}
       
}
catch(Exception e) 
{
    e.printStackTrace();
}                 
                %>

