package com.momo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.momo.config.AppConfig;
import com.momo.repo.RoleRepo;
import com.momo.service.UserService;

public class MainTest {

	public static void main(final String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service = ctx.getBean(UserService.class);
		System.out.println(service.getlastnameByUsername("ok"));

		RoleRepo roleRepo = ctx.getBean(RoleRepo.class);
		System.out.println(roleRepo.getAllRoles());
	}
}
