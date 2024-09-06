package com.example.rest_service;


import com.example.rest_service.dabase.mysqlConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class GreetingController {

    @GetMapping("/TesteDb")
    public String greeting() {
        // Conectando ao banco de dados
        Connection connection = mysqlConnection.connect();

        if (connection != null) {
            try {
                // Exemplo: você pode realizar alguma operação no banco, como uma inserção ou busca
                Statement stmt = connection.createStatement();
                String query = "SELECT * FROM messages WHERE id = 1";
                // Executar a consulta (exemplo, sem lógica de processamento)
                 var consulta = stmt.executeQuery(query);
                 if (consulta.next()) {
                     String message = consulta.getString("message");
                     return message;
                 }
            } catch (SQLException e) {
                return "Erro ao acessar o banco de dados: " + e.getMessage();
            } finally {
                try {
                    connection.close(); // Fechando a conexão
                } catch (SQLException e) {
                    return "Erro ao fechar a conexão com o banco de dados: " + e.getMessage();
                }
            }
        } else {
            return "Erro: Não foi possível conectar ao banco de dados.";
        }
        return "deu ruim";
    }
}