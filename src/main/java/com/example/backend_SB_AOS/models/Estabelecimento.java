package com.example.backend_SB_AOS.models;
//Importando os modulos
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Estabelecimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj;
    private String nome;
    private String endereco;

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Gato> gatos;
    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Peixe> peixes;
    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Cachorro> cachorros;
    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Hamster> hamsters;
    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Recepcionista> recepcionistas;


    public Estabelecimento(String cnpj, String nome, String endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
