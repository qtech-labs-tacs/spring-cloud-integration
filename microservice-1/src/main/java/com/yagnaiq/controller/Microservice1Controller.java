package com.yagnaiq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagnaiq.clients.CommonClient;
import com.yagnaiq.clients.feign.Microservice2Client;
import com.yagnaiq.clients.feign.Microservice2Client2;
import com.yagnaiq.clients.feign.Microservice2Client3;

@RestController
@RequestMapping(value = "/api/v1/microservice1")
public class Microservice1Controller {

	private static final Logger log = LoggerFactory.getLogger(Microservice1Controller.class);
	
//	@Autowired
//	private Microservice2Client m2client;
//
//	@Autowired
//	private Microservice2Client2 m2client2;
//	
//	@Autowired
//	private Microservice2Client3 m2client3;
//	

	@GetMapping(value = "/message")
	public String getMessage() {
		log.info("Microservice 1 called new code new code new code   : {}");
		log.info("Microservice 1 called latest log: {}");
		CommonClient obj = new CommonClient();
		
//		m2client3.getMessage1();
//		m2client.getMessage();
//		m2client2.getMessage1();
		return "Hello K8S";

		
	}

	
}
