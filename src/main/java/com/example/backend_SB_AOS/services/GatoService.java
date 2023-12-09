package com.example.backend_SB_AOS.services;

import com.example.backend_SB_AOS.models.Gato;
import com.example.backend_SB_AOS.repositories.GatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GatoService {

    private final GatoRepository gatoRepository;

    @Autowired
    public GatoService(GatoRepository gatoRepository) {
        this.gatoRepository = gatoRepository;
    }

    public List<Gato> listarGatos() {
        return gatoRepository.findAll();
    }

    public Optional<Gato> obterGatoPorId(Long id) {
        return gatoRepository.findById(id);
    }

    public Gato salvarGato(Gato gato) {
        return gatoRepository.save(gato);
    }

    public void deletarGato(Long id) {
        gatoRepository.deleteById(id);
    }
}
