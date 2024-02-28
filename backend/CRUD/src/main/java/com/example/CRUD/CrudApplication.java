package com.example.CRUD;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {


		Dotenv dotenv = Dotenv.configure().load();

		System.setProperty("URL_DATABASE", dotenv.get("URL_DATABASE"));
		System.setProperty("USERNAME_DATABASE", dotenv.get("USERNAME_DATABASE"));
		System.setProperty("PASSWORD_DATABASE", dotenv.get("PASSWORD_DATABASE"));

		SpringApplication.run(CrudApplication.class, args);
	}


}


