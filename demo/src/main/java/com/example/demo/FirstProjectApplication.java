package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	@GetMapping("/hello")
	public String sayHi() {
		return "Hello world";
	}

	@GetMapping("/{name}")
	public String sayHiToSomeOne(@PathVariable String name) {
		return "Hello " + name;
	}

}
