package com.example.backend_SB_AOS.controllers;

import com.example.backend_SB_AOS.models.Peixe;
import com.example.backend_SB_AOS.services.PeixeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petshop/peixes")
public class PeixeController {

    private final PeixeService peixeService;

    public PeixeController(PeixeService peixeService) {
        this.peixeService = peixeService;
    }

    @GetMapping
    public List<Peixe> listarPeixes() {
        return peixeService.listarPeixes();
    }

    @GetMapping("/{id}")
    public Optional<Peixe> obterPeixePorId(@PathVariable Long id) {
        return peixeService.obterPeixePorId(id);
    }

    @PostMapping
    public Peixe salvarPeixe(@RequestBody Peixe peixe) {
        return peixeService.salvarPeixe(peixe);
    }

    @DeleteMapping("/{id}")
    public void deletarPeixe(@PathVariable Long id) {
        peixeService.deletarPeixe(id);
    }
}
