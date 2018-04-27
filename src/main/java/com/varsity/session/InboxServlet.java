package com.varsity.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Inbox")
public class InboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String name= request.getParameter("user");
		String password= request.getParameter("password");
		String city= request.getParameter("location");*/
		
		// cookie creation
		/*String name=null;
		String city=null;
		Cookie[] cookies= request.getCookies();
		for(Cookie cookie:cookies) {
			if(cookie.getName().equals("user")) {
				name=cookie.getValue();
			}
			if(cookie.getName().equals("location")) {
				city=cookie.getValue();
			}
		}*/
		
		// session creation
		HttpSession session=request.getSession();
		
		String name=(String)session.getAttribute("user");
		String city=(String)session.getAttribute("city");
		
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><title>InboxPage</title></head>"
				+ "<body><h1>Inbox</h1>"
				+ "<h2> Welcome to Mr./Ms"+name.toUpperCase()+"</h2>"
				+ "<h2>Location "+ city+"</h2>"
				//+ "<a href='SentItem?user="+name+"&location="+city+"'>Sent Item </a>"
				+"<a href='SentItem'>SentItem</a>"
				+"<a href='Logout'>LogOut</a>"
				+ "</body></html>");
	}

}
