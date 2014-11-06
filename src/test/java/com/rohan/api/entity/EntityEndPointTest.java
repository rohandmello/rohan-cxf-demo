package com.rohan.api.entity;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rohan.api.service.entity.EntityService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-beans.xml"})
public class EntityEndPointTest {

	EntityService service;
	
	@Autowired
	private JaxWsProxyFactoryBean testEntityClient;
	
	@Before
	public void setUp() throws Exception {
		service = testEntityClient.create(EntityService.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetEntityName() throws Exception {
		List<String> entityList = service.getEntityName(201);
		assertTrue(entityList.get(0).equals("Rohan Tech"));
	}

}
