package com.synerzip;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");		
	   
		if(email.equals("pranav@gmail.com") && password.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/welcome.html");
	        rd.forward(request, response) ; 
		}else {
			RequestDispatcher rd1 = request.getRequestDispatcher("login_page.html");
		    rd1.include(request, response);  
		}
	}

}
