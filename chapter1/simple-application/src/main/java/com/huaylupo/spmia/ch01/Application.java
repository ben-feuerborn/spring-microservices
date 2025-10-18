package com.huaylupo.spmia.ch01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping(value="/{firstName}")
	public String helloGET( 
			@PathVariable("firstName") String firstName,
			@RequestParam("lastName") String lastName) {
		return String.format("{\"message\":\"Hello %s %s\"}",firstName, lastName);
	}
	
	// Add two more GET endpoints to enhance your program. Use the following two GET endpoints:
	// GET 'hello/ping' - This endpoint should return one string ‘pong’ as the response.
	@GetMapping(value="/ping")
	public String helloPingGet() {
		return String.format("{\"message\":\"pong\"}");
	}

	// GET ‘hello/ping?name=health’ - This endpoint should return a string ‘pong health’ as the response.
	@GetMapping(value="/ping", params="name")
	public String helloPingNameGET(
		@RequestParam("name") String name
	) {
		return String.format("{\"message\":\"pong %s\"}", name);
	}

	@PostMapping
	public String helloPOST( @RequestBody HelloRequest request) {
		return String.format("{\"message\":\"Hello %s %s\"}",request.getFirstName(), request.getLastName());
	}
}

class HelloRequest{
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

