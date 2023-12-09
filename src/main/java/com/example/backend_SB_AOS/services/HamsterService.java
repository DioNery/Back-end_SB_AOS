package com.example.backend_SB_AOS.services;

import com.example.backend_SB_AOS.models.Hamster;
import com.example.backend_SB_AOS.repositories.HamsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HamsterService {

    private final HamsterRepository hamsterRepository;

    @Autowired
    public HamsterService(HamsterRepository hamsterRepository) {
        this.hamsterRepository = hamsterRepository;
    }

    public List<Hamster> listarHamsters() {
        return hamsterRepository.findAll();
    }

    public Optional<Hamster> obterHamsterPorId(Long id) {
        return hamsterRepository.findById(id);
    }

    public Hamster salvarHamster(Hamster hamster) {
        return hamsterRepository.save(hamster);
    }

    public void deletarHamster(Long id) {
        hamsterRepository.deleteById(id);
    }
}
