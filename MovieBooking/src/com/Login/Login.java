package com.Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Login.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	LoginDao lDao = new LoginDao();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");		// getting username from form
		String password = request.getParameter("password");		// getting password from form
		
		if(lDao.checkDetails(userName, password))
		{
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			response.sendRedirect("home.jsp");					// redirecting to home.jsp if username password is correct
		}
		else
		{
			response.sendRedirect("login.jsp");					// redirecting back to login.jps is username password is incorrect
		}
	}
}
