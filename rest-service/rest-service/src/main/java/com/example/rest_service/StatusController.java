//pacote em que a classe está localizada
package com.example.rest_service;

// Importa a anotação @GetMapping, usada para mapear requisições HTTP GET para métodos de um controlador.
import org.springframework.web.bind.annotation.GetMapping;
//: Importa a anotação @RestController, que define a classe como um controlador REST, facilitando a
// criação de APIs que retornam dados diretamente no corpo da resposta.
import org.springframework.web.bind.annotation.RestController;

//Define uma classe como controlador REST no Spring Boot
@RestController
public class StatusController {

    // Método que retorna status ok = 200
    @GetMapping("/status")
    public void getStatus(){


        // Esse método simplesmente retorna um status HTTP 200 OK.
        // O Spring Boot trata automaticamente o status 200 para métodos que não lançam exceções e não retornam erro.
    }
}
