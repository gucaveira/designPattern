package com.design.controle.calculador;

import com.design.interface_geral.imposto.Imposto;
import com.design.model.Orcamento;

public class CalculadorDeImposto {

    public void calculador(Orcamento orcamento, Imposto estrategiaDeImposto) {
        double resultado = estrategiaDeImposto.calcula(orcamento);
        System.out.println(resultado);
    }
}
