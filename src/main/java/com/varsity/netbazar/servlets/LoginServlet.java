package com.varsity.netbazar.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns="/Login",initParams= {
		@WebInitParam(name="passWord", value="netbazar"),
		
})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		HttpSession session= request.getSession();
		String user= request.getParameter("username");
		String password= request.getParameter("password");
		
		if(user!= null && user!=" " && password.equals(getInitParameter("passWord"))) {
			
			session.setAttribute("user", user);
			response.sendRedirect("HomePage.jsp");
		}
		else {
			request.setAttribute("message", "Invalied username or password");
			rd=request.getRequestDispatcher("LoginPage.jsp");
			rd.forward(request, response);
		}
	
	}

}
