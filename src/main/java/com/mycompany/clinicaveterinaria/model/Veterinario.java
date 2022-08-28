package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 */
public class Veterinario extends Pessoa {
    private final int codVet; 

    public Veterinario(int codVet, int codPess, String nome, String endereco, String telefone) {
        super(codPess, nome, endereco, telefone);
        this.codVet = codVet;
     
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

    @Override
    public int getCodPess() {
        return super.getCodPess(); 
    }

    public int getCodVet() {
        return codVet;
    }
    
    
}
