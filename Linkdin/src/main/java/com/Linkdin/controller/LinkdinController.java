package com.Linkdin.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.Linkdin.entity.LinkdinUser;
import com.Lindkin.exception.ProfileNotFoundException ;
import com.Linkdin.service.LinkdinService;
import com.Linkdin.service.LinkdinServiceFactory;
import com.Linkdin.service.LinkdinServiceInterface;


public class LinkdinController implements LinkdinControllerInterface {

	Logger log = Logger.getLogger("Controller");
	@Override
	public void createProfileController() {
		// TODO Auto-generated method 
		
		
		System.out.println("Enter name");
		Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        
        LinkdinUser lu = new LinkdinUser();
        lu.setName(name);
        lu.setPassword(password);
        lu.setEmail(email);
        lu.setAddress(address);
        
        
    	LinkdinServiceInterface lsi = LinkdinServiceFactory.createObject("User");
        int i = lsi.createProfileService(lu);
    	if(i>0) {
			log.info("profile created at "+LocalDateTime.now());
		}
		else {
			log.error("could not create");
		}
        	sc.close();	
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email to view profile");
		String email = sc.nextLine();
		
		LinkdinUser lu = new LinkdinUser();
		lu.setEmail(email);
		
		
		LinkdinServiceInterface ls = new LinkdinService();
		LinkdinUser l1 = ls.viewProfileService(lu);
		
		try {
			if(l1!=null) {
				System.out.println("Your profile is");
				System.out.println("Name is -->"+l1.getName());
				System.out.println("Password is -->"+l1.getPassword());
				System.out.println("Email is -->"+l1.getEmail());
				System.out.println("Address is -->"+l1.getAddress());
				
			}
			else {
				throw new ProfileNotFoundException("Profile not found for given mail id" +email);
			}
		}
			catch(Exception e) {
				System.out.println(e);
				
			}
		sc.close();	
		}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub
		LinkdinServiceInterface lss = new LinkdinService();
		
		List<LinkdinUser> ll = lss.viewAllProfileService();
		
		for(LinkdinUser vv :ll) {
			System.out.println("************************");
			System.out.println("Name is -->"+vv.getName());
			System.out.println("Password is -->"+vv.getPassword());
			System.out.println("Email is -->"+vv.getEmail());
			System.out.println("Address is -->"+vv.getAddress());
			
			
		}
		
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email and password to login in a profile ");
		String email = sc.nextLine();
		String password = sc.nextLine();
		LinkdinUser lu = new LinkdinUser();
		lu.setEmail(email);
		lu.setPassword(password);		
		
		LinkdinServiceInterface lsi = new LinkdinService();
		LinkdinUser l2 = lsi.loginProfileService(lu);
		
		try {
			if(l2 != null) {
				System.out.println("Your profile is");
				System.out.println("Name is -->"+l2.getName());
				System.out.println("Password is -->"+l2.getPassword());
				System.out.println("Email is -->"+l2.getEmail());
				System.out.println("Address is -->"+l2.getAddress());
				
			}
			else {
				throw new ProfileNotFoundException("Profile not found for given mail id" +email);
			}
		}catch(Exception e) {
			System.out.println(e);
			}
			
		}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to search a profile");
		String name = sc.nextLine();
		
		LinkdinUser lu = new LinkdinUser();
		lu.setName(name);
		LinkdinServiceInterface lsu = new LinkdinService();
		LinkdinUser l3 = lsu.searchProfileService(lu);
		try {
		if(l3 != null) {
			System.out.println("Profile found on given name " +name);
			
		}
		else {
			throw new ProfileNotFoundException("Profile not found for given name " +name);
		}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to delete profile");
		String name = sc.nextLine();
		
		LinkdinUser lu = new LinkdinUser();
		lu.setName(name);
		LinkdinServiceInterface lsi = new LinkdinService();
		int ld =lsi.deleteProfileService(lu);
		try {
		if(ld > 0) {
			System.out.println("Your profile is deleted");
			
		}else {
			throw new ProfileNotFoundException("Profile not found for given name " +name);
		}
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email to edit profile");
		String email = sc.nextLine();
	    LinkdinUser lu = new LinkdinUser();
	    lu.setEmail(email);
	    LinkdinServiceInterface lse = new LinkdinService(); 
	    LinkdinUser le = lse.viewProfileService(lu);
	    try {
	    	 if(le != null) {
	    			System.out.println("Your old profile is ");
	    			System.out.println("Name is -->"+le.getName());
	    			System.out.println("Password is -->"+le.getPassword());
	    			System.out.println("Email is --> "+le.getEmail());
	    			System.out.println("Address is -->"+le.getAddress());
	    			
	    			System.out.println("press 1 to change password");
	    			System.out.println("press 2 to change address");
	    			
	    			System.out.println("enter choice");
	    			int n = sc.nextInt();
	    			switch(n) {
	    			
	    			case 1:   System.out.println("enter new password ");
	    					  String npassword=sc.next();
	    					  le.setPassword(npassword);
	    					  int i = lse.editProfileService(le);
	    					  if(i>0) {
	    						  System.out.println("password changed");
	    					  }
	    					  break;
	    			case 2:   System.out.println("enter new address ");
			  		          String naddress=sc.next();
			  		
			  		         le.setAddress(naddress);
					         int m =lse.editProfileService(le);
					  
					         if(m>0) {
						            System.out.println("Address changed");
					             }
				             break;
				   default : System.out.println("wrong choice");
				
	    				 
	    				}
	    			}
	    			else {
	    				throw new ProfileNotFoundException("profile not found for given mail id" +email);
	    			}
	    	 
    	}catch(Exception e) {
    		    e.printStackTrace();
    	}
	}
	   
		
	}
		
	
	

	


//Arraylist data structure present in list interface and it is dynamic and completion is utility of java
//if has object of any class using instance of operator to find object of which class
//homegenous and heterogenous objects ,Our collection for a specific class  it is known as generic collection
//extended for loop and enhanced for loop
//collen right side u wirte collection and left side class