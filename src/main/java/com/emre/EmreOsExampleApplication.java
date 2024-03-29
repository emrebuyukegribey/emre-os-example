package com.emre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmreOsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmreOsExampleApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello !!!";
	}

}
