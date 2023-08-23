package com.yagnaiq.clients.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/** Feign Client for Microservice2Controller2
 * 
 * @author aamirqureshi
 *
 */
@FeignClient(name = "microservice-2", contextId = "client-2")
public interface Microservice2Client2 {
	
	@GetMapping("/api/v1/microservice2/message1")
	public String getMessage1();
	
	

}
	