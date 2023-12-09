package com.example.backend_SB_AOS.services;

import com.example.backend_SB_AOS.models.Recepcionista;
import com.example.backend_SB_AOS.repositories.RecepcionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecepcionistaService {

    private final RecepcionistaRepository recepcionistaRepository;

    @Autowired
    public RecepcionistaService(RecepcionistaRepository recepcionistaRepository) {
        this.recepcionistaRepository = recepcionistaRepository;
    }

    public List<Recepcionista> listarRecepcionistas() {
        return recepcionistaRepository.findAll();
    }

    public Optional<Recepcionista> obterRecepcionistaPorId(Long id) {
        return recepcionistaRepository.findById(id);
    }

    public Recepcionista salvarRecepcionista(Recepcionista recepcionista) {
        return recepcionistaRepository.save(recepcionista);
    }

    public void deletarRecepcionista(Long id) {
        recepcionistaRepository.deleteById(id);
    }
}
