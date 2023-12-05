package com.example.backend_SB_AOS.controllers;

import com.example.backend_SB_AOS.models.Cachorro;
import com.example.backend_SB_AOS.services.CachorroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cachorros")
public class CachorroController {

    private final CachorroService cachorroService;

    @Autowired
    public CachorroController(CachorroService cachorroService) {
        this.cachorroService = cachorroService;
    }

    @GetMapping
    public ResponseEntity<List<Cachorro>> getAllCachorros() {
        List<Cachorro> cachorros = cachorroService.getAllCachorros();
        return ResponseEntity.ok(cachorros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cachorro> getCachorroById(@PathVariable Long id) {
        return cachorroService.getCachorroById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cachorro> saveCachorro(@RequestBody Cachorro cachorro) {
        Cachorro savedCachorro = cachorroService.saveCachorro(cachorro);
        return ResponseEntity.ok(savedCachorro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCachorro(@PathVariable Long id) {
        cachorroService.deleteCachorro(id);
        return ResponseEntity.noContent().build();
    }
}