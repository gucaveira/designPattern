package com.design.controle.tipo_desconto;

import com.design.interface_geral.Desconto;
import com.design.model.Item;
import com.design.model.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (aconteceuVendaCasada(orcamento)) {
            return orcamento.getValor() * 0.05;

        } else return proximo.desconta(orcamento);

    }

    private boolean aconteceuVendaCasada(Orcamento orcamento) {
        return existe("caneta", orcamento) && existe("lapis", orcamento);
    }

    private boolean existe(String nomeItem, Orcamento orcamento) {
        for (Item item :
                orcamento.getItens()) {
            if (item.getNome().equals(nomeItem)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setProximo(Desconto proximo) {

    }
}
