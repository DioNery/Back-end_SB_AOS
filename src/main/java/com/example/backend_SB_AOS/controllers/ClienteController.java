package com.example.backend_SB_AOS.controllers;

import com.example.backend_SB_AOS.models.Cliente;
import com.example.backend_SB_AOS.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petshop/clientes")
public class ClienteController {

    private final ClienteService clienteService;
    
    // Construtor que injeta a dependência do ClienteService no Controller
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Mapeamento para a rota "/petshop/clientes" usando o método HTTP GET
    @GetMapping
    public List<Cliente> listarClientes() {
        // Retorna a lista de todos os clientes chamando o método correspondente do ClienteService
        return clienteService.findAll();
    }

    // Mapeamento para a rota "/petshop/clientes/{id}" usando o método HTTP GET
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obterClientePorId(@PathVariable Long id) {
        // Tenta obter um cliente pelo ID chamando o método correspondente do ClienteService
        return clienteService.findById(id)
                // Se o cliente for encontrado, retorna uma resposta HTTP 200 OK com o cliente
                .map(ResponseEntity::ok)
                // Se o cliente não for encontrado, retorna uma resposta HTTP 404 Not Found
                .orElse(ResponseEntity.notFound().build());
    }

    // Mapeamento para a rota "/petshop/clientes" usando o método HTTP POST
    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        // Salva um novo cliente chamando o método correspondente do ClienteService
        return clienteService.save(cliente);
    }

    // Mapeamento para a rota "/petshop/clientes/{id}" usando o método HTTP DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarCliente(@PathVariable Long id) {
        // Tenta obter um cliente pelo ID chamando o método correspondente do ClienteService
        return clienteService.findById(id)
                // Se o cliente for encontrado, exclui-o e retorna uma resposta HTTP 200 OK
                .map(cliente -> {
                    clienteService.delete(id);
                    return ResponseEntity.ok().build();
                })
                // Se o cliente não for encontrado, retorna uma resposta HTTP 404 Not Found
                .orElse(ResponseEntity.notFound().build());
    }
}
