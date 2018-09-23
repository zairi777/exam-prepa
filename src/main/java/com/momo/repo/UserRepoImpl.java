package com.momo.repo;

import org.springframework.beans.factory.annotation.Autowired;

public class UserRepoImpl implements UserRepo {

	@Autowired
	private RoleRepo roleRepo;

	public String getlastnameByUsername(final String username) {
		return "ZAROUAL";
	}
}
