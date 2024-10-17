package com.Linkdin.view;

import java.util.Scanner;
import java.util.logging.Logger;

import com.Linkdin.controller.LinkdinController;
import com.Linkdin.controller.LinkdinControllerInterface;
import com.Linkdin.utility.LinkdinControllerFactory;

public class LinkdinView {
	private static Logger log = Logger.getLogger("LinkdinView");
	public static void main(String args[]){
		
		String ss= "y";
		
		 while(ss.equals("y")) {
		log.info("***********Main Menu************");
		log.info("Enter your choice");
		log.info("Press 1 to Create  profile");
		log.info("Press 2 to view profile");
		log.info("Enter 3 to view all profile");
		log.info("Enter 4 to login profile");
		log.info("Enter 5 to search profile");
		log.info("Enter 6 to delete profile");
		log.info("Enter 7 to edit profile");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkdinControllerInterface lk = LinkdinControllerFactory.createObject("user");
		
		switch(n) {
		case 1:  lk.createProfileController();
			break;
		case 2:  lk.viewProfileController();
		    break;
		case 3:  lk.viewAllProfileController();
		    break;
		case 4:  lk.loginProfileController();
		    break;
		case 5:  lk.searchProfileController();
		    break;
		case 6:  lk.deleteProfileController();
		    break;
		case 7: lk.editProfileController();
		    break;
	    default:
			System.out.println("Enter valid number");
			
		}
		System.out.println("Enter y to continue");
	    ss = sc.next();
		 }
		
		}
	}

