package com.Linkdin.dao;

import java.util.List;

import com.Linkdin.entity.LinkdinUser;

public interface LinkdinDaoInterface {

	  int createProfileDao(LinkdinUser lu);

	LinkdinUser viewProfileDao(LinkdinUser lu);

	List<LinkdinUser> viewAllProfileDao();

	LinkdinUser loginProfileDao(LinkdinUser lu);

	LinkdinUser searchProfileDao(LinkdinUser lu);

	int deleteProfileDao(LinkdinUser lu);

	int editProfileDao(LinkdinUser lu);
	  
	  

}
