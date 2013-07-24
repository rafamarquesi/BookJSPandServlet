package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestInitParams extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("test init parameters<br>");
		
		java.util.Enumeration e = getServletContext().getInitParameterNames();
		while(e.hasMoreElements()) {
			out.println("<br>param name = " + e.nextElement() + "<br>");
		}
		
		out.println("main email is " + getServletContext().getInitParameter("mainEmail"));
		out.println("<br>");
		out.println("admin email is " + getServletContext().getInitParameter("adminEmail"));
		
		HttpSession session = request.getSession();
		
		if(session.isNew())
		{
			out.println("<br>");
			out.println("This is a new session!");
		}
		else
		{
			out.println("<br>");
			out.println("Welcome back!");
		}
	}

}
