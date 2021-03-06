package com.rmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rmi.anno.EnableAutoRemoteLookup;

@SpringBootApplication
@EnableAutoRemoteLookup
public class CostomerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CostomerApplication.class, args);
	} 
}
