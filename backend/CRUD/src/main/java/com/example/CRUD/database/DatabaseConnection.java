package com.example.CRUD.database;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {

    public static Connection init() {

        Dotenv dotenv = Dotenv.load();

        Connection connection = null;
        try {
            String url = dotenv.get("URL_DATABASE");
            String username = dotenv.get("USERNAME_DATABASE");
            String password = dotenv.get("PASSWORD_DATABASE");
            connection = DriverManager.getConnection(
                    url,
                    username,
                    password);
            System.out.println("connection successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
