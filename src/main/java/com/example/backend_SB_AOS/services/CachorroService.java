package com.example.backend_SB_AOS.services;

import com.example.backend_SB_AOS.models.Cachorro;
import com.example.backend_SB_AOS.repositories.CachorroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CachorroService {

    private final CachorroRepository cachorroRepository;

    public CachorroService(CachorroRepository cachorroRepository) {
        this.cachorroRepository = cachorroRepository;
    }

    public List<Cachorro> getAllCachorros() {
        return cachorroRepository.findAll();
    }

    public Optional<Cachorro> getCachorroById(Long id) {
        return cachorroRepository.findById(id);
    }

    public Cachorro saveCachorro(Cachorro cachorro) {
        return cachorroRepository.save(cachorro);
    }

    public void deleteCachorro(Long id) {
        cachorroRepository.deleteById(id);
    }
}