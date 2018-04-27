package com.varsity.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/professionals")
public class ProffessionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName= request.getParameter("firstName");
		String lName= request.getParameter("lastName");
		String location= request.getParameter("location");
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>Get Professional Info</title></head>");
		out.println("<body bgcolor='#F5E0DB'>");
		out.println("<fieldset> <form action='Display'><table>" 
				+ "<tr><td>City</td>" 
				+"<td><input type='text' name='city' id='city'/></td></tr>"
						+ "<tr><td>CollegeName</td>" 
					+"<td><input type='text' name='cname' id='cname'/></td></tr>"
					+ "<tr><td>Qualification</td>" 
					+"<td><input type='text' name='degree' id='degree'/></td></tr>"
					+"<td><input type='hidden' name='fname' id='c=fname' value='"+fName+"'/></td></tr>"
		+"<td><input type='hidden' name='lname' id='c=lname' value='"+lName+"'/></td></tr>"
		+"<td><input type='hidden' name='location' id='c=location' value='"+location+"'/></td></tr>"
		+"<td><input type='submit' value='Display'/></td></tr>");
		out.println("</form></fieldset><table></body></html>");
	
	}

	
	

}
