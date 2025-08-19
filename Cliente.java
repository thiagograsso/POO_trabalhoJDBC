package com.imobiliaria.models;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    // Construtor
    public Cliente(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Getters e setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
}
