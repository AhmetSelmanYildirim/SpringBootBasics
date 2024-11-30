package com.ahmetselmanyildirim.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Spring frameworkunde çalışacağı için @SpringBootApplication anotasyonunu kullanıyoruz.
public class HelloworldApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloworldApplication.class, args);
	}

}
