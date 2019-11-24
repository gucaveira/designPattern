package com.design.model.imposto;

import com.design.model.Item;
import com.design.model.Orcamento;
import com.design.model.template.TemplateDeImpostoCondicional;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {
    
    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<>();
        for (Item item :
                orcamento.getItens()) {
            if (noOrcamento.contains(item.getNome())) {
                return true;
            } else {
                noOrcamento.add(item.getNome());
            }
        }
        return false;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }
}
