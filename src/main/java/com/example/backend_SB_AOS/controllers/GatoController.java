package com.example.backend_SB_AOS.controllers;

import com.example.backend_SB_AOS.models.Gato;
import com.example.backend_SB_AOS.services.GatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petshop/gatos")
public class GatoController {

    private final GatoService gatoService;

    public GatoController(GatoService gatoService) {
        this.gatoService = gatoService;
    }

    @GetMapping
    public List<Gato> listarGatos() {
        return gatoService.listarGatos();
    }

    @GetMapping("/{id}")
    public Optional<Gato> obterGatoPorId(@PathVariable Long id) {
        return gatoService.obterGatoPorId(id);
    }

    @PostMapping
    public Gato salvarGato(@RequestBody Gato gato) {
        return gatoService.salvarGato(gato);
    }

    @DeleteMapping("/{id}")
    public void deletarGato(@PathVariable Long id) {
        gatoService.deletarGato(id);
    }
}
