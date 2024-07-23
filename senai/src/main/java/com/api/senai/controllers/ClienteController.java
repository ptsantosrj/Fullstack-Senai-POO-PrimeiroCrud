package com.api.senai.controllers;

import org.springframework.web.bind.annotation.*;

import com.api.senai.classes.Cliente;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    // Get all clients
    @GetMapping
    public String getAllClientes() {
        if(!Cliente.clientes.isEmpty()) {
            // Usar o Gson para retornar os objetos
            return Cliente.clientes.toString();
        } else {
            return "Não há clientes cadastrados.";
        }
    }

    @PostMapping
    public String addCliente(@RequestBody Cliente cliente) {

        System.out.println("Adicionando cliente...");

        Cliente.clientes.add(cliente);
        return "Cliente adicionado com sucesso!";
    }
}
