package com.design.principal;

import com.design.controle.calculador.CalculadorDeDescontos;
import com.design.model.Item;
import com.design.model.Orcamento;

public class TestDesconto {

    public static void main(String[] args) {
        CalculadorDeDescontos calculador = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(1000.0);
        orcamento.adicionaItem(new Item("Caneta", 250.0));
        orcamento.adicionaItem(new Item("lapis", 223.0));

        double desconto = calculador.calcula(orcamento);

        System.out.println(desconto);
    }
}
