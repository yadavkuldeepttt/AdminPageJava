package com.files.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminDao2 {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public AdminDao2() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java11","root","1234");
			System.out.println("Connection created");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public Admin checkLogin(String id,String password)

	{
		Admin a=null;
		
		try {
			ps=con.prepareStatement("select * from admin where id = ? and password=? ");
			ps.setString(1, id);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				a = new Admin();
				a.setId(rs.getString(1));
				a.setName(rs.getString(2));
				a.setAge(rs.getInt(3));
		        a.setPhone(rs.getLong(4));
		        a.setPassword(rs.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;	
	}
	

 	public int saveAdmin(Admin a) {
		int status=0;
		
		try {

	        ps=con.prepareStatement("insert into admin values(?,?,?,?,?)");		

			
			ps.setString(1, a.getId());
			ps.setString(2,a.getName());
			ps.setInt(3,a.getAge());
		
			ps.setLong(4,a.getPhone());
			ps.setString(5,a.getPassword());

			status=ps.executeUpdate();
			System.out.println("Record saved: "+status);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return status;
	}

//	Using map method
//	
//	public int saveAdmin(Map<String,String> ad)
//	{
//		int status = 0;
//		
//		try {
//			ps = con.prepareStatement("insert into admin values(?,?,?,?,?)");
//			ps.setString(1, ad.get("userid"));
//			ps.setString(2, ad.get("username"));
//			ps.setInt(3, Integer.parseInt(ad.get("userage")));
//			ps.setLong(4,Long.parseLong(ad.get("userphone")));
//			ps.setString(5, ad.get("password"));
//			
//			 status = ps.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		
//		return status;
//		
//	}


	public Admin viewRecordById(String userid) {
		
		Admin ad = null;
		
		try {
			ps=con.prepareStatement("select * from admin where id=? ");
			ps.setString(1, userid);
			
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				ad= new Admin();
				ad.setId(rs.getString(1));
				ad.setName(rs.getString(2));
				ad.setAge(rs.getInt(3));
				ad.setPhone(rs.getLong(4));
				ad.setPassword(rs.getString(5));
				
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ad;	}


	public int deleteRecord(String userid) {
	
		int status= 0 ;
		
		try {
			ps =con.prepareStatement("DELETE FROM admin WHERE id = ?");
			ps.setString(1, userid);
			
			status = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}


	public int updateRecord(Admin ad) {

         int status = 0;
		
		try {
			ps = con.prepareStatement("UPDATE admin SET name=?, age=? ,phone=?,password=? WHERE id=?");
		    
			ps.setString(1,ad.getName() );
			ps.setInt(2, ad.getAge());
			ps.setLong(3,ad.getPhone());
			ps.setString(4,ad.getPassword());
			ps.setString(5, ad.getId());
			
			 status = ps.executeUpdate();
			 System.out.println("status: "+status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
    public List<Admin> getRecords(int index, int total)
    {
    	List<Admin> admlist = new ArrayList<Admin>();
    	
    	try {
			ps = con.prepareStatement("select * from admin limit ?,?");
			ps.setInt(1, index);
			ps.setInt(2, total);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Admin ad = new Admin();
				ad.setId(rs.getString(1));
				ad.setName(rs.getString(2));
				ad.setAge(rs.getInt(3));
				ad.setPhone(rs.getLong(4));
				ad.setPassword(rs.getString(5));
				admlist.add(ad);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admlist;
    	
    }
     public int countRecords() 
     {
    	 int count=0;
    	 
    	 try {
			ps = con.prepareStatement("select count(id) from admin");
			rs = ps.executeQuery();
			
			if(rs.next())
			{
				count= rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
     }

	
	
	
}
