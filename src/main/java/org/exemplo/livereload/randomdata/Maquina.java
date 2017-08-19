package org.exemplo.livereload.randomdata;

import java.io.Serializable;

public class Maquina implements Serializable {
    private int posicao;
    private String status;

    public Maquina(int posicao, String status) {
        this.posicao = posicao;
        this.status = status;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
