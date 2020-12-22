package com.Login.dao;

import java.sql.*;

public class LoginDao {

	String url = "jdbc:mysql://localhost:3306/moviebooking";
	String query = "select * from loginInfo where username=? and password=?";
	
	public boolean checkDetails(String userName,String password)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"mohit","Abcd@1234");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, userName);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean isPresent(String userName)
	{
		String query = "select * from loginInfo where username=?";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"mohit","Abcd@1234");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, userName);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
}
