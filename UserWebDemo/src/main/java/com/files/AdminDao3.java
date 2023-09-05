package com.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.files.entities.Admin;
import com.files.entities.AdminDao2;



@WebServlet("/AdminDao3")
public class AdminDao3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public AdminDao3() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
//		request.getRequestDispatcher("Header.html").include(request, response);
		String action = request.getParameter("action");
		String userid = request.getParameter("userid");
	    AdminDao2 ad = new AdminDao2();
		
		
		if(action.equals("view record"))
		{
           Admin adv =  ad.viewRecordById(userid);
            if(adv!=null)
            {
            	HttpSession session = request.getSession();
            	session.setAttribute("admin", adv);
            	request.getRequestDispatcher("ViewAdmin.jsp").include(request, response);
            }
            else {
//                  pw.print("<h3>User doesn't exist! either id is incorrect");     
            	request.setAttribute("message", "User id doesn't exist");
              	request.getRequestDispatcher("GetId.jsp").forward(request, response);

            }
            	
           
		}
		else if(action.equals("Delete Record"))
		{
			   int status =  ad.deleteRecord(userid);
	           
			   if(status==1)
			   {
				   pw.print("<h1>Record deleted successfuly</h1>");
				   
			   }
			   else
			   {
				   pw.print("<h3>User id does not exist!</h3>");
				   
				   
				   request.getRequestDispatcher("GetId.jsp").include(request, response);
			   }
	           
		}
		else if(action.equals("Update"))
		{

	           Admin adv =  ad.viewRecordById(userid);
	           HttpSession session = request.getSession();
	           
	           session.setAttribute("admin", adv);
	           request.getRequestDispatcher("UpdateEmployee.jsp").include(request, response);
			   
		}  
		
		else if(action.equals("Update Record"))
		{
           Admin adm = new Admin();
           adm.setId(request.getParameter("userid"));
           adm.setName(request.getParameter("username"));
           String userAgeParam = request.getParameter("userage");
           if (userAgeParam != null) {
               adm.setAge(Integer.parseInt(userAgeParam));
           }
//           adm.setAge(Integer.parseInt(request.getParameter("userage")));
           String userPhoneParam = request.getParameter("userphone");
           if (userPhoneParam != null) {
        	   adm.setPhone(Long.parseLong(userPhoneParam));
               }
//           adm.setPhone(Long.parseLong(request.getParameter("userphone")));
           adm.setPassword(request.getParameter("password"));
           
			
			AdminDao2 ads = new AdminDao2();
			
			int status= ads.updateRecord(adm);
	
			if(status==1)
			{
				  pw.print("<h3>Record saved Successfully! </h3>");
					 
			}
			else
			{
				  pw.print("<h3>Unable to save record please try again </h3>");
				  request.getRequestDispatcher("UpdateEmployee.jsp").include(request, response);
			 
			}
		}
		else if(action.equals("View All"))
		{
			int pageno = Integer.parseInt(request.getParameter("page"));
			int total=5;
			int index;
				if(pageno==1)
				{
					index=0;
				}
				else
				{
					index= (pageno-1)*total;
					
				}
			
			
			AdminDao2 add = new AdminDao2();
			List<Admin> list = add.getRecords(index,total);
			
			HttpSession session = request.getSession();
			session.setAttribute("admlist", list);
			request.getRequestDispatcher("ViewallAdmin.jsp").forward(request, response);
		}
		
	

}
}
