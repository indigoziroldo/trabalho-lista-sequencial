package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import org.springframework.stereotype.Service;

public class MediaValores {

    /* Nessa classe faremos o algoritmo:
    Calcular a “média" de valores armazenados na lista,
    Como já expliquei várias lógicas por trás da resolução desses algoritmos,
    irei pular a explicação das que são extremamente semelhanetes
    1) Verificar se tem alguma coisa na lista
        CASO NÃO TENHA, LANÇO EXCEPTION
    2) CASO TENHA, ir fazendo um looping pra adicionar os valores ao saldo total
        retornar o saldo total e fazer a média usando o tamanho da lista
     */

    public static void rachandoConta() throws Exception{
        if(ListaSequencialDB.PIZZAS.isEmpty()){
            throw new Exception("LISTA VAZIA, NÃO HÁ NENHUM VALOR AQUI!");
        }

        float somaTotal = 0;
        for (int i = 0; i < ListaSequencialDB.PIZZAS.size(); i++) {
            somaTotal += ListaSequencialDB.PIZZAS.get(i).getPreco();
        }
        System.out.println((somaTotal / ListaSequencialDB.PIZZAS.size()));
    }
}
