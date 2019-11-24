package com.design.principal;

import com.design.interface_geral.imposto.Imposto;
import com.design.model.Orcamento;
import com.design.model.imposto.ICCC;

public class Test {

    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500.0);

        Imposto novoImposto = new ICCC();
        System.out.println(novoImposto.calcula(reforma));
    }
}
