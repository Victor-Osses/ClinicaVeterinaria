package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author Victor Hugo Costa Osses 254373
 */
public class Cliente extends Pessoa {
    private final int id;
    private String cep;
    private String email;

    public Cliente(int id, String cep, String email, int codPess, String nome, String endereco, String telefone) {
        super(codPess, nome, endereco, telefone);
        this.id = id;
        this.cep = cep;
        this.email = email;
    }

    public int getId() {
        return id;
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
 
   
}
