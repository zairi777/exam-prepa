package com.momo.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class RoleRepoImpl implements RoleRepo {

	public List<String> getAllRoles() {
		return Arrays.asList("ADMIN");
	}

}
