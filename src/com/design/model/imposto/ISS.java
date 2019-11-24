package com.design.model.imposto;

import com.design.interface_geral.imposto.Imposto;
import com.design.model.Orcamento;

public class ISS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
