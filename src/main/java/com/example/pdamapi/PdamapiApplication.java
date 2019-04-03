package com.example.pdamapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PdamapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdamapiApplication.class, args);
	}

}
