package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends GenericServlet  {
	private static final long serialVersionUID = 1L;
       
    
    public HelloServlet() {
    	 System.out.println("start");
    }

	
	public void init(ServletConfig config) throws ServletException {
		 System.out.println("Init method");
	}

	
	public void destroy() {
		 System.out.println("destroy");
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		 System.out.println("Service method");
		 PrintWriter out = response.getWriter();
		 out.println("Hello from servlet");
		 
	}

}
