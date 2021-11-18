package com.iridavis.api.model;

public class RespostaAgrupada {
    private String nome;
    private int pt;
    private int pd;
    private int ec;
    private int fs;

    public RespostaAgrupada() {
    }

    public RespostaAgrupada(String nome, int pt, int pd, int ec, int fs) {
        this.nome = nome;
        this.pt = pt;
        this.pd = pd;
        this.ec = ec;
        this.fs = fs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPt() {
        return pt;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }

    public int getPd() {
        return pd;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public int getEc() {
        return ec;
    }

    public void setEc(int ec) {
        this.ec = ec;
    }

    public int getFs() {
        return fs;
    }

    public void setFs(int fs) {
        this.fs = fs;
    }

    @Override
    public String toString() {
        return "RespostaAgrupada{" +
                "nome='" + nome + '\'' +
                ", pt=" + pt +
                ", pd=" + pd +
                ", ec=" + ec +
                ", fs=" + fs +
                '}';
    }
}
