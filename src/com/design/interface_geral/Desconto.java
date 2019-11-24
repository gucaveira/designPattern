package com.design.interface_geral;

import com.design.model.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
