package com.example.backend_SB_AOS.controllers;

import com.example.backend_SB_AOS.models.Hamster;
import com.example.backend_SB_AOS.services.HamsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/petshop/hamsters")
public class HamsterController {

    private final HamsterService hamsterService;

    @Autowired
    public HamsterController(HamsterService hamsterService) {
        this.hamsterService = hamsterService;
    }

    @GetMapping
    public List<Hamster> listarHamsters() {
        return hamsterService.listarHamsters();
    }

    @GetMapping("/{id}")
    public Optional<Hamster> obterHamsterPorId(@PathVariable Long id) {
        return hamsterService.obterHamsterPorId(id);
    }

    @PostMapping
    public Hamster salvarHamster(@RequestBody Hamster hamster) {
        return hamsterService.salvarHamster(hamster);
    }

    @DeleteMapping("/{id}")
    public void deletarHamster(@PathVariable Long id) {
        hamsterService.deletarHamster(id);
    }
}
