package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public class ProcurarNoRemoverAnterior {

    /***
     *  Faremos nessa classe o algoritmo de:
     *  Procurar nó por nome ou descrição e remover o nó anterior ao encontrado,
     *  Vamos verificar se possuímos uma PIZZA que o atributo nomeSabor seja igual ao procurado
     *  1) Se nomeSabor não existir na lista,
     *      iremos lançar uma exception ("NÃO FOI ACHADO ESSE SABOR")
     *  2) Caso esse sabor exista na lista,
     *      iremos verificar se existe mais de um elemento na lista
     *          b) Caso não exista, iremos lançar uma exception ("Não é possível remover o anterior")
     *  3) Se não tiver outras exceções, iremos remover o elemento anterior ao elemento buscado
     */

    static int posicaoComSabor = -1;
    // verificar se esse sabor existe na nossa lista, retorna a posicao que possui esse valor
    public static int saborExiste(String sabor){
        for(int i = 0; i < ListaSequencialDB.PIZZAS.size(); i++){
            if(ListaSequencialDB.PIZZAS.get(i).getNomeSabor().equals(sabor)){
                posicaoComSabor = i;
            }
        }
        return posicaoComSabor;
    }

    public static void procurar(String sabor) throws Exception {
      // pega o resultado do metodo saborExiste
        // se o resultado for -1 significa que não existe esse sabor na lista,
        // portanto não pode ser retirado o valor anterior a ele
        if(saborExiste(sabor) == -1){
            throw new Exception("Não existe esse pizza com esse sabor na lista");
        } else if( saborExiste(sabor) == 0){
            throw new Exception("Esse sabor existe, mas é o primeiro elemento, então não podemos retirar o antecessor");
        } else if(saborExiste(sabor) >= 1){ // achado e sendo mais do que dois elementos, vamos remover o antecessor
            ListaSequencialDB.PIZZAS.remove(posicaoComSabor - 1);
        }
        System.out.println(ListaSequencialDB.PIZZAS);
    }
}
