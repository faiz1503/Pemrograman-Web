<%-- 
    Document   : dashboard
    Created on : Oct 24, 2015, 12:44:25 PM
    Author     : NIKHIL
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Model.Member"%>
<jsp:useBean id="Member"  class="Model.Member"/>
<jsp:useBean id="MemberHome" class="Model.MemberHome"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    session = request.getSession(false);
    if(session.getAttribute("email")!=null)
    {
        Connection con = null;
        PreparedStatement ps;
        ResultSet rs;
        String query;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost/gosurfsumatera","root","");
            query = "select * from admin where email=?";
            ps = con.prepareStatement(query);
            String emailFromSession = session.getAttribute("email").toString();
            ps.setString(1,emailFromSession);
            rs = ps.executeQuery();
            if(rs.next())
            {
                out.println("Welcome, "+" "+rs.getString("name")+"!!!");
                out.println("<br><br> Session created for you...<br><br>");
                
                int indexOfatTheRate = emailFromSession.indexOf('@');
                
                boolean cookieCheck=false;
                Cookie ck[] = request.getCookies();
                for(int i=0;i<ck.length;i++)
                {
                    if(ck[i].getName().equals("tempatLahir"+emailFromSession.substring(0,indexOfatTheRate)))
                    {
                        out.println("Tempat Lahir anda - "+ck[i].getValue()+"&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"#\"></a>");
                        cookieCheck = true;
                        break;
                    }
                }
                // Lokasi baru halaman yang akan dialihkan
                out.println("Halaman Akan Segera Redirect, Tekan ini Jika Browser tidak Mendukung Fitur Redirect");
                String site = new String("http://localhost:8080/ProjectPWEB/Admin/Login/index.jsp");
                response.setStatus(response.SC_MOVED_TEMPORARILY);
                response.setHeader("Location", site);
                
                if(!cookieCheck)
                {
                    out.println("<form action=\"\" method=\"post\">");
                    out.println("<input type=\"text\" name=\"currentCity\" placeholder=\"Please, enter your Current City\" size=\"50\">"
                            + "&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"cookieSubmit\" value=\"Submit\">");
                    out.println("</form>");
                    if("POST".equalsIgnoreCase(request.getMethod()))
                    {
                        if(request.getParameter("cookieSubmit")!=null)
                        {
                            if(request.getParameter("cookieSubmit").equals("Submit"))
                            {
                                Cookie cookie = new Cookie("tempatLahir"+emailFromSession.substring(0,indexOfatTheRate),request.getParameter("currentCity"));
                                cookie.setMaxAge(10000);
                                response.addCookie(cookie);
                                response.sendRedirect("index.jsp");
                            }
                        }
                    }
                    
                }
                
                //Creating Logout button...
                
                out.println("<br><br>"
                        + "<form action=\"logout.jsp\" method=\"post\">");
                out.println("<input type=\"submit\" name=\"logout\" value=\"Logout\">");
                out.println("</form>");
                
                out.println("<br><br><a href=\"changePassword.jsp?uemail="+session.getAttribute("email").toString()+"\"> Change Password </a>");
            }
            
                    
            
                    
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
               
    }
    
    if("POST".equalsIgnoreCase(request.getMethod()))
    {
        if(request.getParameter("login")!=null)
        {
            if(request.getParameter("login").equals("Login"))
            {
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String name = request.getParameter("nama");
                
                Connection con = null;
                PreparedStatement ps;
                ResultSet rs;
                String query;
                
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                
                try
                {
                    con = DriverManager.getConnection("jdbc:mysql://localhost/gosurfsumatera","root","");
                    query = "Select * from admin where email=? and password=?";
                    ps = con.prepareStatement(query);
                    ps.setString(1,email);
                    ps.setString(2,password);
                    rs = ps.executeQuery();
                    
                    if(rs.next())
                    {
                        //Login successful!
                        //Creating Session...
                        session = request.getSession();
                        session.setAttribute("email", email);
                        session.setAttribute("name", name);
                        response.sendRedirect("index.jsp");
                    }
                    else
                    {
                        out.println("Invalid Email id or Password!!! Please ");
                        out.println("<a href=\"LoginAdmin.jsp\"> Try Again </a>");
                        
                    }
                    
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                }
               
           }
        }
        else if (request.getParameter("registerLogin")!=null)
        {
            if(request.getParameter("registerLogin").equals("I'm New User"))
            {
                response.sendRedirect("register.jsp");
            }
        }
            
    }
    
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
    </head>
    <body>
    </body>
</html>
