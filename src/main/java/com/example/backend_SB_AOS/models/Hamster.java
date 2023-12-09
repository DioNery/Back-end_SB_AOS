package com.example.backend_SB_AOS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Hamster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String cor;
    private Boolean ehDomesticado;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "estabelecimento")
    private Estabelecimento estabelecimento;

    public Hamster() {
    }

    public Hamster(Long id, String nome, int idade, String cor, Boolean ehDomesticado) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.ehDomesticado = ehDomesticado;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getEhDomesticado() {
        return ehDomesticado;
    }

    public void setEhDomesticado(Boolean ehDomesticado) {
        this.ehDomesticado = ehDomesticado;
    }
}
