package com.zensar.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zensar.demo.Dao.DaoClass;

/**
 * Servlet implementation class registration
 */
@WebServlet("/registration")
public class registration extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DaoClass dao = new DaoClass();
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String password = request.getParameter("password");
		String DOB = request.getParameter("DOB");
		String Email = request.getParameter("Email");
		HttpSession session = request.getSession();
		int row = dao.insertData(name, password, DOB, Email);

		try {
			if (row == 1) {
				response.sendRedirect("successfull.jsp");
			} else {
				out.println("Something went Wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
