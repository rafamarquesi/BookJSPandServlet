package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

import com.example.BeerSessionCounter;
import com.example.model.*;

import java.util.*;

public class BeerSelect extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{		
		String c = request.getParameter("color");
		String b = request.getParameter("body");

		BeerExpert especialista = new BeerExpert();
		List result = especialista.getBrands(c, b);

		//teste cookies
		CheckCookie cheqCookie = new CheckCookie();
		Cookie[] cookies = request.getCookies();
		String userName = cheqCookie.getUserName(cookies);
		
		if(!userName.equals(""))
			request.setAttribute("username", userName);
		
		request.setAttribute("styles", result);

		RequestDispatcher view = request.getRequestDispatcher("result.jsp");

		view.forward(request,response);
	}
}
