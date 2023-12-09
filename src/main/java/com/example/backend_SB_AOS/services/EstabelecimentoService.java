package com.example.backend_SB_AOS.services;

import com.example.backend_SB_AOS.models.Estabelecimento;
import com.example.backend_SB_AOS.repositories.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstabelecimentoService {

    private final EstabelecimentoRepository estabelecimentoRepository;

    @Autowired
    public EstabelecimentoService(EstabelecimentoRepository estabelecimentoRepository) {
        this.estabelecimentoRepository = estabelecimentoRepository;
    }

    public List<Estabelecimento> listarEstabelecimentos() {
        return estabelecimentoRepository.findAll();
    }

    public Optional<Estabelecimento> obterEstabelecimentoPorId(Long id) {
        return estabelecimentoRepository.findById(id);
    }

    public Estabelecimento salvarEstabelecimento(Estabelecimento estabelecimento) {
        return estabelecimentoRepository.save(estabelecimento);
    }

    public void deletarEstabelecimento(Long id) {
        estabelecimentoRepository.deleteById(id);
    }
}
