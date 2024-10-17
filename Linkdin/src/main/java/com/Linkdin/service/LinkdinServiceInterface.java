package com.Linkdin.service;

import java.util.List;

import com.Linkdin.entity.LinkdinUser;

public interface LinkdinServiceInterface {

	int createProfileService(LinkdinUser lu);
	LinkdinUser viewProfileService(LinkdinUser lu);
	List<LinkdinUser> viewAllProfileService();
	LinkdinUser loginProfileService(LinkdinUser lu);
	LinkdinUser searchProfileService(LinkdinUser lu);
	int deleteProfileService(LinkdinUser lu);
	int editProfileService(LinkdinUser lu);
	
	

}
