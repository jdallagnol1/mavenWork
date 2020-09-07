package com.Group3;

public class Motorista {
    String cpf;
    String name;
    Veiculo v;

    public Motorista(String cpf, String name, Veiculo v){
        this.cpf = cpf;
        this.name = name;
        this.v = v;
    }

    public Motorista(String cpf, String name){
        this.cpf = cpf;
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }
    public String getName() {
        return name;
    }
    public Veiculo getV() {
        return v;
    }
    public void setV(Veiculo v){
        this.v = v;
    }
}
