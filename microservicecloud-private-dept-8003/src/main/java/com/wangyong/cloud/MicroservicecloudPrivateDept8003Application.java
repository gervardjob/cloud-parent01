package com.wangyong.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value="com.wangyong.cloud.mapper")
public class MicroservicecloudPrivateDept8003Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudPrivateDept8003Application.class, args);
	}

}
