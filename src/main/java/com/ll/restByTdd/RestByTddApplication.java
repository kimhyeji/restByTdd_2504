package com.ll.restByTdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
@ActiveProfiles("test")
public class RestByTddApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestByTddApplication.class, args);
	}

}
