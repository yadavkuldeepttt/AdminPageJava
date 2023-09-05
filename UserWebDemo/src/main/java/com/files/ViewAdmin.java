package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.files.entities.Admin;


@WebServlet("/ViewAdmin")
public class ViewAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ViewAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.print("<h3>Admin Details </h1>");
		
		HttpSession session =  request.getSession();
		Admin adm = (Admin) session.getAttribute("admin");
		
		pw.print("Admin Id: " +adm.getId());
		pw.print("Admin Name: " +adm.getName());
		pw.print("Admin Age: " +adm.getAge());
		
		pw.close();
	}



}
