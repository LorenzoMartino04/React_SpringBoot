package com.example.CRUD.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseQuery {
    public String getAllUsers() throws SQLException {
        String query = "SELECT * FROM users";
        StringBuilder result = new StringBuilder();

        Connection connection = DatabaseConnection.init();
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        try (connection; preparedStatement) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");

                result.append("ID: ").append(id).append(", Username: ").append(username).append(", Email: ").append(email).append(", Password: ").append(password).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
