package com.wangyong.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wangyong.cloud"})
public class MicroservicecloudConsumerDept80FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerDept80FeignApplication.class, args);
	}

}
