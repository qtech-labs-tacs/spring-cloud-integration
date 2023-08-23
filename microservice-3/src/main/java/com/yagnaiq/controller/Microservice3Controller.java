package com.yagnaiq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/microservice3")
public class Microservice3Controller {

	private static final Logger log = LoggerFactory.getLogger(Microservice3Controller.class);
	
	@Value("${custom.message:null}")
	private String message1;


	
	@GetMapping(value = "/message")
	public String getMessage() {
		String returnMessage = message1;
		log.info("Microservice 3: {}",returnMessage);
		return returnMessage;
	}

}
