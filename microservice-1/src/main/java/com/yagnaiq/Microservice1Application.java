package com.yagnaiq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.core.env.Environment;




@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Microservice1Application implements CommandLineRunner{

    private static final Logger logger = LoggerFactory.getLogger(Microservice1Application.class);
    
    @Autowired
    private Environment env;
    
	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("{}", env.getProperty("database.cassandra.host"));
        logger.info("{}", env.getProperty("database.cassandra.port"));		
	}

}
