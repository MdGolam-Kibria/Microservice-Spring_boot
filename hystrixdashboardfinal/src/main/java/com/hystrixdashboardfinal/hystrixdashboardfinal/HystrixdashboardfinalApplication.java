package com.hystrixdashboardfinal.hystrixdashboardfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixdashboardfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixdashboardfinalApplication.class, args);
	}

}
