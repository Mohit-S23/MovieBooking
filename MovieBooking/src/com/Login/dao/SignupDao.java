package com.Login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	
	String url = "jdbc:mysql://localhost:3306/moviebooking";
	String query = "insert into logininfo value(?,?)";
	
	public void addDetails(String uname,String pwd)
	{
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
}
