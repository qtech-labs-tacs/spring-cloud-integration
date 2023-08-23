package com.yagnaiq.clients.feign;


import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "microservice-2", contextId = "client-2")
public interface Microservice2Client2 {
	
	@GetMapping("/microservice-2/api/v1/microservice2/message1")
	public String getMessage1();
	
	

}
	