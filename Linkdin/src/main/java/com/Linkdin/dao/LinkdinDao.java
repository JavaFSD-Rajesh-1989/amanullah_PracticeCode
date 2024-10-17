package com.Linkdin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Linkdin.entity.LinkdinUser;

public class LinkdinDao implements LinkdinDaoInterface {
	

	@Override
	public int createProfileDao(LinkdinUser lu) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkdinproject","root","Soft123@#");
			PreparedStatement ps = con.prepareStatement("insert into LinkdinUser values (?,?,?,?)");
			ps.setString(1,lu.getName());
			ps.setString(2,lu.getPassword());
			ps.setString(3, lu.getEmail());
			ps.setString(4,lu.getAddress());
			i = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//PreparedStatement ps = con.prepareStatement("insert into LinkdinUser values ("?,?,?,?")");
		return i;
	}

	@Override
	public LinkdinUser viewProfileDao(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinUser l2 = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LinkdinProject","root","Soft123@#");
			PreparedStatement ps = con.prepareStatement("select * from linkdinUser where email =?");
			ps.setString(1,  lu.getEmail());
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				l2 = new LinkdinUser();
				l2.setName(n);
				l2.setPassword(p);
				l2.setEmail(e);
				l2.setAddress(a);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return l2;
	}

	@Override
	public List<LinkdinUser> viewAllProfileDao() {
		// TODO Auto-generated method stub
		List<LinkdinUser> ll = new ArrayList<LinkdinUser>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LinkdinProject","root","Soft123@#");
		    PreparedStatement ps = con.prepareStatement("select * from linkdinUser");
			
		    ResultSet res = ps.executeQuery();
		    while(res.next()) {
		    	String n = res.getString(1);
		    	String p = res.getString(2);
		    	String e = res.getString(3);
		    	String a = res.getString(4);
		    	
		    	LinkdinUser l1 = new LinkdinUser();
		    	l1.setName(n);
		    	l1.setPassword(p);
		    	l1.setEmail(e);
		    	l1.setAddress(a);
		    	ll.add(l1);
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return ll;
	}

	@Override
	public LinkdinUser loginProfileDao(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinUser l3 = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LinkdinProject","root","Soft123@#");
			PreparedStatement ps = con.prepareStatement("select * from linkdinUser where email=? and password=?");
		    ps.setString(1, lu.getEmail());
		    ps.setString(2, lu.getPassword());
		    ResultSet rs = ps.executeQuery();
		    if(rs.next()) {
		    	String n = rs.getString(1);
		    	String p = rs.getString(2);
		    	String e = rs.getString(3);
		    	String a = rs.getString(4);
		    	
		    	l3 = new LinkdinUser();
		    	l3.setName(n);
		    	l3.setPassword(p);
		    	l3.setEmail(e);
		    	l3.setAddress(a);
		        	
		    }
		    
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return l3;
	}

	@Override
	public LinkdinUser searchProfileDao(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinUser l4 = null ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Linkdinproject","root","Soft123@#");
		    PreparedStatement ps = conn.prepareStatement("select name from linkdinUser where name = ?");
		    ps.setString(1,lu.getName());
		    ResultSet res = ps.executeQuery();
		    
		    if(res.next()) {
		    	 
		    	 String n = res.getString(1);
		    	 l4 = new LinkdinUser();
		    	 l4.setName(n);
		    	 
		    }
		   
		    
		    
		      
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return l4;
	}

	@Override
	public int deleteProfileDao(LinkdinUser lu) {
		// TODO Auto-generated method stub
		int l = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LinkdinProject","root","Soft123@#");
			PreparedStatement ps = con.prepareStatement("delete from linkdinUser where name = ?");
			ps.setString(1,lu.getName());
			l = ps.executeUpdate();	
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return l;
	}

	@Override
	public int editProfileDao(LinkdinUser lu) {
		// TODO Auto-generated method stub
		int l5 = 0 ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LinkdinProject","root","Soft123@#");
			PreparedStatement ps = con.prepareStatement("update linkdinuser set password=?, address = ? where email=?");
		
			ps.setString(1, lu.getPassword());
			ps.setString(2, lu.getAddress());
			ps.setString(3, lu.getEmail());
			l5 = ps.executeUpdate();

			
		}catch(Exception e) {
			e.getStackTrace();
			
		}
		return l5;
		
	}

}
