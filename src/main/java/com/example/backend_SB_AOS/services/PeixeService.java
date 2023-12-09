package com.example.backend_SB_AOS.services;

import com.example.backend_SB_AOS.models.Peixe;
import com.example.backend_SB_AOS.repositories.PeixeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeixeService {

    private final PeixeRepository peixeRepository;

    @Autowired
    public PeixeService(PeixeRepository peixeRepository) {
        this.peixeRepository = peixeRepository;
    }

    public List<Peixe> listarPeixes() {
        return peixeRepository.findAll();
    }

    public Optional<Peixe> obterPeixePorId(Long id) {
        return peixeRepository.findById(id);
    }

    public Peixe salvarPeixe(Peixe peixe) {
        return peixeRepository.save(peixe);
    }

    public void deletarPeixe(Long id) {
        peixeRepository.deleteById(id);
    }
}
