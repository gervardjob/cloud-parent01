package com.wangyong.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroservicecloudZuulGateway9527Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudZuulGateway9527Application.class, args);
	}

}
