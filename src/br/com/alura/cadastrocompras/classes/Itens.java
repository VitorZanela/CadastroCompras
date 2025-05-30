package br.com.alura.cadastrocompras.classes;

import java.util.Locale;

public class Itens {
    private String item;
    private double valor;

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("pt-BR"), "%s - R$%.2f", this.getItem(), this.getValor());
    }
}
