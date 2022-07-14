package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternationalizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternationalizationApplication.class, args);
	}
// imakes your application adaptable to different langauges and regions without engineering changes on the source code
}
//steps:-Understand locale(know language codes), configure locale resolver and interceptor in spring, create language files(messages_XX.properties)
