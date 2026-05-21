package com.examfinal.demo.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class DataSource {
    @Bean
    public Connection getConnection() throws SQLException {
        try {
            String url = "jdbc:postgresql://localhost:5432/techadvisor";
            String username = "postgres";
            String password = "Kokoo271107.";
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}