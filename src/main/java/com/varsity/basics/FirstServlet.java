package com.varsity.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/1")
public class FirstServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>My First Servlet</title></head>");
		out.println("<body bgcolor='ivory'><h2>Welcome to Hexaware</h2>");
		Date today= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyy hh:mm a");
		String now= sdf.format(today);
		out.println("<h4> Now the Time is"+now+"</h4>");
		out.println("</body></html>");
		
	}

}
