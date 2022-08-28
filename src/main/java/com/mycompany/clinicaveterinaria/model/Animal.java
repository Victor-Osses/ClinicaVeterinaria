
package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 */
public class Animal extends Especie {
    private final int codAnimal;
    private String nome;
    private int idade;
    private char sexo;

    public Animal(int codAnimal, String nome, int idade, char sexo, int codEsp, String nomeEsp) {
        super(codEsp, nomeEsp);
        this.codAnimal = codAnimal;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
    
    @Override
    public void setNomeEsp(String nomeEsp) {
        super.setNomeEsp(nomeEsp); 
    }

    @Override
    public String getNomeEsp() {
        return super.getNomeEsp(); 
    }

    @Override
    public int getCodEsp() {
        return super.getCodEsp(); 
    }
}
