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

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DaoClass dao = new DaoClass();
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		String Name = "";
		String Password = "";
		ResultSet rs = dao.checkavaility(name);
		boolean flag = false;

		try {
			flag = rs.next();
			if (flag == true) {
				Name = rs.getString(1);
				Password = rs.getString(2);
				if (Name.equalsIgnoreCase(name) && Password.equals(password)) {
					session.setAttribute("name", name);
					request.setAttribute("name", "name");
					request.getRequestDispatcher("./Welcome.jsp").forward(request, response);
					//response.sendRedirect("./Welcome.jsp");
				} else {
					out.println("Name or Password is incorrect!");
				}
			} else {
				out.println("Please register first");
				response.sendRedirect("./registration.jsp");
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
