package spring5_rest_study.service.impl;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import spring5_rest_study.service.MemberListService;

public class MemberListServiceImplTest {
	protected static final Log log = LogFactory.getLog(MemberListService.class);
	
	@Autowired
	private MemberListService memberListService;
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetLists() {
		
	}

}
