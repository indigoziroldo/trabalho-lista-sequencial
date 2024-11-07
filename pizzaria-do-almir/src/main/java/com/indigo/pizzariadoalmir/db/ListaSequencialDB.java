package com.indigo.pizzariadoalmir.db;

import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import com.indigo.pizzariadoalmir.entity.Tamanho;
import com.indigo.pizzariadoalmir.entity.TipoBorda;
import com.indigo.pizzariadoalmir.service.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaSequencialDB {

    public static final List<PizzaEntity> PIZZAS = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        PizzaEntity pizzaTESTE = new PizzaEntity("Brigadeiro",10.0f, TipoBorda.CHOCOLATE, Tamanho.PEQUENO,"01/01/2020");

        PizzaEntity pizza1 = new PizzaEntity("Marguerita",32.5f, TipoBorda.CHEDDAR, Tamanho.MEDIA, "23/05/2024");
        PizzaEntity pizza2 = new PizzaEntity("Calabresa", 30.0f, TipoBorda.CATUPIRY, Tamanho.PEQUENO, "22/05/2024");
        PizzaEntity pizza3 = new PizzaEntity("Portuguesa", 22.9f, TipoBorda.CATUPIRY, Tamanho.GRANDE, "21/05/2024");
        PIZZAS.add(pizza1);
        PIZZAS.add(pizza2);
        PIZZAS.add(pizza3);
        System.out.println(PIZZAS);

        //ALGORITMO 2
//        AlterarConteudo.pizzaAlterada(32.5f, 15.0f);
//        System.out.println(PIZZAS);

        //ALGORITMO 3
//        ClassificarLista.ordenacaoPorSabor();
//        ClassificarLista.ordenacaoPorValidade();

        //ALGORITMO 4
//        ConsultarPizzaNaPosicaoK.pizzaProcurada(1);

        // ALGORITMO 5
//        ConsultarPizzasPares.pizzasPares();

        //ALGORITMO 6 ***
        InserirNaPosicaoK1.inserirNaPosicao(3,pizzaTESTE);

        //ALGORITMO 7
//        MediaValores.rachandoConta();

        //ALGORITMO 8
//        ProcurarEAlterarPizza.pizzaAlterada(pizza1,pizzaTESTE);

        //ALGORITMO 9
//        ProcurarNoRemoverAnterior.procurar("Calabresa");
    }

}
