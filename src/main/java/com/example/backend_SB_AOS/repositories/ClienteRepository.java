package com.example.backend_SB_AOS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend_SB_AOS.models.Cliente;

// Interface que estende JpaRepository para realizar operações de persistência relacionadas à entidade Cliente
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
