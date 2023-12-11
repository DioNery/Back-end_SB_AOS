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

// Anotação indicando que a classe é uma entidade JPA
@Entity
public class Cliente {
    
    // Identificador único do cliente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Informações pessoais do cliente
    private String nome;
    private String email;
    private String telefone;

    // Relacionamentos: Cada cliente pode ter várias instâncias de diferentes animais de estimação
    // Mapeamento de um para muitos com as classes de animais de estimação
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Gato> gatos;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Peixe> peixes;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Hamster> hamsters;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cachorro> cachorros;
    
    // Relacionamento: Muitos clientes podem ser associados a um recepcionista
    @ManyToOne
    @JoinColumn(name = "recepcionista")
    private Recepcionista recepcionista;

    // Construtor padrão necessário para JPA
    public Cliente() {
    }

    // Construtor para criar um cliente com informações específicas
    public Cliente(Long id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos getters e setters para acessar e modificar os atributos da classe
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

