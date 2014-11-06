package com.rohan.api.repo;

public class EntityRepositoryImpl implements EntityRepository {

	@Override
	public String getPasswordForUser(String userID) {
		return "password1!";
	}

}
