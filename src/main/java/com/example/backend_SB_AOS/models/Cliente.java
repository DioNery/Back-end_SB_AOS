package com.example.backend_SB_AOS.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Gato> gatos;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Peixe> peixes;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Hamster> hamsters;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cachorro> cachorros;
    
    @ManyToOne
    @JoinColumn(name = "recepcionista")
    private Recepcionista recepcionista;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
