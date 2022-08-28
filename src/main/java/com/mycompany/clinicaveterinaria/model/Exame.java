package com.mycompany.clinicaveterinaria.model;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 */
public class Exame {
    private final int codExa;
    private final int codCon;
    private String descExame;

    public Exame(int codExa, int codCon, String descExame) {
        this.codExa = codExa;
        this.codCon = codCon;
        this.descExame = descExame;
    }

    public int getCodExa() {
        return codExa;
    }

    public int getCodCon() {
        return codCon;
    }

    public String getDescExame() {
        return descExame;
    }

    public void setDescExame(String descExame) {
        this.descExame = descExame;
    }
}
