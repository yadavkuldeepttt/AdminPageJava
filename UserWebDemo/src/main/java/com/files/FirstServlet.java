package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.files.entities.Admin;
import com.files.entities.AdminDao2;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/login")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String userpass = request.getParameter("userpass");
		
		
		AdminDao2 ad= new AdminDao2();
		Admin login = ad.checkLogin(username, userpass);
		if(login!=null)
		{
//			request.getSession().setAttribute("username", login.getName());
//			request.setAttribute("userId", login.getEid());
//			request.setAttribute("userpassword", login.getPassword());
//			request.setAttribute("userage", login.getAge());
//			request.setAttribute("usercity", login.getCity());
			
               HttpSession session = request.getSession();
               session.setAttribute("admin", login);
			RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
			rd.forward(request, response);
		
		}
		else
		{
			out.print("Either ID or Password is incorrect!");
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.include(request, response);
		}
		out.close();
	}

}
