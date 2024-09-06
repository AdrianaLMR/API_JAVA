package com.example.rest_service.dabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlConnection {
    public static Connection connect() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/hellocontrollerdb";
            String user = "root";
            String password = "KUr52Vrkr7%5e%x6WUVB";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Conectado ao banco de dados MySQL!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return connection;
    }
}

