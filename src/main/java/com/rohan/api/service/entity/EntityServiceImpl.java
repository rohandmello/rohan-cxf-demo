package com.rohan.api.service.entity;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


//@WebService(endpointInterface = "com.rohan.api.entity.EntityService")
public class EntityServiceImpl implements EntityService{

	@Override
//	@WebMethod
	public List<String> getEntityName(long id) throws Exception {
		if(id == 201){
			List<String> entityList = new ArrayList<String>();
			entityList.add("Rohan Tech Ltd");
			entityList.add("brinal Tech Ltd");
			return entityList;
		}
		throw new Exception();
	}

	@Override
	public boolean addEntity(String entityName) {
		if(entityName.equals("RTD Tech"))
			return true;
		else
			return false;
	}

}
