package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import org.springframework.stereotype.Service;

public class ConsultarPizzaNaPosicaoK {

    /* Nessa classe iremos fazer o algoritmo:
       Consultar nó na posição K,
       como também é semelhante aos exercícios anteriores,
       vou pular a explicação adjacente sobre exception caso não exista a posicao K
       1) Verifica se existe essa posição
            Se não existir lanço a exception ("Posição não encontrada")
       2) Caso exista, vou lançar a PizzaEntity daquela posicao
     */

    public static void pizzaProcurada(int posicao) throws Exception {
        if(ListaSequencialDB.PIZZAS.get(posicao) == null){ // não existe pizza nessa posicao
            throw new Exception("Não existe pizza nessa posição!");
        } else System.out.println(ListaSequencialDB.PIZZAS.get(posicao));  // aqui retorna a pizza inteira que está naquela posicao
    }

}
