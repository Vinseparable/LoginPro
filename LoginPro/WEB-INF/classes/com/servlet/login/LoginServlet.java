package com.servlet.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String confUsername = this.getServletConfig().getInitParameter("USERNAME");
		String confPassword = this.getServletConfig().getInitParameter("PASSWORD");
		
//		System.out.println(username+"::"+password);
		
		String inputUsername = request.getParameter("username");
		String inputPassword = request.getParameter("password");
//		System.out.println(inputUsername+"::"+inputPassword);
		
		if(inputUsername.equals(confUsername)&&inputPassword.equals(confPassword)){
			System.out.println("Login successed.");
			this.getServletContext().setAttribute("userName", inputUsername);
			request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);
		}else{
			System.out.println("Login failed.");
			response.getWriter().append("Login faild,please Login again.");
			response.setHeader("Refresh","2;url='loginPage.jsp'");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
