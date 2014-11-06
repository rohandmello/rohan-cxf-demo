package com.rohan.api.service.auth;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import com.rohan.api.repo.EntityRepository;

public class ServicePasswordCallbackHandler implements CallbackHandler{

	private EntityRepository entityRepository;
	
	public void setEntityRepository(EntityRepository entityRepository) {
		this.entityRepository = entityRepository;
	}

	@Override
	public void handle(Callback[] callback) throws IOException,
			UnsupportedCallbackException {
		for(Callback cb : callback){
			if(cb instanceof WSPasswordCallback){
				doAuthentication((WSPasswordCallback) cb);
			}
		}
	}

	private void doAuthentication(WSPasswordCallback cb) {
		try{
			if(cb.getIdentifier().equals("rohan")){
//				cb.setPassword("password1!");
				cb.setPassword(entityRepository.getPasswordForUser("rohan"));
			}/*else{
				throw new Exception();				
			}*/
		}catch(SecurityException e){
			throw new SecurityException("Authentication Failed");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
