package com.imobiliaria;

import com.imobiliaria.models.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gestão Imobiliária ===");

        // Exemplo de uso
        Cliente c1 = new Cliente(1, "João Silva", "12345678900", "11999990000");
        Imovel i1 = new Imovel(1, "Rua A, 100", "Apartamento", 1200.0, true);
        Contrato contrato = new Contrato(1, new java.util.Date(), new java.util.Date(), 1200.0, c1, i1);

        System.out.println("Cliente: " + c1.getNome());
        System.out.println("Imóvel disponível: " + i1.isDisponivel());
    }
}
