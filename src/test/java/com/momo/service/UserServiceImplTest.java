package com.momo.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.momo.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class UserServiceImplTest {

	@Autowired
	private UserService userService;

	@Test
	public void getLastnameByUsernameTest() {
		Assertions.assertThat(userService.getlastnameByUsername("ok")).isEqualTo("ZAROUAL");
	}
}
