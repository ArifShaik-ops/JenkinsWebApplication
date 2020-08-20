package com.axis.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSpringBootSampleApplication.class, args);
		Sysyem.out.println("Web Application");
	}

}
