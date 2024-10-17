package com.Linkdin.service;

import java.util.List;

import com.Linkdin.dao.LinkdinDao;
import com.Linkdin.dao.LinkdinDaoInterface;
import com.Linkdin.entity.LinkdinUser;

public class LinkdinService implements LinkdinServiceInterface {


	@Override
	public int createProfileService(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinDaoInterface ldi = new LinkdinDao();
		int i = ldi.createProfileDao(lu);
		return i;
		
	}

	@Override
	public LinkdinUser viewProfileService(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinDaoInterface ldi = new LinkdinDao();
		
		return ldi.viewProfileDao(lu);
	}

	@Override
	public List<LinkdinUser> viewAllProfileService() {
		LinkdinDaoInterface ldi = new LinkdinDao();
		
		return ldi.viewAllProfileDao();
	}

	@Override
	public LinkdinUser loginProfileService(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinDaoInterface ldi = new LinkdinDao();
		
		return ldi.loginProfileDao(lu);
	}

	@Override
	public LinkdinUser searchProfileService(LinkdinUser lu) {
		// TODO Auto-generated method stub
		
		LinkdinDaoInterface ldo = new LinkdinDao();
		
		
		return ldo.searchProfileDao(lu);
	}

	@Override
	public int deleteProfileService(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinDaoInterface ldd = new LinkdinDao();
		return ldd.deleteProfileDao(lu);
		
	}

	@Override
	public int editProfileService(LinkdinUser lu) {
		// TODO Auto-generated method stub
		LinkdinDaoInterface ldi = new LinkdinDao();
		return ldi.editProfileDao(lu);
		
	}

	
	
	
	

}
