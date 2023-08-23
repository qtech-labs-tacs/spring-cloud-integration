package com.yagnaiq.clients.feign;


import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "microservice-2", contextId = "client-1")
public interface Microservice2Client {
	
	@GetMapping("/microservice-2/api/v1/microservice2/message")
	public String getMessage();
	

}
	