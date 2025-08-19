package com.imobiliaria.models;

public class Imovel {
    private int id;
    private String endereco;
    private String tipo;
    private double valorAluguel;
    private boolean disponivel;

    public Imovel(int id, String endereco, String tipo, double valorAluguel, boolean disponivel) {
        this.id = id;
        this.endereco = endereco;
        this.tipo = tipo;
        this.valorAluguel = valorAluguel;
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() { return disponivel; }
}
