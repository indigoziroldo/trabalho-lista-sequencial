package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPizzasPares {

    /* Nessa Classe iremos fazer o algoritmo:
    Imprimir nós armazenados nos índices pares,
    nesse caso, irei lançar apenas UM exception,
    caso tenha apenas UM valor, seria impar e irei demonstrar isso
    1) Fazer um looping pra pegar todos os indices pares e adicionar a lista pizzaspares
    2) Lançar exception caso a lista pizzaspares esteja vazia
     */

    public static void pizzasPares() throws Exception {
        List<PizzaEntity> pizzasPares = new ArrayList<>();
        for (int i = 0; i < ListaSequencialDB.PIZZAS.size(); i++){
            if(i % 2 == 0){
                pizzasPares.add(ListaSequencialDB.PIZZAS.get(i));
            }
        }
        if(pizzasPares.isEmpty()){
            throw new Exception("Não existe pizzas pares, por isso nada foi adicionado aqui");
        }
        System.out.println(pizzasPares);
    }
}
