package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@SpringBootApplication
@EnableDataFlowServer
public class SpringBatchAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchAdminApplication.class, args);
	}
}
