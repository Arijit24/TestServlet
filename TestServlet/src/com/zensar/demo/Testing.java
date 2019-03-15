package com.zensar.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Testing extends HttpServlet {

protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {

	PrintWriter out=res.getWriter();
	out.println("Hello");
	
}
  protected void doPost(HttpServletRequest req,HttpServletResponse res) {

	
}
}
