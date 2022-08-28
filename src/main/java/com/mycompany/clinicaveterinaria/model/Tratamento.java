package com.mycompany.clinicaveterinaria.model;

import java.util.Date;
import java.util.List;

public class Tratamento {
    private final int codTrat;
    private final int codVet;
    private final int codCon;
    private final Date dataIni;
    private Animal animal;
    private Veterinario veterinario;
    private List<Consulta> consultas; 

    public Tratamento(int codTrat, int codVet, int codCon, Date dataIni, Animal animal, Veterinario veterinario, List<Consulta> consultas) {
        this.codTrat = codTrat;
        this.codVet = codVet;
        this.codCon = codCon;
        this.dataIni = dataIni;
        this.animal = animal;
        this.veterinario = veterinario;
        this.consultas = consultas; 
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public int getCodTrat() {
        return codTrat;
    }

    public int getCodVet() {
        return codVet;
    }

    public int getCodCon() {
        return codCon;
    }

    public Date getDataIni() {
        return dataIni;
    }
            
    
}
