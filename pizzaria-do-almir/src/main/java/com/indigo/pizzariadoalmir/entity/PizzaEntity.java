package com.indigo.pizzariadoalmir.entity;

import java.util.Objects;

public class PizzaEntity {

    private String nomeSabor;
    private float preco;
    public TipoBorda tipoBorda;
    public Tamanho tamanho;
    private String validade;


    public PizzaEntity(String sabor, float valor, TipoBorda tipoBorda, Tamanho tamanho, String validade) {
        super();
        this.nomeSabor = sabor;
        this.preco = valor;
        this.tipoBorda = tipoBorda;
        this.tamanho = tamanho;
        this.validade = validade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNomeSabor() {
        return nomeSabor;
    }

    public void setNomeSabor(String nomeSabor) {
        this.nomeSabor = nomeSabor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public TipoBorda getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(TipoBorda tipoBorda) {
        this.tipoBorda = tipoBorda;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PizzaEntity pizza)) return false;
        return Float.compare(preco, pizza.preco) == 0 && Objects.equals(nomeSabor, pizza.nomeSabor) && tipoBorda == pizza.tipoBorda && tamanho == pizza.tamanho && Objects.equals(validade, pizza.validade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeSabor, preco, tipoBorda, tamanho, validade);
    }

    @Override
    public String toString() {
        return "PIZZA = " + " " + "[" + "nomeSabor=" + nomeSabor + " " + "preco=" + preco + " " + "tipoBorda=" + tipoBorda + " " + "tamanho=" + tamanho + " " + "validade=" + validade + " " + ']'+ '\n';

    }
}
