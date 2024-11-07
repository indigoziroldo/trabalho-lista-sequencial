package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ClassificarLista {

    /* Nesta classe faremos o seguinte algoritmo:
    Classificar a lista em ordem crescente de nome ou descrição,
    ORDENAÇÃO EM ORDEM CRESCENTE <3
    Vamos fazer diversos tipos:
    1) por nomeSabor em ordem crescente
    2) por VALIDADE - PQ AI EU USO LOCALDATE NA CONVERSÃO MUAHAHAHA
     */

    public static void ordenacaoPorSabor(){
        List<PizzaEntity> copiaDaLista = new ArrayList<>(ListaSequencialDB.PIZZAS.stream().toList());
        copiaDaLista.sort(Comparator.comparing(PizzaEntity::getNomeSabor));
        System.out.println(copiaDaLista);
    }

    public static void ordenacaoPorValidade(){
        List<PizzaEntity> copiaDaLista = new ArrayList<>(ListaSequencialDB.PIZZAS.stream().toList());
        copiaDaLista.sort(Comparator.comparing(pizza -> LocalDate.parse(pizza.getValidade(),
                                                                DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        System.out.println(copiaDaLista);
    }
}
