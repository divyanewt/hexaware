package com.varsity.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns="/Login1",initParams= {
		@WebInitParam(name="uName", value="Tom"),
		@WebInitParam(name="passWord", value="jerry"),
		@WebInitParam(name="location", value="india")
})
public class Login1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher rd= null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user= request.getParameter("username");
		String password= request.getParameter("password");
		String location= request.getParameter("location");
		ServletConfig config= getServletConfig();
		
		if(user.equals(config.getInitParameter("uName"))) {
			if(password.equals(config.getInitParameter("passWord"))) {
				//url rewritting method
				//response.sendRedirect("Inbox?user="+user+"&location="+location);
				
				//Creating cookie
				/*Cookie c1= new Cookie("user", user);;
				Cookie c2= new Cookie("location",location);
				response.addCookie(c1);
				response.addCookie(c2);*/
				
				//creating session
				HttpSession session= request.getSession();
				session.setAttribute("user", user);
				session.setAttribute("city", location);
				response.sendRedirect("Inbox");
			}else {
				response.sendRedirect("Login.jsp");
			}
		}
			
		
	
	}

}
