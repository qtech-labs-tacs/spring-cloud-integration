package com.yagnaiq.clients.feign;


import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "microservice-2", contextId = "client-3", url = "http://192.168.49.2:32001")
//@FeignClient(name = "microservice-2", contextId = "client-3", url = "${url.property}")
public interface Microservice2Client3 {
	
	@GetMapping("/microservice-2/api/v1/microservice2/message1")
	public String getMessage1();
	
}