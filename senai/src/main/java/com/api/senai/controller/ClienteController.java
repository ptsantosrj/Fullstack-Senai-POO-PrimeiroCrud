package com.api.senai.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.*;

import com.api.senai.classes.Cliente;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    // Buscar todos os clientes - getAll
    @GetMapping
    public String getAll() {
        if (Cliente.clientes.isEmpty()) {
            return "Não há clientes cadastrados.";
        } else {
            String resposta = Cliente.clientes.toString();
            return resposta;
        }
    }

    // Criar um cliente - create
    @PostMapping
    public String create(@RequestBody Cliente cliente) {
        Cliente.clientes.add(cliente);
        return "Cliente cadastrado com sucesso!";
    }

    // Buscar um cliente por id - getById
    @GetMapping("/{id}")
    public String getById(@PathVariable UUID id) {
        for (Cliente cliente : Cliente.clientes) {
            if (cliente.getId().equals(id)) {
                return cliente.toString();
            }
        }
        return "Cliente não encontrado.";
    }

    // Atualizar um cliente - update

    // Deletar um cliente - delete
    
}
