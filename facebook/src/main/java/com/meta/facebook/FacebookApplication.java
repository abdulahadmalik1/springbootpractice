package com.meta.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacebookApplication {

	public static void main(String[] args) {
		// Run the Spring application and get the application context
		var a= SpringApplication.run(FacebookApplication.class, args);
		var a2=a.getBean(check.class);
		System.out.println("No problem solved");
	}
}
