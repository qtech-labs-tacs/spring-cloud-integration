package com.yagnaiq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/microservice2")
public class Microservice2Controller2 {
	
	private static final Logger log = LoggerFactory.getLogger(Microservice2Controller2.class);
	
	@GetMapping(value = "/message1")
	public String getMessage1() {
		log.info("Microservice 2 message 2");
		return "Message 2 from Microservice-2 ";
	}
}
