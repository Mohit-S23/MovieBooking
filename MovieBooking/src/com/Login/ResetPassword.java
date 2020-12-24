package com.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Login.dao.LoginDao;
import com.Login.dao.SignupDao;

@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {
	
	LoginDao lDao = new LoginDao();
	SignupDao sDao = new SignupDao();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		String rePassword = request.getParameter("repwd");
		
		PrintWriter out = response.getWriter();
		
		if(lDao.isPresent(userName))
		{
			if(!password.equals(rePassword))
			{
				out.println(password + " " + rePassword);
				out.println("Passwords does'nt match");
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
					sDao.resetPassword(userName, password);
					response.sendRedirect("login.jsp");
				}
			}
		}
		else
		{
			out.println(userName + " does'nt exist");
		}
	}
}
