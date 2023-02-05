package com.example.jenkinsmultibranch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsMultibranchApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Jenkins";
	}

	@GetMapping("/goodbye")
	public String goodbye() {
		return "goodbye Jenkins";
	}



	public static void main(String[] args) {
		SpringApplication.run(JenkinsMultibranchApplication.class, args);
	}

}
