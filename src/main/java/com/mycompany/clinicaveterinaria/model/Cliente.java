package com.mycompany.clinicaveterinaria.model;

import java.util.List;

/**
 *
 * @author Victor Hugo Costa Osses 254373
 */
public class Cliente extends Pessoa {
    private final int codCli;
    private String cep;
    private String email;
    private List<Animal> animais;

    public Cliente(int codCli, String cep, String email, int codPess, String nome, String endereco, String telefone, List<Animal> animais) {
        super(codPess, nome, endereco, telefone);
        this.codCli = codCli;
        this.cep = cep;
        this.email = email;
        this.animais = animais;
    }

    @Override
    public int getCodPess() {
        return super.getCodPess();
    }

    @Override
    public void setTelefone(String telefone) {
        super.setTelefone(telefone); 
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco); 
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }

    @Override
    public String getTelefone() {
        return super.getTelefone(); 
    }

    @Override
    public String getEndereco() {
        return super.getEndereco(); 
    }

    @Override
    public String getNome() {
        return super.getNome(); 
    }
   
    public int getCodCli() {
        return codCli;
    }
    
    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    public List<Animal> getAnimais() {
        return animais;
    }
   
}
