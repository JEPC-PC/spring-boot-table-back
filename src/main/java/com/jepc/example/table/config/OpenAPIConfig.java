package com.jepc.example.table.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

public class OpenAPIConfig {

	@Value("${APPLICATION_DESCRIPTION}")
	public String description;

	@Value("${APPLICATION_VERSION}")
	public String version;

	@Value("${APPLICATION_NAME}")
	public String name;

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title(description).version(version).description(name)
				.termsOfService("http://swagger.io/terms/")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
