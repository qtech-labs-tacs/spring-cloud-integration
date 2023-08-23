package com.yagnaiq.clients.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**Feign Client for Microservice2Controller1
 * 
 * @author aamirqureshi
 *
 */
@FeignClient(name = "microservice-2", contextId = "client-1")
public interface Microservice2Client1 {
	
	@GetMapping("/api/v1/microservice2/message")
	public String getMessage();
	

}
	