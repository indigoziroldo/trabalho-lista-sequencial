package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import com.indigo.pizzariadoalmir.entity.TipoBorda;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProcurarEAlterarPizza {

    /* Nessa classe faremos o algoritmo:
    Procurar um nó e alterar o conteúdo INTEIRO,
    iremos procurar um nó INTEIRO e alterar ele INTEIRO,
    assim como foi feito e explicado anteriormente, vou pular as explicações dnv
     */

    public static void pizzaAlterada (PizzaEntity pizzaAntiga, PizzaEntity pizzaNova){
        List<PizzaEntity> pizzasAlteradas = ListaSequencialDB.PIZZAS.stream()
                .filter(pizza -> pizza.equals(pizzaAntiga))
                .peek(pizza ->{
                    pizza.setNomeSabor(pizzaNova.getNomeSabor());
                    pizza.setPreco(pizzaNova.getPreco());
                    pizza.setTipoBorda(pizzaNova.getTipoBorda());
                    pizza.setValidade(pizzaNova.getValidade());
                    pizza.setTamanho(pizzaNova.getTamanho());
                })
                .toList();
        System.out.println(ListaSequencialDB.PIZZAS);
    }

}
