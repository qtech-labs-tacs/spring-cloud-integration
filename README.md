### Spring Cloud

* Discovery Service
* Discovery Client
* API Gateway
* Sleuth
* Feign Client



---


#### Discovery Service

* Service Registry which have information about all the microservices 
* All microservices register/connect to Discovery Service on start up


```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```





---

#### Discovery Client


* Used by microservices to register themself with Discovery Service

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```








---

#### API Gateway


* Single Entry Point for our Enterprise Product/Application
* API Gateway will take Discovery Service help to find the hostname or hostpath
* API Gateway also do Load Balancing of incoming requests 
* All APIs will be called via API Gateway
* API Gateway stores the Routing information for all the REST Endpoint exposed by different microservices 


```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>


<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
```








---

#### Sleuth

* Sleuth is used for Distributed Tracing

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>
```
	





---

#### Feign Client


* Feign is a Declarative HTTP Client 

```
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```


