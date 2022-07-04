package com;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class Servlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher dispacther =req.getRequestDispatcher("heart.jsp");
		dispacther.forward(req, res);
		
		
	}
}
