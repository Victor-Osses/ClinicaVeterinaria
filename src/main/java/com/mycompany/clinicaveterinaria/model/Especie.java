package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author Vitor Hugo Costa Osses, 254373
 */
public abstract class Especie {
    private final int codEsp;
    private String nomeEsp;

    public Especie(int codEsp, String nomeEsp) {
        this.codEsp = codEsp;
        this.nomeEsp = nomeEsp;
    }

    public int getCodEsp() {
        return codEsp;
    }

    public String getNomeEsp() {
        return nomeEsp;
    }

    public void setNomeEsp(String nomeEsp) {
        this.nomeEsp = nomeEsp;
    }
    
    
}
