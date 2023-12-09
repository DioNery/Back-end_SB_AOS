package com.example.backend_SB_AOS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Peixe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especie;
    private int tamanho; // Pode representar o tamanho do aquário necessário
    private Boolean ehAguaDoce;

    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "estabelecimento")
    private Estabelecimento estabelecimento;

    public Peixe() {
    }

    public Peixe(Long id, String nome, String especie, int tamanho, Boolean ehAguaDoce) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.tamanho = tamanho;
        this.ehAguaDoce = ehAguaDoce;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getEhAguaDoce() {
        return ehAguaDoce;
    }

    public void setEhAguaDoce(Boolean ehAguaDoce) {
        this.ehAguaDoce = ehAguaDoce;
    }

}
