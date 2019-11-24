package com.design.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;
    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public boolean contemItemDeNome(String nomeItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeItem)) {
                return true;
            }
        }
        return false;
    }
}
