package com.varsity.basics;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns= {"/login"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user= request.getParameter("username");
		String password= request.getParameter("password");
		ServletConfig config= getServletConfig();
		String validUserName=config.getInitParameter("usernamevalue");
		String validPassWord=config.getInitParameter("passwordvalue");
		
		RequestDispatcher rd=null;
		if(user.equalsIgnoreCase(validUserName)&& password.equals(validPassWord)){
			request.setAttribute("name", user);
			rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
			
		}
		else {
			request.setAttribute("message", "Invalied username or password");
			rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
			//response.sendRedirect("Login.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
