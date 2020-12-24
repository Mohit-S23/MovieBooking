package com.Login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	
	String url = "jdbc:mysql://localhost:3306/moviebooking";
	
	public void addDetails(String uname,String pwd)
	{
		String query = "insert into logininfo value(?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"mohit","Abcd@1234");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, pwd);
			st.executeUpdate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	public void resetPassword(String uname,String pwd)
	{
		String query = "update logininfo set password=? where username=?";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"mohit","Abcd@1234");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, pwd);
			st.setString(2, uname);
			st.executeUpdate();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
}
