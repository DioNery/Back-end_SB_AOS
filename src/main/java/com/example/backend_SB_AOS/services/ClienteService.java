package com.example.backend_SB_AOS.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.backend_SB_AOS.models.Cliente;
import com.example.backend_SB_AOS.repositories.ClienteRepository;

import java.util.List;
import java.util.Optional;

// Classe de serviço que encapsula a lógica de negócios relacionada à entidade Cliente
@Service
public class ClienteService {

    // Injeção de dependência do ClienteRepository
    @Autowired
    private ClienteRepository clienteRepository;

    // Método para obter todos os clientes
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    // Método para obter um cliente pelo ID
    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }

    // Método para salvar ou atualizar um cliente
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Método para excluir um cliente pelo ID
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}

