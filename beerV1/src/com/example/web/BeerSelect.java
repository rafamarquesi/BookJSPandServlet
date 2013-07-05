package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.example.model.*;
import java.util.*;

public class BeerSelect extends HttpServlet
{
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
   {
   
      String c = request.getParameter("color");
      BeerExpert especialista = new BeerExpert();
      List result = especialista.getBrands(c);
      
      //response.setContentType("text/html");
      //PrintWriter out = response.getWriter();
      //out.println("Beer Selection Advice<br>");
      
      request.setAttribute("styles", result);
      
      RequestDispatcher view = request.getRequestDispatcher("result.jsp");
      
      view.forward(request,response);
   }
}
