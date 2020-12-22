package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Login.dao.LoginDao;
import com.Login.dao.SignupDao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/Create")
public class Create extends HttpServlet {
	
	SignupDao sDao = new SignupDao();
	LoginDao lDao = new LoginDao();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("uname");		// getting username from signup form
		String password = request.getParameter("pwd");			// getting password from signup form
		
		PrintWriter out = response.getWriter();
		
		if(userName == "" || password == "")
		{
			out.println("Username or Password cannot be empty");
		}
		else if(lDao.isPresent(userName))
		{
			out.println("Username already exists");
		}
		else
		{
			int uppercase=0,lowercase=0,digit=0,special=0;
			Pattern p = Pattern.compile("[^A-Za-z0-9]");
		    Matcher m = p.matcher(password);
		    boolean b = m.find();
			for(int i=0;i<password.length();i++)
			{
				if(password.charAt(i)>='A' && password.charAt(i)<='Z')
				{
					uppercase++;
				}
				else if(password.charAt(i)>='a' && password.charAt(i)<='z')
				{
					lowercase++;
				}
				else if(password.charAt(i)>='0' && password.charAt(i)<='9')
				{
					digit++;
				}
				else if(b)
				{
					special++;
				}
			}
			if(password.length()<6 || password.length()>18)
			{
				out.println("Password length must be between 6 to 18 characters.");
			}
			else if(uppercase==0)
			{
				out.println("Password must contain an Uppercase letter.");
			}
			else if(lowercase==0)
			{
				out.println("Password must contain a Lowercase letter.");
			}
			else if(digit==0)
			{
				out.println("Password must contain a Digit.");
			}
			else if(special==0)
			{
				out.println("Password must contain a Special Character.");
			}
			else
			{
				sDao.addDetails(userName, password);
				response.sendRedirect("login.jsp");
			}
		}
	}
	
}
