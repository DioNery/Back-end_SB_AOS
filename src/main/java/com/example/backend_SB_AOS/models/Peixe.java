package com.example.backend_SB_AOS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Peixe { //Criei a classe Peixe

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

    public Long getId() { //GET ID
        return id;
    }

    public void setId(Long id) { //SET ID
        this.id = id;
    }

    public String getNome() { //GET NOME
        return nome;
    }

    public void setNome(String nome) { //SET NOME
        this.nome = nome;
    }

    public String getEspecie() { //PEGAR ESPECIE
        return especie;
    }

    public void setEspecie(String especie) { // SETAR UM ESPECIE
        this.especie = especie;
    }

    public int getTamanho() { // PEGAR TAMANHO
        return tamanho;
    }

    public void setTamanho(int tamanho) { // SETAR UM TAMANHO
        this.tamanho = tamanho;
    }

    public Boolean getEhAguaDoce() { //  EH DE AGUA DOCE
        return ehAguaDoce;
    }

    public void setEhAguaDoce(Boolean ehAguaDoce) { //SETAR SE EH AGUA DOCE
        this.ehAguaDoce = ehAguaDoce;
    }

}
