package com.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.files.entities.Admin;
import com.files.entities.AdminDao2;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		  response.setContentType("text/html");
		  PrintWriter pw = response.getWriter();
	
	       Admin ad = new Admin();
		ad.setId(request.getParameter("userid"));
		ad.setName(request.getParameter("username"));
		ad.setAge(Integer.parseInt(request.getParameter("userage")));
		ad.setPhone(Long.parseLong(request.getParameter("userphone")));
		ad.setPassword(request.getParameter("password"));
		
		  
//		  Enumeration<String> params =  request.getParameterNames();
//		  Iterator<String> itr = params.asIterator();
//		  Map<String, String> admlist =  new HashMap<String, String>();
//		  
//		  
//		 while(itr.hasNext())
//		  {
//			  String key = itr.next();
//			  admlist.put(key, request.getParameter(key));
////			  pw.print(key+""+admlist.get(key)+"<br>");
//		  }
// 		  
//		  
		  
		  
		  
		  AdminDao2  ad2= new AdminDao2();
		  int status = ad2.saveAdmin(ad);
//		  int status = ad2.saveAdmin(admlist);
		  
		  if(status==1)
		  {
			  pw.print("<h3>Record saved Successfully! </h3>");
			  request.getRequestDispatcher("Register.jsp").include(request, response);
			  
		  }
		  else {
			  pw.print("<h3>Unable to save record please try again </h3>");
			  request.getRequestDispatcher("Register.jsp").include(request, response);
		  
		  }
	}


}
