package com.varsity.netbazar.servlets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String[] mobiles=(String[])session.getAttribute("mobile");
		List<String> list =  Arrays.asList(mobiles); 
		  request.setAttribute("mobiles", list); 
		  session.setAttribute("mobiles", list);
		 response.sendRedirect("HomePage.jsp");
		  
	}

}
