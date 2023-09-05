package com.files;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Mysearch")
public class Mysearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Mysearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String text = request.getParameter("data");
		
		response.sendRedirect("https://www.google.com/search?q="+text);
		
		
		
	}

}
