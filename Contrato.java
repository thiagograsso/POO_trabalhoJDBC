package com.imobiliaria.models;

import java.util.Date;

public class Contrato {
    private int id;
    private Date dataInicio;
    private Date dataFim;
    private double valor;
    private Cliente cliente;
    private Imovel imovel;

    public Contrato(int id, Date dataInicio, Date dataFim, double valor, Cliente cliente, Imovel imovel) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.cliente = cliente;
        this.imovel = imovel;
    }
}
