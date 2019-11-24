package com.design.model.imposto;

import com.design.interface_geral.imposto.Imposto;
import com.design.model.Orcamento;

public class ICMS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05 + 50;
    }
}
