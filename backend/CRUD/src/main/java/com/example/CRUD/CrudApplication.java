package com.example.CRUD;

import com.example.CRUD.database.DatabaseConnection;
import com.example.CRUD.database.DatabaseQuery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@SpringBootApplication
@RestController
public class CrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudApplication.class, args);
	}

	@GetMapping("/getUsers")
	public String users() {
		DatabaseQuery databaseQuery = new DatabaseQuery();
		try {
			return databaseQuery.getAllUsers();
		} catch (SQLException e) {
			e.printStackTrace();
			return "Error retrieving users.";
		}
	}
}
