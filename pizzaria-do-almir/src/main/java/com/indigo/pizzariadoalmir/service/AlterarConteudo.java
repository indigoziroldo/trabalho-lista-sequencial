package com.indigo.pizzariadoalmir.service;

import com.indigo.pizzariadoalmir.db.ListaSequencialDB;
import com.indigo.pizzariadoalmir.entity.PizzaEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public class AlterarConteudo {

    /* Nessa classe iremos fazer o algoritmo:
     * Alterar o conteúdo de um nó com valor igual a x
     * Semelhante ao algoritmo 2, iremos primeiro verificar se existe um elemento que possua esse valor encontrado
     * Nesse caso, iremos procurar uma pizza que possua um PRECO x
     *  1) Se esse preco X não existir na lista,
     *      iremos lançar uma exception ("NÃO FOI ACHADO ESSE PRECO")
     *  2) Caso esse preco exista na lista,
     *      iremos mudar o seu conteúdo.
     */


    public static PizzaEntity pizzaAlterada (float valor, float novoValor) throws Exception {
        return alterarPizza(novoValor, valorExiste(valor));
    }

    // vamos verificar se existe uma pizza com esse preco
    private static int valorExiste(float valor) throws Exception {
        int posicaoComValor = -1;
        for(int i = 0; i < ListaSequencialDB.PIZZAS.size(); i++){
            if(ListaSequencialDB.PIZZAS.get(i).getPreco() == valor){
                posicaoComValor = i;
            }
        }
        return posicaoComValor;
    }

    private static PizzaEntity alterarPizza(float novoValor, int posicaoComValor) throws Exception {
        // novamente, semelhante ao processo anterior, se retornar -1 significa que não foi encontrado esse valor na lista, portanto é exception
        if (posicaoComValor == -1) {
            throw new Exception("Não foi encontrado esse valor na lista!");
        } else { // aqui vamos pegar a posicao e alterar o valor
            ListaSequencialDB.PIZZAS.get(posicaoComValor).setPreco(novoValor);
        }
        return ListaSequencialDB.PIZZAS.get(posicaoComValor);
    }
}
