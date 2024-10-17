package com.Linkdin.utility;
import com.Linkdin.controller.LinkdinControllerInterface;
import com.Linkdin.controller.LinkdinController;


public class LinkdinControllerFactory {
	private LinkdinControllerFactory() {};

	public static LinkdinControllerInterface createObject(String n) {
		if(n.equals("user")) {
			return new LinkdinController();
					
		}
		return null;
	}
}
