package com.design.model.template;

import com.design.interface_geral.imposto.Imposto;
import com.design.model.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    protected abstract double maximaTaxacao(Orcamento orcamento);

    protected abstract double minimaTaxacao(Orcamento orcamento);

}
