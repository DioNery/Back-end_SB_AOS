package com.example.backend_SB_AOS.controllers;

import com.example.backend_SB_AOS.models.Estabelecimento;
import com.example.backend_SB_AOS.services.EstabelecimentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petshop/estabelecimento")
public class EstabelecimentoController {

    private final EstabelecimentoService estabelecimentoService;

    public EstabelecimentoController(EstabelecimentoService estabelecimentoService) {
        this.estabelecimentoService = estabelecimentoService;
    }

    @GetMapping
    public List<Estabelecimento> listarEstabelecimentos() {
        return estabelecimentoService.listarEstabelecimentos();
    }

    @GetMapping("/{id}")
    public Optional<Estabelecimento> obterEstabelecimentoPorId(@PathVariable Long id) {
        return estabelecimentoService.obterEstabelecimentoPorId(id);
    }

    @PostMapping
    public Estabelecimento salvarEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
        return estabelecimentoService.salvarEstabelecimento(estabelecimento);
    }

    @DeleteMapping("/{id}")
    public void deletarEstabelecimento(@PathVariable Long id) {
        estabelecimentoService.deletarEstabelecimento(id);
    }
}