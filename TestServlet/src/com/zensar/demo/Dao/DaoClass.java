package com.zensar.demo.Dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoClass {

	public ResultSet checkavaility(String name) {
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet",
					"root", "temp1234");
			PreparedStatement ps = con.prepareStatement("select * from login where name=? ");
			ps.setString(1, name);
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return rs;
		
	}
	public int insertData(String name,String password,String DOB,String Email) {
		int row=-1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet",
					"root", "temp1234");
			PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, password);
			ps.setString(3, DOB);
			ps.setString(4, Email);
		    row = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
		
	}
}
