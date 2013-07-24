package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class TestSessionAttributes extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("test session attributes<br>");
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(5*60);//configurando timeout da sessao
		
		out.println("<html><body>");
		out.println("<a href=\"" + response.encodeURL("/beerV1/TestSessionAttributes.do") + "\">click me</a>");
		out.println("<a href=\"" + response.encodeRedirectURL("/beerV1/TestInitParams.do")+ "\">click me</a>");//redirecionando
		out.println("<html><body>");
		
		if(session.isNew())
		{
			out.println("This is a new session!");
		}
		else
		{
			out.println("Welcome back!");
		}
	}
}
