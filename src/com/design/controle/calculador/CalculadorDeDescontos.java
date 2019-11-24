package com.design.controle.calculador;

import com.design.controle.tipo_desconto.DescontoPorCincoItens;
import com.design.controle.tipo_desconto.DescontoPorMaisDeQuinhentosReais;
import com.design.controle.tipo_desconto.SemDesconto;
import com.design.interface_geral.Desconto;
import com.design.model.Orcamento;

public class CalculadorDeDescontos {

    public double calcula(Orcamento orcamento) {
        Desconto primeiroDesconto = new DescontoPorCincoItens();
        Desconto segundoDesconto = new DescontoPorMaisDeQuinhentosReais();
        Desconto terceiroDesconto = new SemDesconto();

        primeiroDesconto.setProximo(segundoDesconto);
        segundoDesconto.setProximo(terceiroDesconto);

        return primeiroDesconto.desconta(orcamento);


    }


}
