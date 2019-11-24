package com.design.model.imposto;

import com.design.model.Item;
import com.design.model.Orcamento;
import com.design.model.template.TemplateDeImpostoCondicional;

public class IKCV extends TemplateDeImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (Item item :
                orcamento.getItens()) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }
}
