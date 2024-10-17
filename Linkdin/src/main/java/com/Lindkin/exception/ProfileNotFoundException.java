package com.Lindkin.exception;


public class ProfileNotFoundException extends Exception {
	
	 /**
	 * 
	 */
	
	String message ;
	public ProfileNotFoundException(String message) {
		// TODO Auto-generated constructor stub
	   this.message = message ;
	}
	
   public String toString() {
	   return "I am exception " +message ;
	   
   }
   
	

	
	
}
