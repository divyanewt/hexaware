package com.varsity.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		String fName= request.getParameter("fname");
		String lName= request.getParameter("lname");
		String location= request.getParameter("location");
		String city= request.getParameter("city");
		String collegeName= request.getParameter("cname");
		String qualification= request.getParameter("degree");
		out.println("<html><head><title>Display Details Page</title></head>");
		out.println("<body bgcolor='#55DC&E'>");
		out.println("<center><h1 style='color:#C70039'>"
				+"Resgistration Details</h1></center></h1>"
				+"<table border='1'>"
				+ "<tr><td>Name</td><td>" +fName+" "+lName+"</td></tr>"
				+ "<tr><td>Location</td><td>" +location+"</td></tr>"
				+ "<tr><td>City</td><td>" +city+"</td></tr>"
				+ "<tr><td>CollegeName</td><td>" +collegeName+"</td></tr>"
				+ "<tr><td>Qualification</td><td>" +qualification+"</td></tr>"
				);
		
	}

}
