package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 */
public abstract class Pessoa {
    private final int codPess;
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(int codPess, String nome, String endereco, String telefone) {
        this.codPess = codPess;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getCodPess() {
        return codPess;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

