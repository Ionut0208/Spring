package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	@GetMapping("/")
	public String sayHi() {
		return "Hello world";
	}

	@GetMapping("/{name}")
	public String sayHiToSomeOne(@PathVariable String name) {
		return "Hello " + name;
	}
}


