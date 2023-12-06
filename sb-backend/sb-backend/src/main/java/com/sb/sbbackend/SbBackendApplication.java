package com.sb.sbbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SbBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(SbBackendApplication.class, args);

		System.out.println("hello world");
	}

}
