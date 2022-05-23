package com.company.rulesengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RulesEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RulesEngineApplication.class, args);
	}
	public static ConfigurableApplicationContext run(String[] args) {
		return SpringApplication.run(RulesEngineApplication.class, args);
	}

}
