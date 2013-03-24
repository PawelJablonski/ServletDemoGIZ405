package com.pl.adam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pl.adam.services.UserService;

@WebServlet("/Login")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("user");
		String password = request.getParameter("password");
		UserService service = new UserService();
		boolean authenticationResult = service.authenticate(login, password);
		
		if(authenticationResult)
		{
			HttpSession session = request.getSession();
			session.setAttribute("loggedUser", service.getUser(login));
			response.sendRedirect("userProfile.jsp");
		}else
		{
			response.sendRedirect("login.jsp");
		}
		
	}

}
