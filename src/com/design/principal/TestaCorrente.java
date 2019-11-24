package com.design.principal;

import com.design.controle.tipo_desconto.DescontoPorCincoItens;
import com.design.controle.tipo_desconto.DescontoPorMaisDeQuinhentosReais;
import com.design.controle.tipo_desconto.DescontoPorVendaCasada;
import com.design.controle.tipo_desconto.SemDesconto;
import com.design.interface_geral.Desconto;
import com.design.model.Item;
import com.design.model.Orcamento;

public class TestaCorrente {

    public static void main(String[] args) {
        Desconto d1 = pegarDesconto();

        Item lapis = new Item("lapis", 15.00);
        Item caneta = new Item("caneta", 15.00);
        Item borracha = new Item("borracha", 15.00);

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(caneta);
        orcamento.adicionaItem(borracha);
        orcamento.adicionaItem(lapis);

        double desconto = d1.desconta(orcamento);
        System.out.println(desconto);

    }

    private static Desconto pegarDesconto() {
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);
        return d1;
    }
}
