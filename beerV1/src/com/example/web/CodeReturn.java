package com.example.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CodeReturn
 */
public class CodeReturn extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/jar");
		
		ServletContext ctx = getServletContext();
		InputStream is = ctx.getResourceAsStream("/teste.jar");
		
		int read = 0;
		byte[] bytes = new byte[1024];
		
		OutputStream os = response.getOutputStream();
		while ((read = is.read(bytes)) != -1) {
			os.write(bytes, 0, read);
		}
		
		os.flush();
		os.close();
	}

}
