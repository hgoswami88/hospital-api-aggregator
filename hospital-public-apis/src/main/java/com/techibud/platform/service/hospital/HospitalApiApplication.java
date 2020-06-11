package com.techibud.platform.service.hospital;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HospitalApiApplication {

	public static void main(String[] args) {
		log.info("Hospital application is starting");
		SpringApplication.run(HospitalApiApplication.class, args);
		log.info("Hospital application started done");
	}

}
