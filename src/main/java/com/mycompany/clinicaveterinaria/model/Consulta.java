package com.mycompany.clinicaveterinaria.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 */
public class Consulta {
    private final int codCon;
    private final int codVet;
    private final Date data; 
    private final Date hora;
    private String historico;
    private List<Exame> exames;

    public Consulta(int codCon, int codVet, Date data, Date hora, String historico, List<Exame> exames) {
        this.codVet = codVet;
        this.codCon = codCon;
        this.data = data;
        this.hora = hora;
        this.historico = historico;
        this.exames = exames;
    }

    public int getCodCon() {
        return codCon;
    }

    public int getCodVet() {
        return codVet;
    }

    public Date getData() {
        return data;
    }

    public Date getHora() {
        return hora;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Exame> getExames() {
        return exames;
    }
    
}
