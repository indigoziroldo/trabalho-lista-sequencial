package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import org.springframework.stereotype.Service;


public class InserirNaPosicaoK1 {

    /***
     * Faremos nessa classe o algoritmo para INSERIR NA POSIÇÃO K - 1
     * Para inserir na posição K - 1, precisamos fazer algumas verificações:
     *
     * 1) Verificar se a lista não está vazia, caso esteja
     *      Verificar se é para adicionar no 1º elemento (K sendo 1),
     *      Nesse caso mesmo se a lista for vazia, ele irá adicionar como o primeiro elemento
     *      -
     * 2) Verificar se o K é maior do que o fim da lista,
     *      Caso seja maior iremos lançar uma EXCEPTION ("K MAIOR QUE TAMANHO DA LISTA")
     *      -
     * 3) Caso O K - 1 seja apenas 1 número maior do que o tamanho da lista,
     *      Iremos adicionar NO FINAL da lista, que é um ADD COMUM
     *
     * 4) Caso não caia em nenhuma outra dessas opções,
     *      E o K - 1 seja um nº no index da lista
     *      Iremos adicionar a entidade da PIZZAENTITY nesse lugar determinado.
     */

    public static void inserirNaPosicao(int k, PizzaEntity pizzaNova) throws Exception {

        /* o K - 1 é uma forma de dizer que vamos utilizar a posição atual,
            relembrando que o array no Java começa na posição 0,
            então K-1 é utilizado para apontar para a posição REAL
            que o usuário deseja inserir, levando em conta que começa em 0*/
        int posicao = k - 1;

         // PRIMEIRA VERIFICACAO = Adicionar o primeiro elemento
        if (posicao == 0 && ListaSequencialDB.PIZZAS.isEmpty()){
            ListaSequencialDB.PIZZAS.add(pizzaNova);
        } else if ( posicao > 1 && (ListaSequencialDB.PIZZAS.isEmpty()))
            // CASO A LISTA FOR VAZIA, IREMOS ADICIONAR NO PRIMEIRO ELEMENTO E EMPURRAR O RESTO
        {   throw new Exception("Lista está vazia e a posição não existe!");
        } else if (ListaSequencialDB.PIZZAS.size() >= posicao) {
            // CASO A POSIÇÃO NÃO ULTRAPASSE O TAMANHO TOTAL DA LISTA
            ListaSequencialDB.PIZZAS.add(posicao, pizzaNova);
        } else {
            // SE A LISTA ESTIVER CHEIA MAS A POSIÇÃO FOR MAIOR DO QUE O TAMANHO DELA
            throw new Exception("Essa posição ultrapassa o tamanho da lista");
        }
        System.out.println(ListaSequencialDB.PIZZAS);
    }
}
