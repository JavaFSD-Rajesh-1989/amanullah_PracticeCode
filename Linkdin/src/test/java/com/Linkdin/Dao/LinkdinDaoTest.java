package com.Linkdin.Dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Linkdin.dao.LinkdinDao;
import com.Linkdin.dao.LinkdinDaoInterface;
import com.Linkdin.entity.LinkdinUser;

public class LinkdinDaoTest {

	 private LinkdinDaoInterface ldao ;
	 
	 
	@Before
	public void setUp() throws Exception {
		ldao = new LinkdinDao();
	}

	@After
	public void tearDown() throws Exception {
		ldao = null ;
	}

	@Test
	public void testCreateProfileDao() {
		
		LinkdinUser lu = new LinkdinUser();
		lu.setName("Amanullah");
		lu.setPassword("Aman");
		lu.setEmail("Aman@gmail.com");
		lu.setAddress("Kota");
		int i = ldao.createProfileDao(lu);
		assert i>0 : "could not create profile";
		
		 
	}

	@Test
	public void testViewProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewAllProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoginProfileDao() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchProfileDao() {
		fail("Not yet implemented");
	}

	
}
