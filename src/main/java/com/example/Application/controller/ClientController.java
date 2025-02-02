package com.example.Application.controller;

import com.example.Application.resource.Client;
import com.example.Application.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/getClients")
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/getClientById")
    public Client getClient(@RequestParam(value = "id") Integer id) {
        return clientService.getClientById(id);
    }
}
