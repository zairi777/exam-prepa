package com.momo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.momo.repo.UserRepo;
import com.momo.repo.UserRepoImpl;

@Configuration
@ComponentScan("com.momo.repo")
public class RepoConfig {

	@Bean
	public UserRepo userRepo() {
		return new UserRepoImpl();
	}
}
