package com.momo.service;

import com.momo.repo.UserRepo;

public class UserServiceImpl implements UserService {

	private UserRepo userRepo;

	public String getlastnameByUsername(final String username) {
		return userRepo.getlastnameByUsername(username);
	}

	public void setUserRepo(final UserRepo userRepo) {
		this.userRepo = userRepo;
	}
}
