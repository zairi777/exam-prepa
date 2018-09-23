package com.momo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(RepoConfig.class)
@ImportResource(value = "classpath:spring/appContext.xml")
public class AppConfig {

}
