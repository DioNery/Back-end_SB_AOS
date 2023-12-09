package com.example.backend_SB_AOS.controllers;

import com.example.backend_SB_AOS.models.Recepcionista;
import com.example.backend_SB_AOS.services.RecepcionistaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petshop/recepcionistas")
public class RecepcionistaController {

    private final RecepcionistaService recepcionistaService;

    public RecepcionistaController(RecepcionistaService recepcionistaService) {
        this.recepcionistaService = recepcionistaService;
    }

    @GetMapping
    public List<Recepcionista> listarRecepcionistas() {
        return recepcionistaService.listarRecepcionistas();
    }

    @GetMapping("/{id}")
    public Optional<Recepcionista> obterRecepcionistaPorId(@PathVariable Long id) {
        return recepcionistaService.obterRecepcionistaPorId(id);
    }

    @PostMapping
    public Recepcionista salvarRecepcionista(@RequestBody Recepcionista recepcionista) {
        return recepcionistaService.salvarRecepcionista(recepcionista);
    }

    @DeleteMapping("/{id}")
    public void deletarRecepcionista(@PathVariable Long id) {
        recepcionistaService.deletarRecepcionista(id);
    }
}
