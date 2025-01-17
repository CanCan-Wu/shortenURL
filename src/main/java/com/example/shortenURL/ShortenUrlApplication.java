package com.example.shortenURL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.example.shortenURL.obj")
@EnableJpaRepositories("com.example.shortenURL.service.repository")
@SpringBootApplication
public class ShortenUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShortenUrlApplication.class, args);
	}

}
//BBB
//CCC