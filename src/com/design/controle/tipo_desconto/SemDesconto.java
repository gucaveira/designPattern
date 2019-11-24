package com.design.controle.tipo_desconto;

import com.design.interface_geral.Desconto;
import com.design.model.Orcamento;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {

    }
}
