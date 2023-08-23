package com.yagnaiq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagnaiq.clients.feign.Microservice2Client1;
import com.yagnaiq.clients.feign.Microservice2Client2;

@RestController
@RequestMapping(value = "/api/v1/microservice1")
public class Microservice1Controller {

	private static final Logger log = LoggerFactory.getLogger(Microservice1Controller.class);
	
	@Autowired
	private Microservice2Client1 m2client1;

	@Autowired
	private Microservice2Client2 m2client2;
	
	

	@GetMapping(value = "/message")
	public String getMessage() {
		log.info("Microservice 1");
		
		m2client1.getMessage();
		m2client2.getMessage1();
		
		return "Hello K8S";

		
	}

	
}
