package com.klebermagno.code.cap3;

/**
 * Animal Shelter:
 * An animal shelter, which holds only dogs and cats,
 * operates on a strictly"first in, first out" basis.
 * People must adopt either the"oldest" (based on arrival time)
 * of all animals at the shelter, or they can select whether
 * they would prefer a dog or a cat (and will receive the oldest animal of that type).
 * They cannot select which specific animal they would like.
 * Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
 * You may use the built-in Linked list data structure.
 *
 */

/**
 * Abrigo de animais:
 * Um abrigo de animais, que abriga apenas cães e gatos,
 * opera estritamente em uma base de "primeiro a entrar, primeiro a sair".
 * As pessoas devem adotar o "mais velho" (com base na hora de chegada)
 * de todos os animais no abrigo, ou podem escolher se preferem um cachorro ou
 * um gato (e receberão o animal mais velho desse tipo).
 * Eles não podem selecionar qual animal específico eles gostariam.
 * Crie as estruturas de dados para manter esse sistema e implementar
 * operações como enqueue, dequeueAny, dequeueDog e dequeueCat.
 * Você pode usar a estrutura de dados de lista vinculada embutida.
 */
public class Q36 {

    public void enqueue(Animal animal){

    }
    public Animal dequeueAny(){
        return null;
    }
    public Animal dequeueCat(){
        return null;
    }
    public Animal dequeueDog(){
        return null;
    }

    private class Animal {
        enum Type{cat,dog}
        Type type;
        String name;
        Animal(Type t, String name){
            this.type = t;
            this.name =name;
        }
    }
}
