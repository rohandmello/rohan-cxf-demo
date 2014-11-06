package com.rohan.api.service.entity;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService
public interface EntityService {

	@WebMethod
	@WebResult(name="EntityName")
	public List<String> getEntityName(@WebParam(name = "accountID") long id) throws Exception;
	
	@WebMethod
	@WebResult(name = "EntityAdded")
	public boolean addEntity(@WebParam(name = "Entity") String entityName);
}
